	import java.util.Set;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
	import java.io.File;
import java.io.IOException;

	/*
	 *User.java
	 * Danielle Taylor, taylord24
	 */


	/*
	 * Maze.java
	 * Danielle Taylor, taylord24
	 */

	/*
	 *
	 * Name: Danielle Taylor
	 * User Name: taylord24
	 * Assignment: 7
	 *
	 * Description:
	 * 
	Create a User class that has an instance variable to store the user’s name and another instance variable that is of type HashSet<User> for the collection of friends.  
	The friends Set<User> variable should contain references to the User objects that the current user links to. 
	For example, for the user iba there would be three entries for java_guru, crisha, and ducky. 
	 The User class should also include:

A constructor with a parameter for the name; the constructor also creates the new empty friends HashSet
A getter method for the name
A method for adding friends (Users) to the friends HashSet
A method for returning the friends HashSet
	 *
	 */

public class User {



	private String name = " ";
	private HashSet<User> friends;
	 
	
    public User(String name) {
        this.name = name;
        friends = new HashSet<User>();
    }

    
	 public static void main(String[] args) throws IOException {
		
		 Map<String, User> map = new HashMap<>();
		 List<String> strings = new ArrayList<>();
		 
		 
		 try {
			 File file = new File("network.txt");
			 Scanner input = new Scanner(file);
			 
			 while (input.hasNextLine()) {
				    // Convert the word to lower case, trim it and insert into the set
				    // In this step, you will probably want to remove punctuation marks
				 
				
			  		String line = input.nextLine();
		            String line_array[] = line.split(" ");
		            
		            String sourceName = line_array[0];
	                String friendName = line_array[1];
	                
	                User source = map.getOrDefault(sourceName, new User(sourceName));
	                User friend = map.getOrDefault(friendName, new User(friendName));

	                source.addFriends(friendName);
	                map.put(sourceName, source);
	                map.put(friendName, friend);

		    }
			 
			   // Print the social network
		        for (User user : map.values()) {
		            System.out.println(user.getName() + " is friends with:");
		            for (User friend : user.getFriends()) {
		                System.out.println("- " + friend.getName());
		            }
		        }
			 	
		  }
		  
		 
	 
		  
		 catch (IOException e){
		        	System.out.println(e.getMessage());
		        } // end try...catch
		 

	        
		 }// end main
		 
		
	
	
    public String getName() {
        return name;
    }

    
    public void addFriends(String friend) {
        friends.add(new User(friend));
    }
    
    public HashSet<User> getFriends() {
   return friends;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        return this.name.equals(u.getName());
    }
    


    
}
