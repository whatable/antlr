package com.huntkey.antlr4.formula;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huntkey.antlr4.formula.core.FormulaBaseVisitor;
import com.huntkey.antlr4.formula.core.FormulaParser.ArithmeticAddExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.ArithmeticAtomExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.ArithmeticMulExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.ConditionExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.LogicAtomExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.LogicExpressionContext;

public class _FinalVisitor extends FormulaBaseVisitor<Object> {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object visitLogicExpression(LogicExpressionContext ctx) {
		Boolean a = (Boolean) visitLogicAtomExpression(ctx.logicAtomExpression(0));

		for (int i = 1; i < ctx.getChildCount(); i += 2) {
			String op = ctx.getChild(i).getText();
			Boolean b = (Boolean) visitLogicAtomExpression((LogicAtomExpressionContext) ctx.getChild(i + 1));
			switch (op) {
			case "&&":
				a = a && b;
				break;
			case "||":
				a = a || b;
				break;
			default:
				break;
			}
		}
		return a;
	}

	@Override
	public Object visitLogicAtomExpression(LogicAtomExpressionContext ctx) {
		if (ctx.logicExpression() != null) {
			return visitLogicExpression(ctx.logicExpression());
		} else if (ctx.conditionExpression() != null) {
			return visitConditionExpression(ctx.conditionExpression());
		} else {
			return new Boolean(ctx.getText());
		}
	}

	@Override
	public Object visitConditionExpression(ConditionExpressionContext ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}条件:: {}", tabs, ctx.getText());
		BigDecimal a = (BigDecimal) visitArithmeticAddExpression(ctx.arithmeticAddExpression(0));
		BigDecimal b = (BigDecimal) visitArithmeticAddExpression(ctx.arithmeticAddExpression(1));
		int compare = a.compareTo(b);
		switch (ctx.op.getText()) {
		case ">":
			return compare > 0;
		case "<":
			return compare < 0;
		case "==":
			return compare == 0;
		case "!=":
			return compare != 0;
		case ">=":
			return compare >= 0;
		case "<=":
			return compare <= 0;
		default:
			break;
		}
		return null;
	}

	@Override
	public Object visitArithmeticAddExpression(ArithmeticAddExpressionContext ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}加减:: {}", tabs, ctx.getText());

		BigDecimal a = (BigDecimal) visitArithmeticMulExpression(ctx.arithmeticMulExpression(0));
		for (int i = 1; i < ctx.getChildCount(); i += 2) {
			String op = ctx.getChild(i).getText();
			BigDecimal b = (BigDecimal) visitArithmeticMulExpression(
					(ArithmeticMulExpressionContext) ctx.getChild(i + 1));
			switch (op) {
			case "+":
				a = a.add(b);
				break;
			case "-":
				a = a.subtract(b);
				break;
			default:
				break;
			}
		}
		LOGGER.debug("{}<<<<返回:: {}", tabs, a);
		return a;
	}

	@Override
	public Object visitArithmeticMulExpression(ArithmeticMulExpressionContext ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}乘除:: {}", tabs, ctx.getText());

		BigDecimal a = (BigDecimal) visitArithmeticAtomExpression(ctx.arithmeticAtomExpression(0));
		for (int i = 1; i < ctx.getChildCount(); i += 2) {
			String op = ctx.getChild(i).getText();
			BigDecimal b = (BigDecimal) visitArithmeticAtomExpression(
					(ArithmeticAtomExpressionContext) ctx.getChild(i + 1));
			switch (op) {
			case "*":
				a = a.multiply(b);
				break;
			case "/":
				a = a.divide(b, 2, BigDecimal.ROUND_HALF_EVEN);
				break;
			default:
				break;
			}
		}
		LOGGER.debug("{}<<<<返回:: {}", tabs, a);
		return a;
	}

	@Override
	public Object visitArithmeticAtomExpression(ArithmeticAtomExpressionContext ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}数字或括号:: {}", tabs, ctx.getText());
		Object ret = ctx.arithmeticAddExpression() == null ? new BigDecimal(ctx.getText())
				: visitArithmeticAddExpression(ctx.arithmeticAddExpression());
		LOGGER.debug("{}<<<<返回:: {}", tabs, ret);
		return ret;
	}

	private static String tabs(int c) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < c - 1; i++) {
			b.append("\t");
		}
		return b.toString();
	}
}
