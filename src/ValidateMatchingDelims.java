//Tzvi Zeller
//12/10
public class ValidateMatchingDelims implements ValidatorInterface{
    private TokenizedLines tlines;
    private String[] errors;
    private LineHeaderNode temp;
    private TokenNode temp2;
    private int errorCount=0;
    private Stack don = new Stack();
    private Stack jim = new Stack();

    public ValidateMatchingDelims(TokenizedLines tlines)  {
        this.tlines = tlines;
        temp=tlines.getToken();
    }

    //Has all the logic for validation of the tokenised lines
	public void validate() {
		temp=tlines.getToken();
		temp2=temp.getFirst();
		System.out.println("Inside validate");
		System.out.println(temp2);
		
		// while loops traverse tokens
		while(temp.getNext()!=null){
			while(temp2.getToken()!=null){
				// check for deliminators
				//add dilimators to stack
				if(temp2.getToken().getCode()==(6)) {
					if(temp2.getToken().getValue().equals("(") || temp2.getToken().getValue().equals("{") || temp2.getToken().getValue().equals("[")
							|| temp2.getToken().getValue().equals("\"")|| temp2.getToken().getValue().equals("\'")){
						String bob=temp2.getToken().getValue();
						don.push(bob);
					}
					//pops and checks for a match
					else {
						String desiredDelim = don.pop();
						if(desiredDelim.equals("(")||desiredDelim.equals(")")){
							if(temp2.getToken().getValue().equals(")")|| temp2.getToken().getValue().equals("(")){
							}
							else{
								System.out.println(temp2.getToken().getValue() + "in errors");
								errors[errorCount] = " Parentheses mising on line " + errorCount;
								errorCount++;
							}
						}
						else if(desiredDelim.equals(("[")) || desiredDelim.equals("]"))	{
							if(temp2.getToken().getValue().equals("]") || temp2.getToken().getValue().equals("]")){
							}
							else{
								System.out.println(temp2.getToken().getValue() + "in errors");
								errors[errorCount] = "Square bracket missing on line " + errorCount;
								errorCount++;
							}
						}
						else if(desiredDelim.equals(("\""))){
							if(temp2.getToken().getValue().equals("\"")){
							}
							else{
								System.out.println(temp2.getToken().getValue() + "in errors");
								errors[errorCount] = "Quotation missing on line " + errorCount;
								errorCount++;
							}
						}
						else if(desiredDelim.equals(("'")))	{
							if(temp2.getToken().getValue().equals("'")){
							}
							else{
								System.out.println(temp2.getToken().getValue() + "in errors");
								errors[errorCount] = "Apostrophe missing on line " + errorCount;
								errorCount++;
							}
						}
						else if(desiredDelim.equals(("{")))	{
							if(temp2.getToken().getValue().equals("}")){
							}
							else
							{
								System.out.println(temp2.getToken().getValue() + "in errors");
								errors[errorCount] = "Curly bracket missing on line " + errorCount;
								errorCount++;
							}
						}
					}
				}
				//check for strign main
				if(temp2.getToken().getCode()==(2)) 	{
					if(temp2.getToken().getValue().equals("main")) {
						String sam=temp2.getToken().getValue();
						jim.push(sam);
					}
					//pops and checks
					else{
						String desiredDelim2 = jim.pop();
						if(desiredDelim2.equals(" main")){
							if(temp2.getToken().getValue().equals(" main")){	
							}
							else{
								errors[errorCount] = "Program is missing 'public static void main(String[] args)'";
								errorCount++;
							}
						}
					}
				}
				temp=temp.getNext();
			}
			temp2=temp2.getNext();
		}
	}

	public String[] getErrors() {
		return errors;
	}

	public boolean isValid() {
		return false;
	}
}