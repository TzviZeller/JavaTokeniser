// Tzvi Zeller
// 12/10

public class TokenNode {
	private Token token;
	private TokenNode next;

	//Constructor 
	public TokenNode(Token token,TokenNode next){
		this.token=token;
		this.next=next;
	}

	//getters
	public Token getToken(){
		return token;
	}

	public TokenNode getNext(){
		return next;
	}

	//setters
	public void setNext(TokenNode temp){
		next=temp;
	}
}
