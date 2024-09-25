
public class VendingMachine {

	//instance variables
	private int num_cans = 0;
	private int num_tokens = 0;
	
	
	public void fillUp( int cans ) { num_cans = num_cans + cans; }
	
	public int getCanCount() { return num_cans; }
	public int getTokenCount() { return num_tokens; }
	
	
	public void insertToken()
	{
	   // Java statements for updating the token and can counts
		//Decrease can and increase token
		
		if (num_cans >= 0) {
			num_cans--;
			num_tokens++;
		}
		
	}
	
}
