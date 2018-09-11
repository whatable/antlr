package com.huntkey.antlr4.formula;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huntkey.antlr4.formula.core.FormulaLexer;
import com.huntkey.antlr4.formula.core.FormulaParser;
import com.huntkey.antlr4.formula.core.FormulaParser.ArithmeticAddExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.ConditionExpressionContext;
import com.huntkey.antlr4.formula.core.FormulaParser.LogicExpressionContext;

public class FormulaMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(FormulaMain.class);

	public static BigDecimal arithmetic(String input) {
		FormulaLexer lexer = new FormulaLexer(new ANTLRInputStream(input));
		CommonTokenStream token = new CommonTokenStream(lexer);
		FormulaParser parser = new FormulaParser(token);
		ArithmeticAddExpressionContext context = parser.arithmeticAddExpression();
		return (BigDecimal) new _FinalVisitor().visit(context);
	}

	public static Boolean condition(String input) {
		FormulaLexer lexer = new FormulaLexer(new ANTLRInputStream(input));
		CommonTokenStream token = new CommonTokenStream(lexer);
		FormulaParser parser = new FormulaParser(token);
		ConditionExpressionContext context = parser.conditionExpression();
		return (Boolean) new _FinalVisitor().visit(context);
	}

	public static Boolean logic(String input) {
		FormulaLexer lexer = new FormulaLexer(new ANTLRInputStream(input));
		CommonTokenStream token = new CommonTokenStream(lexer);
		FormulaParser parser = new FormulaParser(token);
		LogicExpressionContext context = parser.logicExpression();
		return (Boolean) new _FinalVisitor().visit(context);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		LOGGER.info("【1+2】 .......result=" + arithmetic("1+2"));
		LOGGER.info("【2*3】 .......result=" + arithmetic("2*3"));
		LOGGER.info("【((5+5.8)+2)】 .......result=" + arithmetic("((5+5.8)+2)"));
		LOGGER.info("【((5+5.13)+2*2*(5.2-1)-3)/2】 .......result=" + arithmetic("((5+5.13)+2*2*(5.2-1)-3)/2"));
		LOGGER.info("【1+2>3】 .......result=" + condition("1+2>3"));
		LOGGER.info("【1+2>=3】 .......result=" + condition("1+2>=3"));
		LOGGER.info("【1+2==(3+3)/2】 .......result=" + condition("1+2==(3+3)/2"));
		LOGGER.info("【1+2!=(3+3)/2】 .......result=" + condition("1+2!=(3+3)/2"));
		LOGGER.info("【TRUE】 .......result=" + logic("TRUE"));
		LOGGER.info("【TRUE&&FALSE】 .......result=" + logic("TRUE&&FALSE"));
		LOGGER.info("【2<10&&2>11】 .......result=" + logic("2<10&&2>11"));
		LOGGER.info("【2<10&&(2>11||2>1)】 .......result=" + logic("2<10&&(2>11||2>1)"));
	}
}
