// Tzvi Zeller
// 12/10

public class TokenizedLines {
	private LineHeaderNode lines;
	private LineHeaderNode current_head;
	private TokenNode current_toeken;
	int line=2;

	//Constructor 
	public TokenizedLines(){
		lines=new LineHeaderNode(null, 1, null);
		current_head=lines;
		current_toeken=current_head.getFirst();
	}

	//append for token
	public void addToken(Token temp){
		if(current_head.getFirst()!=null){
			current_toeken.setNext(new TokenNode(temp,null));
			current_toeken = current_toeken.getNext();
		}
		else {
			current_head.setFirst(new TokenNode(temp,null));
			current_toeken=current_head.getFirst();
		}
	}

	//adds a new line
	public void newLine(){
		LineHeaderNode temp= new LineHeaderNode(null,line,null);
		current_head.setNext(temp);
		current_head=temp;
		line++;
	}

	//prints out lines and tokens
	public void print(){
		LineHeaderNode temp1=lines;
		while(temp1!=null){
			System.out.println("Code on line "+temp1.getLine()+":");
			TokenNode tempToken=temp1.getFirst();
			while(tempToken!=null){
				System.out.println("Token Code: "+tempToken.getToken().getCode()+" Token Value: "+tempToken.getToken().getValue());
				tempToken=tempToken.getNext();
			}
			temp1=temp1.getNext();
		}
	}
	public TokenizedLines getTokenizedLines(){
		 TokenizedLines lines= new TokenizedLines();
		 return lines;
	}
	public LineHeaderNode getToken(){
		return current_head;
	}
}
