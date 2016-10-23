// Tzvi Zeller
// 12/10
//listing class with all methods
public class SymbolTable {
	private LineHeaderNode1[] symbol_table;
	
	//construtor
	public SymbolTable(){
		symbol_table = new LineHeaderNode1[50];
		//intulise to null
	}
	
	//adds a new lineheader or line node
	public void append(String iden, int line) {
		int lineFound = 0;
		boolean found=false;
		for(int i=0; i<symbol_table.length;i++){
			if((symbol_table[i]!=null)&&(symbol_table[i].getIdentifier().equals(iden))){
				found=true;
				lineFound=i;
			}
		}
		if(found==true){
			LineNode temp = symbol_table[lineFound].getNext();

			while(temp.getNext() != null){
				temp = temp.getNext();
				if((temp.getNext() != null)&&(temp.getNext().getLineNum() == line))
					break;
			}
			temp.setNext(new LineNode(line, null));
		}
		else{
			LineHeaderNode1 tempIden = new LineHeaderNode1(iden,new LineNode (line, null));
			boolean done=false; 
			int i=0;
			while(done==false)
				if(symbol_table[i]==null){
					symbol_table[i]=tempIden;
					done=true;
				}
				else
					i++;
			}
		}
	
	//print method
	public void print(){
		int i=0;
		boolean fin=false; 
		while(!fin){
			System.out.println("\n"+"Identifyer: "+ symbol_table[i].getIdentifier());
			System.out.print("On lines ");
			LineNode temp = symbol_table[i].getNext();
			while(temp!=null){
				System.out.print(temp.getLineNum()+" ");
				temp=temp.getNext();
			}
			if(symbol_table[i+1]==null)
				fin=true;
			else
				i++;
		}
	}
}
