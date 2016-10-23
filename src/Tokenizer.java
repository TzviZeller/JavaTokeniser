// Tzvi Zeller
// 12/10

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tokenizer {
	private TokenizedLines t_lines;
	private SymbolTable sym_table;
	private LanguageSyntax lang_syntax;
	private BufferedReader prog_file;
	private int linecount;
	private int tcode;

	//constructor
	public Tokenizer(BufferedReader prog_file, LanguageSyntax lang_syntax)	{
		t_lines = new TokenizedLines();
		sym_table = new SymbolTable();
		this.lang_syntax = lang_syntax;
		this.prog_file= prog_file;
	}

	// tokinese lines
	public void start() {	
		String line = null;
		boolean end=false;
		String blank_char = " ";  // one space between quotes
		String all_delimiters = blank_char + ",;:()[]{}"+"\""+"\'"+"\t";  // backslash before quote symbols
		StringTokenizer st = null;
		
		System.out.println("\n"+"File Output: ");
		while(!end){ //scans file while not empty
			try {
				line = prog_file.readLine();
				if(line != null)
				{
					System.out.println(line);
					st = new StringTokenizer(line, all_delimiters, true); 
				}

			} catch (IOException e) {
			}
			if(line==null)
				end=true;
			else{

				while(st.hasMoreElements()){
					String tString = st.nextToken();
					if((tString.equals(" "))||(tString.equals("\t")))
					{
						//rid of white space
					}
					else{
						tcode = lang_syntax.getTokenCode(tString); 

						if(tcode == 3){ 
							sym_table.append(tString, linecount);  
						}

						Token token = new Token(tcode, tString); 
						t_lines.addToken(token); 
					}
				}
				t_lines.newLine();
				linecount++;
			}
		}
	} // end of start.

	public void displayTokenizedLines()	{
		t_lines.print();
	}

	public void displaySymbolTable(){
		sym_table.print();
	}

	public TokenizedLines getTokenizedLines() {
		return t_lines.getTokenizedLines();
	}
}