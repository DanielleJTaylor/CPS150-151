import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

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
 * Assignment: 5
 *
 * Description:
 * 
 * Use a recursive approach to write a Maze object class.
 * 
 * The Maze escape method merely tests whether there is a path out of the maze,
 * that checks whether you can escape from the maze:
 * 
 * If you are at an exit, return true.
 * Recursively check whether you can escape from one of the empty neighboring locations without visiting the current location.
 *
 * Bug Report:
 *  Works well, no problems
 *
 */

public class Maze {

	//public static void main(String[] args) {
	// instance variables
    private char[][] maze;
    private boolean[][] visited;  
    private int width;
    private int height;
	
	 // Constructor
    public Maze(char[][] maze) {
        this.maze =  new char [maze.length][maze[0].length];
        this.width = maze.length;
        this.height = maze[0].length;
    }
    
    public boolean escape (int x, int y) {

    		boolean result;

    		result = isExit(x, y+1);

    		if (result) { return true;}

    		result =  isExit(x-1, y);

    		if (result) { return true;}

    		result =  isExit(x, y-1);

    		if (result) { return true;}

    		result =  isExit(x+1, y);

    		if (result) { return true;}

    		maze[x][y] = ' ';

    		return false;

    		}
    	 //  int[][] path = new int[height][width]; // to record the path

    	
    
    private boolean isExit (int x, int y) {
    	if (maze[x][y] == '*' || maze[x][y] == '#') {

    		return false;

    		}
    	maze[x][y] = '#';
    		return true;
    }
}
