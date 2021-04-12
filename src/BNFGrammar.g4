grammar BNFGrammar;

re : union | simpleRE ;
union : simpleRE '|' re;
simpleRE : basicRE | concatenation ;
concatenation : basicRE simpleRE;
basicRE : star | plus | elementaryRE;
star : elementaryRE '*';
plus  : elementaryRE '+';
elementaryRE : group | any | eos | chara | set;
group : '(' re ')';
any : '.';
eos : '$';
chara: chars| '/' metacharacter ;
set :  positiveset;
positiveset  : '[' setitems ']';
setitems : setitem | setitem setitems;
setitem : range | chara;
range : chara '-' chara;

metacharacter :  '#'
              |  '"'
              |  '&'
              |  '!'
              |  '?'
              ;

chars : LETTER|  DIGIT;
LETTER        :  [a-zA-Z];
DIGIT         :  [0-9]+;
WS            :  [ \t\r\n]+ -> skip;