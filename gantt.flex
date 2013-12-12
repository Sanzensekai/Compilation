
%%
   
%package calculator
%class Lexer
%line
%column
%cup

%%
[ \t\f]					{ }
\r\n|\r|\n				{ return getSymbolFactory().newSymbol ("EOLN", Sym.EOLN); }

"CREATE_T"				{ return getSymbolFactory().newSymbol ("CREATE_T", Sym.RPAREN); }
   
[0-9]+      			{ return getSymbolFactory().newSymbol ("NUMBER", Sym.NUMBER, new Integer(yytext())); }
[A-Za-z_][A-Za-z_0-9]*	{ return getSymbolFactory().newSymbol ("NAME", Sym.ID, new String(yytext())); }
   
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
