// $ANTLR 3.5.2 Q.g 2014-04-21 21:09:03

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
		"DecimalLiteral", "ELSE", "EQ", "EQ_ASSIGN", "EscapeSequence", "Exponent", 
		"FALSE", "FOR", "FUNCTION", "FloatTypeSuffix", "FloatingPointLiteral", 
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
	public static final int T__80=80;
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
	public static final int AND=4;
	public static final int AND2=5;
	public static final int BREAK=6;
	public static final int Comment=7;
	public static final int DecimalLiteral=8;
	public static final int ELSE=9;
	public static final int EQ=10;
	public static final int EQ_ASSIGN=11;
	public static final int EscapeSequence=12;
	public static final int Exponent=13;
	public static final int FALSE=14;
	public static final int FOR=15;
	public static final int FUNCTION=16;
	public static final int FloatTypeSuffix=17;
	public static final int FloatingPointLiteral=18;
	public static final int GE=19;
	public static final int GT=20;
	public static final int HexDigit=21;
	public static final int HexLiteral=22;
	public static final int IF=23;
	public static final int IN=24;
	public static final int IntegerTypeSuffix=25;
	public static final int JavaIDDigit=26;
	public static final int LBB=27;
	public static final int LE=28;
	public static final int LEFT_ASSIGN=29;
	public static final int LT=30;
	public static final int Letter=31;
	public static final int NA=32;
	public static final int NE=33;
	public static final int NEXT=34;
	public static final int NS_GET=35;
	public static final int NS_GET_INT=36;
	public static final int NULL_CONST=37;
	public static final int OR=38;
	public static final int OR2=39;
	public static final int OctalEscape=40;
	public static final int OctalLiteral=41;
	public static final int REPEAT=42;
	public static final int RIGHT_ASSIGN=43;
	public static final int SPECIAL=44;
	public static final int STR_CONST=45;
	public static final int SYMBOL=46;
	public static final int TRUE=47;
	public static final int UnicodeEscape=48;
	public static final int WHILE=49;
	public static final int XXBINARY=50;
	public static final int XXCOND=51;
	public static final int XXDEFUN=52;
	public static final int XXEXPRLIST=53;
	public static final int XXEXPRLIST0=54;
	public static final int XXEXPRLIST1=55;
	public static final int XXEXPRLIST2=56;
	public static final int XXFOR=57;
	public static final int XXFORCOND=58;
	public static final int XXFORMAL0=59;
	public static final int XXFORMAL1=60;
	public static final int XXFORMALLIST=61;
	public static final int XXFUNCALL=62;
	public static final int XXIF=63;
	public static final int XXIFCOND=64;
	public static final int XXIFELSE=65;
	public static final int XXNULLSUB0=66;
	public static final int XXNULLSUB1=67;
	public static final int XXNXTBRK=68;
	public static final int XXPAREN=69;
	public static final int XXREPEAT=70;
	public static final int XXSUB0=71;
	public static final int XXSUB1=72;
	public static final int XXSUBLIST=73;
	public static final int XXSUBSCRIPT=74;
	public static final int XXSYMSUB0=75;
	public static final int XXSYMSUB1=76;
	public static final int XXUNARY=77;
	public static final int XXVALUE=78;
	public static final int XXWHILE=79;

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
	// Q.g:93:1: prog : prog_begin ( prog_continue )* ( '\\n' | ';' )* ;
	public final QParser.prog_return prog() throws RecognitionException {
		QParser.prog_return retval = new QParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set3=null;
		ParserRuleReturnScope prog_begin1 =null;
		ParserRuleReturnScope prog_continue2 =null;

		Object set3_tree=null;

		try {
			// Q.g:93:6: ( prog_begin ( prog_continue )* ( '\\n' | ';' )* )
			// Q.g:93:8: prog_begin ( prog_continue )* ( '\\n' | ';' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_prog_begin_in_prog288);
			prog_begin1=prog_begin();
			state._fsp--;

			adaptor.addChild(root_0, prog_begin1.getTree());

			// Q.g:93:19: ( prog_continue )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// Q.g:93:19: prog_continue
					{
					pushFollow(FOLLOW_prog_continue_in_prog290);
					prog_continue2=prog_continue();
					state._fsp--;

					adaptor.addChild(root_0, prog_continue2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// Q.g:93:34: ( '\\n' | ';' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==90||LA2_0==100) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Q.g:
					{
					set3=input.LT(1);
					if ( input.LA(1)==90||input.LA(1)==100 ) {
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
	// Q.g:96:1: prog_begin : ( '\\n' | ';' )* expr_or_assign -> ^( XXVALUE expr_or_assign ) ;
	public final QParser.prog_begin_return prog_begin() throws RecognitionException {
		QParser.prog_begin_return retval = new QParser.prog_begin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal4=null;
		Token char_literal5=null;
		ParserRuleReturnScope expr_or_assign6 =null;

		Object char_literal4_tree=null;
		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:96:12: ( ( '\\n' | ';' )* expr_or_assign -> ^( XXVALUE expr_or_assign ) )
			// Q.g:96:14: ( '\\n' | ';' )* expr_or_assign
			{
			// Q.g:96:14: ( '\\n' | ';' )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==100) ) {
					alt3=1;
				}
				else if ( (LA3_0==90) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// Q.g:96:15: '\\n'
					{
					char_literal4=(Token)match(input,100,FOLLOW_100_in_prog_begin311);  
					stream_100.add(char_literal4);

					}
					break;
				case 2 :
					// Q.g:96:22: ';'
					{
					char_literal5=(Token)match(input,90,FOLLOW_90_in_prog_begin315);  
					stream_90.add(char_literal5);

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_expr_or_assign_in_prog_begin319);
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
			// 97:3: -> ^( XXVALUE expr_or_assign )
			{
				// Q.g:97:6: ^( XXVALUE expr_or_assign )
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
	// Q.g:100:1: prog_continue : ( '\\n' | ';' )+ expr_or_assign -> ^( XXVALUE expr_or_assign ) ;
	public final QParser.prog_continue_return prog_continue() throws RecognitionException {
		QParser.prog_continue_return retval = new QParser.prog_continue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal7=null;
		Token char_literal8=null;
		ParserRuleReturnScope expr_or_assign9 =null;

		Object char_literal7_tree=null;
		Object char_literal8_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:100:14: ( ( '\\n' | ';' )+ expr_or_assign -> ^( XXVALUE expr_or_assign ) )
			// Q.g:101:3: ( '\\n' | ';' )+ expr_or_assign
			{
			// Q.g:101:3: ( '\\n' | ';' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==100) ) {
					alt4=1;
				}
				else if ( (LA4_0==90) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Q.g:101:4: '\\n'
					{
					char_literal7=(Token)match(input,100,FOLLOW_100_in_prog_continue345);  
					stream_100.add(char_literal7);

					}
					break;
				case 2 :
					// Q.g:101:11: ';'
					{
					char_literal8=(Token)match(input,90,FOLLOW_90_in_prog_continue349);  
					stream_90.add(char_literal8);

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			pushFollow(FOLLOW_expr_or_assign_in_prog_continue353);
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
			// 102:3: -> ^( XXVALUE expr_or_assign )
			{
				// Q.g:102:6: ^( XXVALUE expr_or_assign )
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
	// Q.g:105:1: expr_or_assign : ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )? ;
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
			// Q.g:105:17: ( ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )? )
			// Q.g:105:22: ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )?
			{
			// Q.g:105:22: ( expr -> expr )
			// Q.g:105:23: expr
			{
			pushFollow(FOLLOW_expr_in_expr_or_assign379);
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
			// 105:27: -> expr
			{
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:105:35: ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EQ_ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Q.g:105:36: EQ_ASSIGN expr_or_assign
					{
					EQ_ASSIGN11=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_expr_or_assign385);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN11);

					pushFollow(FOLLOW_expr_or_assign_in_expr_or_assign387);
					expr_or_assign12=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign12.getTree());
					// AST REWRITE
					// elements: EQ_ASSIGN, expr_or_assign, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:61: -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign )
					{
						// Q.g:105:64: ^( XXBINARY EQ_ASSIGN expr expr_or_assign )
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
	// Q.g:108:1: symbol_or_conststr : ( SYMBOL | STR_CONST );
	public final QParser.symbol_or_conststr_return symbol_or_conststr() throws RecognitionException {
		QParser.symbol_or_conststr_return retval = new QParser.symbol_or_conststr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set13=null;

		Object set13_tree=null;

		try {
			// Q.g:109:2: ( SYMBOL | STR_CONST )
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
	// Q.g:111:1: unary_op : ( '-' | '+' | '!' | '~' | '?' ) ;
	public final QParser.unary_op_return unary_op() throws RecognitionException {
		QParser.unary_op_return retval = new QParser.unary_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;

		Object set14_tree=null;

		try {
			// Q.g:112:2: ( ( '-' | '+' | '!' | '~' | '?' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set14=input.LT(1);
			if ( input.LA(1)==80||input.LA(1)==85||input.LA(1)==87||input.LA(1)==91||input.LA(1)==105 ) {
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
	// Q.g:115:1: formalarg : ( SYMBOL -> ^( XXFORMAL0 SYMBOL ) | SYMBOL EQ_ASSIGN expr -> ^( XXFORMAL1 SYMBOL expr ) );
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
			// Q.g:115:11: ( SYMBOL -> ^( XXFORMAL0 SYMBOL ) | SYMBOL EQ_ASSIGN expr -> ^( XXFORMAL1 SYMBOL expr ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==SYMBOL) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==EQ_ASSIGN) ) {
					alt6=2;
				}
				else if ( (LA6_1==EOF||LA6_1==83||LA6_1==86) ) {
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
					// Q.g:115:13: SYMBOL
					{
					SYMBOL15=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formalarg470);  
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
					// 115:20: -> ^( XXFORMAL0 SYMBOL )
					{
						// Q.g:115:23: ^( XXFORMAL0 SYMBOL )
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
					// Q.g:116:4: SYMBOL EQ_ASSIGN expr
					{
					SYMBOL16=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formalarg483);  
					stream_SYMBOL.add(SYMBOL16);

					EQ_ASSIGN17=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_formalarg485);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN17);

					pushFollow(FOLLOW_expr_in_formalarg487);
					expr18=expr();
					state._fsp--;

					stream_expr.add(expr18.getTree());
					// AST REWRITE
					// elements: SYMBOL, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:26: -> ^( XXFORMAL1 SYMBOL expr )
					{
						// Q.g:116:29: ^( XXFORMAL1 SYMBOL expr )
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
	// Q.g:120:1: formlist : ( formalarg ( ',' formalarg )* )? ( EOF )? -> ^( XXFORMALLIST ( formalarg )* ) ;
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
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_formalarg=new RewriteRuleSubtreeStream(adaptor,"rule formalarg");

		try {
			// Q.g:120:9: ( ( formalarg ( ',' formalarg )* )? ( EOF )? -> ^( XXFORMALLIST ( formalarg )* ) )
			// Q.g:120:10: ( formalarg ( ',' formalarg )* )? ( EOF )?
			{
			// Q.g:120:10: ( formalarg ( ',' formalarg )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==SYMBOL) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Q.g:120:11: formalarg ( ',' formalarg )*
					{
					pushFollow(FOLLOW_formalarg_in_formlist507);
					formalarg19=formalarg();
					state._fsp--;

					stream_formalarg.add(formalarg19.getTree());
					// Q.g:120:21: ( ',' formalarg )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==86) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Q.g:120:22: ',' formalarg
							{
							char_literal20=(Token)match(input,86,FOLLOW_86_in_formlist510);  
							stream_86.add(char_literal20);

							pushFollow(FOLLOW_formalarg_in_formlist512);
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

			// Q.g:120:40: ( EOF )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==EOF) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Q.g:120:40: EOF
					{
					EOF22=(Token)match(input,EOF,FOLLOW_EOF_in_formlist518);  
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
			// 121:4: -> ^( XXFORMALLIST ( formalarg )* )
			{
				// Q.g:121:7: ^( XXFORMALLIST ( formalarg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFORMALLIST, "XXFORMALLIST"), root_1);
				// Q.g:121:22: ( formalarg )*
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
	// Q.g:125:1: lexpr : ( num_const | STR_CONST | NULL_CONST | SYMBOL | '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}' -> ^( XXEXPRLIST ( expr_or_assign )+ ) | '(' expr_or_assign ')' -> ^( XXPAREN expr_or_assign ) | unary_op expr -> ^( XXUNARY unary_op expr ) | FUNCTION '(' formlist ')' cr expr_or_assign -> ^( XXDEFUN formlist expr_or_assign ) | IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )? -> ^( XXIFELSE ifcond $ifexp ( $elexp)? ) | FOR forcond expr_or_assign -> ^( XXFOR forcond expr_or_assign ) | WHILE cond expr_or_assign -> ^( XXWHILE cond expr_or_assign ) | REPEAT expr_or_assign -> ^( XXREPEAT expr_or_assign ) | (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET $fs $ss) | (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET_INT $fs $ss) | NEXT -> ^( XXNXTBRK NEXT ) | BREAK -> ^( XXNXTBRK BREAK ) );
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
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_NS_GET_INT=new RewriteRuleTokenStream(adaptor,"token NS_GET_INT");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_NS_GET=new RewriteRuleTokenStream(adaptor,"token NS_GET");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
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
			// Q.g:125:7: ( num_const | STR_CONST | NULL_CONST | SYMBOL | '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}' -> ^( XXEXPRLIST ( expr_or_assign )+ ) | '(' expr_or_assign ')' -> ^( XXPAREN expr_or_assign ) | unary_op expr -> ^( XXUNARY unary_op expr ) | FUNCTION '(' formlist ')' cr expr_or_assign -> ^( XXDEFUN formlist expr_or_assign ) | IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )? -> ^( XXIFELSE ifcond $ifexp ( $elexp)? ) | FOR forcond expr_or_assign -> ^( XXFOR forcond expr_or_assign ) | WHILE cond expr_or_assign -> ^( XXWHILE cond expr_or_assign ) | REPEAT expr_or_assign -> ^( XXREPEAT expr_or_assign ) | (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET $fs $ss) | (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET_INT $fs $ss) | NEXT -> ^( XXNXTBRK NEXT ) | BREAK -> ^( XXNXTBRK BREAK ) )
			int alt15=16;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case FALSE:
			case FloatingPointLiteral:
			case HexLiteral:
			case NA:
			case OctalLiteral:
			case TRUE:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
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
				case 81:
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
				case 99:
				case 100:
				case 101:
				case 102:
				case 104:
				case 105:
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
				case 81:
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
				case 99:
				case 100:
				case 101:
				case 102:
				case 104:
				case 105:
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
			case 103:
				{
				alt15=5;
				}
				break;
			case 82:
				{
				alt15=6;
				}
				break;
			case 80:
			case 85:
			case 87:
			case 91:
			case 105:
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
					// Q.g:125:10: num_const
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_num_const_in_lexpr543);
					num_const23=num_const();
					state._fsp--;

					adaptor.addChild(root_0, num_const23.getTree());

					}
					break;
				case 2 :
					// Q.g:126:4: STR_CONST
					{
					root_0 = (Object)adaptor.nil();


					STR_CONST24=(Token)match(input,STR_CONST,FOLLOW_STR_CONST_in_lexpr548); 
					STR_CONST24_tree = (Object)adaptor.create(STR_CONST24);
					adaptor.addChild(root_0, STR_CONST24_tree);

					}
					break;
				case 3 :
					// Q.g:127:4: NULL_CONST
					{
					root_0 = (Object)adaptor.nil();


					NULL_CONST25=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_lexpr553); 
					NULL_CONST25_tree = (Object)adaptor.create(NULL_CONST25);
					adaptor.addChild(root_0, NULL_CONST25_tree);

					}
					break;
				case 4 :
					// Q.g:128:4: SYMBOL
					{
					root_0 = (Object)adaptor.nil();


					SYMBOL26=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_lexpr558); 
					SYMBOL26_tree = (Object)adaptor.create(SYMBOL26);
					adaptor.addChild(root_0, SYMBOL26_tree);

					}
					break;
				case 5 :
					// Q.g:129:4: '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}'
					{
					char_literal27=(Token)match(input,103,FOLLOW_103_in_lexpr563);  
					stream_103.add(char_literal27);

					// Q.g:129:8: ( '\\n' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==100) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Q.g:129:8: '\\n'
							{
							char_literal28=(Token)match(input,100,FOLLOW_100_in_lexpr565);  
							stream_100.add(char_literal28);

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_expr_or_assign_in_lexpr568);
					expr_or_assign29=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign29.getTree());
					// Q.g:129:29: ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )*
					loop13:
					while (true) {
						int alt13=3;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==90) ) {
							alt13=1;
						}
						else if ( (LA13_0==100) ) {
							alt13=2;
						}

						switch (alt13) {
						case 1 :
							// Q.g:129:30: ( ';' ( expr_or_assign )? )
							{
							// Q.g:129:30: ( ';' ( expr_or_assign )? )
							// Q.g:129:31: ';' ( expr_or_assign )?
							{
							char_literal30=(Token)match(input,90,FOLLOW_90_in_lexpr572);  
							stream_90.add(char_literal30);

							// Q.g:129:35: ( expr_or_assign )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==BREAK||LA11_0==DecimalLiteral||(LA11_0 >= FALSE && LA11_0 <= FUNCTION)||LA11_0==FloatingPointLiteral||(LA11_0 >= HexLiteral && LA11_0 <= IF)||LA11_0==NA||LA11_0==NEXT||LA11_0==NULL_CONST||(LA11_0 >= OctalLiteral && LA11_0 <= REPEAT)||(LA11_0 >= STR_CONST && LA11_0 <= TRUE)||LA11_0==WHILE||LA11_0==80||LA11_0==82||LA11_0==85||LA11_0==87||LA11_0==91||(LA11_0 >= 93 && LA11_0 <= 98)||LA11_0==103||LA11_0==105) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// Q.g:129:35: expr_or_assign
									{
									pushFollow(FOLLOW_expr_or_assign_in_lexpr574);
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
							// Q.g:129:54: ( '\\n' ( expr_or_assign )? )
							{
							// Q.g:129:54: ( '\\n' ( expr_or_assign )? )
							// Q.g:129:55: '\\n' ( expr_or_assign )?
							{
							char_literal32=(Token)match(input,100,FOLLOW_100_in_lexpr581);  
							stream_100.add(char_literal32);

							// Q.g:129:60: ( expr_or_assign )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==BREAK||LA12_0==DecimalLiteral||(LA12_0 >= FALSE && LA12_0 <= FUNCTION)||LA12_0==FloatingPointLiteral||(LA12_0 >= HexLiteral && LA12_0 <= IF)||LA12_0==NA||LA12_0==NEXT||LA12_0==NULL_CONST||(LA12_0 >= OctalLiteral && LA12_0 <= REPEAT)||(LA12_0 >= STR_CONST && LA12_0 <= TRUE)||LA12_0==WHILE||LA12_0==80||LA12_0==82||LA12_0==85||LA12_0==87||LA12_0==91||(LA12_0 >= 93 && LA12_0 <= 98)||LA12_0==103||LA12_0==105) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// Q.g:129:60: expr_or_assign
									{
									pushFollow(FOLLOW_expr_or_assign_in_lexpr583);
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

					char_literal34=(Token)match(input,104,FOLLOW_104_in_lexpr589);  
					stream_104.add(char_literal34);

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
					// 130:3: -> ^( XXEXPRLIST ( expr_or_assign )+ )
					{
						// Q.g:130:6: ^( XXEXPRLIST ( expr_or_assign )+ )
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
					// Q.g:131:4: '(' expr_or_assign ')'
					{
					char_literal35=(Token)match(input,82,FOLLOW_82_in_lexpr605);  
					stream_82.add(char_literal35);

					pushFollow(FOLLOW_expr_or_assign_in_lexpr607);
					expr_or_assign36=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign36.getTree());
					char_literal37=(Token)match(input,83,FOLLOW_83_in_lexpr609);  
					stream_83.add(char_literal37);

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
					// 132:3: -> ^( XXPAREN expr_or_assign )
					{
						// Q.g:132:6: ^( XXPAREN expr_or_assign )
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
					// Q.g:133:5: unary_op expr
					{
					pushFollow(FOLLOW_unary_op_in_lexpr625);
					unary_op38=unary_op();
					state._fsp--;

					stream_unary_op.add(unary_op38.getTree());
					pushFollow(FOLLOW_expr_in_lexpr627);
					expr39=expr();
					state._fsp--;

					stream_expr.add(expr39.getTree());
					// AST REWRITE
					// elements: expr, unary_op
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:3: -> ^( XXUNARY unary_op expr )
					{
						// Q.g:134:6: ^( XXUNARY unary_op expr )
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
					// Q.g:135:4: FUNCTION '(' formlist ')' cr expr_or_assign
					{
					FUNCTION40=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_lexpr644);  
					stream_FUNCTION.add(FUNCTION40);

					char_literal41=(Token)match(input,82,FOLLOW_82_in_lexpr646);  
					stream_82.add(char_literal41);

					pushFollow(FOLLOW_formlist_in_lexpr648);
					formlist42=formlist();
					state._fsp--;

					stream_formlist.add(formlist42.getTree());
					char_literal43=(Token)match(input,83,FOLLOW_83_in_lexpr650);  
					stream_83.add(char_literal43);

					pushFollow(FOLLOW_cr_in_lexpr652);
					cr44=cr();
					state._fsp--;

					stream_cr.add(cr44.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr654);
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
					// 136:3: -> ^( XXDEFUN formlist expr_or_assign )
					{
						// Q.g:136:6: ^( XXDEFUN formlist expr_or_assign )
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
					// Q.g:137:4: IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )?
					{
					IF46=(Token)match(input,IF,FOLLOW_IF_in_lexpr671);  
					stream_IF.add(IF46);

					pushFollow(FOLLOW_ifcond_in_lexpr673);
					ifcond47=ifcond();
					state._fsp--;

					stream_ifcond.add(ifcond47.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr677);
					ifexp=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(ifexp.getTree());
					// Q.g:137:35: ( ELSE elexp= expr_or_assign )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ELSE) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Q.g:137:36: ELSE elexp= expr_or_assign
							{
							ELSE48=(Token)match(input,ELSE,FOLLOW_ELSE_in_lexpr680);  
							stream_ELSE.add(ELSE48);

							pushFollow(FOLLOW_expr_or_assign_in_lexpr684);
							elexp=expr_or_assign();
							state._fsp--;

							stream_expr_or_assign.add(elexp.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: elexp, ifcond, ifexp
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
					// 138:3: -> ^( XXIFELSE ifcond $ifexp ( $elexp)? )
					{
						// Q.g:138:6: ^( XXIFELSE ifcond $ifexp ( $elexp)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXIFELSE, "XXIFELSE"), root_1);
						adaptor.addChild(root_1, stream_ifcond.nextTree());
						adaptor.addChild(root_1, stream_ifexp.nextTree());
						// Q.g:138:32: ( $elexp)?
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
					// Q.g:139:4: FOR forcond expr_or_assign
					{
					FOR49=(Token)match(input,FOR,FOLLOW_FOR_in_lexpr708);  
					stream_FOR.add(FOR49);

					pushFollow(FOLLOW_forcond_in_lexpr710);
					forcond50=forcond();
					state._fsp--;

					stream_forcond.add(forcond50.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr712);
					expr_or_assign51=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign51.getTree());
					// AST REWRITE
					// elements: expr_or_assign, forcond
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:3: -> ^( XXFOR forcond expr_or_assign )
					{
						// Q.g:140:6: ^( XXFOR forcond expr_or_assign )
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
					// Q.g:141:4: WHILE cond expr_or_assign
					{
					WHILE52=(Token)match(input,WHILE,FOLLOW_WHILE_in_lexpr729);  
					stream_WHILE.add(WHILE52);

					pushFollow(FOLLOW_cond_in_lexpr731);
					cond53=cond();
					state._fsp--;

					stream_cond.add(cond53.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr733);
					expr_or_assign54=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign54.getTree());
					// AST REWRITE
					// elements: cond, expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:3: -> ^( XXWHILE cond expr_or_assign )
					{
						// Q.g:142:6: ^( XXWHILE cond expr_or_assign )
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
					// Q.g:143:4: REPEAT expr_or_assign
					{
					REPEAT55=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_lexpr750);  
					stream_REPEAT.add(REPEAT55);

					pushFollow(FOLLOW_expr_or_assign_in_lexpr752);
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
					// 144:3: -> ^( XXREPEAT expr_or_assign )
					{
						// Q.g:144:6: ^( XXREPEAT expr_or_assign )
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
					// Q.g:145:4: (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr )
					{
					// Q.g:145:4: (fs= symbol_or_conststr )
					// Q.g:145:5: fs= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr770);
					fs=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(fs.getTree());
					}

					NS_GET57=(Token)match(input,NS_GET,FOLLOW_NS_GET_in_lexpr773);  
					stream_NS_GET.add(NS_GET57);

					// Q.g:145:35: (ss= symbol_or_conststr )
					// Q.g:145:36: ss= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr778);
					ss=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(ss.getTree());
					}

					// AST REWRITE
					// elements: fs, NS_GET, ss
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
					// 146:3: -> ^( XXBINARY NS_GET $fs $ss)
					{
						// Q.g:146:6: ^( XXBINARY NS_GET $fs $ss)
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
					// Q.g:147:4: (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr )
					{
					// Q.g:147:4: (fs= symbol_or_conststr )
					// Q.g:147:5: fs= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr803);
					fs=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(fs.getTree());
					}

					NS_GET_INT58=(Token)match(input,NS_GET_INT,FOLLOW_NS_GET_INT_in_lexpr806);  
					stream_NS_GET_INT.add(NS_GET_INT58);

					// Q.g:147:39: (ss= symbol_or_conststr )
					// Q.g:147:40: ss= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr811);
					ss=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(ss.getTree());
					}

					// AST REWRITE
					// elements: fs, NS_GET_INT, ss
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
					// 148:3: -> ^( XXBINARY NS_GET_INT $fs $ss)
					{
						// Q.g:148:6: ^( XXBINARY NS_GET_INT $fs $ss)
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
					// Q.g:149:4: NEXT
					{
					NEXT59=(Token)match(input,NEXT,FOLLOW_NEXT_in_lexpr833);  
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
					// 150:3: -> ^( XXNXTBRK NEXT )
					{
						// Q.g:150:6: ^( XXNXTBRK NEXT )
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
					// Q.g:151:4: BREAK
					{
					BREAK60=(Token)match(input,BREAK,FOLLOW_BREAK_in_lexpr848);  
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
					// 152:3: -> ^( XXNXTBRK BREAK )
					{
						// Q.g:152:6: ^( XXNXTBRK BREAK )
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
	// Q.g:155:1: additive_op : ( '+' | '-' ) ;
	public final QParser.additive_op_return additive_op() throws RecognitionException {
		QParser.additive_op_return retval = new QParser.additive_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;

		Object set61_tree=null;

		try {
			// Q.g:156:2: ( ( '+' | '-' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set61=input.LT(1);
			if ( input.LA(1)==85||input.LA(1)==87 ) {
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
	// Q.g:159:1: relationalOp : ( LT | LE | EQ | NE | GE | GT | AND2 | OR2 ) ;
	public final QParser.relationalOp_return relationalOp() throws RecognitionException {
		QParser.relationalOp_return retval = new QParser.relationalOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set62=null;

		Object set62_tree=null;

		try {
			// Q.g:160:2: ( ( LT | LE | EQ | NE | GE | GT | AND2 | OR2 ) )
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
	// Q.g:166:1: assign_op : ( LEFT_ASSIGN | RIGHT_ASSIGN | '?' ) ;
	public final QParser.assign_op_return assign_op() throws RecognitionException {
		QParser.assign_op_return retval = new QParser.assign_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;

		Object set63_tree=null;

		try {
			// Q.g:166:10: ( ( LEFT_ASSIGN | RIGHT_ASSIGN | '?' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==LEFT_ASSIGN||input.LA(1)==RIGHT_ASSIGN||input.LA(1)==91 ) {
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
	// Q.g:171:1: multicative_op : ( '*' | '/' | SPECIAL ) ;
	public final QParser.multicative_op_return multicative_op() throws RecognitionException {
		QParser.multicative_op_return retval = new QParser.multicative_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set64=null;

		Object set64_tree=null;

		try {
			// Q.g:172:2: ( ( '*' | '/' | SPECIAL ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set64=input.LT(1);
			if ( input.LA(1)==SPECIAL||input.LA(1)==84||input.LA(1)==88 ) {
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
	// Q.g:179:1: refer : ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )* ;
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
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_LBB=new RewriteRuleTokenStream(adaptor,"token LBB");
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_sublist=new RewriteRuleSubtreeStream(adaptor,"rule sublist");

		try {
			// Q.g:179:7: ( ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )* )
			// Q.g:179:9: ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )*
			{
			// Q.g:179:9: ( lexpr -> lexpr )
			// Q.g:179:10: lexpr
			{
			pushFollow(FOLLOW_lexpr_in_refer976);
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
			// 179:16: -> lexpr
			{
				adaptor.addChild(root_0, stream_lexpr.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:180:6: ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )*
			loop17:
			while (true) {
				int alt17=5;
				switch ( input.LA(1) ) {
				case 82:
					{
					alt17=1;
					}
					break;
				case LBB:
					{
					alt17=2;
					}
					break;
				case 99:
					{
					alt17=3;
					}
					break;
				case 81:
					{
					alt17=4;
					}
					break;
				case 92:
					{
					alt17=4;
					}
					break;
				}
				switch (alt17) {
				case 1 :
					// Q.g:180:7: '(' sublist ')'
					{
					char_literal66=(Token)match(input,82,FOLLOW_82_in_refer989);  
					stream_82.add(char_literal66);

					pushFollow(FOLLOW_sublist_in_refer991);
					sublist67=sublist();
					state._fsp--;

					stream_sublist.add(sublist67.getTree());
					char_literal68=(Token)match(input,83,FOLLOW_83_in_refer993);  
					stream_83.add(char_literal68);

					// AST REWRITE
					// elements: refer, sublist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 181:5: -> ^( XXFUNCALL $refer sublist )
					{
						// Q.g:181:8: ^( XXFUNCALL $refer sublist )
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
					// Q.g:182:5: LBB sublist ']' ']'
					{
					LBB69=(Token)match(input,LBB,FOLLOW_LBB_in_refer1014);  
					stream_LBB.add(LBB69);

					pushFollow(FOLLOW_sublist_in_refer1016);
					sublist70=sublist();
					state._fsp--;

					stream_sublist.add(sublist70.getTree());
					char_literal71=(Token)match(input,101,FOLLOW_101_in_refer1018);  
					stream_101.add(char_literal71);

					char_literal72=(Token)match(input,101,FOLLOW_101_in_refer1020);  
					stream_101.add(char_literal72);

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
					// 183:5: -> ^( XXSUBSCRIPT LBB $refer sublist )
					{
						// Q.g:183:8: ^( XXSUBSCRIPT LBB $refer sublist )
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
					// Q.g:184:5: '[' sublist ']'
					{
					char_literal73=(Token)match(input,99,FOLLOW_99_in_refer1043);  
					stream_99.add(char_literal73);

					pushFollow(FOLLOW_sublist_in_refer1045);
					sublist74=sublist();
					state._fsp--;

					stream_sublist.add(sublist74.getTree());
					char_literal75=(Token)match(input,101,FOLLOW_101_in_refer1048);  
					stream_101.add(char_literal75);

					// AST REWRITE
					// elements: refer, sublist, 99
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 185:5: -> ^( XXSUBSCRIPT '[' $refer sublist )
					{
						// Q.g:185:8: ^( XXSUBSCRIPT '[' $refer sublist )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUBSCRIPT, "XXSUBSCRIPT"), root_1);
						adaptor.addChild(root_1, stream_99.nextNode());
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_sublist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Q.g:186:5: ( '$' | '@' ) symbol_or_conststr
					{
					// Q.g:186:5: ( '$' | '@' )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==81) ) {
						alt16=1;
					}
					else if ( (LA16_0==92) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// Q.g:186:6: '$'
							{
							char_literal76=(Token)match(input,81,FOLLOW_81_in_refer1072);  
							stream_81.add(char_literal76);

							}
							break;
						case 2 :
							// Q.g:186:12: '@'
							{
							char_literal77=(Token)match(input,92,FOLLOW_92_in_refer1076);  
							stream_92.add(char_literal77);

							}
							break;

					}

					pushFollow(FOLLOW_symbol_or_conststr_in_refer1079);
					symbol_or_conststr78=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(symbol_or_conststr78.getTree());
					// AST REWRITE
					// elements: 81, symbol_or_conststr, refer, 92
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 187:5: -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr )
					{
						// Q.g:187:8: ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						// Q.g:187:19: ( '$' )?
						if ( stream_81.hasNext() ) {
							adaptor.addChild(root_1, stream_81.nextNode());
						}
						stream_81.reset();

						// Q.g:187:24: ( '@' )?
						if ( stream_92.hasNext() ) {
							adaptor.addChild(root_1, stream_92.nextNode());
						}
						stream_92.reset();

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
	// Q.g:191:1: powerExpression : ( refer -> refer ) ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )? ;
	public final QParser.powerExpression_return powerExpression() throws RecognitionException {
		QParser.powerExpression_return retval = new QParser.powerExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal80=null;
		ParserRuleReturnScope refer79 =null;
		ParserRuleReturnScope powerExpression81 =null;

		Object char_literal80_tree=null;
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleSubtreeStream stream_refer=new RewriteRuleSubtreeStream(adaptor,"rule refer");
		RewriteRuleSubtreeStream stream_powerExpression=new RewriteRuleSubtreeStream(adaptor,"rule powerExpression");

		try {
			// Q.g:192:5: ( ( refer -> refer ) ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )? )
			// Q.g:192:7: ( refer -> refer ) ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )?
			{
			// Q.g:192:7: ( refer -> refer )
			// Q.g:192:8: refer
			{
			pushFollow(FOLLOW_refer_in_powerExpression1125);
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
			// 192:14: -> refer
			{
				adaptor.addChild(root_0, stream_refer.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:193:5: ( '^' powerExpression -> ^( XXBINARY '^' refer powerExpression ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==102) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Q.g:193:7: '^' powerExpression
					{
					char_literal80=(Token)match(input,102,FOLLOW_102_in_powerExpression1138);  
					stream_102.add(char_literal80);

					pushFollow(FOLLOW_powerExpression_in_powerExpression1140);
					powerExpression81=powerExpression();
					state._fsp--;

					stream_powerExpression.add(powerExpression81.getTree());
					// AST REWRITE
					// elements: refer, 102, powerExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:9: -> ^( XXBINARY '^' refer powerExpression )
					{
						// Q.g:194:12: ^( XXBINARY '^' refer powerExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_102.nextNode());
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
	// Q.g:199:1: seqExpression : ( powerExpression -> powerExpression ) ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )? ;
	public final QParser.seqExpression_return seqExpression() throws RecognitionException {
		QParser.seqExpression_return retval = new QParser.seqExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal83=null;
		ParserRuleReturnScope powerExpression82 =null;
		ParserRuleReturnScope seqExpression84 =null;

		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleSubtreeStream stream_seqExpression=new RewriteRuleSubtreeStream(adaptor,"rule seqExpression");
		RewriteRuleSubtreeStream stream_powerExpression=new RewriteRuleSubtreeStream(adaptor,"rule powerExpression");

		try {
			// Q.g:200:5: ( ( powerExpression -> powerExpression ) ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )? )
			// Q.g:200:7: ( powerExpression -> powerExpression ) ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )?
			{
			// Q.g:200:7: ( powerExpression -> powerExpression )
			// Q.g:200:8: powerExpression
			{
			pushFollow(FOLLOW_powerExpression_in_seqExpression1188);
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
			// 200:24: -> powerExpression
			{
				adaptor.addChild(root_0, stream_powerExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:201:5: ( ':' seqExpression -> ^( XXBINARY ':' powerExpression seqExpression ) )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==89) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Q.g:201:7: ':' seqExpression
					{
					char_literal83=(Token)match(input,89,FOLLOW_89_in_seqExpression1201);  
					stream_89.add(char_literal83);

					pushFollow(FOLLOW_seqExpression_in_seqExpression1203);
					seqExpression84=seqExpression();
					state._fsp--;

					stream_seqExpression.add(seqExpression84.getTree());
					// AST REWRITE
					// elements: powerExpression, seqExpression, 89
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 202:9: -> ^( XXBINARY ':' powerExpression seqExpression )
					{
						// Q.g:202:12: ^( XXBINARY ':' powerExpression seqExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_89.nextNode());
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
	// Q.g:207:1: additiveExpression : ( multiplicativeExpression -> multiplicativeExpression ) ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )? ;
	public final QParser.additiveExpression_return additiveExpression() throws RecognitionException {
		QParser.additiveExpression_return retval = new QParser.additiveExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope multiplicativeExpression85 =null;
		ParserRuleReturnScope additive_op86 =null;
		ParserRuleReturnScope additiveExpression87 =null;

		RewriteRuleSubtreeStream stream_additive_op=new RewriteRuleSubtreeStream(adaptor,"rule additive_op");
		RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");
		RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");

		try {
			// Q.g:208:5: ( ( multiplicativeExpression -> multiplicativeExpression ) ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )? )
			// Q.g:208:9: ( multiplicativeExpression -> multiplicativeExpression ) ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )?
			{
			// Q.g:208:9: ( multiplicativeExpression -> multiplicativeExpression )
			// Q.g:208:10: multiplicativeExpression
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1253);
			multiplicativeExpression85=multiplicativeExpression();
			state._fsp--;

			stream_multiplicativeExpression.add(multiplicativeExpression85.getTree());
			// AST REWRITE
			// elements: multiplicativeExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 208:35: -> multiplicativeExpression
			{
				adaptor.addChild(root_0, stream_multiplicativeExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:209:3: ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==85||LA20_0==87) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Q.g:209:5: additive_op additiveExpression
					{
					pushFollow(FOLLOW_additive_op_in_additiveExpression1264);
					additive_op86=additive_op();
					state._fsp--;

					stream_additive_op.add(additive_op86.getTree());
					pushFollow(FOLLOW_additiveExpression_in_additiveExpression1266);
					additiveExpression87=additiveExpression();
					state._fsp--;

					stream_additiveExpression.add(additiveExpression87.getTree());
					// AST REWRITE
					// elements: additive_op, multiplicativeExpression, additiveExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 210:5: -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression )
					{
						// Q.g:210:8: ^( XXBINARY additive_op multiplicativeExpression additiveExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_additive_op.nextTree());
						adaptor.addChild(root_1, stream_multiplicativeExpression.nextTree());
						adaptor.addChild(root_1, stream_additiveExpression.nextTree());
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
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// Q.g:214:1: multiplicativeExpression : (a= seqExpression -> $a) ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )* ;
	public final QParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		QParser.multiplicativeExpression_return retval = new QParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope multicative_op88 =null;

		RewriteRuleSubtreeStream stream_multicative_op=new RewriteRuleSubtreeStream(adaptor,"rule multicative_op");
		RewriteRuleSubtreeStream stream_seqExpression=new RewriteRuleSubtreeStream(adaptor,"rule seqExpression");

		try {
			// Q.g:215:5: ( (a= seqExpression -> $a) ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )* )
			// Q.g:215:9: (a= seqExpression -> $a) ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )*
			{
			// Q.g:215:9: (a= seqExpression -> $a)
			// Q.g:215:10: a= seqExpression
			{
			pushFollow(FOLLOW_seqExpression_in_multiplicativeExpression1309);
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
			// 215:26: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:216:4: ( multicative_op b= seqExpression -> ^( XXBINARY multicative_op $multiplicativeExpression $b) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==SPECIAL||LA21_0==84||LA21_0==88) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Q.g:217:3: multicative_op b= seqExpression
					{
					pushFollow(FOLLOW_multicative_op_in_multiplicativeExpression1324);
					multicative_op88=multicative_op();
					state._fsp--;

					stream_multicative_op.add(multicative_op88.getTree());
					pushFollow(FOLLOW_seqExpression_in_multiplicativeExpression1328);
					b=seqExpression();
					state._fsp--;

					stream_seqExpression.add(b.getTree());
					// AST REWRITE
					// elements: b, multiplicativeExpression, multicative_op
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 218:5: -> ^( XXBINARY multicative_op $multiplicativeExpression $b)
					{
						// Q.g:218:8: ^( XXBINARY multicative_op $multiplicativeExpression $b)
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
	// Q.g:222:1: inclusiveOrExpression : ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )? ;
	public final QParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		QParser.inclusiveOrExpression_return retval = new QParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR90=null;
		ParserRuleReturnScope andExpression89 =null;
		ParserRuleReturnScope inclusiveOrExpression91 =null;

		Object OR90_tree=null;
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");
		RewriteRuleSubtreeStream stream_inclusiveOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule inclusiveOrExpression");

		try {
			// Q.g:223:5: ( ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )? )
			// Q.g:223:9: ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )?
			{
			// Q.g:223:9: ( andExpression -> andExpression )
			// Q.g:223:10: andExpression
			{
			pushFollow(FOLLOW_andExpression_in_inclusiveOrExpression1372);
			andExpression89=andExpression();
			state._fsp--;

			stream_andExpression.add(andExpression89.getTree());
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
			// 223:24: -> andExpression
			{
				adaptor.addChild(root_0, stream_andExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:224:3: ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==OR) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Q.g:224:5: OR inclusiveOrExpression
					{
					OR90=(Token)match(input,OR,FOLLOW_OR_in_inclusiveOrExpression1383);  
					stream_OR.add(OR90);

					pushFollow(FOLLOW_inclusiveOrExpression_in_inclusiveOrExpression1385);
					inclusiveOrExpression91=inclusiveOrExpression();
					state._fsp--;

					stream_inclusiveOrExpression.add(inclusiveOrExpression91.getTree());
					// AST REWRITE
					// elements: OR, inclusiveOrExpression, andExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 225:5: -> ^( XXBINARY OR andExpression inclusiveOrExpression )
					{
						// Q.g:225:8: ^( XXBINARY OR andExpression inclusiveOrExpression )
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
	// Q.g:229:1: andExpression : ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )? ;
	public final QParser.andExpression_return andExpression() throws RecognitionException {
		QParser.andExpression_return retval = new QParser.andExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND93=null;
		ParserRuleReturnScope relationalExpression92 =null;
		ParserRuleReturnScope andExpression94 =null;

		Object AND93_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");
		RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");

		try {
			// Q.g:230:5: ( ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )? )
			// Q.g:230:9: ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )?
			{
			// Q.g:230:9: ( relationalExpression -> relationalExpression )
			// Q.g:230:10: relationalExpression
			{
			pushFollow(FOLLOW_relationalExpression_in_andExpression1425);
			relationalExpression92=relationalExpression();
			state._fsp--;

			stream_relationalExpression.add(relationalExpression92.getTree());
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
			// 230:31: -> relationalExpression
			{
				adaptor.addChild(root_0, stream_relationalExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:231:3: ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==AND) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Q.g:231:5: AND andExpression
					{
					AND93=(Token)match(input,AND,FOLLOW_AND_in_andExpression1436);  
					stream_AND.add(AND93);

					pushFollow(FOLLOW_andExpression_in_andExpression1438);
					andExpression94=andExpression();
					state._fsp--;

					stream_andExpression.add(andExpression94.getTree());
					// AST REWRITE
					// elements: andExpression, AND, relationalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 232:5: -> ^( XXBINARY AND relationalExpression andExpression )
					{
						// Q.g:232:8: ^( XXBINARY AND relationalExpression andExpression )
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
	// Q.g:237:1: relationalExpression : ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )? ;
	public final QParser.relationalExpression_return relationalExpression() throws RecognitionException {
		QParser.relationalExpression_return retval = new QParser.relationalExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope additiveExpression95 =null;
		ParserRuleReturnScope relationalOp96 =null;
		ParserRuleReturnScope relationalExpression97 =null;

		RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
		RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");
		RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");

		try {
			// Q.g:238:5: ( ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )? )
			// Q.g:238:9: ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )?
			{
			// Q.g:238:9: ( additiveExpression -> additiveExpression )
			// Q.g:238:10: additiveExpression
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression1479);
			additiveExpression95=additiveExpression();
			state._fsp--;

			stream_additiveExpression.add(additiveExpression95.getTree());
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
			// 238:29: -> additiveExpression
			{
				adaptor.addChild(root_0, stream_additiveExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:239:3: ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==AND2||LA24_0==EQ||(LA24_0 >= GE && LA24_0 <= GT)||LA24_0==LE||LA24_0==LT||LA24_0==NE||LA24_0==OR2) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Q.g:239:5: relationalOp relationalExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression1490);
					relationalOp96=relationalOp();
					state._fsp--;

					stream_relationalOp.add(relationalOp96.getTree());
					pushFollow(FOLLOW_relationalExpression_in_relationalExpression1492);
					relationalExpression97=relationalExpression();
					state._fsp--;

					stream_relationalExpression.add(relationalExpression97.getTree());
					// AST REWRITE
					// elements: additiveExpression, relationalExpression, relationalOp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 240:5: -> ^( XXBINARY relationalOp additiveExpression relationalExpression )
					{
						// Q.g:240:8: ^( XXBINARY relationalOp additiveExpression relationalExpression )
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
	// Q.g:244:1: tildeExpression : ( inclusiveOrExpression -> inclusiveOrExpression ) ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )? ;
	public final QParser.tildeExpression_return tildeExpression() throws RecognitionException {
		QParser.tildeExpression_return retval = new QParser.tildeExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal99=null;
		ParserRuleReturnScope inclusiveOrExpression98 =null;
		ParserRuleReturnScope tildeExpression100 =null;

		Object char_literal99_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleSubtreeStream stream_inclusiveOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule inclusiveOrExpression");
		RewriteRuleSubtreeStream stream_tildeExpression=new RewriteRuleSubtreeStream(adaptor,"rule tildeExpression");

		try {
			// Q.g:245:5: ( ( inclusiveOrExpression -> inclusiveOrExpression ) ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )? )
			// Q.g:245:7: ( inclusiveOrExpression -> inclusiveOrExpression ) ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )?
			{
			// Q.g:245:7: ( inclusiveOrExpression -> inclusiveOrExpression )
			// Q.g:245:8: inclusiveOrExpression
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_tildeExpression1530);
			inclusiveOrExpression98=inclusiveOrExpression();
			state._fsp--;

			stream_inclusiveOrExpression.add(inclusiveOrExpression98.getTree());
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
			// 245:30: -> inclusiveOrExpression
			{
				adaptor.addChild(root_0, stream_inclusiveOrExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:246:5: ( '~' tildeExpression -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression ) )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==105) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Q.g:247:5: '~' tildeExpression
					{
					char_literal99=(Token)match(input,105,FOLLOW_105_in_tildeExpression1546);  
					stream_105.add(char_literal99);

					pushFollow(FOLLOW_tildeExpression_in_tildeExpression1548);
					tildeExpression100=tildeExpression();
					state._fsp--;

					stream_tildeExpression.add(tildeExpression100.getTree());
					// AST REWRITE
					// elements: inclusiveOrExpression, 105, tildeExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 248:7: -> ^( XXBINARY '~' inclusiveOrExpression tildeExpression )
					{
						// Q.g:248:10: ^( XXBINARY '~' inclusiveOrExpression tildeExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_105.nextNode());
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
	// Q.g:252:1: expr : ( tildeExpression -> tildeExpression ) ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )? ;
	public final QParser.expr_return expr() throws RecognitionException {
		QParser.expr_return retval = new QParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope tildeExpression101 =null;
		ParserRuleReturnScope assign_op102 =null;
		ParserRuleReturnScope expr103 =null;

		RewriteRuleSubtreeStream stream_tildeExpression=new RewriteRuleSubtreeStream(adaptor,"rule tildeExpression");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_assign_op=new RewriteRuleSubtreeStream(adaptor,"rule assign_op");

		try {
			// Q.g:252:6: ( ( tildeExpression -> tildeExpression ) ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )? )
			// Q.g:252:8: ( tildeExpression -> tildeExpression ) ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )?
			{
			// Q.g:252:8: ( tildeExpression -> tildeExpression )
			// Q.g:252:9: tildeExpression
			{
			pushFollow(FOLLOW_tildeExpression_in_expr1590);
			tildeExpression101=tildeExpression();
			state._fsp--;

			stream_tildeExpression.add(tildeExpression101.getTree());
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
			// 252:25: -> tildeExpression
			{
				adaptor.addChild(root_0, stream_tildeExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:253:6: ( assign_op expr -> ^( XXBINARY assign_op tildeExpression expr ) )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LEFT_ASSIGN||LA26_0==RIGHT_ASSIGN||LA26_0==91) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Q.g:254:3: assign_op expr
					{
					pushFollow(FOLLOW_assign_op_in_expr1605);
					assign_op102=assign_op();
					state._fsp--;

					stream_assign_op.add(assign_op102.getTree());
					pushFollow(FOLLOW_expr_in_expr1607);
					expr103=expr();
					state._fsp--;

					stream_expr.add(expr103.getTree());
					// AST REWRITE
					// elements: tildeExpression, expr, assign_op
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 255:5: -> ^( XXBINARY assign_op tildeExpression expr )
					{
						// Q.g:255:8: ^( XXBINARY assign_op tildeExpression expr )
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
	// Q.g:260:1: cond : '(' expr ')' -> ^( XXCOND expr ) ;
	public final QParser.cond_return cond() throws RecognitionException {
		QParser.cond_return retval = new QParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal104=null;
		Token char_literal106=null;
		ParserRuleReturnScope expr105 =null;

		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:260:6: ( '(' expr ')' -> ^( XXCOND expr ) )
			// Q.g:260:8: '(' expr ')'
			{
			char_literal104=(Token)match(input,82,FOLLOW_82_in_cond1642);  
			stream_82.add(char_literal104);

			pushFollow(FOLLOW_expr_in_cond1644);
			expr105=expr();
			state._fsp--;

			stream_expr.add(expr105.getTree());
			char_literal106=(Token)match(input,83,FOLLOW_83_in_cond1646);  
			stream_83.add(char_literal106);

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
			// 261:2: -> ^( XXCOND expr )
			{
				// Q.g:261:4: ^( XXCOND expr )
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
	// Q.g:264:1: ifcond : '(' expr ')' -> ^( XXIFCOND expr ) ;
	public final QParser.ifcond_return ifcond() throws RecognitionException {
		QParser.ifcond_return retval = new QParser.ifcond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope expr108 =null;

		Object char_literal107_tree=null;
		Object char_literal109_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:264:8: ( '(' expr ')' -> ^( XXIFCOND expr ) )
			// Q.g:264:10: '(' expr ')'
			{
			char_literal107=(Token)match(input,82,FOLLOW_82_in_ifcond1664);  
			stream_82.add(char_literal107);

			pushFollow(FOLLOW_expr_in_ifcond1666);
			expr108=expr();
			state._fsp--;

			stream_expr.add(expr108.getTree());
			char_literal109=(Token)match(input,83,FOLLOW_83_in_ifcond1668);  
			stream_83.add(char_literal109);

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
			// 265:2: -> ^( XXIFCOND expr )
			{
				// Q.g:265:5: ^( XXIFCOND expr )
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
	// Q.g:268:1: forcond : '(' SYMBOL IN expr ')' -> ^( XXFORCOND SYMBOL expr ) ;
	public final QParser.forcond_return forcond() throws RecognitionException {
		QParser.forcond_return retval = new QParser.forcond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal110=null;
		Token SYMBOL111=null;
		Token IN112=null;
		Token char_literal114=null;
		ParserRuleReturnScope expr113 =null;

		Object char_literal110_tree=null;
		Object SYMBOL111_tree=null;
		Object IN112_tree=null;
		Object char_literal114_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:268:9: ( '(' SYMBOL IN expr ')' -> ^( XXFORCOND SYMBOL expr ) )
			// Q.g:268:11: '(' SYMBOL IN expr ')'
			{
			char_literal110=(Token)match(input,82,FOLLOW_82_in_forcond1687);  
			stream_82.add(char_literal110);

			SYMBOL111=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_forcond1689);  
			stream_SYMBOL.add(SYMBOL111);

			IN112=(Token)match(input,IN,FOLLOW_IN_in_forcond1691);  
			stream_IN.add(IN112);

			pushFollow(FOLLOW_expr_in_forcond1693);
			expr113=expr();
			state._fsp--;

			stream_expr.add(expr113.getTree());
			char_literal114=(Token)match(input,83,FOLLOW_83_in_forcond1695);  
			stream_83.add(char_literal114);

			// AST REWRITE
			// elements: SYMBOL, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 269:2: -> ^( XXFORCOND SYMBOL expr )
			{
				// Q.g:269:5: ^( XXFORCOND SYMBOL expr )
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
	// Q.g:285:1: fragment sublist : sub ( cr ',' sub )* ( EOF )? -> ^( XXSUBLIST ( sub )* ) ;
	public final QParser.sublist_return sublist() throws RecognitionException {
		QParser.sublist_return retval = new QParser.sublist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal117=null;
		Token EOF119=null;
		ParserRuleReturnScope sub115 =null;
		ParserRuleReturnScope cr116 =null;
		ParserRuleReturnScope sub118 =null;

		Object char_literal117_tree=null;
		Object EOF119_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_cr=new RewriteRuleSubtreeStream(adaptor,"rule cr");
		RewriteRuleSubtreeStream stream_sub=new RewriteRuleSubtreeStream(adaptor,"rule sub");

		try {
			// Q.g:285:9: ( sub ( cr ',' sub )* ( EOF )? -> ^( XXSUBLIST ( sub )* ) )
			// Q.g:285:11: sub ( cr ',' sub )* ( EOF )?
			{
			pushFollow(FOLLOW_sub_in_sublist1723);
			sub115=sub();
			state._fsp--;

			stream_sub.add(sub115.getTree());
			// Q.g:285:15: ( cr ',' sub )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==BREAK||LA27_0==DecimalLiteral||(LA27_0 >= FALSE && LA27_0 <= FUNCTION)||LA27_0==FloatingPointLiteral||(LA27_0 >= HexLiteral && LA27_0 <= IF)||LA27_0==NA||LA27_0==NEXT||LA27_0==NULL_CONST||(LA27_0 >= OctalLiteral && LA27_0 <= REPEAT)||(LA27_0 >= STR_CONST && LA27_0 <= TRUE)||LA27_0==WHILE||LA27_0==80||LA27_0==82||(LA27_0 >= 85 && LA27_0 <= 87)||LA27_0==91||(LA27_0 >= 93 && LA27_0 <= 98)||LA27_0==103||LA27_0==105) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Q.g:285:16: cr ',' sub
					{
					pushFollow(FOLLOW_cr_in_sublist1726);
					cr116=cr();
					state._fsp--;

					stream_cr.add(cr116.getTree());
					char_literal117=(Token)match(input,86,FOLLOW_86_in_sublist1728);  
					stream_86.add(char_literal117);

					pushFollow(FOLLOW_sub_in_sublist1730);
					sub118=sub();
					state._fsp--;

					stream_sub.add(sub118.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			// Q.g:285:29: ( EOF )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EOF) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Q.g:285:29: EOF
					{
					EOF119=(Token)match(input,EOF,FOLLOW_EOF_in_sublist1734);  
					stream_EOF.add(EOF119);

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
			// 286:3: -> ^( XXSUBLIST ( sub )* )
			{
				// Q.g:286:6: ^( XXSUBLIST ( sub )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUBLIST, "XXSUBLIST"), root_1);
				// Q.g:286:18: ( sub )*
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
	// Q.g:290:1: fragment sub : ( -> ^( XXSUB0 ) | expr -> ^( XXSUB1 expr ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr ) );
	public final QParser.sub_return sub() throws RecognitionException {
		QParser.sub_return retval = new QParser.sub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NULL_CONST122=null;
		Token EQ_ASSIGN123=null;
		Token NULL_CONST125=null;
		Token EQ_ASSIGN126=null;
		ParserRuleReturnScope expr120 =null;
		ParserRuleReturnScope symbol_or_conststr121 =null;
		ParserRuleReturnScope symbol_or_conststr124 =null;
		ParserRuleReturnScope expr127 =null;

		Object NULL_CONST122_tree=null;
		Object EQ_ASSIGN123_tree=null;
		Object NULL_CONST125_tree=null;
		Object EQ_ASSIGN126_tree=null;
		RewriteRuleTokenStream stream_NULL_CONST=new RewriteRuleTokenStream(adaptor,"token NULL_CONST");
		RewriteRuleTokenStream stream_EQ_ASSIGN=new RewriteRuleTokenStream(adaptor,"token EQ_ASSIGN");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:290:5: ( -> ^( XXSUB0 ) | expr -> ^( XXSUB1 expr ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr ) )
			int alt31=4;
			switch ( input.LA(1) ) {
			case EOF:
			case 83:
			case 86:
			case 101:
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
			case 80:
			case 82:
			case 85:
			case 87:
			case 91:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 103:
			case 105:
				{
				alt31=2;
				}
				break;
			case STR_CONST:
				{
				int LA31_3 = input.LA(2);
				if ( (LA31_3==EOF||(LA31_3 >= AND && LA31_3 <= AND2)||LA31_3==EQ||(LA31_3 >= GE && LA31_3 <= GT)||(LA31_3 >= LBB && LA31_3 <= LT)||LA31_3==NE||(LA31_3 >= NS_GET && LA31_3 <= NS_GET_INT)||(LA31_3 >= OR && LA31_3 <= OR2)||(LA31_3 >= RIGHT_ASSIGN && LA31_3 <= SPECIAL)||(LA31_3 >= 81 && LA31_3 <= 89)||(LA31_3 >= 91 && LA31_3 <= 92)||LA31_3==99||(LA31_3 >= 101 && LA31_3 <= 102)||LA31_3==105) ) {
					alt31=2;
				}
				else if ( (LA31_3==EQ_ASSIGN) ) {
					int LA31_6 = input.LA(3);
					if ( (LA31_6==EOF||LA31_6==83||LA31_6==86||LA31_6==101) ) {
						alt31=3;
					}
					else if ( (LA31_6==BREAK||LA31_6==DecimalLiteral||(LA31_6 >= FALSE && LA31_6 <= FUNCTION)||LA31_6==FloatingPointLiteral||(LA31_6 >= HexLiteral && LA31_6 <= IF)||LA31_6==NA||LA31_6==NEXT||LA31_6==NULL_CONST||(LA31_6 >= OctalLiteral && LA31_6 <= REPEAT)||(LA31_6 >= STR_CONST && LA31_6 <= TRUE)||LA31_6==WHILE||LA31_6==80||LA31_6==82||LA31_6==85||LA31_6==87||LA31_6==91||(LA31_6 >= 93 && LA31_6 <= 98)||LA31_6==103||LA31_6==105) ) {
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
				if ( (LA31_4==EOF||(LA31_4 >= AND && LA31_4 <= AND2)||LA31_4==EQ||(LA31_4 >= GE && LA31_4 <= GT)||(LA31_4 >= LBB && LA31_4 <= LT)||LA31_4==NE||(LA31_4 >= OR && LA31_4 <= OR2)||(LA31_4 >= RIGHT_ASSIGN && LA31_4 <= SPECIAL)||(LA31_4 >= 81 && LA31_4 <= 89)||(LA31_4 >= 91 && LA31_4 <= 92)||LA31_4==99||(LA31_4 >= 101 && LA31_4 <= 102)||LA31_4==105) ) {
					alt31=2;
				}
				else if ( (LA31_4==EQ_ASSIGN) ) {
					int LA31_6 = input.LA(3);
					if ( (LA31_6==EOF||LA31_6==83||LA31_6==86||LA31_6==101) ) {
						alt31=3;
					}
					else if ( (LA31_6==BREAK||LA31_6==DecimalLiteral||(LA31_6 >= FALSE && LA31_6 <= FUNCTION)||LA31_6==FloatingPointLiteral||(LA31_6 >= HexLiteral && LA31_6 <= IF)||LA31_6==NA||LA31_6==NEXT||LA31_6==NULL_CONST||(LA31_6 >= OctalLiteral && LA31_6 <= REPEAT)||(LA31_6 >= STR_CONST && LA31_6 <= TRUE)||LA31_6==WHILE||LA31_6==80||LA31_6==82||LA31_6==85||LA31_6==87||LA31_6==91||(LA31_6 >= 93 && LA31_6 <= 98)||LA31_6==103||LA31_6==105) ) {
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
				if ( (LA31_5==EOF||(LA31_5 >= AND && LA31_5 <= AND2)||LA31_5==EQ||(LA31_5 >= GE && LA31_5 <= GT)||(LA31_5 >= LBB && LA31_5 <= LT)||LA31_5==NE||(LA31_5 >= NS_GET && LA31_5 <= NS_GET_INT)||(LA31_5 >= OR && LA31_5 <= OR2)||(LA31_5 >= RIGHT_ASSIGN && LA31_5 <= SPECIAL)||(LA31_5 >= 81 && LA31_5 <= 89)||(LA31_5 >= 91 && LA31_5 <= 92)||LA31_5==99||(LA31_5 >= 101 && LA31_5 <= 102)||LA31_5==105) ) {
					alt31=2;
				}
				else if ( (LA31_5==EQ_ASSIGN) ) {
					int LA31_6 = input.LA(3);
					if ( (LA31_6==EOF||LA31_6==83||LA31_6==86||LA31_6==101) ) {
						alt31=3;
					}
					else if ( (LA31_6==BREAK||LA31_6==DecimalLiteral||(LA31_6 >= FALSE && LA31_6 <= FUNCTION)||LA31_6==FloatingPointLiteral||(LA31_6 >= HexLiteral && LA31_6 <= IF)||LA31_6==NA||LA31_6==NEXT||LA31_6==NULL_CONST||(LA31_6 >= OctalLiteral && LA31_6 <= REPEAT)||(LA31_6 >= STR_CONST && LA31_6 <= TRUE)||LA31_6==WHILE||LA31_6==80||LA31_6==82||LA31_6==85||LA31_6==87||LA31_6==91||(LA31_6 >= 93 && LA31_6 <= 98)||LA31_6==103||LA31_6==105) ) {
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
					// Q.g:290:7: 
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
					// 290:7: -> ^( XXSUB0 )
					{
						// Q.g:290:10: ^( XXSUB0 )
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
					// Q.g:291:4: expr
					{
					pushFollow(FOLLOW_expr_in_sub1767);
					expr120=expr();
					state._fsp--;

					stream_expr.add(expr120.getTree());
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
					// 291:9: -> ^( XXSUB1 expr )
					{
						// Q.g:291:12: ^( XXSUB1 expr )
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
					// Q.g:292:4: ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN
					{
					// Q.g:292:4: ( symbol_or_conststr | NULL_CONST )
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
							// Q.g:292:5: symbol_or_conststr
							{
							pushFollow(FOLLOW_symbol_or_conststr_in_sub1781);
							symbol_or_conststr121=symbol_or_conststr();
							state._fsp--;

							stream_symbol_or_conststr.add(symbol_or_conststr121.getTree());
							}
							break;
						case 2 :
							// Q.g:292:26: NULL_CONST
							{
							NULL_CONST122=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_sub1785);  
							stream_NULL_CONST.add(NULL_CONST122);

							}
							break;

					}

					EQ_ASSIGN123=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_sub1788);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN123);

					// AST REWRITE
					// elements: NULL_CONST, symbol_or_conststr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 292:48: -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? )
					{
						// Q.g:292:51: ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSYMSUB0, "XXSYMSUB0"), root_1);
						// Q.g:292:63: ( symbol_or_conststr )?
						if ( stream_symbol_or_conststr.hasNext() ) {
							adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						}
						stream_symbol_or_conststr.reset();

						// Q.g:292:83: ( NULL_CONST )?
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
					// Q.g:293:4: ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr
					{
					// Q.g:293:4: ( symbol_or_conststr | NULL_CONST )
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
							// Q.g:293:5: symbol_or_conststr
							{
							pushFollow(FOLLOW_symbol_or_conststr_in_sub1806);
							symbol_or_conststr124=symbol_or_conststr();
							state._fsp--;

							stream_symbol_or_conststr.add(symbol_or_conststr124.getTree());
							}
							break;
						case 2 :
							// Q.g:293:26: NULL_CONST
							{
							NULL_CONST125=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_sub1810);  
							stream_NULL_CONST.add(NULL_CONST125);

							}
							break;

					}

					EQ_ASSIGN126=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_sub1813);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN126);

					pushFollow(FOLLOW_expr_in_sub1815);
					expr127=expr();
					state._fsp--;

					stream_expr.add(expr127.getTree());
					// AST REWRITE
					// elements: symbol_or_conststr, NULL_CONST, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 293:53: -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr )
					{
						// Q.g:293:55: ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSYMSUB1, "XXSYMSUB1"), root_1);
						// Q.g:293:67: ( symbol_or_conststr )?
						if ( stream_symbol_or_conststr.hasNext() ) {
							adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						}
						stream_symbol_or_conststr.reset();

						// Q.g:293:87: ( NULL_CONST )?
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
	// Q.g:305:1: cr :;
	public final QParser.cr_return cr() throws RecognitionException {
		QParser.cr_return retval = new QParser.cr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		try {
			// Q.g:305:4: ()
			// Q.g:306:2: 
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
	// Q.g:338:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final QParser.integerLiteral_return integerLiteral() throws RecognitionException {
		QParser.integerLiteral_return retval = new QParser.integerLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set128=null;

		Object set128_tree=null;

		try {
			// Q.g:338:16: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set128=input.LT(1);
			if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set128));
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
	// Q.g:344:1: num_const : ( integerLiteral | FloatingPointLiteral | NA | TRUE | FALSE | 'Inf' | 'NaN' | 'NA_integer_' | 'NA_real_' | 'NA_character_' | 'NA_complex_' );
	public final QParser.num_const_return num_const() throws RecognitionException {
		QParser.num_const_return retval = new QParser.num_const_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FloatingPointLiteral130=null;
		Token NA131=null;
		Token TRUE132=null;
		Token FALSE133=null;
		Token string_literal134=null;
		Token string_literal135=null;
		Token string_literal136=null;
		Token string_literal137=null;
		Token string_literal138=null;
		Token string_literal139=null;
		ParserRuleReturnScope integerLiteral129 =null;

		Object FloatingPointLiteral130_tree=null;
		Object NA131_tree=null;
		Object TRUE132_tree=null;
		Object FALSE133_tree=null;
		Object string_literal134_tree=null;
		Object string_literal135_tree=null;
		Object string_literal136_tree=null;
		Object string_literal137_tree=null;
		Object string_literal138_tree=null;
		Object string_literal139_tree=null;

		try {
			// Q.g:345:2: ( integerLiteral | FloatingPointLiteral | NA | TRUE | FALSE | 'Inf' | 'NaN' | 'NA_integer_' | 'NA_real_' | 'NA_character_' | 'NA_complex_' )
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
			case 93:
				{
				alt32=6;
				}
				break;
			case 98:
				{
				alt32=7;
				}
				break;
			case 96:
				{
				alt32=8;
				}
				break;
			case 97:
				{
				alt32=9;
				}
				break;
			case 94:
				{
				alt32=10;
				}
				break;
			case 95:
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
					// Q.g:345:4: integerLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integerLiteral_in_num_const2136);
					integerLiteral129=integerLiteral();
					state._fsp--;

					adaptor.addChild(root_0, integerLiteral129.getTree());

					}
					break;
				case 2 :
					// Q.g:346:4: FloatingPointLiteral
					{
					root_0 = (Object)adaptor.nil();


					FloatingPointLiteral130=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_num_const2141); 
					FloatingPointLiteral130_tree = (Object)adaptor.create(FloatingPointLiteral130);
					adaptor.addChild(root_0, FloatingPointLiteral130_tree);

					}
					break;
				case 3 :
					// Q.g:347:4: NA
					{
					root_0 = (Object)adaptor.nil();


					NA131=(Token)match(input,NA,FOLLOW_NA_in_num_const2146); 
					NA131_tree = (Object)adaptor.create(NA131);
					adaptor.addChild(root_0, NA131_tree);

					}
					break;
				case 4 :
					// Q.g:348:4: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE132=(Token)match(input,TRUE,FOLLOW_TRUE_in_num_const2151); 
					TRUE132_tree = (Object)adaptor.create(TRUE132);
					adaptor.addChild(root_0, TRUE132_tree);

					}
					break;
				case 5 :
					// Q.g:349:4: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE133=(Token)match(input,FALSE,FOLLOW_FALSE_in_num_const2156); 
					FALSE133_tree = (Object)adaptor.create(FALSE133);
					adaptor.addChild(root_0, FALSE133_tree);

					}
					break;
				case 6 :
					// Q.g:350:4: 'Inf'
					{
					root_0 = (Object)adaptor.nil();


					string_literal134=(Token)match(input,93,FOLLOW_93_in_num_const2161); 
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

					}
					break;
				case 7 :
					// Q.g:351:4: 'NaN'
					{
					root_0 = (Object)adaptor.nil();


					string_literal135=(Token)match(input,98,FOLLOW_98_in_num_const2166); 
					string_literal135_tree = (Object)adaptor.create(string_literal135);
					adaptor.addChild(root_0, string_literal135_tree);

					}
					break;
				case 8 :
					// Q.g:352:4: 'NA_integer_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal136=(Token)match(input,96,FOLLOW_96_in_num_const2171); 
					string_literal136_tree = (Object)adaptor.create(string_literal136);
					adaptor.addChild(root_0, string_literal136_tree);

					}
					break;
				case 9 :
					// Q.g:353:4: 'NA_real_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal137=(Token)match(input,97,FOLLOW_97_in_num_const2176); 
					string_literal137_tree = (Object)adaptor.create(string_literal137);
					adaptor.addChild(root_0, string_literal137_tree);

					}
					break;
				case 10 :
					// Q.g:354:4: 'NA_character_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal138=(Token)match(input,94,FOLLOW_94_in_num_const2181); 
					string_literal138_tree = (Object)adaptor.create(string_literal138);
					adaptor.addChild(root_0, string_literal138_tree);

					}
					break;
				case 11 :
					// Q.g:355:4: 'NA_complex_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal139=(Token)match(input,95,FOLLOW_95_in_num_const2186); 
					string_literal139_tree = (Object)adaptor.create(string_literal139);
					adaptor.addChild(root_0, string_literal139_tree);

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
		"\1\132\1\6\1\uffff\1\6\1\uffff";
	static final String DFA1_maxS =
		"\1\144\1\151\1\uffff\1\151\1\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA1_specialS =
		"\5\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\3\11\uffff\1\1",
			"\1\4\1\uffff\1\4\5\uffff\3\4\1\uffff\1\4\3\uffff\2\4\10\uffff\1\4\1"+
			"\uffff\1\4\2\uffff\1\4\3\uffff\2\4\2\uffff\3\4\1\uffff\1\4\36\uffff\1"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\3\1\4\1\uffff\6\4\1"+
			"\uffff\1\1\2\uffff\1\4\1\uffff\1\4",
			"",
			"\1\4\1\uffff\1\4\5\uffff\3\4\1\uffff\1\4\3\uffff\2\4\10\uffff\1\4\1"+
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
			return "()* loopback of 93:19: ( prog_continue )*";
		}
	}

	public static final BitSet FOLLOW_prog_begin_in_prog288 = new BitSet(new long[]{0x0000000000000002L,0x0000001004000000L});
	public static final BitSet FOLLOW_prog_continue_in_prog290 = new BitSet(new long[]{0x0000000000000002L,0x0000001004000000L});
	public static final BitSet FOLLOW_100_in_prog_begin311 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000297ECA50000L});
	public static final BitSet FOLLOW_90_in_prog_begin315 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000297ECA50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_prog_begin319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_prog_continue345 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000297ECA50000L});
	public static final BitSet FOLLOW_90_in_prog_continue349 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000297ECA50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_prog_continue353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_or_assign379 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_expr_or_assign385 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_expr_or_assign387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formalarg470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formalarg483 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_formalarg485 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_formalarg487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalarg_in_formlist507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_formlist510 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_formalarg_in_formlist512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_EOF_in_formlist518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_const_in_lexpr543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_CONST_in_lexpr548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_CONST_in_lexpr553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_lexpr558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_lexpr563 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000297E8A50000L});
	public static final BitSet FOLLOW_100_in_lexpr565 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000297E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr568 = new BitSet(new long[]{0x0000000000000000L,0x0000011004000000L});
	public static final BitSet FOLLOW_90_in_lexpr572 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000397ECA50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr574 = new BitSet(new long[]{0x0000000000000000L,0x0000011004000000L});
	public static final BitSet FOLLOW_100_in_lexpr581 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000397ECA50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr583 = new BitSet(new long[]{0x0000000000000000L,0x0000011004000000L});
	public static final BitSet FOLLOW_104_in_lexpr589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_lexpr605 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_lexpr609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_op_in_lexpr625 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_lexpr627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_lexpr644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_lexpr646 = new BitSet(new long[]{0x0000400000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_formlist_in_lexpr648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_lexpr650 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_cr_in_lexpr652 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_lexpr671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ifcond_in_lexpr673 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr677 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ELSE_in_lexpr680 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_lexpr708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_forcond_in_lexpr710 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_lexpr729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_cond_in_lexpr731 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_lexpr750 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr770 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_NS_GET_in_lexpr773 = new BitSet(new long[]{0x0000600000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr803 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_NS_GET_INT_in_lexpr806 = new BitSet(new long[]{0x0000600000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_lexpr833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_lexpr848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_in_refer976 = new BitSet(new long[]{0x0000000008000002L,0x0000000810060000L});
	public static final BitSet FOLLOW_82_in_refer989 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8E50000L});
	public static final BitSet FOLLOW_sublist_in_refer991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_refer993 = new BitSet(new long[]{0x0000000008000002L,0x0000000810060000L});
	public static final BitSet FOLLOW_LBB_in_refer1014 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8E50000L});
	public static final BitSet FOLLOW_sublist_in_refer1016 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_refer1018 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_refer1020 = new BitSet(new long[]{0x0000000008000002L,0x0000000810060000L});
	public static final BitSet FOLLOW_99_in_refer1043 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8E50000L});
	public static final BitSet FOLLOW_sublist_in_refer1045 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_refer1048 = new BitSet(new long[]{0x0000000008000002L,0x0000000810060000L});
	public static final BitSet FOLLOW_81_in_refer1072 = new BitSet(new long[]{0x0000600000000000L});
	public static final BitSet FOLLOW_92_in_refer1076 = new BitSet(new long[]{0x0000600000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_refer1079 = new BitSet(new long[]{0x0000000008000002L,0x0000000810060000L});
	public static final BitSet FOLLOW_refer_in_powerExpression1125 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_powerExpression1138 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_powerExpression_in_powerExpression1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_powerExpression_in_seqExpression1188 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_seqExpression1201 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_seqExpression_in_seqExpression1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_additive_op_in_additiveExpression1264 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_additiveExpression_in_additiveExpression1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqExpression_in_multiplicativeExpression1309 = new BitSet(new long[]{0x0000100000000002L,0x0000000001100000L});
	public static final BitSet FOLLOW_multicative_op_in_multiplicativeExpression1324 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_seqExpression_in_multiplicativeExpression1328 = new BitSet(new long[]{0x0000100000000002L,0x0000000001100000L});
	public static final BitSet FOLLOW_andExpression_in_inclusiveOrExpression1372 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_OR_in_inclusiveOrExpression1383 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_inclusiveOrExpression1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_andExpression1425 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_andExpression1436 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_andExpression_in_andExpression1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1479 = new BitSet(new long[]{0x0000008250180422L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression1490 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_tildeExpression1530 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_tildeExpression1546 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_tildeExpression_in_tildeExpression1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tildeExpression_in_expr1590 = new BitSet(new long[]{0x0000080020000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_assign_op_in_expr1605 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_expr1607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_cond1642 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_cond1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_cond1646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_ifcond1664 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_ifcond1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ifcond1668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_forcond1687 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SYMBOL_in_forcond1689 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IN_in_forcond1691 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_forcond1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_forcond1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_in_sublist1723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_cr_in_sublist1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_sublist1728 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8E50000L});
	public static final BitSet FOLLOW_sub_in_sublist1730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_EOF_in_sublist1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_sub1767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_sub1781 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NULL_CONST_in_sub1785 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_sub1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_sub1806 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NULL_CONST_in_sub1810 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_sub1813 = new BitSet(new long[]{0x0002E62500C5C140L,0x00000287E8A50000L});
	public static final BitSet FOLLOW_expr_in_sub1815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_num_const2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_num_const2141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NA_in_num_const2146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_num_const2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_num_const2156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_num_const2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_num_const2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_num_const2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_num_const2176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_num_const2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_num_const2186 = new BitSet(new long[]{0x0000000000000002L});
}
