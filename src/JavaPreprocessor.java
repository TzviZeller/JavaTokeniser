// Tzvi Zeller
// 12/10
//driver for program
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class JavaPreprocessor {

	public static void main(String[] args) {

		Scanner console= new Scanner(System.in);
		BufferedReader scan = null;
		String fileName = null;
		boolean find=false;
		
		while(!find){
			System.out.println("Please enter the file you would like to read and tokenize:");
			fileName=console.next();

			try {
				scan = new BufferedReader (new FileReader(fileName+".txt"));
				find=true;
			}
			catch (FileNotFoundException e) {
				System.out.print("Invalid file name, ");
			}
			catch (NullPointerException e) {
				System.out.print("Invalid file, ");
			} //finds file, creates "reader"
		}

		// create Java language objects
		JavaComments javaComments = new JavaComments();
		JavaLiterals javaLiterals = new JavaLiterals();
		JavaKeywords javaKeywords = new JavaKeywords();
		JavaIdentifiers javaIdentifiers = new JavaIdentifiers();
		JavaOperators javaOperators = new JavaOperators();
		JavaDelimiters javaDelimiters = new JavaDelimiters();

		// construct Controller
		Controller controller = new Controller(scan, javaComments, javaLiterals, javaKeywords,javaIdentifiers,javaOperators,javaDelimiters);
		
		// start preprocessor
		controller.start();
	}
}