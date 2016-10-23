// Tzvi Zeller
// 12/10
//Library
public class JavaIdentifiers implements Identifiers {

	public boolean isValidIdentifier(String s) {
		if(!(Character.isDigit(s.charAt(0))))
			return true;
		else
			return false;
	}

}
