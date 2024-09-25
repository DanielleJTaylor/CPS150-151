
public class CallingCard extends Card {
	private int PIN;
	private String cardNumber;
	
	public CallingCard(String name, String id, int thePIN)
		{
		  super(name);
		  this.cardNumber = cardNumber;
		  PIN = thePIN;
		}
		
	
	public String toString() { return super.toString() + "Pin: " + PIN; }


}
