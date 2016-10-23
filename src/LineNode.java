// Tzvi Zeller
// 12/10
//line node class
public class LineNode
{
	private int lineNum;
	private LineNode next;

	// constructor
	public LineNode(int lineNum, LineNode next)
	{
		this.lineNum = lineNum;
		this.next = next;
	}

	// getters
	public int getLineNum()
	{
		return lineNum;
	}

	public LineNode getNext()
	{
		return next;
	}
	
	//setter
	public void setNext(LineNode temp){
	
		next=temp;
	}
	
	//printer
	public void print(){
		LineNode temp=next;
		System.out.print(" Lines: "+ lineNum);
		while(temp!=null){
			System.out.print(", "+ temp.getLineNum());
			temp=temp.getNext();
			
		}
	}
}
