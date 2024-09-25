import java.util.ArrayList;
import java.util.Scanner;

/*
 	SongPlayer.java
 	
 	Client class that plays Songs
 */

public class SongPlayer
{
	public static Scanner in = new Scanner( System.in );
	
	public static void main(String[] args)
	{
		ArrayList<Song> songs = new ArrayList<Song>();
		
		// add songs to the list
		addSongs(songs);
		
		// show songs in the list
		for (Song nextSong : songs) {
			nextSong.play();
		}
	} // end main
	
	public static void addSongs(ArrayList<Song> mySongs)
	{
		System.out.println("Let's add some songs (enter empty title to quit)");
		
		boolean done = false;
		
		do
		{
			// get song title as user input
			System.out.print("Enter the song title: ");
			String theTitle = in.nextLine();
			
			// when user enters empty title, end loop
			if (theTitle.isEmpty())
			{
				done = true;
			}
			else {
				// get song artist as user input
				System.out.println("Enter the song artist: ");
				String theArtist = in.nextLine();
				
				Song nextSong = new Song();
				
				nextSong.setTitle(theTitle);
				nextSong.setArtist(theArtist);
				
				mySongs.add(nextSong);
			}
		} while (!done);
	} // end addSongs

} // end class SongPlayer