// Tzvi Zeller
// 12/10

public class LineHeaderNode {
	private int line;
	private LineHeaderNode next;
	private TokenNode first;

	// Default Constructor 
	public LineHeaderNode(){
		line=line++;
		next=null;
		this.first=null; 
	}
	//arg Constructor 
	public LineHeaderNode(LineHeaderNode next,int line,TokenNode first){
		this.line=line;
		this.next=next;
		this.first=first; 
	}

	//getters
	public int getLine() {
		return line;
	}

	public LineHeaderNode getNext() {
		return next;
	}

	public TokenNode getFirst() {
		return first;
	}

	//setters
	public void setNext(LineHeaderNode next) {
		this.next = next;
	}

	public void setFirst(TokenNode first) {
		this.first = first;
	}	
}
