// Tzvi Zeller
// 12/10
//Header node class
public class LineHeaderNode1
{
	private String identifier;
	private LineNode next;

	// constructor
	public LineHeaderNode1(String identifier, LineNode next)
	{
		this.identifier = identifier;
		this.next = next;
	}

	// getters
	public String getIdentifier()
	{
		return identifier;
	}

	public LineNode getNext()
	{
		return next;
	}
	
	//setters
	public void setNext(LineNode next){
		this.next=next;
	}
	
}
