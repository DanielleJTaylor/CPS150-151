/*
    CountOccurrenceOfWords.java
    program counts the occurrences of words in a text and
        displays the words and their occurrences in
        alphabetical order of the words
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class CountOccurrenceOfWords
{
  public static void main(String[] args)
  {
    // Set text in a string
    String text = " ";
  
   
    private static final Scanner KBD = new Scanner(System.in);

    
    try {
        // get maze file name from user
        // abort the program if any input is not valid
        System.out.println("File name? ");
    } catch (IOException e) {
    	System.out.println(e.getMessage());
    }
    
    try (Scanner fileReader = new Scanner(new File(fName))) {
    	// get maze file name, width and height from user
        OUT.print("Maze width? ");
        width = getDimension("\tInvalid width, bye!");
        OUT.print("Maze height? ");
        height = getDimension("\tInvalid height, bye!");
        
        // make the maze 2-D char array
        maze = new char[height][width];
        
    	// read the maze from the file
    	readMaze(fileReader);
    	// showMaze();
    	
    	// create a Maze object with the maze
    	Maze solver = new Maze(maze);
    // Create a TreeMap to hold words as key and count as value
    Map<String, Integer> map = new TreeMap<>();

    // extracts words from text, using a whitespace \s or
    //  punctuation \p{P} as a delimiter
    String[] words = text.split("[\\s+\\p{P}]");
    
    // loop over the words String array
    for (int i = 0; i < words.length; i++)
    {
     // get next word in all lowercase characters
     String word = words[i].toLowerCase();
      
      if (word.length() > 0) // word is not empty string
      {
        if (!map.containsKey(word)) // word is not yet key in map
        {
          map.put(word, 1); // add word with count of 1
        }
        else
        {
          int count = map.get(word); // get current count for word
          count++;                   // increment count by 1
          map.put(word, count);      // put word back in map with new count
        }
      }
    } // end for loop

    // Display each word in the map and count for that word
    for (String word : map.keySet())
    {
        int count = map.get(word);
        System.out.println(word + "\t" + count);
    }
  } // end main
} // end CountOccurrenceOfWords
