// Generated from src/main/resources/Formula.g4 by ANTLR 4.5.3
package com.huntkey.antlr4.formula.core;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FormulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FormulaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FormulaParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(FormulaParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#logicAtomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAtomExpression(FormulaParser.LogicAtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(FormulaParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#arithmeticAtomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtomExpression(FormulaParser.ArithmeticAtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#arithmeticMulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticMulExpression(FormulaParser.ArithmeticMulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#arithmeticAddExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAddExpression(FormulaParser.ArithmeticAddExpressionContext ctx);
}