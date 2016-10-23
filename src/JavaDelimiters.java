// Tzvi Zeller
// 12/10
//Library
public class JavaDelimiters implements Delimiters{

	public boolean isDelimiter(String s) {
		if((s.equals(" "))||(s.equals(","))||(s.equals(";"))||(s.equals(":")))
			return true;
		else
			return false;
	}

	public boolean isPairedDelimiter(String s) {
		if((s.equals("("))||(s.equals(")"))||(s.equals("{"))||(s.equals("}"))||(s.equals("\""))||(s.equals("\'"))||(s.equals("“"))||(s.equals("”"))||(s.equals("["))||(s.equals("]")))
			return true;
		else
		return false;
	}

	public boolean isLeftDelimiter(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
