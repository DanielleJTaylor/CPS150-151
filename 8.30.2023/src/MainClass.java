import java.util.Scanner;
public class MainClass {
	/*
	 * You can catch exceptions or throw exceptions.
	 * */
	 
	public static void main(String[] args) {
		//catch exception
		try {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter 2 integers:");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			//throw exception
			//if(x <=0 || y <=0) {
			//	throw new Exception(" Integers must be positive");
		//}
			
			//int z = x/y;
			int z = divide(x,y);
			
			System.out.println(z);
		}
		catch(Exception ex) //exception is almost universal..
		{
			System.out.println("Something went wrong." + ex.getMessage());
			//get.message tells us what is wrong with program to get exception
		}
	} //end main
	
	public static int divide(int a, int b) throws IllegalArgumentException {
		if (a <=0 || b <= 0) {
			throw new IllegalArgumentException("  arguments must be positive integers");
		}
		return a/b;
	}
}// end MainClass
