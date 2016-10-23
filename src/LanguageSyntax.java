// Tzvi Zeller
// 12/10
//defines syntax for check
public class LanguageSyntax {
    
    private Comments comments;
    private Literals literals;
    private Keywords keyword;
    private Identifiers idenfifer;
    private Operators operator;
    private Delimiters dilimiter;
            
    public LanguageSyntax(Comments c, Literals l,  Keywords k, Identifiers i, Operators o, Delimiters d )
    {
        comments = c;
        literals = l;
        keyword= k;
        idenfifer= i;
        operator= o;
        dilimiter = d;
    }
    
    public int getTokenCode(String s)
    {
    	if (comments.isComment(s))
    		return 0;
    	else if (literals.isLiteral(s))
    			return 1;
    	else if (keyword.isKeyword(s))
    			return 2;
    	else if (operator.isOperator(s))
			return 4;
    	else if (dilimiter.isPairedDelimiter(s))
			return 5;
    	else if (dilimiter.isDelimiter(s))
			return 6;
    	else if (idenfifer.isValidIdentifier(s))
			return 3;
    	else
		 return -1;
    }
}