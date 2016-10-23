// Tzvi Zeller
// 12/10
//Library
public class JavaKeywords implements Keywords{

	public boolean isKeyword(String s) {
		if((s.equals("boolean"))||(s.equals("break"))||(s.equals("case"))||(s.equals("char"))||(s.equals("class"))||(s.equals("const"))||
				(s.equals("default"))||(s.equals("do"))||(s.equals("else"))||(s.equals("false"))||(s.equals("final"))||(s.equals("float"))||
				(s.equals("for"))||(s.equals("if"))||(s.equals("import"))||(s.equals("int"))||(s.equals("long"))||(s.equals("new"))||
				(s.equals("null"))||(s.equals("public"))||(s.equals("return"))||(s.equals("static"))||(s.equals("switch"))||(s.equals("true"))||
				(s.equals("void"))||(s.equals("while"))||(s.equals("System"))||(s.equals("String"))||(s.equals("main")))
			return true;
		else 
			return false;
	}
}
