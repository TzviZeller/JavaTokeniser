// Tzvi Zeller
// 12/10

public class Token {
	private int code;
	private String value;

	//Constructor 
	Token(int code, String value){
		this.code=code;
		this.value=value;
	}

	//getters
	public int getCode(){
		return code;
	}

	public String getValue(){
		return value;
	}
}
