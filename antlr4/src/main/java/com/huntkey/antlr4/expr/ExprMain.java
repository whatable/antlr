package com.huntkey.antlr4.expr;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huntkey.antlr4.expr.core.ExprLexer;
import com.huntkey.antlr4.expr.core.ExprParser;

public class ExprMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExprMain.class);

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String[] expressions = { "((5+5.8)+2)", "((5+5.13)+2*2*(5.2-1)-3)/2" };// "((5+5)+2*2*(5-1)-3)/3"
		final _FinalVisitor v = new _FinalVisitor();
		for (String exp : expressions) {
			// input stream
			ANTLRInputStream input = new ANTLRInputStream(exp);
			// lexer
			ExprLexer lexer = new ExprLexer(input);
			// token
			CommonTokenStream token = new CommonTokenStream(lexer);
			// parser
			ExprParser parser = new ExprParser(token);

			ExprParser.ExprContext tree = parser.expr();
			Object result = v.visit(tree);
			LOGGER.info("FINAL!!!! result=" + result);
		}
	}
}
