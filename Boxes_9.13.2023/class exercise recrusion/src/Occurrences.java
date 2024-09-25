import java.util.Scanner;

public class Occurrences {
	
	   public static void main(String[] args) {
Scanner in	= new Scanner (System.in);
System.out.print("Entera storing:");
String line = in.nextLine();
System.out.print("Enter a letter; ");
char letter = in.next().charAt(0);
int letterCount = count(line,letter);
	}
	
	
public static int count (String str, char a) {
	
	if (str.isEmpty()) {
	return 0;
	
}
	 else        // All other sized (non-empty) lists are created here
	    {
	    	
	         count(str,a);
	         return ;
	      }
}
}
