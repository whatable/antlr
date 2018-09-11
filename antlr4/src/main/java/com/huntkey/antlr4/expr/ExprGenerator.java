package com.huntkey.antlr4.expr;

import org.antlr.v4.Tool;

public class ExprGenerator {
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			args = new String[] { "-o", "src/main/java/com/huntkey/antlr4/expr/core", "-package",
					"com.huntkey.antlr4.expr.core", "-no-listener", "-visitor", "src/main/resources/Expr.g4" };
		}
		Tool.main(args);
	}
}
