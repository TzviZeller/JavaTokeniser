// Tzvi Zeller
// 12/10
//Library
public class JavaLiterals implements Literals {

	public boolean isLiteral(String s) {
		if((s.equals("true"))||(s.equals("false"))||(s.charAt(0)=='"')||(s.matches("-?\\d+(\\.\\d+)?")))
			return true;
		else
			return false;
	}

}

