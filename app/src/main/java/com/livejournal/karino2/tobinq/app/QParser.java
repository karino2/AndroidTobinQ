// $ANTLR 3.5.2 Q.g 2014-04-26 22:19:42

       package com.livejournal.karino2.tobinq.app;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class QParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND2", "BREAK", "Comment", 
		"DecimalLiteral", "ELSE", "ENCLOSED_ASSIGN", "EQ", "EQ_ASSIGN", "EscapeSequence", 
		"Exponent", "FALSE", "FOR", "FUNCTION", "FloatTypeSuffix", "FloatingPointLiteral", 
		"GE", "GT", "HexDigit", "HexLiteral", "IF", "IN", "IntegerTypeSuffix", 
		"JavaIDDigit", "LBB", "LE", "LEFT_ASSIGN", "LT", "Letter", "NA", "NE", 
		"NEXT", "NS_GET", "NS_GET_INT", "NULL_CONST", "OR", "OR2", "OctalEscape", 
		"OctalLiteral", "REPEAT", "RIGHT_ASSIGN", "SPECIAL", "STR_CONST", "SYMBOL", 
		"TRUE", "UnicodeEscape", "WHILE", "XXBINARY", "XXCOND", "XXDEFUN", "XXEXPRLIST", 
		"XXEXPRLIST0", "XXEXPRLIST1", "XXEXPRLIST2", "XXFOR", "XXFORCOND", "XXFORMAL0", 
		"XXFORMAL1", "XXFORMALLIST", "XXFUNCALL", "XXIF", "XXIFCOND", "XXIFELSE", 
		"XXNULLSUB0", "XXNULLSUB1", "XXNXTBRK", "XXPAREN", "XXREPEAT", "XXSUB0", 
		"XXSUB1", "XXSUBLIST", "XXSUBSCRIPT", "XXSYMSUB0", "XXSYMSUB1", "XXUNARY", 
		"XXVALUE", "XXWHILE", "'!'", "'$'", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'/'", "':'", "';'", "'?'", "'@'", "'Inf'", "'NA_character_'", 
		"'NA_complex_'", "'NA_integer_'", "'NA_real_'", "'NaN'", "'['", "'\\n'", 
		"']'", "'^'", "'{'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int AND=4;
	public static final int AND2=5;
	public static final int BREAK=6;
	public static final int Comment=7;
	public static final int DecimalLiteral=8;
	public static final int ELSE=9;
	public static final int ENCLOSED_ASSIGN=10;
	public static final int EQ=11;
	public static final int EQ_ASSIGN=12;
	public static final int EscapeSequence=13;
	public static final int Exponent=14;
	public static final int FALSE=15;
	public static final int FOR=16;
	public static final int FUNCTION=17;
	public static final int FloatTypeSuffix=18;
	public static final int FloatingPointLiteral=19;
	public static final int GE=20;
	public static final int GT=21;
	public static final int HexDigit=22;
	public static final int HexLiteral=23;
	public static final int IF=24;
	public static final int IN=25;
	public static final int IntegerTypeSuffix=26;
	public static final int JavaIDDigit=27;
	public static final int LBB=28;
	public static final int LE=29;
	public static final int LEFT_ASSIGN=30;
	public static final int LT=31;
	public static final int Letter=32;
	public static final int NA=33;
	public static final int NE=34;
	public static final int NEXT=35;
	public static final int NS_GET=36;
	public static final int NS_GET_INT=37;
	public static final int NULL_CONST=38;
	public static final int OR=39;
	public static final int OR2=40;
	public static final int OctalEscape=41;
	public static final int OctalLiteral=42;
	public static final int REPEAT=43;
	public static final int RIGHT_ASSIGN=44;
	public static final int SPECIAL=45;
	public static final int STR_CONST=46;
	public static final int SYMBOL=47;
	public static final int TRUE=48;
	public static final int UnicodeEscape=49;
	public static final int WHILE=50;
	public static final int XXBINARY=51;
	public static final int XXCOND=52;
	public static final int XXDEFUN=53;
	public static final int XXEXPRLIST=54;
	public static final int XXEXPRLIST0=55;
	public static final int XXEXPRLIST1=56;
	public static final int XXEXPRLIST2=57;
	public static final int XXFOR=58;
	public static final int XXFORCOND=59;
	public static final int XXFORMAL0=60;
	public static final int XXFORMAL1=61;
	public static final int XXFORMALLIST=62;
	public static final int XXFUNCALL=63;
	public static final int XXIF=64;
	public static final int XXIFCOND=65;
	public static final int XXIFELSE=66;
	public static final int XXNULLSUB0=67;
	public static final int XXNULLSUB1=68;
	public static final int XXNXTBRK=69;
	public static final int XXPAREN=70;
	public static final int XXREPEAT=71;
	public static final int XXSUB0=72;
	public static final int XXSUB1=73;
	public static final int XXSUBLIST=74;
	public static final int XXSUBSCRIPT=75;
	public static final int XXSYMSUB0=76;
	public static final int XXSYMSUB1=77;
	public static final int XXUNARY=78;
	public static final int XXVALUE=79;
	public static final int XXWHILE=80;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public QParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public QParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return QParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Q.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// Q.g:94:1: prog : prog_begin ( prog_continue )* ( '\\n' | ';' )* ;
	public final QParser.prog_return prog() throws RecognitionException {
		QParser.prog_return retval = new QParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set3=null;
		ParserRuleReturnScope prog_begin1 =null;
		ParserRuleReturnScope prog_continue2 =null;

		Object set3_tree=null;

		try {
			// Q.g:94:6: ( prog_begin ( prog_continue )* ( '\\n' | ';' )* )
			// Q.g:94:8: prog_begin ( prog_continue )* ( '\\n' | ';' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_prog_begin_in_prog295);
			prog_begin1=prog_begin();
			state._fsp--;

			adaptor.addChild(root_0, prog_begin1.getTree());

			// Q.g:94:19: ( prog_continue )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// Q.g:94:19: prog_continue
					{
					pushFollow(FOLLOW_prog_continue_in_prog297);
					prog_continue2=prog_continue();
					state._fsp--;

					adaptor.addChild(root_0, prog_continue2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// Q.g:94:34: ( '\\n' | ';' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==91||LA2_0==101) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Q.g:
					{
					set3=input.LT(1);
					if ( input.LA(1)==91||input.LA(1)==101 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set3));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class prog_begin_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog_begin"
	// Q.g:97:1: prog_begin : ( '\\n' | ';' )* expr_or_assign -> ^( XXVALUE expr_or_assign ) ;
	public final QParser.prog_begin_return prog_begin() throws RecognitionException {
		QParser.prog_begin_return retval = new QParser.prog_begin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal4=null;
		Token char_literal5=null;
		ParserRuleReturnScope expr_or_assign6 =null;

		Object char_literal4_tree=null;
		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:97:12: ( ( '\\n' | ';' )* expr_or_assign -> ^( XXVALUE expr_or_assign ) )
			// Q.g:97:14: ( '\\n' | ';' )* expr_or_assign
			{
			// Q.g:97:14: ( '\\n' | ';' )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==101) ) {
					alt3=1;
				}
				else if ( (LA3_0==91) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// Q.g:97:15: '\\n'
					{
					char_literal4=(Token)match(input,101,FOLLOW_101_in_prog_begin318);  
					stream_101.add(char_literal4);

					}
					break;
				case 2 :
					// Q.g:97:22: ';'
					{
					char_literal5=(Token)match(input,91,FOLLOW_91_in_prog_begin322);  
					stream_91.add(char_literal5);

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_expr_or_assign_in_prog_begin326);
			expr_or_assign6=expr_or_assign();
			state._fsp--;

			stream_expr_or_assign.add(expr_or_assign6.getTree());
			// AST REWRITE
			// elements: expr_or_assign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:3: -> ^( XXVALUE expr_or_assign )
			{
				// Q.g:98:6: ^( XXVALUE expr_or_assign )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXVALUE, "XXVALUE"), root_1);
				adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog_begin"


	public static class prog_continue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog_continue"
	// Q.g:101:1: prog_continue : ( '\\n' | ';' )+ expr_or_assign -> ^( XXVALUE expr_or_assign ) ;
	public final QParser.prog_continue_return prog_continue() throws RecognitionException {
		QParser.prog_continue_return retval = new QParser.prog_continue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal7=null;
		Token char_literal8=null;
		ParserRuleReturnScope expr_or_assign9 =null;

		Object char_literal7_tree=null;
		Object char_literal8_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:101:14: ( ( '\\n' | ';' )+ expr_or_assign -> ^( XXVALUE expr_or_assign ) )
			// Q.g:102:3: ( '\\n' | ';' )+ expr_or_assign
			{
			// Q.g:102:3: ( '\\n' | ';' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==101) ) {
					alt4=1;
				}
				else if ( (LA4_0==91) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Q.g:102:4: '\\n'
					{
					char_literal7=(Token)match(input,101,FOLLOW_101_in_prog_continue352);  
					stream_101.add(char_literal7);

					}
					break;
				case 2 :
					// Q.g:102:11: ';'
					{
					char_literal8=(Token)match(input,91,FOLLOW_91_in_prog_continue356);  
					stream_91.add(char_literal8);

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			pushFollow(FOLLOW_expr_or_assign_in_prog_continue360);
			expr_or_assign9=expr_or_assign();
			state._fsp--;

			stream_expr_or_assign.add(expr_or_assign9.getTree());
			// AST REWRITE
			// elements: expr_or_assign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:3: -> ^( XXVALUE expr_or_assign )
			{
				// Q.g:103:6: ^( XXVALUE expr_or_assign )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXVALUE, "XXVALUE"), root_1);
				adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog_continue"


	public static class expr_or_assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_or_assign"
	// Q.g:106:1: expr_or_assign : ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )? ;
	public final QParser.expr_or_assign_return expr_or_assign() throws RecognitionException {
		QParser.expr_or_assign_return retval = new QParser.expr_or_assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ_ASSIGN11=null;
		ParserRuleReturnScope expr10 =null;
		ParserRuleReturnScope expr_or_assign12 =null;

		Object EQ_ASSIGN11_tree=null;
		RewriteRuleTokenStream stream_EQ_ASSIGN=new RewriteRuleTokenStream(adaptor,"token EQ_ASSIGN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:106:17: ( ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )? )
			// Q.g:106:22: ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )?
			{
			// Q.g:106:22: ( expr -> expr )
			// Q.g:106:23: expr
			{
			pushFollow(FOLLOW_expr_in_expr_or_assign386);
			expr10=expr();
			state._fsp--;

			stream_expr.add(expr10.getTree());
			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:27: -> expr
			{
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:106:35: ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EQ_ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Q.g:106:36: EQ_ASSIGN expr_or_assign
					{
					EQ_ASSIGN11=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_expr_or_assign392);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN11);

					pushFollow(FOLLOW_expr_or_assign_in_expr_or_assign394);
					expr_or_assign12=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign12.getTree());
					// AST REWRITE
					// elements: expr, expr_or_assign, EQ_ASSIGN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 106:61: -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign )
					{
						// Q.g:106:64: ^( XXBINARY EQ_ASSIGN expr expr_or_assign )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_EQ_ASSIGN.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_or_assign"


	public static class symbol_or_conststr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "symbol_or_conststr"
	// Q.g:109:1: symbol_or_conststr : ( SYMBOL | STR_CONST );
	public final QParser.symbol_or_conststr_return symbol_or_conststr() throws RecognitionException {
		QParser.symbol_or_conststr_return retval = new QParser.symbol_or_conststr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set13=null;

		Object set13_tree=null;

		try {
			// Q.g:110:2: ( SYMBOL | STR_CONST )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set13=input.LT(1);
			if ( (input.LA(1) >= STR_CONST && input.LA(1) <= SYMBOL) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set13));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbol_or_conststr"


	public static class unary_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_op"
	// Q.g:112:1: unary_op : ( '-' | '+' | '!' | '~' | '?' ) ;
	public final QParser.unary_op_return unary_op() throws RecognitionException {
		QParser.unary_op_return retval = new QParser.unary_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;

		Object set14_tree=null;

		try {
			// Q.g:113:2: ( ( '-' | '+' | '!' | '~' | '?' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set14=input.LT(1);
			if ( input.LA(1)==81||input.LA(1)==86||input.LA(1)==88||input.LA(1)==92||input.LA(1)==106 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set14));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_op"


	public static class formalarg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalarg"
	// Q.g:116:1: formalarg : ( SYMBOL -> ^( XXFORMAL0 SYMBOL ) | SYMBOL EQ_ASSIGN expr -> ^( XXFORMAL1 SYMBOL expr ) );
	public final QParser.formalarg_return formalarg() throws RecognitionException {
		QParser.formalarg_return retval = new QParser.formalarg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SYMBOL15=null;
		Token SYMBOL16=null;
		Token EQ_ASSIGN17=null;
		ParserRuleReturnScope expr18 =null;

		Object SYMBOL15_tree=null;
		Object SYMBOL16_tree=null;
		Object EQ_ASSIGN17_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_EQ_ASSIGN=new RewriteRuleTokenStream(adaptor,"token EQ_ASSIGN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:116:11: ( SYMBOL -> ^( XXFORMAL0 SYMBOL ) | SYMBOL EQ_ASSIGN expr -> ^( XXFORMAL1 SYMBOL expr ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==SYMBOL) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==EQ_ASSIGN) ) {
					alt6=2;
				}
				else if ( (LA6_1==EOF||LA6_1==84||LA6_1==87) ) {
					alt6=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Q.g:116:13: SYMBOL
					{
					SYMBOL15=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formalarg477);  
					stream_SYMBOL.add(SYMBOL15);

					// AST REWRITE
					// elements: SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:20: -> ^( XXFORMAL0 SYMBOL )
					{
						// Q.g:116:23: ^( XXFORMAL0 SYMBOL )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFORMAL0, "XXFORMAL0"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Q.g:117:4: SYMBOL EQ_ASSIGN expr
					{
					SYMBOL16=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formalarg490);  
					stream_SYMBOL.add(SYMBOL16);

					EQ_ASSIGN17=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_formalarg492);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN17);

					pushFollow(FOLLOW_expr_in_formalarg494);
					expr18=expr();
					state._fsp--;

					stream_expr.add(expr18.getTree());
					// AST REWRITE
					// elements: expr, SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:26: -> ^( XXFORMAL1 SYMBOL expr )
					{
						// Q.g:117:29: ^( XXFORMAL1 SYMBOL expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFORMAL1, "XXFORMAL1"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalarg"


	public static class formlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formlist"
	// Q.g:121:1: formlist : ( formalarg ( ',' formalarg )* )? ( EOF )? -> ^( XXFORMALLIST ( formalarg )* ) ;
	public final QParser.formlist_return formlist() throws RecognitionException {
		QParser.formlist_return retval = new QParser.formlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal20=null;
		Token EOF22=null;
		ParserRuleReturnScope formalarg19 =null;
		ParserRuleReturnScope formalarg21 =null;

		Object char_literal20_tree=null;
		Object EOF22_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_formalarg=new RewriteRuleSubtreeStream(adaptor,"rule formalarg");

		try {
			// Q.g:121:9: ( ( formalarg ( ',' formalarg )* )? ( EOF )? -> ^( XXFORMALLIST ( formalarg )* ) )
			// Q.g:121:10: ( formalarg ( ',' formalarg )* )? ( EOF )?
			{
			// Q.g:121:10: ( formalarg ( ',' formalarg )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==SYMBOL) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Q.g:121:11: formalarg ( ',' formalarg )*
					{
					pushFollow(FOLLOW_formalarg_in_formlist514);
					formalarg19=formalarg();
					state._fsp--;

					stream_formalarg.add(formalarg19.getTree());
					// Q.g:121:21: ( ',' formalarg )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==87) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Q.g:121:22: ',' formalarg
							{
							char_literal20=(Token)match(input,87,FOLLOW_87_in_formlist517);  
							stream_87.add(char_literal20);

							pushFollow(FOLLOW_formalarg_in_formlist519);
							formalarg21=formalarg();
							state._fsp--;

							stream_formalarg.add(formalarg21.getTree());
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			// Q.g:121:40: ( EOF )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==EOF) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Q.g:121:40: EOF
					{
					EOF22=(Token)match(input,EOF,FOLLOW_EOF_in_formlist525);  
					stream_EOF.add(EOF22);

					}
					break;

			}

			// AST REWRITE
			// elements: formalarg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 122:4: -> ^( XXFORMALLIST ( formalarg )* )
			{
				// Q.g:122:7: ^( XXFORMALLIST ( formalarg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFORMALLIST, "XXFORMALLIST"), root_1);
				// Q.g:122:22: ( formalarg )*
				while ( stream_formalarg.hasNext() ) {
					adaptor.addChild(root_1, stream_formalarg.nextTree());
				}
				stream_formalarg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formlist"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// Q.g:126:1: lexpr : ( num_const | STR_CONST | NULL_CONST | SYMBOL | '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}' -> ^( XXEXPRLIST ( expr_or_assign )+ ) | '(' expr_or_assign ')' -> ^( XXPAREN expr_or_assign ) | unary_op expr -> ^( XXUNARY unary_op expr ) | FUNCTION '(' formlist ')' cr expr_or_assign -> ^( XXDEFUN formlist expr_or_assign ) | IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )? -> ^( XXIFELSE ifcond $ifexp ( $elexp)? ) | FOR forcond expr_or_assign -> ^( XXFOR forcond expr_or_assign ) | WHILE cond expr_or_assign -> ^( XXWHILE cond expr_or_assign ) | REPEAT expr_or_assign -> ^( XXREPEAT expr_or_assign ) | (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET $fs $ss) | (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET_INT $fs $ss) | NEXT -> ^( XXNXTBRK NEXT ) | BREAK -> ^( XXNXTBRK BREAK ) );
	public final QParser.lexpr_return lexpr() throws RecognitionException {
		QParser.lexpr_return retval = new QParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STR_CONST24=null;
		Token NULL_CONST25=null;
		Token SYMBOL26=null;
		Token char_literal27=null;
		Token char_literal28=null;
		Token char_literal30=null;
		Token char_literal32=null;
		Token char_literal34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		Token FUNCTION40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		Token IF46=null;
		Token ELSE48=null;
		Token FOR49=null;
		Token WHILE52=null;
		Token REPEAT55=null;
		Token NS_GET57=null;
		Token NS_GET_INT58=null;
		Token NEXT59=null;
		Token BREAK60=null;
		ParserRuleReturnScope ifexp =null;
		ParserRuleReturnScope elexp =null;
		ParserRuleReturnScope fs =null;
		ParserRuleReturnScope ss =null;
		ParserRuleReturnScope num_const23 =null;
		ParserRuleReturnScope expr_or_assign29 =null;
		ParserRuleReturnScope expr_or_assign31 =null;
		ParserRuleReturnScope expr_or_assign33 =null;
		ParserRuleReturnScope expr_or_assign36 =null;
		ParserRuleReturnScope unary_op38 =null;
		ParserRuleReturnScope expr39 =null;
		ParserRuleReturnScope formlist42 =null;
		ParserRuleReturnScope cr44 =null;
		ParserRuleReturnScope expr_or_assign45 =null;
		ParserRuleReturnScope ifcond47 =null;
		ParserRuleReturnScope forcond50 =null;
		ParserRuleReturnScope expr_or_assign51 =null;
		ParserRuleReturnScope cond53 =null;
		ParserRuleReturnScope expr_or_assign54 =null;
		ParserRuleReturnScope expr_or_assign56 =null;

		Object STR_CONST24_tree=null;
		Object NULL_CONST25_tree=null;
		Object SYMBOL26_tree=null;
		Object char_literal27_tree=null;
		Object char_literal28_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		Object char_literal34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		Object FUNCTION40_tree=null;
		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object IF46_tree=null;
		Object ELSE48_tree=null;
		Object FOR49_tree=null;
		Object WHILE52_tree=null;
		Object REPEAT55_tree=null;
		Object NS_GET57_tree=null;
		Object NS_GET_INT58_tree=null;
		Object NEXT59_tree=null;
		Object BREAK60_tree=null;
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_NS_GET_INT=new RewriteRuleTokenStream(adaptor,"token NS_GET_INT");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_NS_GET=new RewriteRuleTokenStream(adaptor,"token NS_GET");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_cr=new RewriteRuleSubtreeStream(adaptor,"rule cr");
		RewriteRuleSubtreeStream stream_forcond=new RewriteRuleSubtreeStream(adaptor,"rule forcond");
		RewriteRuleSubtreeStream stream_ifcond=new RewriteRuleSubtreeStream(adaptor,"rule ifcond");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_formlist=new RewriteRuleSubtreeStream(adaptor,"rule formlist");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_unary_op=new RewriteRuleSubtreeStream(adaptor,"rule unary_op");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:126:7: ( num_const | STR_CONST | NULL_CONST | SYMBOL | '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}' -> ^( XXEXPRLIST ( expr_or_assign )+ ) | '(' expr_or_assign ')' -> ^( XXPAREN expr_or_assign ) | unary_op expr -> ^( XXUNARY unary_op expr ) | FUNCTION '(' formlist ')' cr expr_or_assign -> ^( XXDEFUN formlist expr_or_assign ) | IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )? -> ^( XXIFELSE ifcond $ifexp ( $elexp)? ) | FOR forcond expr_or_assign -> ^( XXFOR forcond expr_or_assign ) | WHILE cond expr_or_assign -> ^( XXWHILE cond expr_or_assign ) | REPEAT expr_or_assign -> ^( XXREPEAT expr_or_assign ) | (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET $fs $ss) | (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET_INT $fs $ss) | NEXT -> ^( XXNXTBRK NEXT ) | BREAK -> ^( XXNXTBRK BREAK ) )
			int alt15=16;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case FALSE:
			case FloatingPointLiteral:
			case HexLiteral:
			case NA:
			case OctalLiteral:
			case TRUE:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
				{
				alt15=1;
				}
				break;
			case STR_CONST:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case AND:
				case AND2:
				case ELSE:
				case ENCLOSED_ASSIGN:
				case EQ:
				case EQ_ASSIGN:
				case GE:
				case GT:
				case LBB:
				case LE:
				case LEFT_ASSIGN:
				case LT:
				case NE:
				case OR:
				case OR2:
				case RIGHT_ASSIGN:
				case SPECIAL:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 90:
				case 91:
				case 92:
				case 93:
				case 100:
				case 101:
				case 102:
				case 103:
				case 105:
				case 106:
					{
					alt15=2;
					}
					break;
				case NS_GET:
					{
					alt15=13;
					}
					break;
				case NS_GET_INT:
					{
					alt15=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NULL_CONST:
				{
				alt15=3;
				}
				break;
			case SYMBOL:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case AND:
				case AND2:
				case ELSE:
				case ENCLOSED_ASSIGN:
				case EQ:
				case EQ_ASSIGN:
				case GE:
				case GT:
				case LBB:
				case LE:
				case LEFT_ASSIGN:
				case LT:
				case NE:
				case OR:
				case OR2:
				case RIGHT_ASSIGN:
				case SPECIAL:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 90:
				case 91:
				case 92:
				case 93:
				case 100:
				case 101:
				case 102:
				case 103:
				case 105:
				case 106:
					{
					alt15=4;
					}
					break;
				case NS_GET:
					{
					alt15=13;
					}
					break;
				case NS_GET_INT:
					{
					alt15=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 104:
				{
				alt15=5;
				}
				break;
			case 83:
				{
				alt15=6;
				}
				break;
			case 81:
			case 86:
			case 88:
			case 92:
			case 106:
				{
				alt15=7;
				}
				break;
			case FUNCTION:
				{
				alt15=8;
				}
				break;
			case IF:
				{
				alt15=9;
				}
				break;
			case FOR:
				{
				alt15=10;
				}
				break;
			case WHILE:
				{
				alt15=11;
				}
				break;
			case REPEAT:
				{
				alt15=12;
				}
				break;
			case NEXT:
				{
				alt15=15;
				}
				break;
			case BREAK:
				{
				alt15=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// Q.g:126:10: num_const
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_num_const_in_lexpr550);
					num_const23=num_const();
					state._fsp--;

					adaptor.addChild(root_0, num_const23.getTree());

					}
					break;
				case 2 :
					// Q.g:127:4: STR_CONST
					{
					root_0 = (Object)adaptor.nil();


					STR_CONST24=(Token)match(input,STR_CONST,FOLLOW_STR_CONST_in_lexpr555); 
					STR_CONST24_tree = (Object)adaptor.create(STR_CONST24);
					adaptor.addChild(root_0, STR_CONST24_tree);

					}
					break;
				case 3 :
					// Q.g:128:4: NULL_CONST
					{
					root_0 = (Object)adaptor.nil();


					NULL_CONST25=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_lexpr560); 
					NULL_CONST25_tree = (Object)adaptor.create(NULL_CONST25);
					adaptor.addChild(root_0, NULL_CONST25_tree);

					}
					break;
				case 4 :
					// Q.g:129:4: SYMBOL
					{
					root_0 = (Object)adaptor.nil();


					SYMBOL26=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_lexpr565); 
					SYMBOL26_tree = (Object)adaptor.create(SYMBOL26);
					adaptor.addChild(root_0, SYMBOL26_tree);

					}
					break;
				case 5 :
					// Q.g:130:4: '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}'
					{
					char_literal27=(Token)match(input,104,FOLLOW_104_in_lexpr570);  
					stream_104.add(char_literal27);

					// Q.g:130:8: ( '\\n' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==101) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Q.g:130:8: '\\n'
							{
							char_literal28=(Token)match(input,101,FOLLOW_101_in_lexpr572);  
							stream_101.add(char_literal28);

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_expr_or_assign_in_lexpr575);
					expr_or_assign29=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign29.getTree());
					// Q.g:130:29: ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )*
					loop13:
					while (true) {
						int alt13=3;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==91) ) {
							alt13=1;
						}
						else if ( (LA13_0==101) ) {
							alt13=2;
						}

						switch (alt13) {
						case 1 :
							// Q.g:130:30: ( ';' ( expr_or_assign )? )
							{
							// Q.g:130:30: ( ';' ( expr_or_assign )? )
							// Q.g:130:31: ';' ( expr_or_assign )?
							{
							char_literal30=(Token)match(input,91,FOLLOW_91_in_lexpr579);  
							stream_91.add(char_literal30);

							// Q.g:130:35: ( expr_or_assign )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==BREAK||LA11_0==DecimalLiteral||(LA11_0 >= FALSE && LA11_0 <= FUNCTION)||LA11_0==FloatingPointLiteral||(LA11_0 >= HexLiteral && LA11_0 <= IF)||LA11_0==NA||LA11_0==NEXT||LA11_0==NULL_CONST||(LA11_0 >= OctalLiteral && LA11_0 <= REPEAT)||(LA11_0 >= STR_CONST && LA11_0 <= TRUE)||LA11_0==WHILE||LA11_0==81||LA11_0==83||LA11_0==86||LA11_0==88||LA11_0==92||(LA11_0 >= 94 && LA11_0 <= 99)||LA11_0==104||LA11_0==106) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// Q.g:130:35: expr_or_assign
									{
									pushFollow(FOLLOW_expr_or_assign_in_lexpr581);
									expr_or_assign31=expr_or_assign();
									state._fsp--;

									stream_expr_or_assign.add(expr_or_assign31.getTree());
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// Q.g:130:54: ( '\\n' ( expr_or_assign )? )
							{
							// Q.g:130:54: ( '\\n' ( expr_or_assign )? )
							// Q.g:130:55: '\\n' ( expr_or_assign )?
							{
							char_literal32=(Token)match(input,101,FOLLOW_101_in_lexpr588);  
							stream_101.add(char_literal32);

							// Q.g:130:60: ( expr_or_assign )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==BREAK||LA12_0==DecimalLiteral||(LA12_0 >= FALSE && LA12_0 <= FUNCTION)||LA12_0==FloatingPointLiteral||(LA12_0 >= HexLiteral && LA12_0 <= IF)||LA12_0==NA||LA12_0==NEXT||LA12_0==NULL_CONST||(LA12_0 >= OctalLiteral && LA12_0 <= REPEAT)||(LA12_0 >= STR_CONST && LA12_0 <= TRUE)||LA12_0==WHILE||LA12_0==81||LA12_0==83||LA12_0==86||LA12_0==88||LA12_0==92||(LA12_0 >= 94 && LA12_0 <= 99)||LA12_0==104||LA12_0==106) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// Q.g:130:60: expr_or_assign
									{
									pushFollow(FOLLOW_expr_or_assign_in_lexpr590);
									expr_or_assign33=expr_or_assign();
									state._fsp--;

									stream_expr_or_assign.add(expr_or_assign33.getTree());
									}
									break;

							}

							}

							}
							break;

						default :
							break loop13;
						}
					}

					char_literal34=(Token)match(input,105,FOLLOW_105_in_lexpr596);  
					stream_105.add(char_literal34);

					// AST REWRITE
					// elements: expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 131:3: -> ^( XXEXPRLIST ( expr_or_assign )+ )
					{
						// Q.g:131:6: ^( XXEXPRLIST ( expr_or_assign )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXEXPRLIST, "XXEXPRLIST"), root_1);
						if ( !(stream_expr_or_assign.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expr_or_assign.hasNext() ) {
							adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						}
						stream_expr_or_assign.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Q.g:132:4: '(' expr_or_assign ')'
					{
					char_literal35=(Token)match(input,83,FOLLOW_83_in_lexpr612);  
					stream_83.add(char_literal35);

					pushFollow(FOLLOW_expr_or_assign_in_lexpr614);
					expr_or_assign36=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign36.getTree());
					char_literal37=(Token)match(input,84,FOLLOW_84_in_lexpr616);  
					stream_84.add(char_literal37);

					// AST REWRITE
					// elements: expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:3: -> ^( XXPAREN expr_or_assign )
					{
						// Q.g:133:6: ^( XXPAREN expr_or_assign )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXPAREN, "XXPAREN"), root_1);
						adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// Q.g:134:5: unary_op expr
					{
					pushFollow(FOLLOW_unary_op_in_lexpr632);
					unary_op38=unary_op();
					state._fsp--;

					stream_unary_op.add(unary_op38.getTree());
					pushFollow(FOLLOW_expr_in_lexpr634);
					expr39=expr();
					state._fsp--;

					stream_expr.add(expr39.getTree());
					// AST REWRITE
					// elements: unary_op, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:3: -> ^( XXUNARY unary_op expr )
					{
						// Q.g:135:6: ^( XXUNARY unary_op expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXUNARY, "XXUNARY"), root_1);
						adaptor.addChild(root_1, stream_unary_op.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// Q.g:136:4: FUNCTION '(' formlist ')' cr expr_or_assign
					{
					FUNCTION40=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_lexpr651);  
					stream_FUNCTION.add(FUNCTION40);

					char_literal41=(Token)match(input,83,FOLLOW_83_in_lexpr653);  
					stream_83.add(char_literal41);

					pushFollow(FOLLOW_formlist_in_lexpr655);
					formlist42=formlist();
					state._fsp--;

					stream_formlist.add(formlist42.getTree());
					char_literal43=(Token)match(input,84,FOLLOW_84_in_lexpr657);  
					stream_84.add(char_literal43);

					pushFollow(FOLLOW_cr_in_lexpr659);
					cr44=cr();
					state._fsp--;

					stream_cr.add(cr44.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr661);
					expr_or_assign45=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign45.getTree());
					// AST REWRITE
					// elements: formlist, expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:3: -> ^( XXDEFUN formlist expr_or_assign )
					{
						// Q.g:137:6: ^( XXDEFUN formlist expr_or_assign )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXDEFUN, "XXDEFUN"), root_1);
						adaptor.addChild(root_1, stream_formlist.nextTree());
						adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// Q.g:138:4: IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )?
					{
					IF46=(Token)match(input,IF,FOLLOW_IF_in_lexpr678);  
					stream_IF.add(IF46);

					pushFollow(FOLLOW_ifcond_in_lexpr680);
					ifcond47=ifcond();
					state._fsp--;

					stream_ifcond.add(ifcond47.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr684);
					ifexp=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(ifexp.getTree());
					// Q.g:138:35: ( ELSE elexp= expr_or_assign )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ELSE) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Q.g:138:36: ELSE elexp= expr_or_assign
							{
							ELSE48=(Token)match(input,ELSE,FOLLOW_ELSE_in_lexpr687);  
							stream_ELSE.add(ELSE48);

							pushFollow(FOLLOW_expr_or_assign_in_lexpr691);
							elexp=expr_or_assign();
							state._fsp--;

							stream_expr_or_assign.add(elexp.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: ifcond, elexp, ifexp
					// token labels: 
					// rule labels: retval, ifexp, elexp
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_ifexp=new RewriteRuleSubtreeStream(adaptor,"rule ifexp",ifexp!=null?ifexp.getTree():null);
					RewriteRuleSubtreeStream stream_elexp=new RewriteRuleSubtreeStream(adaptor,"rule elexp",elexp!=null?elexp.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:3: -> ^( XXIFELSE ifcond $ifexp ( $elexp)? )
					{
						// Q.g:139:6: ^( XXIFELSE ifcond $ifexp ( $elexp)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXIFELSE, "XXIFELSE"), root_1);
						adaptor.addChild(root_1, stream_ifcond.nextTree());
						adaptor.addChild(root_1, stream_ifexp.nextTree());
						// Q.g:139:32: ( $elexp)?
						if ( stream_elexp.hasNext() ) {
							adaptor.addChild(root_1, stream_elexp.nextTree());
						}
						stream_elexp.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// Q.g:140:4: FOR forcond expr_or_assign
					{
					FOR49=(Token)match(input,FOR,FOLLOW_FOR_in_lexpr715);  
					stream_FOR.add(FOR49);

					pushFollow(FOLLOW_forcond_in_lexpr717);
					forcond50=forcond();
					state._fsp--;

					stream_forcond.add(forcond50.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr719);
					expr_or_assign51=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign51.getTree());
					// AST REWRITE
					// elements: forcond, expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 141:3: -> ^( XXFOR forcond expr_or_assign )
					{
						// Q.g:141:6: ^( XXFOR forcond expr_or_assign )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFOR, "XXFOR"), root_1);
						adaptor.addChild(root_1, stream_forcond.nextTree());
						adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// Q.g:142:4: WHILE cond expr_or_assign
					{
					WHILE52=(Token)match(input,WHILE,FOLLOW_WHILE_in_lexpr736);  
					stream_WHILE.add(WHILE52);

					pushFollow(FOLLOW_cond_in_lexpr738);
					cond53=cond();
					state._fsp--;

					stream_cond.add(cond53.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr740);
					expr_or_assign54=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign54.getTree());
					// AST REWRITE
					// elements: expr_or_assign, cond
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:3: -> ^( XXWHILE cond expr_or_assign )
					{
						// Q.g:143:6: ^( XXWHILE cond expr_or_assign )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXWHILE, "XXWHILE"), root_1);
						adaptor.addChild(root_1, stream_cond.nextTree());
						adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// Q.g:144:4: REPEAT expr_or_assign
					{
					REPEAT55=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_lexpr757);  
					stream_REPEAT.add(REPEAT55);

					pushFollow(FOLLOW_expr_or_assign_in_lexpr759);
					expr_or_assign56=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign56.getTree());
					// AST REWRITE
					// elements: expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:3: -> ^( XXREPEAT expr_or_assign )
					{
						// Q.g:145:6: ^( XXREPEAT expr_or_assign )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXREPEAT, "XXREPEAT"), root_1);
						adaptor.addChild(root_1, stream_expr_or_assign.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// Q.g:146:4: (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr )
					{
					// Q.g:146:4: (fs= symbol_or_conststr )
					// Q.g:146:5: fs= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr777);
					fs=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(fs.getTree());
					}

					NS_GET57=(Token)match(input,NS_GET,FOLLOW_NS_GET_in_lexpr780);  
					stream_NS_GET.add(NS_GET57);

					// Q.g:146:35: (ss= symbol_or_conststr )
					// Q.g:146:36: ss= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr785);
					ss=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(ss.getTree());
					}

					// AST REWRITE
					// elements: ss, fs, NS_GET
					// token labels: 
					// rule labels: retval, fs, ss
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_fs=new RewriteRuleSubtreeStream(adaptor,"rule fs",fs!=null?fs.getTree():null);
					RewriteRuleSubtreeStream stream_ss=new RewriteRuleSubtreeStream(adaptor,"rule ss",ss!=null?ss.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:3: -> ^( XXBINARY NS_GET $fs $ss)
					{
						// Q.g:147:6: ^( XXBINARY NS_GET $fs $ss)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_NS_GET.nextNode());
						adaptor.addChild(root_1, stream_fs.nextTree());
						adaptor.addChild(root_1, stream_ss.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// Q.g:148:4: (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr )
					{
					// Q.g:148:4: (fs= symbol_or_conststr )
					// Q.g:148:5: fs= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr810);
					fs=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(fs.getTree());
					}

					NS_GET_INT58=(Token)match(input,NS_GET_INT,FOLLOW_NS_GET_INT_in_lexpr813);  
					stream_NS_GET_INT.add(NS_GET_INT58);

					// Q.g:148:39: (ss= symbol_or_conststr )
					// Q.g:148:40: ss= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr818);
					ss=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(ss.getTree());
					}

					// AST REWRITE
					// elements: ss, NS_GET_INT, fs
					// token labels: 
					// rule labels: retval, fs, ss
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_fs=new RewriteRuleSubtreeStream(adaptor,"rule fs",fs!=null?fs.getTree():null);
					RewriteRuleSubtreeStream stream_ss=new RewriteRuleSubtreeStream(adaptor,"rule ss",ss!=null?ss.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 149:3: -> ^( XXBINARY NS_GET_INT $fs $ss)
					{
						// Q.g:149:6: ^( XXBINARY NS_GET_INT $fs $ss)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_NS_GET_INT.nextNode());
						adaptor.addChild(root_1, stream_fs.nextTree());
						adaptor.addChild(root_1, stream_ss.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// Q.g:150:4: NEXT
					{
					NEXT59=(Token)match(input,NEXT,FOLLOW_NEXT_in_lexpr840);  
					stream_NEXT.add(NEXT59);

					// AST REWRITE
					// elements: NEXT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 151:3: -> ^( XXNXTBRK NEXT )
					{
						// Q.g:151:6: ^( XXNXTBRK NEXT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXNXTBRK, "XXNXTBRK"), root_1);
						adaptor.addChild(root_1, stream_NEXT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// Q.g:152:4: BREAK
					{
					BREAK60=(Token)match(input,BREAK,FOLLOW_BREAK_in_lexpr855);  
					stream_BREAK.add(BREAK60);

					// AST REWRITE
					// elements: BREAK
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 153:3: -> ^( XXNXTBRK BREAK )
					{
						// Q.g:153:6: ^( XXNXTBRK BREAK )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXNXTBRK, "XXNXTBRK"), root_1);
						adaptor.addChild(root_1, stream_BREAK.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"


	public static class additive_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "additive_op"
	// Q.g:156:1: additive_op : ( '+' | '-' ) ;
	public final QParser.additive_op_return additive_op() throws RecognitionException {
		QParser.additive_op_return retval = new QParser.additive_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;

		Object set61_tree=null;

		try {
			// Q.g:157:2: ( ( '+' | '-' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set61=input.LT(1);
			if ( input.LA(1)==86||input.LA(1)==88 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set61));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_op"


	public static class relationalOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalOp"
	// Q.g:160:1: relationalOp : ( LT | LE | EQ | NE | GE | GT | AND2 | OR2 ) ;
	public final QParser.relationalOp_return relationalOp() throws RecognitionException {
		QParser.relationalOp_return retval = new QParser.relationalOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set62=null;

		Object set62_tree=null;

		try {
			// Q.g:161:2: ( ( LT | LE | EQ | NE | GE | GT | AND2 | OR2 ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set62=input.LT(1);
			if ( input.LA(1)==AND2||input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE||input.LA(1)==OR2 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set62));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalOp"


	public static class assign_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign_op"
	// Q.g:167:1: assign_op : ( LEFT_ASSIGN | RIGHT_ASSIGN | ENCLOSED_ASSIGN | '?' ) ;
	public final QParser.assign_op_return assign_op() throws RecognitionException {
		QParser.assign_op_return retval = new QParser.assign_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;

		Object set63_tree=null;

		try {
			// Q.g:167:10: ( ( LEFT_ASSIGN | RIGHT_ASSIGN | ENCLOSED_ASSIGN | '?' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==ENCLOSED_ASSIGN||input.LA(1)==LEFT_ASSIGN||input.LA(1)==RIGHT_ASSIGN||input.LA(1)==92 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set63));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign_op"


	public static class multicative_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multicative_op"
	// Q.g:172:1: multicative_op : ( '*' | '/' | SPECIAL ) ;
	public final QParser.multicative_op_return multicative_op() throws RecognitionException {
		QParser.multicative_op_return retval = new QParser.multicative_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set64=null;

		Object set64_tree=null;

		try {
			// Q.g:173:2: ( ( '*' | '/' | SPECIAL ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set64=input.LT(1);
			if ( input.LA(1)==SPECIAL||input.LA(1)==85||input.LA(1)==89 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set64));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multicative_op"


	public static class refer_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "refer"
	// Q.g:180:1: refer : ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )* ;
	public final QParser.refer_return refer() throws RecognitionException {
		QParser.refer_return retval = new QParser.refer_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal66=null;
		Token char_literal68=null;
		Token LBB69=null;
		Token char_literal71=null;
		Token char_literal72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token char_literal76=null;
		Token char_literal77=null;
		ParserRuleReturnScope lexpr65 =null;
		ParserRuleReturnScope sublist67 =null;
		ParserRuleReturnScope sublist70 =null;
		ParserRuleReturnScope sublist74 =null;
		ParserRuleReturnScope symbol_or_conststr78 =null;

		Object char_literal66_tree=null;
		Object char_literal68_tree=null;
		Object LBB69_tree=null;
		Object char_literal71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal77_tree=null;
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_LBB=new RewriteRuleTokenStream(adaptor,"token LBB");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_sublist=new RewriteRuleSubtreeStream(adaptor,"rule sublist");

		try {
			// Q.g:180:7: ( ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )* )
			// Q.g:180:9: ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )*
			{
			// Q.g:180:9: ( lexpr -> lexpr )
			// Q.g:180:10: lexpr
			{
			pushFollow(FOLLOW_lexpr_in_refer987);
			lexpr65=lexpr();
			state._fsp--;

			stream_lexpr.add(lexpr65.getTree());
			// AST REWRITE
			// elements: lexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 180:16: -> lexpr
			{
				adaptor.addChild(root_0, stream_lexpr.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:181:6: ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )*
			loop17:
			while (true) {
				int alt17=5;
				switch ( input.LA(1) ) {
				case 83:
					{
					alt17=1;
					}
					break;
				case LBB:
					{
					alt17=2;
					}
					break;
				case 100:
					{
					alt17=3;
					}
					break;
				case 82:
					{
					alt17=4;
					}
					break;
				case 93:
					{
					alt17=4;
					}
					break;
				}
				switch (alt17) {
				case 1 :
					// Q.g:181:7: '(' sublist ')'
					{
					char_literal66=(Token)match(input,83,FOLLOW_83_in_refer1000);  
					stream_83.add(char_literal66);

					pushFollow(FOLLOW_sublist_in_refer1002);
					sublist67=sublist();
					state._fsp--;

					stream_sublist.add(sublist67.getTree());
					char_literal68=(Token)match(input,84,FOLLOW_84_in_refer1004);  
					stream_84.add(char_literal68);

					// AST REWRITE
					// elements: sublist, refer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 182:5: -> ^( XXFUNCALL $refer sublist )
					{
						// Q.g:182:8: ^( XXFUNCALL $refer sublist )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFUNCALL, "XXFUNCALL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_sublist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Q.g:183:5: LBB sublist ']' ']'
					{
					LBB69=(Token)match(input,LBB,FOLLOW_LBB_in_refer1025);  
					stream_LBB.add(LBB69);

					pushFollow(FOLLOW_sublist_in_refer1027);
					sublist70=sublist();
					state._fsp--;

					stream_sublist.add(sublist70.getTree());
					char_literal71=(Token)match(input,102,FOLLOW_102_in_refer1029);  
					stream_102.add(char_literal71);

					char_literal72=(Token)match(input,102,FOLLOW_102_in_refer1031);  
					stream_102.add(char_literal72);

					// AST REWRITE
					// elements: refer, sublist, LBB
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 184:5: -> ^( XXSUBSCRIPT LBB $refer sublist )
					{
						// Q.g:184:8: ^( XXSUBSCRIPT LBB $refer sublist )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUBSCRIPT, "XXSUBSCRIPT"), root_1);
						adaptor.addChild(root_1, stream_LBB.nextNode());
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_sublist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Q.g:185:5: '[' sublist ']'
					{
					char_literal73=(Token)match(input,100,FOLLOW_100_in_refer1054);  
					stream_100.add(char_literal73);

					pushFollow(FOLLOW_sublist_in_refer1056);
					sublist74=sublist();
					state._fsp--;

					stream_sublist.add(sublist74.getTree());
					char_literal75=(Token)match(input,102,FOLLOW_102_in_refer1059);  
					stream_102.add(char_literal75);

					// AST REWRITE
					// elements: 100, sublist, refer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 186:5: -> ^( XXSUBSCRIPT '[' $refer sublist )
					{
						// Q.g:186:8: ^( XXSUBSCRIPT '[' $refer sublist )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUBSCRIPT, "XXSUBSCRIPT"), root_1);
						adaptor.addChild(root_1, stream_100.nextNode());
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_sublist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Q.g:187:5: ( '$' | '@' ) symbol_or_conststr
					{
					// Q.g:187:5: ( '$' | '@' )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==82) ) {
						alt16=1;
					}
					else if ( (LA16_0==93) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// Q.g:187:6: '$'
							{
							char_literal76=(Token)match(input,82,FOLLOW_82_in_refer1083);  
							stream_82.add(char_literal76);

							}
							break;
						case 2 :
							// Q.g:187:12: '@'
							{
							char_literal77=(Token)match(input,93,FOLLOW_93_in_refer1087);  
							stream_93.add(char_literal77);

							}
							break;

					}

					pushFollow(FOLLOW_symbol_or_conststr_in_refer1090);
					symbol_or_conststr78=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(symbol_or_conststr78.getTree());
					// AST REWRITE
					// elements: symbol_or_conststr, 82, refer, 93
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 188:5: -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr )
					{
						// Q.g:188:8: ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						// Q.g:188:19: ( '$' )?
						if ( stream_82.hasNext() ) {
							adaptor.addChild(root_1, stream_82.nextNode());
						}
						stream_82.reset();

						// Q.g:188:24: ( '@' )?
						if ( stream_93.hasNext() ) {
							adaptor.addChild(root_1, stream_93.nextNode());
						}
						stream_93.reset();

						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "refer"


	public static class powerExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powerExpression"
	// Q.g:192:1: powerExpression : ( refer -> refer ) ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )? ;
	public final QParser.powerExpression_return powerExpression() throws RecognitionException {
		QParser.powerExpression_return retval = new QParser.powerExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal80=null;
		ParserRuleReturnScope refer79 =null;
		ParserRuleReturnScope powerExpression81 =null;

		Object char_literal80_tree=null;
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleSubtreeStream stream_refer=new RewriteRuleSubtreeStream(adaptor,"rule refer");
		RewriteRuleSubtreeStream stream_powerExpression=new RewriteRuleSubtreeStream(adaptor,"rule powerExpression");

		try {
			// Q.g:193:5: ( ( refer -> refer ) ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )? )
			// Q.g:193:7: ( refer -> refer ) ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )?
			{
			// Q.g:193:7: ( refer -> refer )
			// Q.g:193:8: refer
			{
			pushFollow(FOLLOW_refer_in_powerExpression1136);
			refer79=refer();
			state._fsp--;

			stream_refer.add(refer79.getTree());
			// AST REWRITE
			// elements: refer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:14: -> refer
			{
				adaptor.addChild(root_0, stream_refer.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:194:5: ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==103) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Q.g:194:7: '^' powerExpression
					{
					char_literal80=(Token)match(input,103,FOLLOW_103_in_powerExpression1149);  
					stream_103.add(char_literal80);

					pushFollow(FOLLOW_powerExpression_in_powerExpression1151);
					powerExpression81=powerExpression();
					state._fsp--;

					stream_powerExpression.add(powerExpression81.getTree());
					// AST REWRITE
					// elements: 103, refer, powerExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 195:9: -> ^( XXBINARY '^' refer powerExpression )
					{
						// Q.g:195:12: ^( XXBINARY '^' refer powerExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_103.nextNode());
						adaptor.addChild(root_1, stream_refer.nextTree());
						adaptor.addChild(root_1, stream_powerExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powerExpression"


	public static class seqExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "seqExpression"
	// Q.g:200:1: seqExpression : ( powerExpression -> powerExpression ) ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )? ;
	public final QParser.seqExpression_return seqExpression() throws RecognitionException {
		QParser.seqExpression_return retval = new QParser.seqExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal83=null;
		ParserRuleReturnScope powerExpression82 =null;
		ParserRuleReturnScope seqExpression84 =null;

		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleSubtreeStream stream_seqExpression=new RewriteRuleSubtreeStream(adaptor,"rule seqExpression");
		RewriteRuleSubtreeStream stream_powerExpression=new RewriteRuleSubtreeStream(adaptor,"rule powerExpression");

		try {
			// Q.g:201:5: ( ( powerExpression -> powerExpression ) ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )? )
			// Q.g:201:7: ( powerExpression -> powerExpression ) ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )?
			{
			// Q.g:201:7: ( powerExpression -> powerExpression )
			// Q.g:201:8: powerExpression
			{
			pushFollow(FOLLOW_powerExpression_in_seqExpression1199);
			powerExpression82=powerExpression();
			state._fsp--;

			stream_powerExpression.add(powerExpression82.getTree());
			// AST REWRITE
			// elements: powerExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 201:24: -> powerExpression
			{
				adaptor.addChild(root_0, stream_powerExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:202:5: ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==90) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Q.g:202:7: ':' seqExpression
					{
					char_literal83=(Token)match(input,90,FOLLOW_90_in_seqExpression1212);  
					stream_90.add(char_literal83);

					pushFollow(FOLLOW_seqExpression_in_seqExpression1214);
					seqExpression84=seqExpression();
					state._fsp--;

					stream_seqExpression.add(seqExpression84.getTree());
					// AST REWRITE
					// elements: seqExpression, 90, powerExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 203:9: -> ^( XXBINARY ':' powerExpression seqExpression )
					{
						// Q.g:203:12: ^( XXBINARY ':' powerExpression seqExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_90.nextNode());
						adaptor.addChild(root_1, stream_powerExpression.nextTree());
						adaptor.addChild(root_1, stream_seqExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "seqExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// Q.g:208:1: additiveExpression : (a= multiplicativeExpression -> $a) ( additive_op b= multiplicativeExpression -> ^( XXBINARY additive_op $additiveExpression $b) )* ;
	public final QParser.additiveExpression_return additiveExpression() throws RecognitionException {
		QParser.additiveExpression_return retval = new QParser.additiveExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope additive_op85 =null;

		RewriteRuleSubtreeStream stream_additive_op=new RewriteRuleSubtreeStream(adaptor,"rule additive_op");
		RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");

		try {
			// Q.g:209:5: ( (a= multiplicativeExpression -> $a) ( additive_op b= multiplicativeExpression -> ^( XXBINARY additive_op $additiveExpression $b) )* )
			// Q.g:209:9: (a= multiplicativeExpression -> $a) ( additive_op b= multiplicativeExpression -> ^( XXBINARY additive_op $additiveExpression $b) )*
			{
			// Q.g:209:9: (a= multiplicativeExpression -> $a)
			// Q.g:209:10: a= multiplicativeExpression
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1266);
			a=multiplicativeExpression();
			state._fsp--;

			stream_multiplicativeExpression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 209:37: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:210:3: ( additive_op b= multiplicativeExpression -> ^( XXBINARY additive_op $additiveExpression $b) )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==86||LA20_0==88) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Q.g:210:5: additive_op b= multiplicativeExpression
					{
					pushFollow(FOLLOW_additive_op_in_additiveExpression1278);
					additive_op85=additive_op();
					state._fsp--;

					stream_additive_op.add(additive_op85.getTree());
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1282);
					b=multiplicativeExpression();
					state._fsp--;

					stream_multiplicativeExpression.add(b.getTree());
					// AST REWRITE
					// elements: additiveExpression, additive_op, b
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 211:5: -> ^( XXBINARY additive_op $additiveExpression $b)
					{
						// Q.g:211:8: ^( XXBINARY additive_op $additiveExpression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_additive_op.nextTree());
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// Q.g:215:1: multiplicativeExpression : (a= seqExpression -> $a) ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )* ;
	public final QParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		QParser.multiplicativeExpression_return retval = new QParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope multicative_op86 =null;

		RewriteRuleSubtreeStream stream_multicative_op=new RewriteRuleSubtreeStream(adaptor,"rule multicative_op");
		RewriteRuleSubtreeStream stream_seqExpression=new RewriteRuleSubtreeStream(adaptor,"rule seqExpression");

		try {
			// Q.g:216:5: ( (a= seqExpression -> $a) ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )* )
			// Q.g:216:9: (a= seqExpression -> $a) ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )*
			{
			// Q.g:216:9: (a= seqExpression -> $a)
			// Q.g:216:10: a= seqExpression
			{
			pushFollow(FOLLOW_seqExpression_in_multiplicativeExpression1327);
			a=seqExpression();
			state._fsp--;

			stream_seqExpression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 216:26: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:217:4: ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==SPECIAL||LA21_0==85||LA21_0==89) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Q.g:218:3: multicative_op b= seqExpression
					{
					pushFollow(FOLLOW_multicative_op_in_multiplicativeExpression1342);
					multicative_op86=multicative_op();
					state._fsp--;

					stream_multicative_op.add(multicative_op86.getTree());
					pushFollow(FOLLOW_seqExpression_in_multiplicativeExpression1346);
					b=seqExpression();
					state._fsp--;

					stream_seqExpression.add(b.getTree());
					// AST REWRITE
					// elements: multicative_op, b, multiplicativeExpression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 219:5: -> ^( XXBINARY multicative_op $multiplicativeExpression $b)
					{
						// Q.g:219:8: ^( XXBINARY multicative_op $multiplicativeExpression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_multicative_op.nextTree());
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inclusiveOrExpression"
	// Q.g:223:1: inclusiveOrExpression : ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )? ;
	public final QParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		QParser.inclusiveOrExpression_return retval = new QParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR88=null;
		ParserRuleReturnScope andExpression87 =null;
		ParserRuleReturnScope inclusiveOrExpression89 =null;

		Object OR88_tree=null;
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");
		RewriteRuleSubtreeStream stream_inclusiveOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule inclusiveOrExpression");

		try {
			// Q.g:224:5: ( ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )? )
			// Q.g:224:9: ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )?
			{
			// Q.g:224:9: ( andExpression -> andExpression )
			// Q.g:224:10: andExpression
			{
			pushFollow(FOLLOW_andExpression_in_inclusiveOrExpression1390);
			andExpression87=andExpression();
			state._fsp--;

			stream_andExpression.add(andExpression87.getTree());
			// AST REWRITE
			// elements: andExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 224:24: -> andExpression
			{
				adaptor.addChild(root_0, stream_andExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:225:3: ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==OR) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Q.g:225:5: OR inclusiveOrExpression
					{
					OR88=(Token)match(input,OR,FOLLOW_OR_in_inclusiveOrExpression1401);  
					stream_OR.add(OR88);

					pushFollow(FOLLOW_inclusiveOrExpression_in_inclusiveOrExpression1403);
					inclusiveOrExpression89=inclusiveOrExpression();
					state._fsp--;

					stream_inclusiveOrExpression.add(inclusiveOrExpression89.getTree());
					// AST REWRITE
					// elements: inclusiveOrExpression, OR, andExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:5: -> ^( XXBINARY OR andExpression inclusiveOrExpression )
					{
						// Q.g:226:8: ^( XXBINARY OR andExpression inclusiveOrExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_OR.nextNode());
						adaptor.addChild(root_1, stream_andExpression.nextTree());
						adaptor.addChild(root_1, stream_inclusiveOrExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inclusiveOrExpression"


	public static class andExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpression"
	// Q.g:230:1: andExpression : ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )? ;
	public final QParser.andExpression_return andExpression() throws RecognitionException {
		QParser.andExpression_return retval = new QParser.andExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND91=null;
		ParserRuleReturnScope relationalExpression90 =null;
		ParserRuleReturnScope andExpression92 =null;

		Object AND91_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");
		RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");

		try {
			// Q.g:231:5: ( ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )? )
			// Q.g:231:9: ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )?
			{
			// Q.g:231:9: ( relationalExpression -> relationalExpression )
			// Q.g:231:10: relationalExpression
			{
			pushFollow(FOLLOW_relationalExpression_in_andExpression1443);
			relationalExpression90=relationalExpression();
			state._fsp--;

			stream_relationalExpression.add(relationalExpression90.getTree());
			// AST REWRITE
			// elements: relationalExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 231:31: -> relationalExpression
			{
				adaptor.addChild(root_0, stream_relationalExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:232:3: ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==AND) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Q.g:232:5: AND andExpression
					{
					AND91=(Token)match(input,AND,FOLLOW_AND_in_andExpression1454);  
					stream_AND.add(AND91);

					pushFollow(FOLLOW_andExpression_in_andExpression1456);
					andExpression92=andExpression();
					state._fsp--;

					stream_andExpression.add(andExpression92.getTree());
					// AST REWRITE
					// elements: andExpression, relationalExpression, AND
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 233:5: -> ^( XXBINARY AND relationalExpression andExpression )
					{
						// Q.g:233:8: ^( XXBINARY AND relationalExpression andExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_AND.nextNode());
						adaptor.addChild(root_1, stream_relationalExpression.nextTree());
						adaptor.addChild(root_1, stream_andExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// Q.g:238:1: relationalExpression : ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )? ;
	public final QParser.relationalExpression_return relationalExpression() throws RecognitionException {
		QParser.relationalExpression_return retval = new QParser.relationalExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope additiveExpression93 =null;
		ParserRuleReturnScope relationalOp94 =null;
		ParserRuleReturnScope relationalExpression95 =null;

		RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
		RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");
		RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");

		try {
			// Q.g:239:5: ( ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )? )
			// Q.g:239:9: ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )?
			{
			// Q.g:239:9: ( additiveExpression -> additiveExpression )
			// Q.g:239:10: additiveExpression
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression1497);
			additiveExpression93=additiveExpression();
			state._fsp--;

			stream_additiveExpression.add(additiveExpression93.getTree());
			// AST REWRITE
			// elements: additiveExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 239:29: -> additiveExpression
			{
				adaptor.addChild(root_0, stream_additiveExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:240:3: ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==AND2||LA24_0==EQ||(LA24_0 >= GE && LA24_0 <= GT)||LA24_0==LE||LA24_0==LT||LA24_0==NE||LA24_0==OR2) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Q.g:240:5: relationalOp relationalExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression1508);
					relationalOp94=relationalOp();
					state._fsp--;

					stream_relationalOp.add(relationalOp94.getTree());
					pushFollow(FOLLOW_relationalExpression_in_relationalExpression1510);
					relationalExpression95=relationalExpression();
					state._fsp--;

					stream_relationalExpression.add(relationalExpression95.getTree());
					// AST REWRITE
					// elements: relationalExpression, relationalOp, additiveExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 241:5: -> ^( XXBINARY relationalOp additiveExpression relationalExpression )
					{
						// Q.g:241:8: ^( XXBINARY relationalOp additiveExpression relationalExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_relationalOp.nextTree());
						adaptor.addChild(root_1, stream_additiveExpression.nextTree());
						adaptor.addChild(root_1, stream_relationalExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class tildeExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tildeExpression"
	// Q.g:245:1: tildeExpression : ( inclusiveOrExpression -> inclusiveOrExpression ) ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )? ;
	public final QParser.tildeExpression_return tildeExpression() throws RecognitionException {
		QParser.tildeExpression_return retval = new QParser.tildeExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal97=null;
		ParserRuleReturnScope inclusiveOrExpression96 =null;
		ParserRuleReturnScope tildeExpression98 =null;

		Object char_literal97_tree=null;
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleSubtreeStream stream_inclusiveOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule inclusiveOrExpression");
		RewriteRuleSubtreeStream stream_tildeExpression=new RewriteRuleSubtreeStream(adaptor,"rule tildeExpression");

		try {
			// Q.g:246:5: ( ( inclusiveOrExpression -> inclusiveOrExpression ) ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )? )
			// Q.g:246:7: ( inclusiveOrExpression -> inclusiveOrExpression ) ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )?
			{
			// Q.g:246:7: ( inclusiveOrExpression -> inclusiveOrExpression )
			// Q.g:246:8: inclusiveOrExpression
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_tildeExpression1548);
			inclusiveOrExpression96=inclusiveOrExpression();
			state._fsp--;

			stream_inclusiveOrExpression.add(inclusiveOrExpression96.getTree());
			// AST REWRITE
			// elements: inclusiveOrExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 246:30: -> inclusiveOrExpression
			{
				adaptor.addChild(root_0, stream_inclusiveOrExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:247:5: ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==106) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Q.g:248:5: '~' tildeExpression
					{
					char_literal97=(Token)match(input,106,FOLLOW_106_in_tildeExpression1564);  
					stream_106.add(char_literal97);

					pushFollow(FOLLOW_tildeExpression_in_tildeExpression1566);
					tildeExpression98=tildeExpression();
					state._fsp--;

					stream_tildeExpression.add(tildeExpression98.getTree());
					// AST REWRITE
					// elements: inclusiveOrExpression, 106, tildeExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 249:7: -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression )
					{
						// Q.g:249:10: ^( XXBINARY '~' inclusiveOrExpression tildeExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_106.nextNode());
						adaptor.addChild(root_1, stream_inclusiveOrExpression.nextTree());
						adaptor.addChild(root_1, stream_tildeExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tildeExpression"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Q.g:253:1: expr : ( tildeExpression -> tildeExpression ) ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )? ;
	public final QParser.expr_return expr() throws RecognitionException {
		QParser.expr_return retval = new QParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope tildeExpression99 =null;
		ParserRuleReturnScope assign_op100 =null;
		ParserRuleReturnScope expr101 =null;

		RewriteRuleSubtreeStream stream_tildeExpression=new RewriteRuleSubtreeStream(adaptor,"rule tildeExpression");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_assign_op=new RewriteRuleSubtreeStream(adaptor,"rule assign_op");

		try {
			// Q.g:253:6: ( ( tildeExpression -> tildeExpression ) ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )? )
			// Q.g:253:8: ( tildeExpression -> tildeExpression ) ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )?
			{
			// Q.g:253:8: ( tildeExpression -> tildeExpression )
			// Q.g:253:9: tildeExpression
			{
			pushFollow(FOLLOW_tildeExpression_in_expr1608);
			tildeExpression99=tildeExpression();
			state._fsp--;

			stream_tildeExpression.add(tildeExpression99.getTree());
			// AST REWRITE
			// elements: tildeExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 253:25: -> tildeExpression
			{
				adaptor.addChild(root_0, stream_tildeExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:254:6: ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ENCLOSED_ASSIGN||LA26_0==LEFT_ASSIGN||LA26_0==RIGHT_ASSIGN||LA26_0==92) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Q.g:255:3: assign_op expr
					{
					pushFollow(FOLLOW_assign_op_in_expr1623);
					assign_op100=assign_op();
					state._fsp--;

					stream_assign_op.add(assign_op100.getTree());
					pushFollow(FOLLOW_expr_in_expr1625);
					expr101=expr();
					state._fsp--;

					stream_expr.add(expr101.getTree());
					// AST REWRITE
					// elements: expr, tildeExpression, assign_op
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 256:5: -> ^( XXBINARY assign_op tildeExpression expr )
					{
						// Q.g:256:8: ^( XXBINARY assign_op tildeExpression expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_assign_op.nextTree());
						adaptor.addChild(root_1, stream_tildeExpression.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class cond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// Q.g:261:1: cond : '(' expr ')' -> ^( XXCOND expr ) ;
	public final QParser.cond_return cond() throws RecognitionException {
		QParser.cond_return retval = new QParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal102=null;
		Token char_literal104=null;
		ParserRuleReturnScope expr103 =null;

		Object char_literal102_tree=null;
		Object char_literal104_tree=null;
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:261:6: ( '(' expr ')' -> ^( XXCOND expr ) )
			// Q.g:261:8: '(' expr ')'
			{
			char_literal102=(Token)match(input,83,FOLLOW_83_in_cond1660);  
			stream_83.add(char_literal102);

			pushFollow(FOLLOW_expr_in_cond1662);
			expr103=expr();
			state._fsp--;

			stream_expr.add(expr103.getTree());
			char_literal104=(Token)match(input,84,FOLLOW_84_in_cond1664);  
			stream_84.add(char_literal104);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 262:2: -> ^( XXCOND expr )
			{
				// Q.g:262:4: ^( XXCOND expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXCOND, "XXCOND"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class ifcond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifcond"
	// Q.g:265:1: ifcond : '(' expr ')' -> ^( XXIFCOND expr ) ;
	public final QParser.ifcond_return ifcond() throws RecognitionException {
		QParser.ifcond_return retval = new QParser.ifcond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope expr106 =null;

		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:265:8: ( '(' expr ')' -> ^( XXIFCOND expr ) )
			// Q.g:265:10: '(' expr ')'
			{
			char_literal105=(Token)match(input,83,FOLLOW_83_in_ifcond1682);  
			stream_83.add(char_literal105);

			pushFollow(FOLLOW_expr_in_ifcond1684);
			expr106=expr();
			state._fsp--;

			stream_expr.add(expr106.getTree());
			char_literal107=(Token)match(input,84,FOLLOW_84_in_ifcond1686);  
			stream_84.add(char_literal107);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 266:2: -> ^( XXIFCOND expr )
			{
				// Q.g:266:5: ^( XXIFCOND expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXIFCOND, "XXIFCOND"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifcond"


	public static class forcond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forcond"
	// Q.g:269:1: forcond : '(' SYMBOL IN expr ')' -> ^( XXFORCOND SYMBOL expr ) ;
	public final QParser.forcond_return forcond() throws RecognitionException {
		QParser.forcond_return retval = new QParser.forcond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal108=null;
		Token SYMBOL109=null;
		Token IN110=null;
		Token char_literal112=null;
		ParserRuleReturnScope expr111 =null;

		Object char_literal108_tree=null;
		Object SYMBOL109_tree=null;
		Object IN110_tree=null;
		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:269:9: ( '(' SYMBOL IN expr ')' -> ^( XXFORCOND SYMBOL expr ) )
			// Q.g:269:11: '(' SYMBOL IN expr ')'
			{
			char_literal108=(Token)match(input,83,FOLLOW_83_in_forcond1705);  
			stream_83.add(char_literal108);

			SYMBOL109=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_forcond1707);  
			stream_SYMBOL.add(SYMBOL109);

			IN110=(Token)match(input,IN,FOLLOW_IN_in_forcond1709);  
			stream_IN.add(IN110);

			pushFollow(FOLLOW_expr_in_forcond1711);
			expr111=expr();
			state._fsp--;

			stream_expr.add(expr111.getTree());
			char_literal112=(Token)match(input,84,FOLLOW_84_in_forcond1713);  
			stream_84.add(char_literal112);

			// AST REWRITE
			// elements: expr, SYMBOL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 270:2: -> ^( XXFORCOND SYMBOL expr )
			{
				// Q.g:270:5: ^( XXFORCOND SYMBOL expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFORCOND, "XXFORCOND"), root_1);
				adaptor.addChild(root_1, stream_SYMBOL.nextNode());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forcond"


	public static class sublist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sublist"
	// Q.g:286:1: fragment sublist : sub ( cr ',' sub )* ( EOF )? -> ^( XXSUBLIST ( sub )* ) ;
	public final QParser.sublist_return sublist() throws RecognitionException {
		QParser.sublist_return retval = new QParser.sublist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal115=null;
		Token EOF117=null;
		ParserRuleReturnScope sub113 =null;
		ParserRuleReturnScope cr114 =null;
		ParserRuleReturnScope sub116 =null;

		Object char_literal115_tree=null;
		Object EOF117_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_cr=new RewriteRuleSubtreeStream(adaptor,"rule cr");
		RewriteRuleSubtreeStream stream_sub=new RewriteRuleSubtreeStream(adaptor,"rule sub");

		try {
			// Q.g:286:9: ( sub ( cr ',' sub )* ( EOF )? -> ^( XXSUBLIST ( sub )* ) )
			// Q.g:286:11: sub ( cr ',' sub )* ( EOF )?
			{
			pushFollow(FOLLOW_sub_in_sublist1741);
			sub113=sub();
			state._fsp--;

			stream_sub.add(sub113.getTree());
			// Q.g:286:15: ( cr ',' sub )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==BREAK||LA27_0==DecimalLiteral||(LA27_0 >= FALSE && LA27_0 <= FUNCTION)||LA27_0==FloatingPointLiteral||(LA27_0 >= HexLiteral && LA27_0 <= IF)||LA27_0==NA||LA27_0==NEXT||LA27_0==NULL_CONST||(LA27_0 >= OctalLiteral && LA27_0 <= REPEAT)||(LA27_0 >= STR_CONST && LA27_0 <= TRUE)||LA27_0==WHILE||LA27_0==81||LA27_0==83||(LA27_0 >= 86 && LA27_0 <= 88)||LA27_0==92||(LA27_0 >= 94 && LA27_0 <= 99)||LA27_0==104||LA27_0==106) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Q.g:286:16: cr ',' sub
					{
					pushFollow(FOLLOW_cr_in_sublist1744);
					cr114=cr();
					state._fsp--;

					stream_cr.add(cr114.getTree());
					char_literal115=(Token)match(input,87,FOLLOW_87_in_sublist1746);  
					stream_87.add(char_literal115);

					pushFollow(FOLLOW_sub_in_sublist1748);
					sub116=sub();
					state._fsp--;

					stream_sub.add(sub116.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			// Q.g:286:29: ( EOF )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EOF) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Q.g:286:29: EOF
					{
					EOF117=(Token)match(input,EOF,FOLLOW_EOF_in_sublist1752);  
					stream_EOF.add(EOF117);

					}
					break;

			}

			// AST REWRITE
			// elements: sub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 287:3: -> ^( XXSUBLIST ( sub )* )
			{
				// Q.g:287:6: ^( XXSUBLIST ( sub )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUBLIST, "XXSUBLIST"), root_1);
				// Q.g:287:18: ( sub )*
				while ( stream_sub.hasNext() ) {
					adaptor.addChild(root_1, stream_sub.nextTree());
				}
				stream_sub.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sublist"


	public static class sub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sub"
	// Q.g:291:1: fragment sub : ( -> ^( XXSUB0 ) | expr -> ^( XXSUB1 expr ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr ) );
	public final QParser.sub_return sub() throws RecognitionException {
		QParser.sub_return retval = new QParser.sub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NULL_CONST120=null;
		Token EQ_ASSIGN121=null;
		Token NULL_CONST123=null;
		Token EQ_ASSIGN124=null;
		ParserRuleReturnScope expr118 =null;
		ParserRuleReturnScope symbol_or_conststr119 =null;
		ParserRuleReturnScope symbol_or_conststr122 =null;
		ParserRuleReturnScope expr125 =null;

		Object NULL_CONST120_tree=null;
		Object EQ_ASSIGN121_tree=null;
		Object NULL_CONST123_tree=null;
		Object EQ_ASSIGN124_tree=null;
		RewriteRuleTokenStream stream_NULL_CONST=new RewriteRuleTokenStream(adaptor,"token NULL_CONST");
		RewriteRuleTokenStream stream_EQ_ASSIGN=new RewriteRuleTokenStream(adaptor,"token EQ_ASSIGN");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:291:5: ( -> ^( XXSUB0 ) | expr -> ^( XXSUB1 expr ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr ) )
			int alt31=4;
			switch ( input.LA(1) ) {
			case EOF:
			case 84:
			case 87:
			case 102:
				{
				alt31=1;
				}
				break;
			case BREAK:
			case DecimalLiteral:
			case FALSE:
			case FOR:
			case FUNCTION:
			case FloatingPointLiteral:
			case HexLiteral:
			case IF:
			case NA:
			case NEXT:
			case OctalLiteral:
			case REPEAT:
			case TRUE:
			case WHILE:
			case 81:
			case 83:
			case 86:
			case 88:
			case 92:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 104:
			case 106:
				{
				alt31=2;
				}
				break;
			case STR_CONST:
				{
				int LA31_3 = input.LA(2);
				if ( (LA31_3==EOF||(LA31_3 >= AND && LA31_3 <= AND2)||(LA31_3 >= ENCLOSED_ASSIGN && LA31_3 <= EQ)||(LA31_3 >= GE && LA31_3 <= GT)||(LA31_3 >= LBB && LA31_3 <= LT)||LA31_3==NE||(LA31_3 >= NS_GET && LA31_3 <= NS_GET_INT)||(LA31_3 >= OR && LA31_3 <= OR2)||(LA31_3 >= RIGHT_ASSIGN && LA31_3 <= SPECIAL)||(LA31_3 >= 82 && LA31_3 <= 90)||(LA31_3 >= 92 && LA31_3 <= 93)||LA31_3==100||(LA31_3 >= 102 && LA31_3 <= 103)||LA31_3==106) ) {
					alt31=2;
				}
				else if ( (LA31_3==EQ_ASSIGN) ) {
					int LA31_6 = input.LA(3);
					if ( (LA31_6==EOF||LA31_6==84||LA31_6==87||LA31_6==102) ) {
						alt31=3;
					}
					else if ( (LA31_6==BREAK||LA31_6==DecimalLiteral||(LA31_6 >= FALSE && LA31_6 <= FUNCTION)||LA31_6==FloatingPointLiteral||(LA31_6 >= HexLiteral && LA31_6 <= IF)||LA31_6==NA||LA31_6==NEXT||LA31_6==NULL_CONST||(LA31_6 >= OctalLiteral && LA31_6 <= REPEAT)||(LA31_6 >= STR_CONST && LA31_6 <= TRUE)||LA31_6==WHILE||LA31_6==81||LA31_6==83||LA31_6==86||LA31_6==88||LA31_6==92||(LA31_6 >= 94 && LA31_6 <= 99)||LA31_6==104||LA31_6==106) ) {
						alt31=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL_CONST:
				{
				int LA31_4 = input.LA(2);
				if ( (LA31_4==EOF||(LA31_4 >= AND && LA31_4 <= AND2)||(LA31_4 >= ENCLOSED_ASSIGN && LA31_4 <= EQ)||(LA31_4 >= GE && LA31_4 <= GT)||(LA31_4 >= LBB && LA31_4 <= LT)||LA31_4==NE||(LA31_4 >= OR && LA31_4 <= OR2)||(LA31_4 >= RIGHT_ASSIGN && LA31_4 <= SPECIAL)||(LA31_4 >= 82 && LA31_4 <= 90)||(LA31_4 >= 92 && LA31_4 <= 93)||LA31_4==100||(LA31_4 >= 102 && LA31_4 <= 103)||LA31_4==106) ) {
					alt31=2;
				}
				else if ( (LA31_4==EQ_ASSIGN) ) {
					int LA31_6 = input.LA(3);
					if ( (LA31_6==EOF||LA31_6==84||LA31_6==87||LA31_6==102) ) {
						alt31=3;
					}
					else if ( (LA31_6==BREAK||LA31_6==DecimalLiteral||(LA31_6 >= FALSE && LA31_6 <= FUNCTION)||LA31_6==FloatingPointLiteral||(LA31_6 >= HexLiteral && LA31_6 <= IF)||LA31_6==NA||LA31_6==NEXT||LA31_6==NULL_CONST||(LA31_6 >= OctalLiteral && LA31_6 <= REPEAT)||(LA31_6 >= STR_CONST && LA31_6 <= TRUE)||LA31_6==WHILE||LA31_6==81||LA31_6==83||LA31_6==86||LA31_6==88||LA31_6==92||(LA31_6 >= 94 && LA31_6 <= 99)||LA31_6==104||LA31_6==106) ) {
						alt31=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SYMBOL:
				{
				int LA31_5 = input.LA(2);
				if ( (LA31_5==EOF||(LA31_5 >= AND && LA31_5 <= AND2)||(LA31_5 >= ENCLOSED_ASSIGN && LA31_5 <= EQ)||(LA31_5 >= GE && LA31_5 <= GT)||(LA31_5 >= LBB && LA31_5 <= LT)||LA31_5==NE||(LA31_5 >= NS_GET && LA31_5 <= NS_GET_INT)||(LA31_5 >= OR && LA31_5 <= OR2)||(LA31_5 >= RIGHT_ASSIGN && LA31_5 <= SPECIAL)||(LA31_5 >= 82 && LA31_5 <= 90)||(LA31_5 >= 92 && LA31_5 <= 93)||LA31_5==100||(LA31_5 >= 102 && LA31_5 <= 103)||LA31_5==106) ) {
					alt31=2;
				}
				else if ( (LA31_5==EQ_ASSIGN) ) {
					int LA31_6 = input.LA(3);
					if ( (LA31_6==EOF||LA31_6==84||LA31_6==87||LA31_6==102) ) {
						alt31=3;
					}
					else if ( (LA31_6==BREAK||LA31_6==DecimalLiteral||(LA31_6 >= FALSE && LA31_6 <= FUNCTION)||LA31_6==FloatingPointLiteral||(LA31_6 >= HexLiteral && LA31_6 <= IF)||LA31_6==NA||LA31_6==NEXT||LA31_6==NULL_CONST||(LA31_6 >= OctalLiteral && LA31_6 <= REPEAT)||(LA31_6 >= STR_CONST && LA31_6 <= TRUE)||LA31_6==WHILE||LA31_6==81||LA31_6==83||LA31_6==86||LA31_6==88||LA31_6==92||(LA31_6 >= 94 && LA31_6 <= 99)||LA31_6==104||LA31_6==106) ) {
						alt31=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// Q.g:291:7: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 291:7: -> ^( XXSUB0 )
					{
						// Q.g:291:10: ^( XXSUB0 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUB0, "XXSUB0"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Q.g:292:4: expr
					{
					pushFollow(FOLLOW_expr_in_sub1785);
					expr118=expr();
					state._fsp--;

					stream_expr.add(expr118.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 292:9: -> ^( XXSUB1 expr )
					{
						// Q.g:292:12: ^( XXSUB1 expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUB1, "XXSUB1"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Q.g:293:4: ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN
					{
					// Q.g:293:4: ( symbol_or_conststr | NULL_CONST )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( ((LA29_0 >= STR_CONST && LA29_0 <= SYMBOL)) ) {
						alt29=1;
					}
					else if ( (LA29_0==NULL_CONST) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// Q.g:293:5: symbol_or_conststr
							{
							pushFollow(FOLLOW_symbol_or_conststr_in_sub1799);
							symbol_or_conststr119=symbol_or_conststr();
							state._fsp--;

							stream_symbol_or_conststr.add(symbol_or_conststr119.getTree());
							}
							break;
						case 2 :
							// Q.g:293:26: NULL_CONST
							{
							NULL_CONST120=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_sub1803);  
							stream_NULL_CONST.add(NULL_CONST120);

							}
							break;

					}

					EQ_ASSIGN121=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_sub1806);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN121);

					// AST REWRITE
					// elements: symbol_or_conststr, NULL_CONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 293:48: -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? )
					{
						// Q.g:293:51: ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSYMSUB0, "XXSYMSUB0"), root_1);
						// Q.g:293:63: ( symbol_or_conststr )?
						if ( stream_symbol_or_conststr.hasNext() ) {
							adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						}
						stream_symbol_or_conststr.reset();

						// Q.g:293:83: ( NULL_CONST )?
						if ( stream_NULL_CONST.hasNext() ) {
							adaptor.addChild(root_1, stream_NULL_CONST.nextNode());
						}
						stream_NULL_CONST.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Q.g:294:4: ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr
					{
					// Q.g:294:4: ( symbol_or_conststr | NULL_CONST )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( ((LA30_0 >= STR_CONST && LA30_0 <= SYMBOL)) ) {
						alt30=1;
					}
					else if ( (LA30_0==NULL_CONST) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// Q.g:294:5: symbol_or_conststr
							{
							pushFollow(FOLLOW_symbol_or_conststr_in_sub1824);
							symbol_or_conststr122=symbol_or_conststr();
							state._fsp--;

							stream_symbol_or_conststr.add(symbol_or_conststr122.getTree());
							}
							break;
						case 2 :
							// Q.g:294:26: NULL_CONST
							{
							NULL_CONST123=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_sub1828);  
							stream_NULL_CONST.add(NULL_CONST123);

							}
							break;

					}

					EQ_ASSIGN124=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_sub1831);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN124);

					pushFollow(FOLLOW_expr_in_sub1833);
					expr125=expr();
					state._fsp--;

					stream_expr.add(expr125.getTree());
					// AST REWRITE
					// elements: expr, symbol_or_conststr, NULL_CONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 294:53: -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr )
					{
						// Q.g:294:55: ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSYMSUB1, "XXSYMSUB1"), root_1);
						// Q.g:294:67: ( symbol_or_conststr )?
						if ( stream_symbol_or_conststr.hasNext() ) {
							adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						}
						stream_symbol_or_conststr.reset();

						// Q.g:294:87: ( NULL_CONST )?
						if ( stream_NULL_CONST.hasNext() ) {
							adaptor.addChild(root_1, stream_NULL_CONST.nextNode());
						}
						stream_NULL_CONST.reset();

						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sub"


	public static class cr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cr"
	// Q.g:306:1: cr :;
	public final QParser.cr_return cr() throws RecognitionException {
		QParser.cr_return retval = new QParser.cr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		try {
			// Q.g:306:4: ()
			// Q.g:307:2: 
			{
			root_0 = (Object)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cr"


	public static class integerLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "integerLiteral"
	// Q.g:339:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final QParser.integerLiteral_return integerLiteral() throws RecognitionException {
		QParser.integerLiteral_return retval = new QParser.integerLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set126=null;

		Object set126_tree=null;

		try {
			// Q.g:339:16: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set126=input.LT(1);
			if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set126));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integerLiteral"


	public static class num_const_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "num_const"
	// Q.g:345:1: num_const : ( integerLiteral | FloatingPointLiteral | NA | TRUE | FALSE | 'Inf' | 'NaN' | 'NA_integer_' | 'NA_real_' | 'NA_character_' | 'NA_complex_' );
	public final QParser.num_const_return num_const() throws RecognitionException {
		QParser.num_const_return retval = new QParser.num_const_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FloatingPointLiteral128=null;
		Token NA129=null;
		Token TRUE130=null;
		Token FALSE131=null;
		Token string_literal132=null;
		Token string_literal133=null;
		Token string_literal134=null;
		Token string_literal135=null;
		Token string_literal136=null;
		Token string_literal137=null;
		ParserRuleReturnScope integerLiteral127 =null;

		Object FloatingPointLiteral128_tree=null;
		Object NA129_tree=null;
		Object TRUE130_tree=null;
		Object FALSE131_tree=null;
		Object string_literal132_tree=null;
		Object string_literal133_tree=null;
		Object string_literal134_tree=null;
		Object string_literal135_tree=null;
		Object string_literal136_tree=null;
		Object string_literal137_tree=null;

		try {
			// Q.g:346:2: ( integerLiteral | FloatingPointLiteral | NA | TRUE | FALSE | 'Inf' | 'NaN' | 'NA_integer_' | 'NA_real_' | 'NA_character_' | 'NA_complex_' )
			int alt32=11;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt32=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt32=2;
				}
				break;
			case NA:
				{
				alt32=3;
				}
				break;
			case TRUE:
				{
				alt32=4;
				}
				break;
			case FALSE:
				{
				alt32=5;
				}
				break;
			case 94:
				{
				alt32=6;
				}
				break;
			case 99:
				{
				alt32=7;
				}
				break;
			case 97:
				{
				alt32=8;
				}
				break;
			case 98:
				{
				alt32=9;
				}
				break;
			case 95:
				{
				alt32=10;
				}
				break;
			case 96:
				{
				alt32=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// Q.g:346:4: integerLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integerLiteral_in_num_const2154);
					integerLiteral127=integerLiteral();
					state._fsp--;

					adaptor.addChild(root_0, integerLiteral127.getTree());

					}
					break;
				case 2 :
					// Q.g:347:4: FloatingPointLiteral
					{
					root_0 = (Object)adaptor.nil();


					FloatingPointLiteral128=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_num_const2159); 
					FloatingPointLiteral128_tree = (Object)adaptor.create(FloatingPointLiteral128);
					adaptor.addChild(root_0, FloatingPointLiteral128_tree);

					}
					break;
				case 3 :
					// Q.g:348:4: NA
					{
					root_0 = (Object)adaptor.nil();


					NA129=(Token)match(input,NA,FOLLOW_NA_in_num_const2164); 
					NA129_tree = (Object)adaptor.create(NA129);
					adaptor.addChild(root_0, NA129_tree);

					}
					break;
				case 4 :
					// Q.g:349:4: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE130=(Token)match(input,TRUE,FOLLOW_TRUE_in_num_const2169); 
					TRUE130_tree = (Object)adaptor.create(TRUE130);
					adaptor.addChild(root_0, TRUE130_tree);

					}
					break;
				case 5 :
					// Q.g:350:4: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE131=(Token)match(input,FALSE,FOLLOW_FALSE_in_num_const2174); 
					FALSE131_tree = (Object)adaptor.create(FALSE131);
					adaptor.addChild(root_0, FALSE131_tree);

					}
					break;
				case 6 :
					// Q.g:351:4: 'Inf'
					{
					root_0 = (Object)adaptor.nil();


					string_literal132=(Token)match(input,94,FOLLOW_94_in_num_const2179); 
					string_literal132_tree = (Object)adaptor.create(string_literal132);
					adaptor.addChild(root_0, string_literal132_tree);

					}
					break;
				case 7 :
					// Q.g:352:4: 'NaN'
					{
					root_0 = (Object)adaptor.nil();


					string_literal133=(Token)match(input,99,FOLLOW_99_in_num_const2184); 
					string_literal133_tree = (Object)adaptor.create(string_literal133);
					adaptor.addChild(root_0, string_literal133_tree);

					}
					break;
				case 8 :
					// Q.g:353:4: 'NA_integer_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal134=(Token)match(input,97,FOLLOW_97_in_num_const2189); 
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

					}
					break;
				case 9 :
					// Q.g:354:4: 'NA_real_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal135=(Token)match(input,98,FOLLOW_98_in_num_const2194); 
					string_literal135_tree = (Object)adaptor.create(string_literal135);
					adaptor.addChild(root_0, string_literal135_tree);

					}
					break;
				case 10 :
					// Q.g:355:4: 'NA_character_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal136=(Token)match(input,95,FOLLOW_95_in_num_const2199); 
					string_literal136_tree = (Object)adaptor.create(string_literal136);
					adaptor.addChild(root_0, string_literal136_tree);

					}
					break;
				case 11 :
					// Q.g:356:4: 'NA_complex_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal137=(Token)match(input,96,FOLLOW_96_in_num_const2204); 
					string_literal137_tree = (Object)adaptor.create(string_literal137);
					adaptor.addChild(root_0, string_literal137_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "num_const"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\5\uffff";
	static final String DFA1_eofS =
		"\2\2\1\uffff\1\2\1\uffff";
	static final String DFA1_minS =
		"\1\133\1\6\1\uffff\1\6\1\uffff";
	static final String DFA1_maxS =
		"\1\145\1\152\1\uffff\1\152\1\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA1_specialS =
		"\5\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\3\11\uffff\1\1",
			"\1\4\1\uffff\1\4\6\uffff\3\4\1\uffff\1\4\3\uffff\2\4\10\uffff\1\4\1"+
			"\uffff\1\4\2\uffff\1\4\3\uffff\2\4\2\uffff\3\4\1\uffff\1\4\36\uffff\1"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\3\1\4\1\uffff\6\4\1"+
			"\uffff\1\1\2\uffff\1\4\1\uffff\1\4",
			"",
			"\1\4\1\uffff\1\4\6\uffff\3\4\1\uffff\1\4\3\uffff\2\4\10\uffff\1\4\1"+
			"\uffff\1\4\2\uffff\1\4\3\uffff\2\4\2\uffff\3\4\1\uffff\1\4\36\uffff\1"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\3\1\4\1\uffff\6\4\1"+
			"\uffff\1\1\2\uffff\1\4\1\uffff\1\4",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 94:19: ( prog_continue )*";
		}
	}

	public static final BitSet FOLLOW_prog_begin_in_prog295 = new BitSet(new long[]{0x0000000000000002L,0x0000002008000000L});
	public static final BitSet FOLLOW_prog_continue_in_prog297 = new BitSet(new long[]{0x0000000000000002L,0x0000002008000000L});
	public static final BitSet FOLLOW_101_in_prog_begin318 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000052FD94A0000L});
	public static final BitSet FOLLOW_91_in_prog_begin322 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000052FD94A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_prog_begin326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_prog_continue352 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000052FD94A0000L});
	public static final BitSet FOLLOW_91_in_prog_continue356 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000052FD94A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_prog_continue360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_or_assign386 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_expr_or_assign392 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_expr_or_assign394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formalarg477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formalarg490 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_formalarg492 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_formalarg494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalarg_in_formlist514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_formlist517 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_formalarg_in_formlist519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_EOF_in_formlist525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_const_in_lexpr550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_CONST_in_lexpr555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_CONST_in_lexpr560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_lexpr565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_lexpr570 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000052FD14A0000L});
	public static final BitSet FOLLOW_101_in_lexpr572 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000052FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr575 = new BitSet(new long[]{0x0000000000000000L,0x0000022008000000L});
	public static final BitSet FOLLOW_91_in_lexpr579 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000072FD94A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr581 = new BitSet(new long[]{0x0000000000000000L,0x0000022008000000L});
	public static final BitSet FOLLOW_101_in_lexpr588 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000072FD94A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr590 = new BitSet(new long[]{0x0000000000000000L,0x0000022008000000L});
	public static final BitSet FOLLOW_105_in_lexpr596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_lexpr612 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_lexpr616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_op_in_lexpr632 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_lexpr634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_lexpr651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_lexpr653 = new BitSet(new long[]{0x0000800000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_formlist_in_lexpr655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_lexpr657 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_cr_in_lexpr659 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_lexpr678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ifcond_in_lexpr680 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr684 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ELSE_in_lexpr687 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_lexpr715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_forcond_in_lexpr717 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_lexpr736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_cond_in_lexpr738 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_lexpr757 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr777 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_NS_GET_in_lexpr780 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr810 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_NS_GET_INT_in_lexpr813 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_lexpr840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_lexpr855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_in_refer987 = new BitSet(new long[]{0x0000000010000002L,0x00000010200C0000L});
	public static final BitSet FOLLOW_83_in_refer1000 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD1CA0000L});
	public static final BitSet FOLLOW_sublist_in_refer1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_refer1004 = new BitSet(new long[]{0x0000000010000002L,0x00000010200C0000L});
	public static final BitSet FOLLOW_LBB_in_refer1025 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD1CA0000L});
	public static final BitSet FOLLOW_sublist_in_refer1027 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_refer1029 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_refer1031 = new BitSet(new long[]{0x0000000010000002L,0x00000010200C0000L});
	public static final BitSet FOLLOW_100_in_refer1054 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD1CA0000L});
	public static final BitSet FOLLOW_sublist_in_refer1056 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_refer1059 = new BitSet(new long[]{0x0000000010000002L,0x00000010200C0000L});
	public static final BitSet FOLLOW_82_in_refer1083 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_93_in_refer1087 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_refer1090 = new BitSet(new long[]{0x0000000010000002L,0x00000010200C0000L});
	public static final BitSet FOLLOW_refer_in_powerExpression1136 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_103_in_powerExpression1149 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_powerExpression_in_powerExpression1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_powerExpression_in_seqExpression1199 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_seqExpression1212 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_seqExpression_in_seqExpression1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1266 = new BitSet(new long[]{0x0000000000000002L,0x0000000001400000L});
	public static final BitSet FOLLOW_additive_op_in_additiveExpression1278 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1282 = new BitSet(new long[]{0x0000000000000002L,0x0000000001400000L});
	public static final BitSet FOLLOW_seqExpression_in_multiplicativeExpression1327 = new BitSet(new long[]{0x0000200000000002L,0x0000000002200000L});
	public static final BitSet FOLLOW_multicative_op_in_multiplicativeExpression1342 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_seqExpression_in_multiplicativeExpression1346 = new BitSet(new long[]{0x0000200000000002L,0x0000000002200000L});
	public static final BitSet FOLLOW_andExpression_in_inclusiveOrExpression1390 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_OR_in_inclusiveOrExpression1401 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_inclusiveOrExpression1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_andExpression1443 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_andExpression1454 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_andExpression_in_andExpression1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1497 = new BitSet(new long[]{0x00000104A0300822L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression1508 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_tildeExpression1548 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_tildeExpression1564 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_tildeExpression_in_tildeExpression1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tildeExpression_in_expr1608 = new BitSet(new long[]{0x0000100040000402L,0x0000000010000000L});
	public static final BitSet FOLLOW_assign_op_in_expr1623 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_expr1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_cond1660 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_cond1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_cond1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_ifcond1682 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_ifcond1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_ifcond1686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_forcond1705 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SYMBOL_in_forcond1707 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IN_in_forcond1709 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_forcond1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_forcond1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_in_sublist1741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_cr_in_sublist1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_sublist1746 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD1CA0000L});
	public static final BitSet FOLLOW_sub_in_sublist1748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_EOF_in_sublist1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_sub1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_sub1799 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NULL_CONST_in_sub1803 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_sub1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_sub1824 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NULL_CONST_in_sub1828 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_sub1831 = new BitSet(new long[]{0x0005CC4A018B8140L,0x0000050FD14A0000L});
	public static final BitSet FOLLOW_expr_in_sub1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_num_const2154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_num_const2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NA_in_num_const2164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_num_const2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_num_const2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_num_const2179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_num_const2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_num_const2189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_num_const2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_num_const2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_num_const2204 = new BitSet(new long[]{0x0000000000000002L});
}
