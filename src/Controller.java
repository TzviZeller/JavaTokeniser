// Tzvi Zeller
// 12/10
//utilition of classes 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller {

	private BufferedReader prog_file;
	private Tokenizer tokenizer;
	private ProgramValidator progValidater;
	ValidatorInterface[] validators;

	public Controller (BufferedReader prog_file, Comments c, Literals l,  Keywords k, Identifiers i, Operators o, Delimiters d)
	{
		this.prog_file = prog_file;
		LanguageSyntax lang_syntax = new LanguageSyntax(c, l, k,i,o,d);
		tokenizer = new Tokenizer(prog_file, lang_syntax);
	}

	public void start()
	{
		tokenizer.start();
		// display here for testing only (eventually remove)
		System.out.println("\n"+"Tokensed file Output:");
		tokenizer.displayTokenizedLines();
		System.out.print("\n"+"Identifier Symbole Table:");
		tokenizer.displaySymbolTable();
		System.out.println("\n"+"\n"+"Errors Found:");
		
        ValidateMatchingDelims dill = new ValidateMatchingDelims(tokenizer.getTokenizedLines());
        ValidatorInterface[] validators = {dill};
        TokenizedLines tLines = tokenizer.getTokenizedLines();
        progValidater = new ProgramValidator(tLines, validators);
        progValidater.start();
        //String[] errors = progValidater.getErrors();
		//System.out.println(errors);
	}
}