import java.io.*;
import java.util.Scanner;
/*
 *MazeTester.java
 * Danielle Taylor, taylord24
 */


/*
 * MazeTester.java
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

public class MazeTester {
	private static char[][] maze;
	private static int width, height;

	private static final Scanner KBD = new Scanner(System.in);
	private static final PrintStream OUT = System.out;

	/*
	 * program for testing the Maze class:
	 *   1. get maze file name, width and height from user
	 *   2. make the maze 2-D char array
	 *   3. read the maze from the file
	 *   4. create a Maze object with the maze
	 *   5. get the start point from the user
	 *   6. solve the maze (if possible), tell user what happened
	 */
	public static void main(String[] args) {
		final int ERROR = 1;
		String fName = null;
		int r = 0, c = 0; // maze coordinates for entrance

		try {
			// get maze file name from user
			// abort the program if any input is not valid
			OUT.print("File name? ");
			fName = getString("\tInvalid file name, bye!");
		} catch (IOException e) {
			OUT.println(e.getMessage());
			System.exit(ERROR);
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

			// get the start point from the user
			// abort the program if any input is not valid
			OUT.print("OK, maze is loaded ... where is the entrance (row# col#)? ");
			r = getCoordinate(width, "\tInvalid row coordinate, bye!");
			c = getCoordinate(height, "\tInvalid column coordinate, bye!");

			// solve the maze (if possible), tell user what happened
			if (solver.escape(r - 1, c - 1)) {
				OUT.println("Yay, I made it through the maze!!!");
				OUT.println(maze);
			} else {
				OUT.println("Help, there's no way out!!!");
			} // end if ... else
		} catch (IOException e) {
			OUT.println(e.getMessage());
			System.exit(1);
		} // end try...catch
	} // end main

	/*
	 * gets a String from the user and validates it
	 *   as a non-null, non-empty String before returning it
	 * throws an IOException with the given error String
	 *   if invalid input
	 */
	private static String getString(String error) throws IOException {
		String result = KBD.nextLine();
		if (result == null || result.length() == 0) {
			throw new IOException(error);
		}
		return result;
	} // end getString

	/*
	 * gets a dimension from the user and validates it
	 *   as a positive integer before returning it
	 * throws an IOException with the given error String
	 *   if invalid input
	 */
	private static int getDimension(String error) throws IOException {
		int result = 0;
		if (KBD.hasNextInt()) {
			result = KBD.nextInt();
			if (result <= 0) {
				throw new IOException(error);
			}
		} else {
			throw new IOException(error);
		}
		return result;
	} // getDimension

	/*
	 * gets a coordinate from the user and validates it
	 *   as a positive integer that is at most the given
	 *   dimension before returning it
	 * throws an IOException with the given error String
	 *   if invalid input
	 */
	private static int getCoordinate(int dimension, String error) throws IOException {
		int result = 0;
		if (KBD.hasNextInt()) {
			result = KBD.nextInt();
			if (result < 1 || result > dimension) {
				throw new IOException(error);
			}
		} else {
			throw new IOException(error);
		}
		return result;
	} // getCoordinate

	/*
	 * loads the maze using the given Scanner to the input file
	 */
	private static void readMaze(Scanner reader) throws IOException {
		int rowIndex = 0;

		while (reader.hasNextLine() && rowIndex < height) {
			String nextLine = reader.nextLine();
			if (nextLine.length() == width) {
				for (int colIndex = 0; colIndex < width; colIndex++) {
					maze[rowIndex][colIndex] = nextLine.charAt(colIndex);
				}
			}
			rowIndex++;
		}
	} // end readMaze

	/*
	 * Used for developing tester; left it in here in case
	 *  you want to output your maze once it's loaded
	 */
	private static void showMaze() {
		for (int row = 0; row < maze.length; row++) {
			for (int col = 0; col < maze[row].length; col++) {
				OUT.print(maze[row][col]);
			} // end inner for
			OUT.println();
		} // end outer for
	} // end showMaze

} // end class MazeTester
