/*
 *
 * Name: 
 * 
 * CPS 151
 * Algorithms & Programming II
 * 
 * Lab Project: What's in the Cards? (Java Inheritance)
 * 
 * Tester source code file for Card classes and Billfold class
 *
 */

public class BillfoldTester
{
    public static void main(String[] args)
    {
      Billfold b = new Billfold();
     
      b.addCard( new DriverLicense("John Doe", "08-097654", 2020) );
      b.addCard( new CallingCard("Omega Card", "301233985945", 1030) );
      b.addCard( new IDCard("Mary Smith", "95-741208") );
     
      System.out.println(" Billfold cards: " + b);
      System.out.println("Expected: [ Card holder: John Doe, ID: 08-097654, "
         + "Expiration year: 2020 |"
         + " Card holder: Omega Card, Card number: 301233985945, Pin: 1030 |"
         + " Card holder: Mary Smith, ID: 95-741208 ]");
    
    } // end main method
    
} // end BillfoldTester class