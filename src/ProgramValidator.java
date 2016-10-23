// Tzvi Zeller
// 12/10
public class ProgramValidator {
	private TokenizedLines tlines;
	private ValidatorInterface[] validators;
	private String[] all_errors=null;
	private int count=0;

	public ProgramValidator(TokenizedLines tlines, ValidatorInterface[] validators)	{
		this.tlines = tlines;
		this.validators = validators;
		all_errors = new String[50];
	}

	//stars validation
	public void start()	{
		for (ValidatorInterface v : validators)	{
			v.validate();
		}
	}

	public String[] getErrors()	{
		return all_errors;
	}

	private void addErrors(String[] errs) {
        for(String s: errs) {
            all_errors[count] = s;
            count++;
        }
    }
}