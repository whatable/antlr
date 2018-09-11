package com.huntkey.antlr4.expr;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huntkey.antlr4.expr.core.ExprBaseVisitor;
import com.huntkey.antlr4.expr.core.ExprParser.Expr0Context;
import com.huntkey.antlr4.expr.core.ExprParser.Expr1Context;
import com.huntkey.antlr4.expr.core.ExprParser.ExprContext;

public class _FinalVisitor extends ExprBaseVisitor<BigDecimal> {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public BigDecimal visitExpr(ExprContext ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}加减:: {}", tabs, ctx.getText());

		BigDecimal a = visitExpr1(ctx.expr1(0));
		for (int i = 1; i < ctx.getChildCount(); i += 2) {
			String op = ctx.getChild(i).getText();
			BigDecimal b = visitExpr1((Expr1Context) ctx.getChild(i + 1));
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
	public BigDecimal visitExpr1(Expr1Context ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}乘除:: {}", tabs, ctx.getText());

		BigDecimal a = visitExpr0(ctx.expr0(0));
		for (int i = 1; i < ctx.getChildCount(); i += 2) {
			String op = ctx.getChild(i).getText();
			BigDecimal b = visitExpr0((Expr0Context) ctx.getChild(i + 1));
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
	public BigDecimal visitExpr0(Expr0Context ctx) {
		String tabs = tabs(ctx.depth());
		LOGGER.debug("{}数字或括号:: {}", tabs, ctx.getText());
		BigDecimal ret = ctx.expr() == null ? new BigDecimal(ctx.getText()) : visitExpr(ctx.expr());
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
