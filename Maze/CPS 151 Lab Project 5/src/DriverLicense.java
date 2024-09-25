
public class DriverLicense extends IDCard {
	   private int expYear;
	

	  
	   public DriverLicense(String name, String idNum, int expiration)
	   {
	      super(name, idNum);
	      expYear = expiration;
	   }
	   
public String toString() { return super.toString() + ",  Expiration Year: " + expYear;}


}//end Id

