// $ANTLR 3.5.2 Q.g 2014-04-26 22:19:43

       package com.livejournal.karino2.tobinq.app;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public QLexer() {} 
	public QLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public QLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Q.g"; }

	// suppress warning by kairno2
	@Override
	public void reportError(RecognitionException e) {
		if (e instanceof NoViableAltException ne)
		{
			// white space ignore.
			if (ne.c == ' ')
				return;
		}
		// NoViableAltException(' '@[1:1: Tokens : ( AND | AND2 | BREAK | ELSE | ENCLOSED_ASSIGN | EQ | EQ_ASSIGN | FALSE | FOR | FUNCTION | GE | GT | IF | IN | LBB | LE | LEFT_ASSIGN | LT | NA | NE | NEXT | NS_GET | NS_GET_INT | OR | OR2 | REPEAT | RIGHT_ASSIGN | TRUE | WHILE | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | STR_CONST | NULL_CONST | SYMBOL | SPECIAL | Comment );])

		super.reportError(e);
	}

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:6:5: ( '&' )
			// Q.g:6:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "AND2"
	public final void mAND2() throws RecognitionException {
		try {
			int _type = AND2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:7:6: ( '&&' )
			// Q.g:7:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND2"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:8:7: ( 'break' )
			// Q.g:8:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:9:6: ( 'else' )
			// Q.g:9:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENCLOSED_ASSIGN"
	public final void mENCLOSED_ASSIGN() throws RecognitionException {
		try {
			int _type = ENCLOSED_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:10:17: ( '<<-' )
			// Q.g:10:19: '<<-'
			{
			match("<<-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENCLOSED_ASSIGN"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:11:4: ( '==' )
			// Q.g:11:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "EQ_ASSIGN"
	public final void mEQ_ASSIGN() throws RecognitionException {
		try {
			int _type = EQ_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:12:11: ( '=' )
			// Q.g:12:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_ASSIGN"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:13:7: ( 'FALSE' )
			// Q.g:13:9: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:14:5: ( 'for' )
			// Q.g:14:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:15:10: ( 'function' )
			// Q.g:15:12: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:16:4: ( '>=' )
			// Q.g:16:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:17:4: ( '>' )
			// Q.g:17:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:18:4: ( 'if' )
			// Q.g:18:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:19:4: ( 'in' )
			// Q.g:19:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "LBB"
	public final void mLBB() throws RecognitionException {
		try {
			int _type = LBB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:20:5: ( '[[' )
			// Q.g:20:7: '[['
			{
			match("[["); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBB"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:21:4: ( '<=' )
			// Q.g:21:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "LEFT_ASSIGN"
	public final void mLEFT_ASSIGN() throws RecognitionException {
		try {
			int _type = LEFT_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:22:13: ( '<-' )
			// Q.g:22:15: '<-'
			{
			match("<-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_ASSIGN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:23:4: ( '<' )
			// Q.g:23:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "NA"
	public final void mNA() throws RecognitionException {
		try {
			int _type = NA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:24:4: ( 'NA' )
			// Q.g:24:6: 'NA'
			{
			match("NA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NA"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:25:4: ( '!=' )
			// Q.g:25:6: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "NEXT"
	public final void mNEXT() throws RecognitionException {
		try {
			int _type = NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:26:6: ( 'next' )
			// Q.g:26:8: 'next'
			{
			match("next"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEXT"

	// $ANTLR start "NS_GET"
	public final void mNS_GET() throws RecognitionException {
		try {
			int _type = NS_GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:27:8: ( '::' )
			// Q.g:27:10: '::'
			{
			match("::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NS_GET"

	// $ANTLR start "NS_GET_INT"
	public final void mNS_GET_INT() throws RecognitionException {
		try {
			int _type = NS_GET_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:28:12: ( ':::' )
			// Q.g:28:14: ':::'
			{
			match(":::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NS_GET_INT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:29:4: ( '|' )
			// Q.g:29:6: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "OR2"
	public final void mOR2() throws RecognitionException {
		try {
			int _type = OR2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:30:5: ( '||' )
			// Q.g:30:7: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR2"

	// $ANTLR start "REPEAT"
	public final void mREPEAT() throws RecognitionException {
		try {
			int _type = REPEAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:31:8: ( 'repeat' )
			// Q.g:31:10: 'repeat'
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPEAT"

	// $ANTLR start "RIGHT_ASSIGN"
	public final void mRIGHT_ASSIGN() throws RecognitionException {
		try {
			int _type = RIGHT_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:32:14: ( '->' )
			// Q.g:32:16: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_ASSIGN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:33:6: ( 'TRUE' )
			// Q.g:33:8: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:34:7: ( 'while' )
			// Q.g:34:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:35:7: ( '!' )
			// Q.g:35:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:36:7: ( '$' )
			// Q.g:36:9: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:37:7: ( '(' )
			// Q.g:37:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:38:7: ( ')' )
			// Q.g:38:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:39:7: ( '*' )
			// Q.g:39:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:40:7: ( '+' )
			// Q.g:40:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:41:7: ( ',' )
			// Q.g:41:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:42:7: ( '-' )
			// Q.g:42:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:43:7: ( '/' )
			// Q.g:43:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:44:7: ( ':' )
			// Q.g:44:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:45:7: ( ';' )
			// Q.g:45:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:46:7: ( '?' )
			// Q.g:46:9: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:47:7: ( '@' )
			// Q.g:47:9: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:48:7: ( 'Inf' )
			// Q.g:48:9: 'Inf'
			{
			match("Inf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:49:7: ( 'NA_character_' )
			// Q.g:49:9: 'NA_character_'
			{
			match("NA_character_"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:50:7: ( 'NA_complex_' )
			// Q.g:50:9: 'NA_complex_'
			{
			match("NA_complex_"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:51:7: ( 'NA_integer_' )
			// Q.g:51:9: 'NA_integer_'
			{
			match("NA_integer_"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:52:7: ( 'NA_real_' )
			// Q.g:52:9: 'NA_real_'
			{
			match("NA_real_"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:53:7: ( 'NaN' )
			// Q.g:53:9: 'NaN'
			{
			match("NaN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:54:8: ( '[' )
			// Q.g:54:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:55:8: ( '\\n' )
			// Q.g:55:10: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:56:8: ( ']' )
			// Q.g:56:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:57:8: ( '^' )
			// Q.g:57:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:58:8: ( '{' )
			// Q.g:58:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:59:8: ( '}' )
			// Q.g:59:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:60:8: ( '~' )
			// Q.g:60:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__106"

	// $ANTLR start "HexLiteral"
	public final void mHexLiteral() throws RecognitionException {
		try {
			int _type = HexLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:313:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
			// Q.g:313:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
			{
			match('0'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Q.g:313:28: ( HexDigit )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Q.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// Q.g:313:38: ( IntegerTypeSuffix )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='L'||LA2_0=='l') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Q.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexLiteral"

	// $ANTLR start "DecimalLiteral"
	public final void mDecimalLiteral() throws RecognitionException {
		try {
			int _type = DecimalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:315:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
			// Q.g:315:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
			{
			// Q.g:315:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Q.g:315:19: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// Q.g:315:25: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// Q.g:315:34: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Q.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			// Q.g:315:45: ( IntegerTypeSuffix )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='L'||LA5_0=='l') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Q.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DecimalLiteral"

	// $ANTLR start "OctalLiteral"
	public final void mOctalLiteral() throws RecognitionException {
		try {
			int _type = OctalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:317:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
			// Q.g:317:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
			{
			match('0'); 
			// Q.g:317:20: ( '0' .. '7' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '7')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Q.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// Q.g:317:32: ( IntegerTypeSuffix )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='L'||LA7_0=='l') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Q.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalLiteral"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// Q.g:321:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// Q.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "IntegerTypeSuffix"
	public final void mIntegerTypeSuffix() throws RecognitionException {
		try {
			// Q.g:324:19: ( ( 'l' | 'L' ) )
			// Q.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerTypeSuffix"

	// $ANTLR start "FloatingPointLiteral"
	public final void mFloatingPointLiteral() throws RecognitionException {
		try {
			int _type = FloatingPointLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:327:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
			int alt18=4;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// Q.g:327:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
					{
					// Q.g:327:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// Q.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// Q.g:327:25: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// Q.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// Q.g:327:37: ( Exponent )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// Q.g:327:37: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// Q.g:327:47: ( FloatTypeSuffix )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='D'||LA11_0=='F'||LA11_0=='d'||LA11_0=='f') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// Q.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// Q.g:328:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
					{
					match('.'); 
					// Q.g:328:13: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Q.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// Q.g:328:25: ( Exponent )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='E'||LA13_0=='e') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// Q.g:328:25: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// Q.g:328:35: ( FloatTypeSuffix )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Q.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// Q.g:329:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
					{
					// Q.g:329:9: ( '0' .. '9' )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Q.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					mExponent(); 

					// Q.g:329:30: ( FloatTypeSuffix )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// Q.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// Q.g:330:9: ( '0' .. '9' )+ FloatTypeSuffix
					{
					// Q.g:330:9: ( '0' .. '9' )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Q.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					mFloatTypeSuffix(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatingPointLiteral"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// Q.g:335:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// Q.g:335:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Q.g:335:22: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='+'||LA19_0=='-') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Q.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Q.g:335:33: ( '0' .. '9' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Q.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatTypeSuffix"
	public final void mFloatTypeSuffix() throws RecognitionException {
		try {
			// Q.g:338:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
			// Q.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatTypeSuffix"

	// $ANTLR start "STR_CONST"
	public final void mSTR_CONST() throws RecognitionException {
		try {
			int _type = STR_CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:366:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) )* '\\'' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='\"') ) {
				alt23=1;
			}
			else if ( (LA23_0=='\'') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// Q.g:366:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// Q.g:366:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
					loop21:
					while (true) {
						int alt21=3;
						int LA21_0 = input.LA(1);
						if ( (LA21_0=='\\') ) {
							alt21=1;
						}
						else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '!')||(LA21_0 >= '#' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
							alt21=2;
						}

						switch (alt21) {
						case 1 :
							// Q.g:366:14: EscapeSequence
							{
							mEscapeSequence(); 

							}
							break;
						case 2 :
							// Q.g:366:31: ~ ( '\\\\' | '\"' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop21;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// Q.g:367:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) )* '\\''
					{
					match('\''); 
					// Q.g:367:14: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )*
					loop22:
					while (true) {
						int alt22=3;
						int LA22_0 = input.LA(1);
						if ( (LA22_0=='\\') ) {
							alt22=1;
						}
						else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '&')||(LA22_0 >= '(' && LA22_0 <= '[')||(LA22_0 >= ']' && LA22_0 <= '\uFFFF')) ) {
							alt22=2;
						}

						switch (alt22) {
						case 1 :
							// Q.g:367:16: EscapeSequence
							{
							mEscapeSequence(); 

							}
							break;
						case 2 :
							// Q.g:367:33: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop22;
						}
					}

					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR_CONST"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// Q.g:373:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt24=1;
					}
					break;
				case 'u':
					{
					alt24=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt24=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// Q.g:373:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// Q.g:374:9: UnicodeEscape
					{
					mUnicodeEscape(); 

					}
					break;
				case 3 :
					// Q.g:375:9: OctalEscape
					{
					mOctalEscape(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// Q.g:380:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='\\') ) {
				int LA25_1 = input.LA(2);
				if ( ((LA25_1 >= '0' && LA25_1 <= '3')) ) {
					int LA25_2 = input.LA(3);
					if ( ((LA25_2 >= '0' && LA25_2 <= '7')) ) {
						int LA25_4 = input.LA(4);
						if ( ((LA25_4 >= '0' && LA25_4 <= '7')) ) {
							alt25=1;
						}

						else {
							alt25=2;
						}

					}

					else {
						alt25=3;
					}

				}
				else if ( ((LA25_1 >= '4' && LA25_1 <= '7')) ) {
					int LA25_3 = input.LA(3);
					if ( ((LA25_3 >= '0' && LA25_3 <= '7')) ) {
						alt25=2;
					}

					else {
						alt25=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// Q.g:380:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// Q.g:381:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// Q.g:382:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	// $ANTLR start "UnicodeEscape"
	public final void mUnicodeEscape() throws RecognitionException {
		try {
			// Q.g:387:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
			// Q.g:387:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('\\'); 
			match('u'); 
			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscape"

	// $ANTLR start "NULL_CONST"
	public final void mNULL_CONST() throws RecognitionException {
		try {
			int _type = NULL_CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:392:2: ( 'NULL' )
			// Q.g:392:4: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL_CONST"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// Q.g:399:5: ( '\\u002e' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
			// Q.g:
			{
			if ( input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "JavaIDDigit"
	public final void mJavaIDDigit() throws RecognitionException {
		try {
			// Q.g:418:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
			// Q.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')||(input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')||(input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')||(input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')||(input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')||(input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')||(input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')||(input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')||(input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')||(input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')||(input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')||(input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')||(input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')||(input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JavaIDDigit"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:436:2: ( Letter ( Letter | JavaIDDigit )* )
			// Q.g:436:6: Letter ( Letter | JavaIDDigit )*
			{
			mLetter(); 

			// Q.g:436:13: ( Letter | JavaIDDigit )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='.'||(LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')||(LA26_0 >= '\u00C0' && LA26_0 <= '\u00D6')||(LA26_0 >= '\u00D8' && LA26_0 <= '\u00F6')||(LA26_0 >= '\u00F8' && LA26_0 <= '\u1FFF')||(LA26_0 >= '\u3040' && LA26_0 <= '\u318F')||(LA26_0 >= '\u3300' && LA26_0 <= '\u337F')||(LA26_0 >= '\u3400' && LA26_0 <= '\u3D2D')||(LA26_0 >= '\u4E00' && LA26_0 <= '\u9FFF')||(LA26_0 >= '\uF900' && LA26_0 <= '\uFAFF')) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Q.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop26;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:442:2: ( '%' (~ ( '%' ) )* '%' )
			// Q.g:442:4: '%' (~ ( '%' ) )* '%'
			{
			match('%'); 
			// Q.g:442:8: (~ ( '%' ) )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '\u0000' && LA27_0 <= '$')||(LA27_0 >= '&' && LA27_0 <= '\uFFFF')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Q.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '$')||(input.LA(1) >= '&' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop27;
				}
			}

			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Q.g:446:5: ( '#' (~ ( '\\n' ) )* )
			// Q.g:446:7: '#' (~ ( '\\n' ) )*
			{
			match('#'); 
			// Q.g:446:11: (~ ( '\\n' ) )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= '\u0000' && LA28_0 <= '\t')||(LA28_0 >= '\u000B' && LA28_0 <= '\uFFFF')) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Q.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop28;
				}
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	@Override
	public void mTokens() throws RecognitionException {
		// Q.g:1:8: ( AND | AND2 | BREAK | ELSE | ENCLOSED_ASSIGN | EQ | EQ_ASSIGN | FALSE | FOR | FUNCTION | GE | GT | IF | IN | LBB | LE | LEFT_ASSIGN | LT | NA | NE | NEXT | NS_GET | NS_GET_INT | OR | OR2 | REPEAT | RIGHT_ASSIGN | TRUE | WHILE | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | STR_CONST | NULL_CONST | SYMBOL | SPECIAL | Comment )
		int alt29=64;
		alt29 = dfa29.predict(input);
		switch (alt29) {
			case 1 :
				// Q.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// Q.g:1:14: AND2
				{
				mAND2(); 

				}
				break;
			case 3 :
				// Q.g:1:19: BREAK
				{
				mBREAK(); 

				}
				break;
			case 4 :
				// Q.g:1:25: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// Q.g:1:30: ENCLOSED_ASSIGN
				{
				mENCLOSED_ASSIGN(); 

				}
				break;
			case 6 :
				// Q.g:1:46: EQ
				{
				mEQ(); 

				}
				break;
			case 7 :
				// Q.g:1:49: EQ_ASSIGN
				{
				mEQ_ASSIGN(); 

				}
				break;
			case 8 :
				// Q.g:1:59: FALSE
				{
				mFALSE(); 

				}
				break;
			case 9 :
				// Q.g:1:65: FOR
				{
				mFOR(); 

				}
				break;
			case 10 :
				// Q.g:1:69: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 11 :
				// Q.g:1:78: GE
				{
				mGE(); 

				}
				break;
			case 12 :
				// Q.g:1:81: GT
				{
				mGT(); 

				}
				break;
			case 13 :
				// Q.g:1:84: IF
				{
				mIF(); 

				}
				break;
			case 14 :
				// Q.g:1:87: IN
				{
				mIN(); 

				}
				break;
			case 15 :
				// Q.g:1:90: LBB
				{
				mLBB(); 

				}
				break;
			case 16 :
				// Q.g:1:94: LE
				{
				mLE(); 

				}
				break;
			case 17 :
				// Q.g:1:97: LEFT_ASSIGN
				{
				mLEFT_ASSIGN(); 

				}
				break;
			case 18 :
				// Q.g:1:109: LT
				{
				mLT(); 

				}
				break;
			case 19 :
				// Q.g:1:112: NA
				{
				mNA(); 

				}
				break;
			case 20 :
				// Q.g:1:115: NE
				{
				mNE(); 

				}
				break;
			case 21 :
				// Q.g:1:118: NEXT
				{
				mNEXT(); 

				}
				break;
			case 22 :
				// Q.g:1:123: NS_GET
				{
				mNS_GET(); 

				}
				break;
			case 23 :
				// Q.g:1:130: NS_GET_INT
				{
				mNS_GET_INT(); 

				}
				break;
			case 24 :
				// Q.g:1:141: OR
				{
				mOR(); 

				}
				break;
			case 25 :
				// Q.g:1:144: OR2
				{
				mOR2(); 

				}
				break;
			case 26 :
				// Q.g:1:148: REPEAT
				{
				mREPEAT(); 

				}
				break;
			case 27 :
				// Q.g:1:155: RIGHT_ASSIGN
				{
				mRIGHT_ASSIGN(); 

				}
				break;
			case 28 :
				// Q.g:1:168: TRUE
				{
				mTRUE(); 

				}
				break;
			case 29 :
				// Q.g:1:173: WHILE
				{
				mWHILE(); 

				}
				break;
			case 30 :
				// Q.g:1:179: T__81
				{
				mT__81(); 

				}
				break;
			case 31 :
				// Q.g:1:185: T__82
				{
				mT__82(); 

				}
				break;
			case 32 :
				// Q.g:1:191: T__83
				{
				mT__83(); 

				}
				break;
			case 33 :
				// Q.g:1:197: T__84
				{
				mT__84(); 

				}
				break;
			case 34 :
				// Q.g:1:203: T__85
				{
				mT__85(); 

				}
				break;
			case 35 :
				// Q.g:1:209: T__86
				{
				mT__86(); 

				}
				break;
			case 36 :
				// Q.g:1:215: T__87
				{
				mT__87(); 

				}
				break;
			case 37 :
				// Q.g:1:221: T__88
				{
				mT__88(); 

				}
				break;
			case 38 :
				// Q.g:1:227: T__89
				{
				mT__89(); 

				}
				break;
			case 39 :
				// Q.g:1:233: T__90
				{
				mT__90(); 

				}
				break;
			case 40 :
				// Q.g:1:239: T__91
				{
				mT__91(); 

				}
				break;
			case 41 :
				// Q.g:1:245: T__92
				{
				mT__92(); 

				}
				break;
			case 42 :
				// Q.g:1:251: T__93
				{
				mT__93(); 

				}
				break;
			case 43 :
				// Q.g:1:257: T__94
				{
				mT__94(); 

				}
				break;
			case 44 :
				// Q.g:1:263: T__95
				{
				mT__95(); 

				}
				break;
			case 45 :
				// Q.g:1:269: T__96
				{
				mT__96(); 

				}
				break;
			case 46 :
				// Q.g:1:275: T__97
				{
				mT__97(); 

				}
				break;
			case 47 :
				// Q.g:1:281: T__98
				{
				mT__98(); 

				}
				break;
			case 48 :
				// Q.g:1:287: T__99
				{
				mT__99(); 

				}
				break;
			case 49 :
				// Q.g:1:293: T__100
				{
				mT__100(); 

				}
				break;
			case 50 :
				// Q.g:1:300: T__101
				{
				mT__101(); 

				}
				break;
			case 51 :
				// Q.g:1:307: T__102
				{
				mT__102(); 

				}
				break;
			case 52 :
				// Q.g:1:314: T__103
				{
				mT__103(); 

				}
				break;
			case 53 :
				// Q.g:1:321: T__104
				{
				mT__104(); 

				}
				break;
			case 54 :
				// Q.g:1:328: T__105
				{
				mT__105(); 

				}
				break;
			case 55 :
				// Q.g:1:335: T__106
				{
				mT__106(); 

				}
				break;
			case 56 :
				// Q.g:1:342: HexLiteral
				{
				mHexLiteral(); 

				}
				break;
			case 57 :
				// Q.g:1:353: DecimalLiteral
				{
				mDecimalLiteral(); 

				}
				break;
			case 58 :
				// Q.g:1:368: OctalLiteral
				{
				mOctalLiteral(); 

				}
				break;
			case 59 :
				// Q.g:1:381: FloatingPointLiteral
				{
				mFloatingPointLiteral(); 

				}
				break;
			case 60 :
				// Q.g:1:402: STR_CONST
				{
				mSTR_CONST(); 

				}
				break;
			case 61 :
				// Q.g:1:412: NULL_CONST
				{
				mNULL_CONST(); 

				}
				break;
			case 62 :
				// Q.g:1:423: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 63 :
				// Q.g:1:430: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 64 :
				// Q.g:1:438: Comment
				{
				mComment(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA18_eotS =
		"\6\uffff";
	static final String DFA18_eofS =
		"\6\uffff";
	static final String DFA18_minS =
		"\2\56\4\uffff";
	static final String DFA18_maxS =
		"\1\71\1\146\4\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\2\1\1\1\3\1\4";
	static final String DFA18_specialS =
		"\6\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "326:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
		}
	}

	static final String DFA29_eotS =
		"\1\uffff\1\55\2\51\1\63\1\65\2\51\1\72\1\51\1\76\1\51\1\103\1\51\1\106"+
		"\1\110\1\51\1\113\2\51\12\uffff\1\51\6\uffff\2\120\1\51\6\uffff\2\51\6"+
		"\uffff\3\51\2\uffff\1\132\1\133\2\uffff\1\135\2\51\2\uffff\1\51\1\142"+
		"\3\uffff\1\51\2\uffff\3\51\2\uffff\1\147\1\uffff\1\120\1\122\3\51\1\155"+
		"\1\51\2\uffff\1\51\1\uffff\1\162\2\51\2\uffff\3\51\1\170\1\uffff\1\51"+
		"\1\122\1\51\1\173\1\51\1\uffff\4\51\1\uffff\1\u0082\1\u0083\1\51\1\u0085"+
		"\1\51\1\uffff\1\122\1\u0087\1\uffff\1\u0088\5\51\2\uffff\1\51\1\uffff"+
		"\1\u008f\2\uffff\5\51\1\u0095\1\uffff\5\51\1\uffff\1\u009b\3\51\1\u009f"+
		"\1\uffff\3\51\1\uffff\4\51\1\u00a7\1\u00a8\1\51\2\uffff\1\u00aa\1\uffff";
	static final String DFA29_eofS =
		"\u00ab\uffff";
	static final String DFA29_minS =
		"\1\12\1\46\1\162\1\154\1\55\1\75\1\101\1\157\1\75\1\146\1\133\1\101\1"+
		"\75\1\145\1\72\1\174\1\145\1\76\1\122\1\150\12\uffff\1\156\6\uffff\2\56"+
		"\1\60\6\uffff\1\145\1\163\6\uffff\1\114\1\162\1\156\2\uffff\2\56\2\uffff"+
		"\1\56\1\116\1\114\2\uffff\1\170\1\72\3\uffff\1\160\2\uffff\1\125\1\151"+
		"\1\146\2\uffff\1\56\1\uffff\2\56\1\141\1\145\1\123\1\56\1\143\2\uffff"+
		"\1\143\1\uffff\1\56\1\114\1\164\2\uffff\1\145\1\105\1\154\1\56\1\uffff"+
		"\1\53\1\56\1\153\1\56\1\105\1\uffff\1\164\1\150\1\156\1\145\1\uffff\2"+
		"\56\1\141\1\56\1\145\1\uffff\2\56\1\uffff\1\56\1\151\1\141\1\155\1\164"+
		"\1\141\2\uffff\1\164\1\uffff\1\56\2\uffff\1\157\1\162\1\160\1\145\1\154"+
		"\1\56\1\uffff\1\156\1\141\1\154\1\147\1\137\1\uffff\1\56\1\143\2\145\1"+
		"\56\1\uffff\1\164\1\170\1\162\1\uffff\1\145\2\137\1\162\2\56\1\137\2\uffff"+
		"\1\56\1\uffff";
	static final String DFA29_maxS =
		"\1\ufaff\1\46\1\162\1\154\2\75\1\101\1\165\1\75\1\156\1\133\1\141\1\75"+
		"\1\145\1\72\1\174\1\145\1\76\1\122\1\150\12\uffff\1\156\6\uffff\1\170"+
		"\1\146\1\71\6\uffff\1\145\1\163\6\uffff\1\114\1\162\1\156\2\uffff\2\ufaff"+
		"\2\uffff\1\ufaff\1\116\1\114\2\uffff\1\170\1\72\3\uffff\1\160\2\uffff"+
		"\1\125\1\151\1\146\2\uffff\1\146\1\uffff\1\146\1\ufaff\1\141\1\145\1\123"+
		"\1\ufaff\1\143\2\uffff\1\162\1\uffff\1\ufaff\1\114\1\164\2\uffff\1\145"+
		"\1\105\1\154\1\ufaff\1\uffff\1\71\1\ufaff\1\153\1\ufaff\1\105\1\uffff"+
		"\1\164\1\157\1\156\1\145\1\uffff\2\ufaff\1\141\1\ufaff\1\145\1\uffff\2"+
		"\ufaff\1\uffff\1\ufaff\1\151\1\141\1\155\1\164\1\141\2\uffff\1\164\1\uffff"+
		"\1\ufaff\2\uffff\1\157\1\162\1\160\1\145\1\154\1\ufaff\1\uffff\1\156\1"+
		"\141\1\154\1\147\1\137\1\uffff\1\ufaff\1\143\2\145\1\ufaff\1\uffff\1\164"+
		"\1\170\1\162\1\uffff\1\145\2\137\1\162\2\ufaff\1\137\2\uffff\1\ufaff\1"+
		"\uffff";
	static final String DFA29_acceptS =
		"\24\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\46\1\50\1\51\1\52\1\uffff\1"+
		"\62\1\63\1\64\1\65\1\66\1\67\3\uffff\1\74\1\76\1\77\1\100\1\2\1\1\2\uffff"+
		"\1\5\1\20\1\21\1\22\1\6\1\7\3\uffff\1\13\1\14\2\uffff\1\17\1\61\3\uffff"+
		"\1\24\1\36\2\uffff\1\47\1\31\1\30\1\uffff\1\33\1\45\3\uffff\1\70\1\71"+
		"\1\uffff\1\73\7\uffff\1\15\1\16\1\uffff\1\23\3\uffff\1\27\1\26\4\uffff"+
		"\1\72\5\uffff\1\11\4\uffff\1\60\5\uffff\1\53\2\uffff\1\4\6\uffff\1\75"+
		"\1\25\1\uffff\1\34\1\uffff\1\3\1\10\6\uffff\1\35\5\uffff\1\32\5\uffff"+
		"\1\12\3\uffff\1\57\7\uffff\1\55\1\56\1\uffff\1\54";
	static final String DFA29_specialS =
		"\u00ab\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\37\26\uffff\1\14\1\50\1\53\1\24\1\52\1\1\1\50\1\25\1\26\1\27\1\30"+
			"\1\31\1\21\1\47\1\32\1\45\11\46\1\16\1\33\1\4\1\5\1\10\1\34\1\35\5\51"+
			"\1\6\2\51\1\36\4\51\1\13\5\51\1\22\6\51\1\12\1\uffff\1\40\1\41\1\51\1"+
			"\uffff\1\51\1\2\2\51\1\3\1\7\2\51\1\11\4\51\1\15\3\51\1\20\4\51\1\23"+
			"\3\51\1\42\1\17\1\43\1\44\101\uffff\27\51\1\uffff\37\51\1\uffff\u1f08"+
			"\51\u1040\uffff\u0150\51\u0170\uffff\u0080\51\u0080\uffff\u092e\51\u10d2"+
			"\uffff\u5200\51\u5900\uffff\u0200\51",
			"\1\54",
			"\1\56",
			"\1\57",
			"\1\62\16\uffff\1\60\1\61",
			"\1\64",
			"\1\66",
			"\1\67\5\uffff\1\70",
			"\1\71",
			"\1\73\7\uffff\1\74",
			"\1\75",
			"\1\77\23\uffff\1\101\13\uffff\1\100",
			"\1\102",
			"\1\104",
			"\1\105",
			"\1\107",
			"\1\111",
			"\1\112",
			"\1\114",
			"\1\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\116",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122\1\uffff\10\121\2\122\12\uffff\3\122\21\uffff\1\117\13\uffff\3"+
			"\122\21\uffff\1\117",
			"\1\122\1\uffff\12\123\12\uffff\3\122\35\uffff\3\122",
			"\12\124",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\125",
			"\1\126",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\134\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\136",
			"\1\137",
			"",
			"",
			"\1\140",
			"\1\141",
			"",
			"",
			"",
			"\1\143",
			"",
			"",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"",
			"\1\122\1\uffff\10\121\2\122\12\uffff\3\122\35\uffff\3\122",
			"",
			"\1\122\1\uffff\12\123\12\uffff\3\122\35\uffff\3\122",
			"\1\51\1\uffff\12\124\7\uffff\3\51\1\151\1\150\1\151\24\51\4\uffff\1"+
			"\51\1\uffff\3\51\1\151\1\150\1\151\24\51\105\uffff\27\51\1\uffff\37\51"+
			"\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff\u0080\51\u0080\uffff"+
			"\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200\51",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\156",
			"",
			"",
			"\1\157\5\uffff\1\160\10\uffff\1\161",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\163",
			"\1\164",
			"",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"",
			"\1\122\1\uffff\1\122\2\uffff\12\171",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\172",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\174",
			"",
			"\1\175",
			"\1\176\6\uffff\1\177",
			"\1\u0080",
			"\1\u0081",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\u0084",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\u0086",
			"",
			"\1\51\1\uffff\12\171\7\uffff\3\51\1\151\1\51\1\151\24\51\4\uffff\1\51"+
			"\1\uffff\3\51\1\151\1\51\1\151\24\51\105\uffff\27\51\1\uffff\37\51\1"+
			"\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff\u0080\51\u0080\uffff"+
			"\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200\51",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"",
			"",
			"\1\u008e",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			"\1\u00a9",
			"",
			"",
			"\1\51\1\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51\105\uffff"+
			"\27\51\1\uffff\37\51\1\uffff\u1f08\51\u1040\uffff\u0150\51\u0170\uffff"+
			"\u0080\51\u0080\uffff\u092e\51\u10d2\uffff\u5200\51\u5900\uffff\u0200"+
			"\51",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | AND2 | BREAK | ELSE | ENCLOSED_ASSIGN | EQ | EQ_ASSIGN | FALSE | FOR | FUNCTION | GE | GT | IF | IN | LBB | LE | LEFT_ASSIGN | LT | NA | NE | NEXT | NS_GET | NS_GET_INT | OR | OR2 | REPEAT | RIGHT_ASSIGN | TRUE | WHILE | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | STR_CONST | NULL_CONST | SYMBOL | SPECIAL | Comment );";
		}
	}

}
