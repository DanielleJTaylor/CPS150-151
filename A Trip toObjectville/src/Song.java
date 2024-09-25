/*
 * object class that represents a song used by the music player
 * 
 * /*
	 * -Object, class name-
	 * Song
	 * 
	 * -Instance Variables-
	 * title: String
	 * artist: String
	 * 
	 * -Member methods-
	 *  setTitle(String)
	 *  setArtist(String)
	 *  play()
	 * 
	 * 
	 */

public class Song {

	String title = "";
	String artist= "";
	
	public void setTitle(String theTitle) {
	
		title = theTitle;
	}//end setTitle
	
	public void setArtist(String theArtist) {
		artist = theArtist;
	}//end setArtist

	public void play() {
		System.out.println("Playing the song" + title + artist);
	}//end play
	
	
	
}//end class Song
