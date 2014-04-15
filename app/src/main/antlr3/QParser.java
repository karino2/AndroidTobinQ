// $ANTLR 3.5.2 Q.g 2014-04-15 12:03:35

       package com.livejournal.karino2.tobinq.app;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class QParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND2", "BREAK", "DecimalLiteral", 
		"ELSE", "EQ", "EQ_ASSIGN", "EscapeSequence", "Exponent", "FALSE", "FOR", 
		"FUNCTION", "FloatTypeSuffix", "FloatingPointLiteral", "GE", "GT", "HexDigit", 
		"HexLiteral", "IF", "IN", "IntegerTypeSuffix", "JavaIDDigit", "LBB", "LE", 
		"LEFT_ASSIGN", "LT", "Letter", "NE", "NEXT", "NS_GET", "NS_GET_INT", "NULL_CONST", 
		"OR", "OR2", "OctalEscape", "OctalLiteral", "REPEAT", "RIGHT_ASSIGN", 
		"SPECIAL", "STR_CONST", "SYMBOL", "TRUE", "UnicodeEscape", "WHILE", "XXBINARY", 
		"XXCOND", "XXDEFUN", "XXEXPRLIST", "XXEXPRLIST0", "XXEXPRLIST1", "XXEXPRLIST2", 
		"XXFOR", "XXFORCOND", "XXFORMAL0", "XXFORMAL1", "XXFORMALLIST", "XXFUNCALL", 
		"XXIF", "XXIFCOND", "XXIFELSE", "XXNULLSUB0", "XXNULLSUB1", "XXNXTBRK", 
		"XXPAREN", "XXREPEAT", "XXSUB0", "XXSUB1", "XXSUBLIST", "XXSUBSCRIPT", 
		"XXSYMSUB0", "XXSYMSUB1", "XXUNARY", "XXVALUE", "XXWHILE", "'!'", "'$'", 
		"'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':'", "';'", 
		"'?'", "'@'", "'Inf'", "'NA'", "'NA_character_'", "'NA_complex_'", "'NA_integer_'", 
		"'NA_real_'", "'NaN'", "'['", "'\\n'", "']'", "'^'", "'{'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__78=78;
	public static final int T__79=79;
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
	public static final int DecimalLiteral=7;
	public static final int ELSE=8;
	public static final int EQ=9;
	public static final int EQ_ASSIGN=10;
	public static final int EscapeSequence=11;
	public static final int Exponent=12;
	public static final int FALSE=13;
	public static final int FOR=14;
	public static final int FUNCTION=15;
	public static final int FloatTypeSuffix=16;
	public static final int FloatingPointLiteral=17;
	public static final int GE=18;
	public static final int GT=19;
	public static final int HexDigit=20;
	public static final int HexLiteral=21;
	public static final int IF=22;
	public static final int IN=23;
	public static final int IntegerTypeSuffix=24;
	public static final int JavaIDDigit=25;
	public static final int LBB=26;
	public static final int LE=27;
	public static final int LEFT_ASSIGN=28;
	public static final int LT=29;
	public static final int Letter=30;
	public static final int NE=31;
	public static final int NEXT=32;
	public static final int NS_GET=33;
	public static final int NS_GET_INT=34;
	public static final int NULL_CONST=35;
	public static final int OR=36;
	public static final int OR2=37;
	public static final int OctalEscape=38;
	public static final int OctalLiteral=39;
	public static final int REPEAT=40;
	public static final int RIGHT_ASSIGN=41;
	public static final int SPECIAL=42;
	public static final int STR_CONST=43;
	public static final int SYMBOL=44;
	public static final int TRUE=45;
	public static final int UnicodeEscape=46;
	public static final int WHILE=47;
	public static final int XXBINARY=48;
	public static final int XXCOND=49;
	public static final int XXDEFUN=50;
	public static final int XXEXPRLIST=51;
	public static final int XXEXPRLIST0=52;
	public static final int XXEXPRLIST1=53;
	public static final int XXEXPRLIST2=54;
	public static final int XXFOR=55;
	public static final int XXFORCOND=56;
	public static final int XXFORMAL0=57;
	public static final int XXFORMAL1=58;
	public static final int XXFORMALLIST=59;
	public static final int XXFUNCALL=60;
	public static final int XXIF=61;
	public static final int XXIFCOND=62;
	public static final int XXIFELSE=63;
	public static final int XXNULLSUB0=64;
	public static final int XXNULLSUB1=65;
	public static final int XXNXTBRK=66;
	public static final int XXPAREN=67;
	public static final int XXREPEAT=68;
	public static final int XXSUB0=69;
	public static final int XXSUB1=70;
	public static final int XXSUBLIST=71;
	public static final int XXSUBSCRIPT=72;
	public static final int XXSYMSUB0=73;
	public static final int XXSYMSUB1=74;
	public static final int XXUNARY=75;
	public static final int XXVALUE=76;
	public static final int XXWHILE=77;

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
	// Q.g:92:1: prog : prog_begin ( prog_continue )* ( '\\n' | ';' )* ;
	public final QParser.prog_return prog() throws RecognitionException {
		QParser.prog_return retval = new QParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set3=null;
		ParserRuleReturnScope prog_begin1 =null;
		ParserRuleReturnScope prog_continue2 =null;

		Object set3_tree=null;

		try {
			// Q.g:92:6: ( prog_begin ( prog_continue )* ( '\\n' | ';' )* )
			// Q.g:92:8: prog_begin ( prog_continue )* ( '\\n' | ';' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_prog_begin_in_prog282);
			prog_begin1=prog_begin();
			state._fsp--;

			adaptor.addChild(root_0, prog_begin1.getTree());

			// Q.g:92:19: ( prog_continue )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// Q.g:92:19: prog_continue
					{
					pushFollow(FOLLOW_prog_continue_in_prog284);
					prog_continue2=prog_continue();
					state._fsp--;

					adaptor.addChild(root_0, prog_continue2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// Q.g:92:34: ( '\\n' | ';' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==89||LA2_0==100) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Q.g:
					{
					set3=input.LT(1);
					if ( input.LA(1)==89||input.LA(1)==100 ) {
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
	// Q.g:95:1: prog_begin : ( '\\n' | ';' )* expr_or_assign -> ^( XXVALUE expr_or_assign ) ;
	public final QParser.prog_begin_return prog_begin() throws RecognitionException {
		QParser.prog_begin_return retval = new QParser.prog_begin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal4=null;
		Token char_literal5=null;
		ParserRuleReturnScope expr_or_assign6 =null;

		Object char_literal4_tree=null;
		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:95:12: ( ( '\\n' | ';' )* expr_or_assign -> ^( XXVALUE expr_or_assign ) )
			// Q.g:95:14: ( '\\n' | ';' )* expr_or_assign
			{
			// Q.g:95:14: ( '\\n' | ';' )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==100) ) {
					alt3=1;
				}
				else if ( (LA3_0==89) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// Q.g:95:15: '\\n'
					{
					char_literal4=(Token)match(input,100,FOLLOW_100_in_prog_begin305);  
					stream_100.add(char_literal4);

					}
					break;
				case 2 :
					// Q.g:95:22: ';'
					{
					char_literal5=(Token)match(input,89,FOLLOW_89_in_prog_begin309);  
					stream_89.add(char_literal5);

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_expr_or_assign_in_prog_begin313);
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
			// 96:3: -> ^( XXVALUE expr_or_assign )
			{
				// Q.g:96:6: ^( XXVALUE expr_or_assign )
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
	// Q.g:99:1: prog_continue : ( '\\n' | ';' )+ expr_or_assign -> ^( XXVALUE expr_or_assign ) ;
	public final QParser.prog_continue_return prog_continue() throws RecognitionException {
		QParser.prog_continue_return retval = new QParser.prog_continue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal7=null;
		Token char_literal8=null;
		ParserRuleReturnScope expr_or_assign9 =null;

		Object char_literal7_tree=null;
		Object char_literal8_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			// Q.g:99:14: ( ( '\\n' | ';' )+ expr_or_assign -> ^( XXVALUE expr_or_assign ) )
			// Q.g:100:3: ( '\\n' | ';' )+ expr_or_assign
			{
			// Q.g:100:3: ( '\\n' | ';' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==100) ) {
					alt4=1;
				}
				else if ( (LA4_0==89) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Q.g:100:4: '\\n'
					{
					char_literal7=(Token)match(input,100,FOLLOW_100_in_prog_continue339);  
					stream_100.add(char_literal7);

					}
					break;
				case 2 :
					// Q.g:100:11: ';'
					{
					char_literal8=(Token)match(input,89,FOLLOW_89_in_prog_continue343);  
					stream_89.add(char_literal8);

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			pushFollow(FOLLOW_expr_or_assign_in_prog_continue347);
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
			// 101:3: -> ^( XXVALUE expr_or_assign )
			{
				// Q.g:101:6: ^( XXVALUE expr_or_assign )
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
	// Q.g:104:1: expr_or_assign : ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )? ;
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
			// Q.g:104:17: ( ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )? )
			// Q.g:104:22: ( expr -> expr ) ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )?
			{
			// Q.g:104:22: ( expr -> expr )
			// Q.g:104:23: expr
			{
			pushFollow(FOLLOW_expr_in_expr_or_assign376);
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
			// 104:27: -> expr
			{
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:104:35: ( EQ_ASSIGN expr_or_assign -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EQ_ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Q.g:104:36: EQ_ASSIGN expr_or_assign
					{
					EQ_ASSIGN11=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_expr_or_assign382);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN11);

					pushFollow(FOLLOW_expr_or_assign_in_expr_or_assign384);
					expr_or_assign12=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign12.getTree());
					// AST REWRITE
					// elements: expr, EQ_ASSIGN, expr_or_assign
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:61: -> ^( XXBINARY EQ_ASSIGN expr expr_or_assign )
					{
						// Q.g:104:64: ^( XXBINARY EQ_ASSIGN expr expr_or_assign )
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
	// Q.g:107:1: symbol_or_conststr : ( SYMBOL | STR_CONST );
	public final QParser.symbol_or_conststr_return symbol_or_conststr() throws RecognitionException {
		QParser.symbol_or_conststr_return retval = new QParser.symbol_or_conststr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set13=null;

		Object set13_tree=null;

		try {
			// Q.g:108:2: ( SYMBOL | STR_CONST )
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
	// Q.g:110:1: unary_op : ( '-' | '+' | '!' | '~' | '?' ) ;
	public final QParser.unary_op_return unary_op() throws RecognitionException {
		QParser.unary_op_return retval = new QParser.unary_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;

		Object set14_tree=null;

		try {
			// Q.g:111:2: ( ( '-' | '+' | '!' | '~' | '?' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set14=input.LT(1);
			if ( input.LA(1)==78||input.LA(1)==84||input.LA(1)==86||input.LA(1)==90||input.LA(1)==105 ) {
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
	// Q.g:114:1: formalarg : ( SYMBOL -> ^( XXFORMAL0 SYMBOL ) | SYMBOL EQ_ASSIGN expr -> ^( XXFORMAL1 SYMBOL expr ) );
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
			// Q.g:114:11: ( SYMBOL -> ^( XXFORMAL0 SYMBOL ) | SYMBOL EQ_ASSIGN expr -> ^( XXFORMAL1 SYMBOL expr ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==SYMBOL) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==EQ_ASSIGN) ) {
					alt6=2;
				}
				else if ( (LA6_1==EOF||LA6_1==82||LA6_1==85) ) {
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
					// Q.g:114:13: SYMBOL
					{
					SYMBOL15=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formalarg467);  
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
					// 114:20: -> ^( XXFORMAL0 SYMBOL )
					{
						// Q.g:114:23: ^( XXFORMAL0 SYMBOL )
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
					// Q.g:115:4: SYMBOL EQ_ASSIGN expr
					{
					SYMBOL16=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formalarg480);  
					stream_SYMBOL.add(SYMBOL16);

					EQ_ASSIGN17=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_formalarg482);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN17);

					pushFollow(FOLLOW_expr_in_formalarg484);
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
					// 115:26: -> ^( XXFORMAL1 SYMBOL expr )
					{
						// Q.g:115:29: ^( XXFORMAL1 SYMBOL expr )
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
	// Q.g:119:1: formlist : ( formalarg ( ',' formalarg )* )? ( EOF )? -> ^( XXFORMALLIST ( formalarg )* ) ;
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
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_formalarg=new RewriteRuleSubtreeStream(adaptor,"rule formalarg");

		try {
			// Q.g:119:9: ( ( formalarg ( ',' formalarg )* )? ( EOF )? -> ^( XXFORMALLIST ( formalarg )* ) )
			// Q.g:119:10: ( formalarg ( ',' formalarg )* )? ( EOF )?
			{
			// Q.g:119:10: ( formalarg ( ',' formalarg )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==SYMBOL) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Q.g:119:11: formalarg ( ',' formalarg )*
					{
					pushFollow(FOLLOW_formalarg_in_formlist504);
					formalarg19=formalarg();
					state._fsp--;

					stream_formalarg.add(formalarg19.getTree());
					// Q.g:119:21: ( ',' formalarg )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==85) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Q.g:119:22: ',' formalarg
							{
							char_literal20=(Token)match(input,85,FOLLOW_85_in_formlist507);  
							stream_85.add(char_literal20);

							pushFollow(FOLLOW_formalarg_in_formlist509);
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

			// Q.g:119:40: ( EOF )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==EOF) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Q.g:119:40: EOF
					{
					EOF22=(Token)match(input,EOF,FOLLOW_EOF_in_formlist515);  
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
			// 120:4: -> ^( XXFORMALLIST ( formalarg )* )
			{
				// Q.g:120:7: ^( XXFORMALLIST ( formalarg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXFORMALLIST, "XXFORMALLIST"), root_1);
				// Q.g:120:22: ( formalarg )*
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
	// Q.g:124:1: lexpr : ( num_const | STR_CONST | NULL_CONST | SYMBOL | '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}' -> ^( XXEXPRLIST ( expr_or_assign )+ ) | '(' expr_or_assign ')' -> ^( XXPAREN expr_or_assign ) | unary_op expr -> ^( XXUNARY unary_op expr ) | FUNCTION '(' formlist ')' cr expr_or_assign -> ^( XXDEFUN formlist expr_or_assign ) | IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )? -> ^( XXIFELSE ifcond $ifexp ( $elexp)? ) | FOR forcond expr_or_assign -> ^( XXFOR forcond expr_or_assign ) | WHILE cond expr_or_assign -> ^( XXWHILE cond expr_or_assign ) | REPEAT expr_or_assign -> ^( XXREPEAT expr_or_assign ) | (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET $fs $ss) | (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET_INT $fs $ss) | NEXT -> ^( XXNXTBRK NEXT ) | BREAK -> ^( XXNXTBRK BREAK ) );
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
		RewriteRuleTokenStream stream_NS_GET_INT=new RewriteRuleTokenStream(adaptor,"token NS_GET_INT");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_NS_GET=new RewriteRuleTokenStream(adaptor,"token NS_GET");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
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
			// Q.g:124:7: ( num_const | STR_CONST | NULL_CONST | SYMBOL | '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}' -> ^( XXEXPRLIST ( expr_or_assign )+ ) | '(' expr_or_assign ')' -> ^( XXPAREN expr_or_assign ) | unary_op expr -> ^( XXUNARY unary_op expr ) | FUNCTION '(' formlist ')' cr expr_or_assign -> ^( XXDEFUN formlist expr_or_assign ) | IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )? -> ^( XXIFELSE ifcond $ifexp ( $elexp)? ) | FOR forcond expr_or_assign -> ^( XXFOR forcond expr_or_assign ) | WHILE cond expr_or_assign -> ^( XXWHILE cond expr_or_assign ) | REPEAT expr_or_assign -> ^( XXREPEAT expr_or_assign ) | (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET $fs $ss) | (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr ) -> ^( XXBINARY NS_GET_INT $fs $ss) | NEXT -> ^( XXNXTBRK NEXT ) | BREAK -> ^( XXNXTBRK BREAK ) )
			int alt15=16;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case FALSE:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case TRUE:
			case 92:
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
				case 79:
				case 80:
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
				case 79:
				case 80:
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
			case 81:
				{
				alt15=6;
				}
				break;
			case 78:
			case 84:
			case 86:
			case 90:
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
					// Q.g:124:10: num_const
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_num_const_in_lexpr540);
					num_const23=num_const();
					state._fsp--;

					adaptor.addChild(root_0, num_const23.getTree());

					}
					break;
				case 2 :
					// Q.g:125:4: STR_CONST
					{
					root_0 = (Object)adaptor.nil();


					STR_CONST24=(Token)match(input,STR_CONST,FOLLOW_STR_CONST_in_lexpr545); 
					STR_CONST24_tree = (Object)adaptor.create(STR_CONST24);
					adaptor.addChild(root_0, STR_CONST24_tree);

					}
					break;
				case 3 :
					// Q.g:126:4: NULL_CONST
					{
					root_0 = (Object)adaptor.nil();


					NULL_CONST25=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_lexpr550); 
					NULL_CONST25_tree = (Object)adaptor.create(NULL_CONST25);
					adaptor.addChild(root_0, NULL_CONST25_tree);

					}
					break;
				case 4 :
					// Q.g:127:4: SYMBOL
					{
					root_0 = (Object)adaptor.nil();


					SYMBOL26=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_lexpr555); 
					SYMBOL26_tree = (Object)adaptor.create(SYMBOL26);
					adaptor.addChild(root_0, SYMBOL26_tree);

					}
					break;
				case 5 :
					// Q.g:128:4: '{' ( '\\n' )* expr_or_assign ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )* '}'
					{
					char_literal27=(Token)match(input,103,FOLLOW_103_in_lexpr560);  
					stream_103.add(char_literal27);

					// Q.g:128:8: ( '\\n' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==100) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Q.g:128:8: '\\n'
							{
							char_literal28=(Token)match(input,100,FOLLOW_100_in_lexpr562);  
							stream_100.add(char_literal28);

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_expr_or_assign_in_lexpr565);
					expr_or_assign29=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign29.getTree());
					// Q.g:128:29: ( ( ';' ( expr_or_assign )? ) | ( '\\n' ( expr_or_assign )? ) )*
					loop13:
					while (true) {
						int alt13=3;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==89) ) {
							alt13=1;
						}
						else if ( (LA13_0==100) ) {
							alt13=2;
						}

						switch (alt13) {
						case 1 :
							// Q.g:128:30: ( ';' ( expr_or_assign )? )
							{
							// Q.g:128:30: ( ';' ( expr_or_assign )? )
							// Q.g:128:31: ';' ( expr_or_assign )?
							{
							char_literal30=(Token)match(input,89,FOLLOW_89_in_lexpr569);  
							stream_89.add(char_literal30);

							// Q.g:128:35: ( expr_or_assign )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( ((LA11_0 >= BREAK && LA11_0 <= DecimalLiteral)||(LA11_0 >= FALSE && LA11_0 <= FUNCTION)||LA11_0==FloatingPointLiteral||(LA11_0 >= HexLiteral && LA11_0 <= IF)||LA11_0==NEXT||LA11_0==NULL_CONST||(LA11_0 >= OctalLiteral && LA11_0 <= REPEAT)||(LA11_0 >= STR_CONST && LA11_0 <= TRUE)||LA11_0==WHILE||LA11_0==78||LA11_0==81||LA11_0==84||LA11_0==86||LA11_0==90||(LA11_0 >= 92 && LA11_0 <= 98)||LA11_0==103||LA11_0==105) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// Q.g:128:35: expr_or_assign
									{
									pushFollow(FOLLOW_expr_or_assign_in_lexpr571);
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
							// Q.g:128:54: ( '\\n' ( expr_or_assign )? )
							{
							// Q.g:128:54: ( '\\n' ( expr_or_assign )? )
							// Q.g:128:55: '\\n' ( expr_or_assign )?
							{
							char_literal32=(Token)match(input,100,FOLLOW_100_in_lexpr578);  
							stream_100.add(char_literal32);

							// Q.g:128:60: ( expr_or_assign )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( ((LA12_0 >= BREAK && LA12_0 <= DecimalLiteral)||(LA12_0 >= FALSE && LA12_0 <= FUNCTION)||LA12_0==FloatingPointLiteral||(LA12_0 >= HexLiteral && LA12_0 <= IF)||LA12_0==NEXT||LA12_0==NULL_CONST||(LA12_0 >= OctalLiteral && LA12_0 <= REPEAT)||(LA12_0 >= STR_CONST && LA12_0 <= TRUE)||LA12_0==WHILE||LA12_0==78||LA12_0==81||LA12_0==84||LA12_0==86||LA12_0==90||(LA12_0 >= 92 && LA12_0 <= 98)||LA12_0==103||LA12_0==105) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// Q.g:128:60: expr_or_assign
									{
									pushFollow(FOLLOW_expr_or_assign_in_lexpr580);
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

					char_literal34=(Token)match(input,104,FOLLOW_104_in_lexpr586);  
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
					// 129:3: -> ^( XXEXPRLIST ( expr_or_assign )+ )
					{
						// Q.g:129:6: ^( XXEXPRLIST ( expr_or_assign )+ )
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
					// Q.g:130:4: '(' expr_or_assign ')'
					{
					char_literal35=(Token)match(input,81,FOLLOW_81_in_lexpr602);  
					stream_81.add(char_literal35);

					pushFollow(FOLLOW_expr_or_assign_in_lexpr604);
					expr_or_assign36=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign36.getTree());
					char_literal37=(Token)match(input,82,FOLLOW_82_in_lexpr606);  
					stream_82.add(char_literal37);

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
					// 131:3: -> ^( XXPAREN expr_or_assign )
					{
						// Q.g:131:6: ^( XXPAREN expr_or_assign )
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
					// Q.g:132:5: unary_op expr
					{
					pushFollow(FOLLOW_unary_op_in_lexpr622);
					unary_op38=unary_op();
					state._fsp--;

					stream_unary_op.add(unary_op38.getTree());
					pushFollow(FOLLOW_expr_in_lexpr624);
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
					// 133:3: -> ^( XXUNARY unary_op expr )
					{
						// Q.g:133:6: ^( XXUNARY unary_op expr )
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
					// Q.g:134:4: FUNCTION '(' formlist ')' cr expr_or_assign
					{
					FUNCTION40=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_lexpr641);  
					stream_FUNCTION.add(FUNCTION40);

					char_literal41=(Token)match(input,81,FOLLOW_81_in_lexpr643);  
					stream_81.add(char_literal41);

					pushFollow(FOLLOW_formlist_in_lexpr645);
					formlist42=formlist();
					state._fsp--;

					stream_formlist.add(formlist42.getTree());
					char_literal43=(Token)match(input,82,FOLLOW_82_in_lexpr647);  
					stream_82.add(char_literal43);

					pushFollow(FOLLOW_cr_in_lexpr649);
					cr44=cr();
					state._fsp--;

					stream_cr.add(cr44.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr651);
					expr_or_assign45=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(expr_or_assign45.getTree());
					// AST REWRITE
					// elements: expr_or_assign, formlist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:3: -> ^( XXDEFUN formlist expr_or_assign )
					{
						// Q.g:135:6: ^( XXDEFUN formlist expr_or_assign )
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
					// Q.g:136:4: IF ifcond ifexp= expr_or_assign ( ELSE elexp= expr_or_assign )?
					{
					IF46=(Token)match(input,IF,FOLLOW_IF_in_lexpr668);  
					stream_IF.add(IF46);

					pushFollow(FOLLOW_ifcond_in_lexpr670);
					ifcond47=ifcond();
					state._fsp--;

					stream_ifcond.add(ifcond47.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr674);
					ifexp=expr_or_assign();
					state._fsp--;

					stream_expr_or_assign.add(ifexp.getTree());
					// Q.g:136:35: ( ELSE elexp= expr_or_assign )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ELSE) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Q.g:136:36: ELSE elexp= expr_or_assign
							{
							ELSE48=(Token)match(input,ELSE,FOLLOW_ELSE_in_lexpr677);  
							stream_ELSE.add(ELSE48);

							pushFollow(FOLLOW_expr_or_assign_in_lexpr681);
							elexp=expr_or_assign();
							state._fsp--;

							stream_expr_or_assign.add(elexp.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: elexp, ifexp, ifcond
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
					// 137:3: -> ^( XXIFELSE ifcond $ifexp ( $elexp)? )
					{
						// Q.g:137:6: ^( XXIFELSE ifcond $ifexp ( $elexp)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXIFELSE, "XXIFELSE"), root_1);
						adaptor.addChild(root_1, stream_ifcond.nextTree());
						adaptor.addChild(root_1, stream_ifexp.nextTree());
						// Q.g:137:32: ( $elexp)?
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
					// Q.g:138:4: FOR forcond expr_or_assign
					{
					FOR49=(Token)match(input,FOR,FOLLOW_FOR_in_lexpr705);  
					stream_FOR.add(FOR49);

					pushFollow(FOLLOW_forcond_in_lexpr707);
					forcond50=forcond();
					state._fsp--;

					stream_forcond.add(forcond50.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr709);
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
					// 139:3: -> ^( XXFOR forcond expr_or_assign )
					{
						// Q.g:139:6: ^( XXFOR forcond expr_or_assign )
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
					// Q.g:140:4: WHILE cond expr_or_assign
					{
					WHILE52=(Token)match(input,WHILE,FOLLOW_WHILE_in_lexpr726);  
					stream_WHILE.add(WHILE52);

					pushFollow(FOLLOW_cond_in_lexpr728);
					cond53=cond();
					state._fsp--;

					stream_cond.add(cond53.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_lexpr730);
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
					// 141:3: -> ^( XXWHILE cond expr_or_assign )
					{
						// Q.g:141:6: ^( XXWHILE cond expr_or_assign )
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
					// Q.g:142:4: REPEAT expr_or_assign
					{
					REPEAT55=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_lexpr747);  
					stream_REPEAT.add(REPEAT55);

					pushFollow(FOLLOW_expr_or_assign_in_lexpr749);
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
					// 143:3: -> ^( XXREPEAT expr_or_assign )
					{
						// Q.g:143:6: ^( XXREPEAT expr_or_assign )
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
					// Q.g:144:4: (fs= symbol_or_conststr ) NS_GET (ss= symbol_or_conststr )
					{
					// Q.g:144:4: (fs= symbol_or_conststr )
					// Q.g:144:5: fs= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr767);
					fs=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(fs.getTree());
					}

					NS_GET57=(Token)match(input,NS_GET,FOLLOW_NS_GET_in_lexpr770);  
					stream_NS_GET.add(NS_GET57);

					// Q.g:144:35: (ss= symbol_or_conststr )
					// Q.g:144:36: ss= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr775);
					ss=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(ss.getTree());
					}

					// AST REWRITE
					// elements: ss, NS_GET, fs
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
					// 145:3: -> ^( XXBINARY NS_GET $fs $ss)
					{
						// Q.g:145:6: ^( XXBINARY NS_GET $fs $ss)
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
					// Q.g:146:4: (fs= symbol_or_conststr ) NS_GET_INT (ss= symbol_or_conststr )
					{
					// Q.g:146:4: (fs= symbol_or_conststr )
					// Q.g:146:5: fs= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr800);
					fs=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(fs.getTree());
					}

					NS_GET_INT58=(Token)match(input,NS_GET_INT,FOLLOW_NS_GET_INT_in_lexpr803);  
					stream_NS_GET_INT.add(NS_GET_INT58);

					// Q.g:146:39: (ss= symbol_or_conststr )
					// Q.g:146:40: ss= symbol_or_conststr
					{
					pushFollow(FOLLOW_symbol_or_conststr_in_lexpr808);
					ss=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(ss.getTree());
					}

					// AST REWRITE
					// elements: fs, ss, NS_GET_INT
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
					// 147:3: -> ^( XXBINARY NS_GET_INT $fs $ss)
					{
						// Q.g:147:6: ^( XXBINARY NS_GET_INT $fs $ss)
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
					// Q.g:148:4: NEXT
					{
					NEXT59=(Token)match(input,NEXT,FOLLOW_NEXT_in_lexpr830);  
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
					// 149:3: -> ^( XXNXTBRK NEXT )
					{
						// Q.g:149:6: ^( XXNXTBRK NEXT )
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
					// Q.g:150:4: BREAK
					{
					BREAK60=(Token)match(input,BREAK,FOLLOW_BREAK_in_lexpr845);  
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
					// 151:3: -> ^( XXNXTBRK BREAK )
					{
						// Q.g:151:6: ^( XXNXTBRK BREAK )
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
	// Q.g:154:1: additive_op : ( '+' | '-' ) ;
	public final QParser.additive_op_return additive_op() throws RecognitionException {
		QParser.additive_op_return retval = new QParser.additive_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;

		Object set61_tree=null;

		try {
			// Q.g:155:2: ( ( '+' | '-' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set61=input.LT(1);
			if ( input.LA(1)==84||input.LA(1)==86 ) {
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
	// Q.g:158:1: relationalOp : ( LT | LE | EQ | NE | GE | GT | AND2 | OR2 ) ;
	public final QParser.relationalOp_return relationalOp() throws RecognitionException {
		QParser.relationalOp_return retval = new QParser.relationalOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set62=null;

		Object set62_tree=null;

		try {
			// Q.g:159:2: ( ( LT | LE | EQ | NE | GE | GT | AND2 | OR2 ) )
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
	// Q.g:163:1: assign_op : ( LEFT_ASSIGN | RIGHT_ASSIGN ) ;
	public final QParser.assign_op_return assign_op() throws RecognitionException {
		QParser.assign_op_return retval = new QParser.assign_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;

		Object set63_tree=null;

		try {
			// Q.g:163:10: ( ( LEFT_ASSIGN | RIGHT_ASSIGN ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==LEFT_ASSIGN||input.LA(1)==RIGHT_ASSIGN ) {
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
	// Q.g:167:1: multicative_op : ( ':' | '*' | '/' | '^' | SPECIAL | '%' | '~' | '?' ) ;
	public final QParser.multicative_op_return multicative_op() throws RecognitionException {
		QParser.multicative_op_return retval = new QParser.multicative_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set64=null;

		Object set64_tree=null;

		try {
			// Q.g:168:2: ( ( ':' | '*' | '/' | '^' | SPECIAL | '%' | '~' | '?' ) )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set64=input.LT(1);
			if ( input.LA(1)==SPECIAL||input.LA(1)==80||input.LA(1)==83||(input.LA(1) >= 87 && input.LA(1) <= 88)||input.LA(1)==90||input.LA(1)==102||input.LA(1)==105 ) {
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
	// Q.g:171:1: refer : ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )* ;
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
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_LBB=new RewriteRuleTokenStream(adaptor,"token LBB");
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_sublist=new RewriteRuleSubtreeStream(adaptor,"rule sublist");

		try {
			// Q.g:171:7: ( ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )* )
			// Q.g:171:9: ( lexpr -> lexpr ) ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )*
			{
			// Q.g:171:9: ( lexpr -> lexpr )
			// Q.g:171:10: lexpr
			{
			pushFollow(FOLLOW_lexpr_in_refer981);
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
			// 171:16: -> lexpr
			{
				adaptor.addChild(root_0, stream_lexpr.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:172:6: ( '(' sublist ')' -> ^( XXFUNCALL $refer sublist ) | LBB sublist ']' ']' -> ^( XXSUBSCRIPT LBB $refer sublist ) | '[' sublist ']' -> ^( XXSUBSCRIPT '[' $refer sublist ) | ( '$' | '@' ) symbol_or_conststr -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr ) )*
			loop17:
			while (true) {
				int alt17=5;
				switch ( input.LA(1) ) {
				case 81:
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
				case 79:
					{
					alt17=4;
					}
					break;
				case 91:
					{
					alt17=4;
					}
					break;
				}
				switch (alt17) {
				case 1 :
					// Q.g:172:7: '(' sublist ')'
					{
					char_literal66=(Token)match(input,81,FOLLOW_81_in_refer994);  
					stream_81.add(char_literal66);

					pushFollow(FOLLOW_sublist_in_refer996);
					sublist67=sublist();
					state._fsp--;

					stream_sublist.add(sublist67.getTree());
					char_literal68=(Token)match(input,82,FOLLOW_82_in_refer998);  
					stream_82.add(char_literal68);

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
					// 173:5: -> ^( XXFUNCALL $refer sublist )
					{
						// Q.g:173:8: ^( XXFUNCALL $refer sublist )
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
					// Q.g:174:5: LBB sublist ']' ']'
					{
					LBB69=(Token)match(input,LBB,FOLLOW_LBB_in_refer1019);  
					stream_LBB.add(LBB69);

					pushFollow(FOLLOW_sublist_in_refer1021);
					sublist70=sublist();
					state._fsp--;

					stream_sublist.add(sublist70.getTree());
					char_literal71=(Token)match(input,101,FOLLOW_101_in_refer1023);  
					stream_101.add(char_literal71);

					char_literal72=(Token)match(input,101,FOLLOW_101_in_refer1025);  
					stream_101.add(char_literal72);

					// AST REWRITE
					// elements: refer, LBB, sublist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 175:5: -> ^( XXSUBSCRIPT LBB $refer sublist )
					{
						// Q.g:175:8: ^( XXSUBSCRIPT LBB $refer sublist )
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
					// Q.g:176:5: '[' sublist ']'
					{
					char_literal73=(Token)match(input,99,FOLLOW_99_in_refer1048);  
					stream_99.add(char_literal73);

					pushFollow(FOLLOW_sublist_in_refer1050);
					sublist74=sublist();
					state._fsp--;

					stream_sublist.add(sublist74.getTree());
					char_literal75=(Token)match(input,101,FOLLOW_101_in_refer1053);  
					stream_101.add(char_literal75);

					// AST REWRITE
					// elements: 99, sublist, refer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 177:5: -> ^( XXSUBSCRIPT '[' $refer sublist )
					{
						// Q.g:177:8: ^( XXSUBSCRIPT '[' $refer sublist )
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
					// Q.g:178:5: ( '$' | '@' ) symbol_or_conststr
					{
					// Q.g:178:5: ( '$' | '@' )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==79) ) {
						alt16=1;
					}
					else if ( (LA16_0==91) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// Q.g:178:6: '$'
							{
							char_literal76=(Token)match(input,79,FOLLOW_79_in_refer1077);  
							stream_79.add(char_literal76);

							}
							break;
						case 2 :
							// Q.g:178:12: '@'
							{
							char_literal77=(Token)match(input,91,FOLLOW_91_in_refer1081);  
							stream_91.add(char_literal77);

							}
							break;

					}

					pushFollow(FOLLOW_symbol_or_conststr_in_refer1084);
					symbol_or_conststr78=symbol_or_conststr();
					state._fsp--;

					stream_symbol_or_conststr.add(symbol_or_conststr78.getTree());
					// AST REWRITE
					// elements: 79, refer, 91, symbol_or_conststr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 179:5: -> ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr )
					{
						// Q.g:179:8: ^( XXBINARY ( '$' )? ( '@' )? $refer symbol_or_conststr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						// Q.g:179:19: ( '$' )?
						if ( stream_79.hasNext() ) {
							adaptor.addChild(root_1, stream_79.nextNode());
						}
						stream_79.reset();

						// Q.g:179:24: ( '@' )?
						if ( stream_91.hasNext() ) {
							adaptor.addChild(root_1, stream_91.nextNode());
						}
						stream_91.reset();

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


	public static class additiveExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// Q.g:183:1: additiveExpression : ( multiplicativeExpression -> multiplicativeExpression ) ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )? ;
	public final QParser.additiveExpression_return additiveExpression() throws RecognitionException {
		QParser.additiveExpression_return retval = new QParser.additiveExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope multiplicativeExpression79 =null;
		ParserRuleReturnScope additive_op80 =null;
		ParserRuleReturnScope additiveExpression81 =null;

		RewriteRuleSubtreeStream stream_additive_op=new RewriteRuleSubtreeStream(adaptor,"rule additive_op");
		RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");
		RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");

		try {
			// Q.g:184:5: ( ( multiplicativeExpression -> multiplicativeExpression ) ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )? )
			// Q.g:184:9: ( multiplicativeExpression -> multiplicativeExpression ) ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )?
			{
			// Q.g:184:9: ( multiplicativeExpression -> multiplicativeExpression )
			// Q.g:184:10: multiplicativeExpression
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1132);
			multiplicativeExpression79=multiplicativeExpression();
			state._fsp--;

			stream_multiplicativeExpression.add(multiplicativeExpression79.getTree());
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
			// 184:35: -> multiplicativeExpression
			{
				adaptor.addChild(root_0, stream_multiplicativeExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:185:3: ( additive_op additiveExpression -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==84||LA18_0==86) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Q.g:185:5: additive_op additiveExpression
					{
					pushFollow(FOLLOW_additive_op_in_additiveExpression1143);
					additive_op80=additive_op();
					state._fsp--;

					stream_additive_op.add(additive_op80.getTree());
					pushFollow(FOLLOW_additiveExpression_in_additiveExpression1145);
					additiveExpression81=additiveExpression();
					state._fsp--;

					stream_additiveExpression.add(additiveExpression81.getTree());
					// AST REWRITE
					// elements: additiveExpression, multiplicativeExpression, additive_op
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 186:5: -> ^( XXBINARY additive_op multiplicativeExpression additiveExpression )
					{
						// Q.g:186:8: ^( XXBINARY additive_op multiplicativeExpression additiveExpression )
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


	public static class oneMulExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneMulExpression"
	// Q.g:190:1: oneMulExpression : (a= refer -> $a) ( multicative_op b= refer -> ^( XXBINARY multicative_op $a $b) )? ;
	public final QParser.oneMulExpression_return oneMulExpression() throws RecognitionException {
		QParser.oneMulExpression_return retval = new QParser.oneMulExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope multicative_op82 =null;

		RewriteRuleSubtreeStream stream_multicative_op=new RewriteRuleSubtreeStream(adaptor,"rule multicative_op");
		RewriteRuleSubtreeStream stream_refer=new RewriteRuleSubtreeStream(adaptor,"rule refer");

		try {
			// Q.g:191:4: ( (a= refer -> $a) ( multicative_op b= refer -> ^( XXBINARY multicative_op $a $b) )? )
			// Q.g:191:6: (a= refer -> $a) ( multicative_op b= refer -> ^( XXBINARY multicative_op $a $b) )?
			{
			// Q.g:191:6: (a= refer -> $a)
			// Q.g:191:7: a= refer
			{
			pushFollow(FOLLOW_refer_in_oneMulExpression1187);
			a=refer();
			state._fsp--;

			stream_refer.add(a.getTree());
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
			// 191:16: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:192:7: ( multicative_op b= refer -> ^( XXBINARY multicative_op $a $b) )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==SPECIAL||LA19_0==80||LA19_0==83||(LA19_0 >= 87 && LA19_0 <= 88)||LA19_0==90||LA19_0==102||LA19_0==105) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Q.g:193:9: multicative_op b= refer
					{
					pushFollow(FOLLOW_multicative_op_in_oneMulExpression1209);
					multicative_op82=multicative_op();
					state._fsp--;

					stream_multicative_op.add(multicative_op82.getTree());
					pushFollow(FOLLOW_refer_in_oneMulExpression1215);
					b=refer();
					state._fsp--;

					stream_refer.add(b.getTree());
					// AST REWRITE
					// elements: a, b, multicative_op
					// token labels: 
					// rule labels: retval, b, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:12: -> ^( XXBINARY multicative_op $a $b)
					{
						// Q.g:194:14: ^( XXBINARY multicative_op $a $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_multicative_op.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
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
	// $ANTLR end "oneMulExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// Q.g:198:1: multiplicativeExpression : ( oneMulExpression -> oneMulExpression ) ( multicative_op refer -> ^( XXBINARY multicative_op oneMulExpression refer ) )? ;
	public final QParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		QParser.multiplicativeExpression_return retval = new QParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope oneMulExpression83 =null;
		ParserRuleReturnScope multicative_op84 =null;
		ParserRuleReturnScope refer85 =null;

		RewriteRuleSubtreeStream stream_multicative_op=new RewriteRuleSubtreeStream(adaptor,"rule multicative_op");
		RewriteRuleSubtreeStream stream_refer=new RewriteRuleSubtreeStream(adaptor,"rule refer");
		RewriteRuleSubtreeStream stream_oneMulExpression=new RewriteRuleSubtreeStream(adaptor,"rule oneMulExpression");

		try {
			// Q.g:199:5: ( ( oneMulExpression -> oneMulExpression ) ( multicative_op refer -> ^( XXBINARY multicative_op oneMulExpression refer ) )? )
			// Q.g:199:9: ( oneMulExpression -> oneMulExpression ) ( multicative_op refer -> ^( XXBINARY multicative_op oneMulExpression refer ) )?
			{
			// Q.g:199:9: ( oneMulExpression -> oneMulExpression )
			// Q.g:199:10: oneMulExpression
			{
			pushFollow(FOLLOW_oneMulExpression_in_multiplicativeExpression1272);
			oneMulExpression83=oneMulExpression();
			state._fsp--;

			stream_oneMulExpression.add(oneMulExpression83.getTree());
			// AST REWRITE
			// elements: oneMulExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 199:27: -> oneMulExpression
			{
				adaptor.addChild(root_0, stream_oneMulExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:200:4: ( multicative_op refer -> ^( XXBINARY multicative_op oneMulExpression refer ) )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==SPECIAL||LA20_0==80||LA20_0==83||(LA20_0 >= 87 && LA20_0 <= 88)||LA20_0==90||LA20_0==102||LA20_0==105) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Q.g:201:3: multicative_op refer
					{
					pushFollow(FOLLOW_multicative_op_in_multiplicativeExpression1286);
					multicative_op84=multicative_op();
					state._fsp--;

					stream_multicative_op.add(multicative_op84.getTree());
					pushFollow(FOLLOW_refer_in_multiplicativeExpression1288);
					refer85=refer();
					state._fsp--;

					stream_refer.add(refer85.getTree());
					// AST REWRITE
					// elements: multicative_op, oneMulExpression, refer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 202:5: -> ^( XXBINARY multicative_op oneMulExpression refer )
					{
						// Q.g:202:8: ^( XXBINARY multicative_op oneMulExpression refer )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_multicative_op.nextTree());
						adaptor.addChild(root_1, stream_oneMulExpression.nextTree());
						adaptor.addChild(root_1, stream_refer.nextTree());
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
	// $ANTLR end "multiplicativeExpression"


	public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inclusiveOrExpression"
	// Q.g:206:1: inclusiveOrExpression : ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )? ;
	public final QParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		QParser.inclusiveOrExpression_return retval = new QParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR87=null;
		ParserRuleReturnScope andExpression86 =null;
		ParserRuleReturnScope inclusiveOrExpression88 =null;

		Object OR87_tree=null;
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");
		RewriteRuleSubtreeStream stream_inclusiveOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule inclusiveOrExpression");

		try {
			// Q.g:207:5: ( ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )? )
			// Q.g:207:9: ( andExpression -> andExpression ) ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )?
			{
			// Q.g:207:9: ( andExpression -> andExpression )
			// Q.g:207:10: andExpression
			{
			pushFollow(FOLLOW_andExpression_in_inclusiveOrExpression1330);
			andExpression86=andExpression();
			state._fsp--;

			stream_andExpression.add(andExpression86.getTree());
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
			// 207:24: -> andExpression
			{
				adaptor.addChild(root_0, stream_andExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:208:3: ( OR inclusiveOrExpression -> ^( XXBINARY OR andExpression inclusiveOrExpression ) )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==OR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Q.g:208:5: OR inclusiveOrExpression
					{
					OR87=(Token)match(input,OR,FOLLOW_OR_in_inclusiveOrExpression1341);  
					stream_OR.add(OR87);

					pushFollow(FOLLOW_inclusiveOrExpression_in_inclusiveOrExpression1343);
					inclusiveOrExpression88=inclusiveOrExpression();
					state._fsp--;

					stream_inclusiveOrExpression.add(inclusiveOrExpression88.getTree());
					// AST REWRITE
					// elements: inclusiveOrExpression, andExpression, OR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 209:5: -> ^( XXBINARY OR andExpression inclusiveOrExpression )
					{
						// Q.g:209:8: ^( XXBINARY OR andExpression inclusiveOrExpression )
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
	// Q.g:213:1: andExpression : ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )? ;
	public final QParser.andExpression_return andExpression() throws RecognitionException {
		QParser.andExpression_return retval = new QParser.andExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND90=null;
		ParserRuleReturnScope relationalExpression89 =null;
		ParserRuleReturnScope andExpression91 =null;

		Object AND90_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");
		RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");

		try {
			// Q.g:214:5: ( ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )? )
			// Q.g:214:9: ( relationalExpression -> relationalExpression ) ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )?
			{
			// Q.g:214:9: ( relationalExpression -> relationalExpression )
			// Q.g:214:10: relationalExpression
			{
			pushFollow(FOLLOW_relationalExpression_in_andExpression1383);
			relationalExpression89=relationalExpression();
			state._fsp--;

			stream_relationalExpression.add(relationalExpression89.getTree());
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
			// 214:31: -> relationalExpression
			{
				adaptor.addChild(root_0, stream_relationalExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:215:3: ( AND andExpression -> ^( XXBINARY AND relationalExpression andExpression ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==AND) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Q.g:215:5: AND andExpression
					{
					AND90=(Token)match(input,AND,FOLLOW_AND_in_andExpression1394);  
					stream_AND.add(AND90);

					pushFollow(FOLLOW_andExpression_in_andExpression1396);
					andExpression91=andExpression();
					state._fsp--;

					stream_andExpression.add(andExpression91.getTree());
					// AST REWRITE
					// elements: AND, andExpression, relationalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 216:5: -> ^( XXBINARY AND relationalExpression andExpression )
					{
						// Q.g:216:8: ^( XXBINARY AND relationalExpression andExpression )
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
	// Q.g:221:1: relationalExpression : ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )? ;
	public final QParser.relationalExpression_return relationalExpression() throws RecognitionException {
		QParser.relationalExpression_return retval = new QParser.relationalExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope additiveExpression92 =null;
		ParserRuleReturnScope relationalOp93 =null;
		ParserRuleReturnScope relationalExpression94 =null;

		RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
		RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");
		RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");

		try {
			// Q.g:222:5: ( ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )? )
			// Q.g:222:9: ( additiveExpression -> additiveExpression ) ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )?
			{
			// Q.g:222:9: ( additiveExpression -> additiveExpression )
			// Q.g:222:10: additiveExpression
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression1437);
			additiveExpression92=additiveExpression();
			state._fsp--;

			stream_additiveExpression.add(additiveExpression92.getTree());
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
			// 222:29: -> additiveExpression
			{
				adaptor.addChild(root_0, stream_additiveExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:223:3: ( relationalOp relationalExpression -> ^( XXBINARY relationalOp additiveExpression relationalExpression ) )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==AND2||LA23_0==EQ||(LA23_0 >= GE && LA23_0 <= GT)||LA23_0==LE||LA23_0==LT||LA23_0==NE||LA23_0==OR2) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Q.g:223:5: relationalOp relationalExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression1448);
					relationalOp93=relationalOp();
					state._fsp--;

					stream_relationalOp.add(relationalOp93.getTree());
					pushFollow(FOLLOW_relationalExpression_in_relationalExpression1450);
					relationalExpression94=relationalExpression();
					state._fsp--;

					stream_relationalExpression.add(relationalExpression94.getTree());
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
					// 224:5: -> ^( XXBINARY relationalOp additiveExpression relationalExpression )
					{
						// Q.g:224:8: ^( XXBINARY relationalOp additiveExpression relationalExpression )
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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Q.g:228:1: expr : ( inclusiveOrExpression -> inclusiveOrExpression ) ( assign_op expr -> ^( XXBINARY assign_op inclusiveOrExpression expr ) )? ;
	public final QParser.expr_return expr() throws RecognitionException {
		QParser.expr_return retval = new QParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inclusiveOrExpression95 =null;
		ParserRuleReturnScope assign_op96 =null;
		ParserRuleReturnScope expr97 =null;

		RewriteRuleSubtreeStream stream_inclusiveOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule inclusiveOrExpression");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_assign_op=new RewriteRuleSubtreeStream(adaptor,"rule assign_op");

		try {
			// Q.g:228:6: ( ( inclusiveOrExpression -> inclusiveOrExpression ) ( assign_op expr -> ^( XXBINARY assign_op inclusiveOrExpression expr ) )? )
			// Q.g:228:8: ( inclusiveOrExpression -> inclusiveOrExpression ) ( assign_op expr -> ^( XXBINARY assign_op inclusiveOrExpression expr ) )?
			{
			// Q.g:228:8: ( inclusiveOrExpression -> inclusiveOrExpression )
			// Q.g:228:9: inclusiveOrExpression
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_expr1487);
			inclusiveOrExpression95=inclusiveOrExpression();
			state._fsp--;

			stream_inclusiveOrExpression.add(inclusiveOrExpression95.getTree());
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
			// 228:31: -> inclusiveOrExpression
			{
				adaptor.addChild(root_0, stream_inclusiveOrExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// Q.g:229:6: ( assign_op expr -> ^( XXBINARY assign_op inclusiveOrExpression expr ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LEFT_ASSIGN||LA24_0==RIGHT_ASSIGN) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Q.g:230:3: assign_op expr
					{
					pushFollow(FOLLOW_assign_op_in_expr1502);
					assign_op96=assign_op();
					state._fsp--;

					stream_assign_op.add(assign_op96.getTree());
					pushFollow(FOLLOW_expr_in_expr1504);
					expr97=expr();
					state._fsp--;

					stream_expr.add(expr97.getTree());
					// AST REWRITE
					// elements: inclusiveOrExpression, expr, assign_op
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 231:5: -> ^( XXBINARY assign_op inclusiveOrExpression expr )
					{
						// Q.g:231:8: ^( XXBINARY assign_op inclusiveOrExpression expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXBINARY, "XXBINARY"), root_1);
						adaptor.addChild(root_1, stream_assign_op.nextTree());
						adaptor.addChild(root_1, stream_inclusiveOrExpression.nextTree());
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
	// Q.g:236:1: cond : '(' expr ')' -> ^( XXCOND expr ) ;
	public final QParser.cond_return cond() throws RecognitionException {
		QParser.cond_return retval = new QParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal98=null;
		Token char_literal100=null;
		ParserRuleReturnScope expr99 =null;

		Object char_literal98_tree=null;
		Object char_literal100_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:236:6: ( '(' expr ')' -> ^( XXCOND expr ) )
			// Q.g:236:8: '(' expr ')'
			{
			char_literal98=(Token)match(input,81,FOLLOW_81_in_cond1539);  
			stream_81.add(char_literal98);

			pushFollow(FOLLOW_expr_in_cond1541);
			expr99=expr();
			state._fsp--;

			stream_expr.add(expr99.getTree());
			char_literal100=(Token)match(input,82,FOLLOW_82_in_cond1543);  
			stream_82.add(char_literal100);

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
			// 237:2: -> ^( XXCOND expr )
			{
				// Q.g:237:4: ^( XXCOND expr )
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
	// Q.g:240:1: ifcond : '(' expr ')' -> ^( XXIFCOND expr ) ;
	public final QParser.ifcond_return ifcond() throws RecognitionException {
		QParser.ifcond_return retval = new QParser.ifcond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		Token char_literal103=null;
		ParserRuleReturnScope expr102 =null;

		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:240:8: ( '(' expr ')' -> ^( XXIFCOND expr ) )
			// Q.g:240:10: '(' expr ')'
			{
			char_literal101=(Token)match(input,81,FOLLOW_81_in_ifcond1561);  
			stream_81.add(char_literal101);

			pushFollow(FOLLOW_expr_in_ifcond1563);
			expr102=expr();
			state._fsp--;

			stream_expr.add(expr102.getTree());
			char_literal103=(Token)match(input,82,FOLLOW_82_in_ifcond1565);  
			stream_82.add(char_literal103);

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
			// 241:2: -> ^( XXIFCOND expr )
			{
				// Q.g:241:5: ^( XXIFCOND expr )
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
	// Q.g:244:1: forcond : '(' SYMBOL IN expr ')' -> ^( XXFORCOND SYMBOL expr ) ;
	public final QParser.forcond_return forcond() throws RecognitionException {
		QParser.forcond_return retval = new QParser.forcond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal104=null;
		Token SYMBOL105=null;
		Token IN106=null;
		Token char_literal108=null;
		ParserRuleReturnScope expr107 =null;

		Object char_literal104_tree=null;
		Object SYMBOL105_tree=null;
		Object IN106_tree=null;
		Object char_literal108_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:244:9: ( '(' SYMBOL IN expr ')' -> ^( XXFORCOND SYMBOL expr ) )
			// Q.g:244:11: '(' SYMBOL IN expr ')'
			{
			char_literal104=(Token)match(input,81,FOLLOW_81_in_forcond1584);  
			stream_81.add(char_literal104);

			SYMBOL105=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_forcond1586);  
			stream_SYMBOL.add(SYMBOL105);

			IN106=(Token)match(input,IN,FOLLOW_IN_in_forcond1588);  
			stream_IN.add(IN106);

			pushFollow(FOLLOW_expr_in_forcond1590);
			expr107=expr();
			state._fsp--;

			stream_expr.add(expr107.getTree());
			char_literal108=(Token)match(input,82,FOLLOW_82_in_forcond1592);  
			stream_82.add(char_literal108);

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
			// 245:2: -> ^( XXFORCOND SYMBOL expr )
			{
				// Q.g:245:5: ^( XXFORCOND SYMBOL expr )
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
	// Q.g:260:1: fragment sublist : sub ( cr ',' sub )* -> ^( XXSUBLIST ( sub )* ) ;
	public final QParser.sublist_return sublist() throws RecognitionException {
		QParser.sublist_return retval = new QParser.sublist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal111=null;
		ParserRuleReturnScope sub109 =null;
		ParserRuleReturnScope cr110 =null;
		ParserRuleReturnScope sub112 =null;

		Object char_literal111_tree=null;
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_cr=new RewriteRuleSubtreeStream(adaptor,"rule cr");
		RewriteRuleSubtreeStream stream_sub=new RewriteRuleSubtreeStream(adaptor,"rule sub");

		try {
			// Q.g:260:9: ( sub ( cr ',' sub )* -> ^( XXSUBLIST ( sub )* ) )
			// Q.g:260:11: sub ( cr ',' sub )*
			{
			pushFollow(FOLLOW_sub_in_sublist1619);
			sub109=sub();
			state._fsp--;

			stream_sub.add(sub109.getTree());
			// Q.g:260:15: ( cr ',' sub )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= BREAK && LA25_0 <= DecimalLiteral)||(LA25_0 >= FALSE && LA25_0 <= FUNCTION)||LA25_0==FloatingPointLiteral||(LA25_0 >= HexLiteral && LA25_0 <= IF)||LA25_0==NEXT||LA25_0==NULL_CONST||(LA25_0 >= OctalLiteral && LA25_0 <= REPEAT)||(LA25_0 >= STR_CONST && LA25_0 <= TRUE)||LA25_0==WHILE||LA25_0==78||LA25_0==81||(LA25_0 >= 84 && LA25_0 <= 86)||LA25_0==90||(LA25_0 >= 92 && LA25_0 <= 98)||LA25_0==103||LA25_0==105) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// Q.g:260:16: cr ',' sub
					{
					pushFollow(FOLLOW_cr_in_sublist1622);
					cr110=cr();
					state._fsp--;

					stream_cr.add(cr110.getTree());
					char_literal111=(Token)match(input,85,FOLLOW_85_in_sublist1624);  
					stream_85.add(char_literal111);

					pushFollow(FOLLOW_sub_in_sublist1626);
					sub112=sub();
					state._fsp--;

					stream_sub.add(sub112.getTree());
					}
					break;

				default :
					break loop25;
				}
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
			// 261:3: -> ^( XXSUBLIST ( sub )* )
			{
				// Q.g:261:6: ^( XXSUBLIST ( sub )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSUBLIST, "XXSUBLIST"), root_1);
				// Q.g:261:18: ( sub )*
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
	// Q.g:265:1: fragment sub : ( -> ^( XXSUB0 ) | expr -> ^( XXSUB1 expr ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr ) );
	public final QParser.sub_return sub() throws RecognitionException {
		QParser.sub_return retval = new QParser.sub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NULL_CONST115=null;
		Token EQ_ASSIGN116=null;
		Token NULL_CONST118=null;
		Token EQ_ASSIGN119=null;
		ParserRuleReturnScope expr113 =null;
		ParserRuleReturnScope symbol_or_conststr114 =null;
		ParserRuleReturnScope symbol_or_conststr117 =null;
		ParserRuleReturnScope expr120 =null;

		Object NULL_CONST115_tree=null;
		Object EQ_ASSIGN116_tree=null;
		Object NULL_CONST118_tree=null;
		Object EQ_ASSIGN119_tree=null;
		RewriteRuleTokenStream stream_NULL_CONST=new RewriteRuleTokenStream(adaptor,"token NULL_CONST");
		RewriteRuleTokenStream stream_EQ_ASSIGN=new RewriteRuleTokenStream(adaptor,"token EQ_ASSIGN");
		RewriteRuleSubtreeStream stream_symbol_or_conststr=new RewriteRuleSubtreeStream(adaptor,"rule symbol_or_conststr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Q.g:265:5: ( -> ^( XXSUB0 ) | expr -> ^( XXSUB1 expr ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? ) | ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr ) )
			int alt28=4;
			switch ( input.LA(1) ) {
			case 82:
			case 85:
			case 101:
				{
				alt28=1;
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
			case NEXT:
			case OctalLiteral:
			case REPEAT:
			case TRUE:
			case WHILE:
			case 78:
			case 81:
			case 84:
			case 86:
			case 90:
			case 92:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 103:
			case 105:
				{
				alt28=2;
				}
				break;
			case STR_CONST:
				{
				int LA28_3 = input.LA(2);
				if ( ((LA28_3 >= AND && LA28_3 <= AND2)||LA28_3==EQ||(LA28_3 >= GE && LA28_3 <= GT)||(LA28_3 >= LBB && LA28_3 <= LT)||LA28_3==NE||(LA28_3 >= NS_GET && LA28_3 <= NS_GET_INT)||(LA28_3 >= OR && LA28_3 <= OR2)||(LA28_3 >= RIGHT_ASSIGN && LA28_3 <= SPECIAL)||(LA28_3 >= 79 && LA28_3 <= 88)||(LA28_3 >= 90 && LA28_3 <= 91)||LA28_3==99||(LA28_3 >= 101 && LA28_3 <= 102)||LA28_3==105) ) {
					alt28=2;
				}
				else if ( (LA28_3==EQ_ASSIGN) ) {
					int LA28_6 = input.LA(3);
					if ( (LA28_6==82||LA28_6==85||LA28_6==101) ) {
						alt28=3;
					}
					else if ( ((LA28_6 >= BREAK && LA28_6 <= DecimalLiteral)||(LA28_6 >= FALSE && LA28_6 <= FUNCTION)||LA28_6==FloatingPointLiteral||(LA28_6 >= HexLiteral && LA28_6 <= IF)||LA28_6==NEXT||LA28_6==NULL_CONST||(LA28_6 >= OctalLiteral && LA28_6 <= REPEAT)||(LA28_6 >= STR_CONST && LA28_6 <= TRUE)||LA28_6==WHILE||LA28_6==78||LA28_6==81||LA28_6==84||LA28_6==86||LA28_6==90||(LA28_6 >= 92 && LA28_6 <= 98)||LA28_6==103||LA28_6==105) ) {
						alt28=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 6, input);
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
							new NoViableAltException("", 28, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL_CONST:
				{
				int LA28_4 = input.LA(2);
				if ( ((LA28_4 >= AND && LA28_4 <= AND2)||LA28_4==EQ||(LA28_4 >= GE && LA28_4 <= GT)||(LA28_4 >= LBB && LA28_4 <= LT)||LA28_4==NE||(LA28_4 >= OR && LA28_4 <= OR2)||(LA28_4 >= RIGHT_ASSIGN && LA28_4 <= SPECIAL)||(LA28_4 >= 79 && LA28_4 <= 88)||(LA28_4 >= 90 && LA28_4 <= 91)||LA28_4==99||(LA28_4 >= 101 && LA28_4 <= 102)||LA28_4==105) ) {
					alt28=2;
				}
				else if ( (LA28_4==EQ_ASSIGN) ) {
					int LA28_6 = input.LA(3);
					if ( (LA28_6==82||LA28_6==85||LA28_6==101) ) {
						alt28=3;
					}
					else if ( ((LA28_6 >= BREAK && LA28_6 <= DecimalLiteral)||(LA28_6 >= FALSE && LA28_6 <= FUNCTION)||LA28_6==FloatingPointLiteral||(LA28_6 >= HexLiteral && LA28_6 <= IF)||LA28_6==NEXT||LA28_6==NULL_CONST||(LA28_6 >= OctalLiteral && LA28_6 <= REPEAT)||(LA28_6 >= STR_CONST && LA28_6 <= TRUE)||LA28_6==WHILE||LA28_6==78||LA28_6==81||LA28_6==84||LA28_6==86||LA28_6==90||(LA28_6 >= 92 && LA28_6 <= 98)||LA28_6==103||LA28_6==105) ) {
						alt28=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 6, input);
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
							new NoViableAltException("", 28, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SYMBOL:
				{
				int LA28_5 = input.LA(2);
				if ( ((LA28_5 >= AND && LA28_5 <= AND2)||LA28_5==EQ||(LA28_5 >= GE && LA28_5 <= GT)||(LA28_5 >= LBB && LA28_5 <= LT)||LA28_5==NE||(LA28_5 >= NS_GET && LA28_5 <= NS_GET_INT)||(LA28_5 >= OR && LA28_5 <= OR2)||(LA28_5 >= RIGHT_ASSIGN && LA28_5 <= SPECIAL)||(LA28_5 >= 79 && LA28_5 <= 88)||(LA28_5 >= 90 && LA28_5 <= 91)||LA28_5==99||(LA28_5 >= 101 && LA28_5 <= 102)||LA28_5==105) ) {
					alt28=2;
				}
				else if ( (LA28_5==EQ_ASSIGN) ) {
					int LA28_6 = input.LA(3);
					if ( (LA28_6==82||LA28_6==85||LA28_6==101) ) {
						alt28=3;
					}
					else if ( ((LA28_6 >= BREAK && LA28_6 <= DecimalLiteral)||(LA28_6 >= FALSE && LA28_6 <= FUNCTION)||LA28_6==FloatingPointLiteral||(LA28_6 >= HexLiteral && LA28_6 <= IF)||LA28_6==NEXT||LA28_6==NULL_CONST||(LA28_6 >= OctalLiteral && LA28_6 <= REPEAT)||(LA28_6 >= STR_CONST && LA28_6 <= TRUE)||LA28_6==WHILE||LA28_6==78||LA28_6==81||LA28_6==84||LA28_6==86||LA28_6==90||(LA28_6 >= 92 && LA28_6 <= 98)||LA28_6==103||LA28_6==105) ) {
						alt28=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 6, input);
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
							new NoViableAltException("", 28, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// Q.g:265:7: 
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
					// 265:7: -> ^( XXSUB0 )
					{
						// Q.g:265:10: ^( XXSUB0 )
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
					// Q.g:266:4: expr
					{
					pushFollow(FOLLOW_expr_in_sub1660);
					expr113=expr();
					state._fsp--;

					stream_expr.add(expr113.getTree());
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
					// 266:9: -> ^( XXSUB1 expr )
					{
						// Q.g:266:12: ^( XXSUB1 expr )
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
					// Q.g:267:4: ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN
					{
					// Q.g:267:4: ( symbol_or_conststr | NULL_CONST )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( ((LA26_0 >= STR_CONST && LA26_0 <= SYMBOL)) ) {
						alt26=1;
					}
					else if ( (LA26_0==NULL_CONST) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// Q.g:267:5: symbol_or_conststr
							{
							pushFollow(FOLLOW_symbol_or_conststr_in_sub1674);
							symbol_or_conststr114=symbol_or_conststr();
							state._fsp--;

							stream_symbol_or_conststr.add(symbol_or_conststr114.getTree());
							}
							break;
						case 2 :
							// Q.g:267:26: NULL_CONST
							{
							NULL_CONST115=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_sub1678);  
							stream_NULL_CONST.add(NULL_CONST115);

							}
							break;

					}

					EQ_ASSIGN116=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_sub1681);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN116);

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
					// 267:48: -> ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? )
					{
						// Q.g:267:51: ^( XXSYMSUB0 ( symbol_or_conststr )? ( NULL_CONST )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSYMSUB0, "XXSYMSUB0"), root_1);
						// Q.g:267:63: ( symbol_or_conststr )?
						if ( stream_symbol_or_conststr.hasNext() ) {
							adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						}
						stream_symbol_or_conststr.reset();

						// Q.g:267:83: ( NULL_CONST )?
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
					// Q.g:268:4: ( symbol_or_conststr | NULL_CONST ) EQ_ASSIGN expr
					{
					// Q.g:268:4: ( symbol_or_conststr | NULL_CONST )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= STR_CONST && LA27_0 <= SYMBOL)) ) {
						alt27=1;
					}
					else if ( (LA27_0==NULL_CONST) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// Q.g:268:5: symbol_or_conststr
							{
							pushFollow(FOLLOW_symbol_or_conststr_in_sub1699);
							symbol_or_conststr117=symbol_or_conststr();
							state._fsp--;

							stream_symbol_or_conststr.add(symbol_or_conststr117.getTree());
							}
							break;
						case 2 :
							// Q.g:268:26: NULL_CONST
							{
							NULL_CONST118=(Token)match(input,NULL_CONST,FOLLOW_NULL_CONST_in_sub1703);  
							stream_NULL_CONST.add(NULL_CONST118);

							}
							break;

					}

					EQ_ASSIGN119=(Token)match(input,EQ_ASSIGN,FOLLOW_EQ_ASSIGN_in_sub1706);  
					stream_EQ_ASSIGN.add(EQ_ASSIGN119);

					pushFollow(FOLLOW_expr_in_sub1708);
					expr120=expr();
					state._fsp--;

					stream_expr.add(expr120.getTree());
					// AST REWRITE
					// elements: NULL_CONST, expr, symbol_or_conststr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 268:53: -> ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr )
					{
						// Q.g:268:55: ^( XXSYMSUB1 ( symbol_or_conststr )? ( NULL_CONST )? expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XXSYMSUB1, "XXSYMSUB1"), root_1);
						// Q.g:268:67: ( symbol_or_conststr )?
						if ( stream_symbol_or_conststr.hasNext() ) {
							adaptor.addChild(root_1, stream_symbol_or_conststr.nextTree());
						}
						stream_symbol_or_conststr.reset();

						// Q.g:268:87: ( NULL_CONST )?
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
	// Q.g:280:1: cr :;
	public final QParser.cr_return cr() throws RecognitionException {
		QParser.cr_return retval = new QParser.cr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		try {
			// Q.g:280:4: ()
			// Q.g:281:2: 
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
	// Q.g:313:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final QParser.integerLiteral_return integerLiteral() throws RecognitionException {
		QParser.integerLiteral_return retval = new QParser.integerLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set121=null;

		Object set121_tree=null;

		try {
			// Q.g:313:16: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// Q.g:
			{
			root_0 = (Object)adaptor.nil();


			set121=input.LT(1);
			if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set121));
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
	// Q.g:319:1: num_const : ( integerLiteral | FloatingPointLiteral | 'NA' | TRUE | FALSE | 'Inf' | 'NaN' | 'NA_integer_' | 'NA_real_' | 'NA_character_' | 'NA_complex_' );
	public final QParser.num_const_return num_const() throws RecognitionException {
		QParser.num_const_return retval = new QParser.num_const_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FloatingPointLiteral123=null;
		Token string_literal124=null;
		Token TRUE125=null;
		Token FALSE126=null;
		Token string_literal127=null;
		Token string_literal128=null;
		Token string_literal129=null;
		Token string_literal130=null;
		Token string_literal131=null;
		Token string_literal132=null;
		ParserRuleReturnScope integerLiteral122 =null;

		Object FloatingPointLiteral123_tree=null;
		Object string_literal124_tree=null;
		Object TRUE125_tree=null;
		Object FALSE126_tree=null;
		Object string_literal127_tree=null;
		Object string_literal128_tree=null;
		Object string_literal129_tree=null;
		Object string_literal130_tree=null;
		Object string_literal131_tree=null;
		Object string_literal132_tree=null;

		try {
			// Q.g:320:2: ( integerLiteral | FloatingPointLiteral | 'NA' | TRUE | FALSE | 'Inf' | 'NaN' | 'NA_integer_' | 'NA_real_' | 'NA_character_' | 'NA_complex_' )
			int alt29=11;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt29=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt29=2;
				}
				break;
			case 93:
				{
				alt29=3;
				}
				break;
			case TRUE:
				{
				alt29=4;
				}
				break;
			case FALSE:
				{
				alt29=5;
				}
				break;
			case 92:
				{
				alt29=6;
				}
				break;
			case 98:
				{
				alt29=7;
				}
				break;
			case 96:
				{
				alt29=8;
				}
				break;
			case 97:
				{
				alt29=9;
				}
				break;
			case 94:
				{
				alt29=10;
				}
				break;
			case 95:
				{
				alt29=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// Q.g:320:4: integerLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integerLiteral_in_num_const2029);
					integerLiteral122=integerLiteral();
					state._fsp--;

					adaptor.addChild(root_0, integerLiteral122.getTree());

					}
					break;
				case 2 :
					// Q.g:321:4: FloatingPointLiteral
					{
					root_0 = (Object)adaptor.nil();


					FloatingPointLiteral123=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_num_const2034); 
					FloatingPointLiteral123_tree = (Object)adaptor.create(FloatingPointLiteral123);
					adaptor.addChild(root_0, FloatingPointLiteral123_tree);

					}
					break;
				case 3 :
					// Q.g:322:4: 'NA'
					{
					root_0 = (Object)adaptor.nil();


					string_literal124=(Token)match(input,93,FOLLOW_93_in_num_const2039); 
					string_literal124_tree = (Object)adaptor.create(string_literal124);
					adaptor.addChild(root_0, string_literal124_tree);

					}
					break;
				case 4 :
					// Q.g:323:4: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE125=(Token)match(input,TRUE,FOLLOW_TRUE_in_num_const2044); 
					TRUE125_tree = (Object)adaptor.create(TRUE125);
					adaptor.addChild(root_0, TRUE125_tree);

					}
					break;
				case 5 :
					// Q.g:324:4: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE126=(Token)match(input,FALSE,FOLLOW_FALSE_in_num_const2049); 
					FALSE126_tree = (Object)adaptor.create(FALSE126);
					adaptor.addChild(root_0, FALSE126_tree);

					}
					break;
				case 6 :
					// Q.g:325:4: 'Inf'
					{
					root_0 = (Object)adaptor.nil();


					string_literal127=(Token)match(input,92,FOLLOW_92_in_num_const2054); 
					string_literal127_tree = (Object)adaptor.create(string_literal127);
					adaptor.addChild(root_0, string_literal127_tree);

					}
					break;
				case 7 :
					// Q.g:326:4: 'NaN'
					{
					root_0 = (Object)adaptor.nil();


					string_literal128=(Token)match(input,98,FOLLOW_98_in_num_const2059); 
					string_literal128_tree = (Object)adaptor.create(string_literal128);
					adaptor.addChild(root_0, string_literal128_tree);

					}
					break;
				case 8 :
					// Q.g:327:4: 'NA_integer_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal129=(Token)match(input,96,FOLLOW_96_in_num_const2064); 
					string_literal129_tree = (Object)adaptor.create(string_literal129);
					adaptor.addChild(root_0, string_literal129_tree);

					}
					break;
				case 9 :
					// Q.g:328:4: 'NA_real_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal130=(Token)match(input,97,FOLLOW_97_in_num_const2069); 
					string_literal130_tree = (Object)adaptor.create(string_literal130);
					adaptor.addChild(root_0, string_literal130_tree);

					}
					break;
				case 10 :
					// Q.g:329:4: 'NA_character_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal131=(Token)match(input,94,FOLLOW_94_in_num_const2074); 
					string_literal131_tree = (Object)adaptor.create(string_literal131);
					adaptor.addChild(root_0, string_literal131_tree);

					}
					break;
				case 11 :
					// Q.g:330:4: 'NA_complex_'
					{
					root_0 = (Object)adaptor.nil();


					string_literal132=(Token)match(input,95,FOLLOW_95_in_num_const2079); 
					string_literal132_tree = (Object)adaptor.create(string_literal132);
					adaptor.addChild(root_0, string_literal132_tree);

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
		"\1\131\1\6\1\uffff\1\6\1\uffff";
	static final String DFA1_maxS =
		"\1\144\1\151\1\uffff\1\151\1\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA1_specialS =
		"\5\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\3\12\uffff\1\1",
			"\2\4\5\uffff\3\4\1\uffff\1\4\3\uffff\2\4\11\uffff\1\4\2\uffff\1\4\3"+
			"\uffff\2\4\2\uffff\3\4\1\uffff\1\4\36\uffff\1\4\2\uffff\1\4\2\uffff\1"+
			"\4\1\uffff\1\4\2\uffff\1\3\1\4\1\uffff\7\4\1\uffff\1\1\2\uffff\1\4\1"+
			"\uffff\1\4",
			"",
			"\2\4\5\uffff\3\4\1\uffff\1\4\3\uffff\2\4\11\uffff\1\4\2\uffff\1\4\3"+
			"\uffff\2\4\2\uffff\3\4\1\uffff\1\4\36\uffff\1\4\2\uffff\1\4\2\uffff\1"+
			"\4\1\uffff\1\4\2\uffff\1\3\1\4\1\uffff\7\4\1\uffff\1\1\2\uffff\1\4\1"+
			"\uffff\1\4",
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
			return "()* loopback of 92:19: ( prog_continue )*";
		}
	}

	public static final BitSet FOLLOW_prog_begin_in_prog282 = new BitSet(new long[]{0x0000000000000002L,0x0000001002000000L});
	public static final BitSet FOLLOW_prog_continue_in_prog284 = new BitSet(new long[]{0x0000000000000002L,0x0000001002000000L});
	public static final BitSet FOLLOW_100_in_prog_begin305 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000297F6524000L});
	public static final BitSet FOLLOW_89_in_prog_begin309 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000297F6524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_prog_begin313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_prog_continue339 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000297F6524000L});
	public static final BitSet FOLLOW_89_in_prog_continue343 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000297F6524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_prog_continue347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_or_assign376 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_expr_or_assign382 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_expr_or_assign384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formalarg467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formalarg480 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_formalarg482 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_formalarg484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalarg_in_formlist504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_formlist507 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_formalarg_in_formlist509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_EOF_in_formlist515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_const_in_lexpr540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_CONST_in_lexpr545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_CONST_in_lexpr550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_lexpr555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_lexpr560 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000297F4524000L});
	public static final BitSet FOLLOW_100_in_lexpr562 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000297F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr565 = new BitSet(new long[]{0x0000000000000000L,0x0000011002000000L});
	public static final BitSet FOLLOW_89_in_lexpr569 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000397F6524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr571 = new BitSet(new long[]{0x0000000000000000L,0x0000011002000000L});
	public static final BitSet FOLLOW_100_in_lexpr578 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000397F6524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr580 = new BitSet(new long[]{0x0000000000000000L,0x0000011002000000L});
	public static final BitSet FOLLOW_104_in_lexpr586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_lexpr602 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_lexpr606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_op_in_lexpr622 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_lexpr624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_lexpr641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_lexpr643 = new BitSet(new long[]{0x0000100000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_formlist_in_lexpr645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_lexpr647 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_cr_in_lexpr649 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_lexpr668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ifcond_in_lexpr670 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr674 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ELSE_in_lexpr677 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_lexpr705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_forcond_in_lexpr707 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_lexpr726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_cond_in_lexpr728 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_lexpr747 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_or_assign_in_lexpr749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr767 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_NS_GET_in_lexpr770 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr800 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NS_GET_INT_in_lexpr803 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_lexpr808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_lexpr830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_lexpr845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_in_refer981 = new BitSet(new long[]{0x0000000004000002L,0x0000000808028000L});
	public static final BitSet FOLLOW_81_in_refer994 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4724000L});
	public static final BitSet FOLLOW_sublist_in_refer996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_refer998 = new BitSet(new long[]{0x0000000004000002L,0x0000000808028000L});
	public static final BitSet FOLLOW_LBB_in_refer1019 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4724000L});
	public static final BitSet FOLLOW_sublist_in_refer1021 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_refer1023 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_refer1025 = new BitSet(new long[]{0x0000000004000002L,0x0000000808028000L});
	public static final BitSet FOLLOW_99_in_refer1048 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4724000L});
	public static final BitSet FOLLOW_sublist_in_refer1050 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_refer1053 = new BitSet(new long[]{0x0000000004000002L,0x0000000808028000L});
	public static final BitSet FOLLOW_79_in_refer1077 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_91_in_refer1081 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_refer1084 = new BitSet(new long[]{0x0000000004000002L,0x0000000808028000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000500000L});
	public static final BitSet FOLLOW_additive_op_in_additiveExpression1143 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_additiveExpression_in_additiveExpression1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_refer_in_oneMulExpression1187 = new BitSet(new long[]{0x0000040000000002L,0x0000024005890000L});
	public static final BitSet FOLLOW_multicative_op_in_oneMulExpression1209 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_refer_in_oneMulExpression1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneMulExpression_in_multiplicativeExpression1272 = new BitSet(new long[]{0x0000040000000002L,0x0000024005890000L});
	public static final BitSet FOLLOW_multicative_op_in_multiplicativeExpression1286 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_refer_in_multiplicativeExpression1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpression_in_inclusiveOrExpression1330 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_OR_in_inclusiveOrExpression1341 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_inclusiveOrExpression1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_andExpression1383 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_andExpression1394 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_andExpression_in_andExpression1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1437 = new BitSet(new long[]{0x00000020A80C0222L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression1448 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_expr1487 = new BitSet(new long[]{0x0000020010000002L});
	public static final BitSet FOLLOW_assign_op_in_expr1502 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_expr1504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_cond1539 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_cond1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_cond1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_ifcond1561 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_ifcond1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ifcond1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_forcond1584 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SYMBOL_in_forcond1586 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IN_in_forcond1588 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_forcond1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_forcond1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_in_sublist1619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_cr_in_sublist1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_sublist1624 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4724000L});
	public static final BitSet FOLLOW_sub_in_sublist1626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_expr_in_sub1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_sub1674 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NULL_CONST_in_sub1678 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_sub1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_or_conststr_in_sub1699 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NULL_CONST_in_sub1703 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_ASSIGN_in_sub1706 = new BitSet(new long[]{0x0000B9890062E0C0L,0x00000287F4524000L});
	public static final BitSet FOLLOW_expr_in_sub1708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_num_const2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_num_const2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_num_const2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_num_const2044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_num_const2049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_num_const2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_num_const2059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_num_const2064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_num_const2069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_num_const2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_num_const2079 = new BitSet(new long[]{0x0000000000000002L});
}
