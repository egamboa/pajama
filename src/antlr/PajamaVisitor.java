// Generated from Pajama.g4 by ANTLR 4.4
package pajama.compile;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PajamaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PajamaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pattObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattObject(@NotNull PajamaParser.PattObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PCte}
	 * labeled alternative in {@link PajamaParser#pattInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPCte(@NotNull PajamaParser.PCteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link PajamaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(@NotNull PajamaParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#relMonom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelMonom(@NotNull PajamaParser.RelMonomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBody(@NotNull PajamaParser.RuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link PajamaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(@NotNull PajamaParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#caseRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseRule(@NotNull PajamaParser.CaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull PajamaParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(@NotNull PajamaParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullPat}
	 * labeled alternative in {@link PajamaParser#pattConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPat(@NotNull PajamaParser.NullPatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairs(@NotNull PajamaParser.PairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#relOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOperation(@NotNull PajamaParser.RelOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pattPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattPair(@NotNull PajamaParser.PattPairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatNum}
	 * labeled alternative in {@link PajamaParser#pattConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatNum(@NotNull PajamaParser.PatNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pattList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattList(@NotNull PajamaParser.PattListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull PajamaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#arithMonom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithMonom(@NotNull PajamaParser.ArithMonomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link PajamaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNull(@NotNull PajamaParser.ExprNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pattRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattRest(@NotNull PajamaParser.PattRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(@NotNull PajamaParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PArray}
	 * labeled alternative in {@link PajamaParser#pattInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPArray(@NotNull PajamaParser.PArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PajamaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(@NotNull PajamaParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#relOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOperator(@NotNull PajamaParser.RelOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link PajamaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(@NotNull PajamaParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull PajamaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull PajamaParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#arithSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithSingle(@NotNull PajamaParser.ArithSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(@NotNull PajamaParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull PajamaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatTrue}
	 * labeled alternative in {@link PajamaParser#pattConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatTrue(@NotNull PajamaParser.PatTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#ruleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStatement(@NotNull PajamaParser.RuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatFalse}
	 * labeled alternative in {@link PajamaParser#pattConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatFalse(@NotNull PajamaParser.PatFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatString}
	 * labeled alternative in {@link PajamaParser#pattConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatString(@NotNull PajamaParser.PatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PObject}
	 * labeled alternative in {@link PajamaParser#pattInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPObject(@NotNull PajamaParser.PObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithOperation(@NotNull PajamaParser.ArithOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#pattArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattArray(@NotNull PajamaParser.PattArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PajamaParser#pattInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull PajamaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PajamaParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull PajamaParser.ObjectContext ctx);
}