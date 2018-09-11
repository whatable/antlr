package com.huntkey.antlr4.formula;

import org.antlr.v4.Tool;

public class FormulaGenerator {
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			args = new String[] { "-o", "src/main/java/com/huntkey/antlr4/formula/core", "-package",
					"com.huntkey.antlr4.formula.core", "-no-listener", "-visitor", "src/main/resources/Formula.g4" };
		}
		Tool.main(args);
	}
}
