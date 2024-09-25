import java.util.ArrayList;

public class Door {
	
	   private String name; //door name
	   private boolean state; // true for open, false for closed
	    
	  public void setName(String n)
	    {
	        name = n;
	    } // end name setter

	  public boolean isOpen()
	    {
	        return state;
	    } // end state getter

	  public void open()
	    {
	       state = true;
	    } // end open method

	  public void close()
	    {
	       state = false;
	    } // end close method
	  
	 // Display the doors and their states.
	 // Maybe it would be a good idea to add an output method to the Door class? Consider:
	  public void output()
	  {
	     System.out.print(name);
	     System.out.print(": ");
	     if (state)
	     {
	        System.out.println("open");
	     }
	     else
	     {
	        System.out.println("closed");
	     }
	  }
	  
	  public void SwitchMethod () {
	  
	  if (state == true) {
		  close();
	  }
	  
	  
	  else if(state == false) {
		  state = true;
		  open();
	  }
}

	public static void main(String[] args) {
// Declare/create an ArrayList doors with element type type Door.
ArrayList<Door> doors = new ArrayList<Door>();

//Add a new Door to the doors ArrayList as a new open Side door
Door door1 = new Door();
door1.setName("Side");
door1.open();
doors.add( door1 );
door1.output();
door1.SwitchMethod();
door1.output();

//Add a new Door to the doors array as a new closed Front door.
Door door2 = new Door();
door2.setName("Front");
door2.close();
doors.add( door2 );
door2.output();
door2.SwitchMethod();
door2.output();

//Add a new Door to the doors array as a new closed Back door.
Door door3 = new Door();
door3.setName("Back");
door3.close();
doors.add( door3 );
door3.output();
door3.SwitchMethod();
door3.output();

//check each door and closes if open or open if close then output door

	}//ends main
}//ends door class
