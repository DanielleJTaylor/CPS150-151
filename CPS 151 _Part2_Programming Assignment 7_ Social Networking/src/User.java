	import java.util.Set;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
	import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

	/*
	 *Maze.java
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
	 * Then, repeatedly:
Allow the user to enter a name.
 
If the name exists in the map, then output all usernames that are one link or two links away from the user entered.
	
	 *
	 */


class User {
    private String name;
    private Set<User> friends;

    private static Map<String, User> userMap = new HashMap<String, User>();
    
    
    public User(String name) {
        this.name = name;
        friends = new HashSet<User>();
    }
    
    public String getName() {
        return name;
    }
    
    public Set<User> getFriends() {
        return friends;
    }
    
    public void addFriend(User user) {
        friends.add(user);
    }
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User)obj;
            return name.equals(user.getName());
        }
        return false;
    }



    
    
    public static void readData(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String[] names = scanner.nextLine().split("\\s+");
                if (names.length == 2) {
                    User user1 = getUser(names[0]);
                    User user2 = getUser(names[1]);
                    user1.addFriend(user2);
                    user2.addFriend(user1);
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static User getUser(String name) {
        User user = userMap.get(name);
        if (user == null) {
            user = new User(name);
            userMap.put(name, user);
        }
        return user;
    }
    
    public static void showFriends(String name, int level) {
        User user = userMap.get(name);
        if (user != null) {
            System.out.println("Friends for " + name);
            showFriendsHelper(user, level);
        } else {
            System.out.println("Name not found.");
        }
    }
    
    private static void showFriendsHelper(User user, int level) {
        if (level <= 2) {
            for (User friend : user.getFriends()) {
                System.out.println(user.getName() + " is friends with " + friend.getName() + " (" + (level+1) + " links)");
                showFriendsHelper(friend, level+1);
            }
        }
    }
    
    public static void main(String[] args) {
    	
        HashMap<String, User> users = new HashMap<>();

        try {
            File file = new File("network.txt");
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(" ");

                String sourceName = parts[0];
                String friendName = parts[1];

                User source = users.getOrDefault(sourceName, new User(sourceName));
                User friend = users.getOrDefault(friendName, new User(friendName));

                source.addFriend(friend);
                users.put(sourceName, source);
                users.put(friendName, friend);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Print the social network
        for (User user : users.values()) {
            System.out.println(user.getName() + " is friends with:");
            for (User friend : user.getFriends()) {
                System.out.println("- " + friend.getName());
            }
        }
     
    	
    	
        readData("network.txt");
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.println(" ");
            System.out.println("Enter a username and all friends\n"
                             + "two links or less will be displayed.\n"
                             + "Press enter to exit.");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            showFriends(name, 0);
        }
        scanner.close();
    }
}