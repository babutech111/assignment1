package learning1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterndemo {

	public static void main(String[] args) {
        
		//1st way  
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		  
		//3rd way  
		boolean b3 = Pattern.matches(".p", "pp");  
		  
		System.out.println(b+" "+b2+" "+b3);  
		
		
	  boolean t=Pattern.matches(".a..d", "aasfd");
	  System.out.println(t);
	  
	  System.out.println(Pattern.matches("..\\dx", "ssxx"));
	  System.out.println(Pattern.matches("..\\Dx", "ssxx"));
	  
	  System.out.println("===");
	  System.out.println(Pattern.matches("b[a-z]", "bx"));
	  System.out.println(Pattern.matches("b[A-Z]", "bZ"));
	  System.out.println(Pattern.matches("b[a-z]", "bx"));
	  System.out.println(Pattern.matches("b[a-zA-Z_0-9]", "bZ9"));

	  
	  
	  

	  
	}

}
