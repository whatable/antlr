// Generated from src/main/resources/Expr.g4 by ANTLR 4.5.3
package com.huntkey.antlr4.expr.core;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(ExprParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr0(ExprParser.Expr0Context ctx);
}