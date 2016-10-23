// Tzvi Zeller
// 12/10
//Library
public class JavaOperators implements Operators {

	public boolean isOperator(String s) {
		if((s.equals("+"))||(s.equals("-"))||(s.equals("*"))||(s.equals("/"))||(s.equals("%"))||(s.equals("<"))
				||(s.equals(">"))||(s.equals("<="))||(s.equals(">="))||(s.equals("=="))||(s.equals("!="))||(s.equals("&&"))
				||(s.equals("||"))||(s.equals("!")))
			return true;
		else
			return false;		
		}
}
