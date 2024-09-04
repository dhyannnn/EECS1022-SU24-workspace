package lab6;

///////////////////////////////////////////////////////////////////////////
//Full Name : Dhyan Thakkar
//Yorku Email : dhyannnn@my.yorku.ca
//Date : August 8, 2024
//Authenticity Declaration:
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider. This submitted
//piece of work is entirely of my own creation.
///////////////////////////////////////////////////////////////////////////

// You are NOT allowed to add any "import" statement other than 
// the ones already in the starter files. 
import java.util.*;

public class SongCollection {
	
	
	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	
	private String listName;
	private List<Song> listofSongs;
	
	public SongCollection(String listName) {
		this.listName = listName;
		this.listofSongs = new ArrayList<>();
	}
	
	public SongCollection(SongCollection anotherCollection) {
		this.listName = anotherCollection.listName;
		this.listofSongs = new ArrayList<>(anotherCollection.listofSongs);
	}
	
	public String getListName() {
		return listName;
	}
	
	public void setListName(String listName) {
		this.listName = listName;
	}
	
	public List<Song> getListofSongs() {
		return listofSongs;
	}
	
	public void addSongs(List<Song> songs) {
		listofSongs.addAll(songs);
	}
	
	public void removeSong(Song song) {
		listofSongs.remove(song);
	}
	
	public boolean contains(Song song) {
		return listofSongs.contains(song);
	}
	
	public boolean inSongCollection(String artist) {
		for (Song song : listofSongs) {
			if (song.getSongArtist().equals(artist)) {
				return true;
			}
		}
		
		return false;
	}
	
	public List<Song> getSongsforArtist(String artist) {
		List<Song> artistSongs = new ArrayList<>();
		for (Song song : listofSongs) {
			if (song.getSongArtist().equals(artist)) {
				artistSongs.add(song);
			}
		}
		
		return artistSongs;
	}
	
	public String totalListeningTime() {
		int totalSeconds = 0;
		for (Song song : listofSongs) {
			totalSeconds += song.getSongLength();
		}
		
		int hrs = totalSeconds / 3600;
		int mins = (totalSeconds % 3600) / 60;
		int secs = totalSeconds % 60;
		
		return String.format("Total Listening Time: %d:%02d:%02d", hrs, mins, secs);
	}
	


}
//////////////////////////////////////////
/**
 * The class defines a simple structure called Song,
 * capable of storing the following information about a single song:
 * <p> artist</p>
 * <p> title</p>
 * <p> album</p>
 * <p>price</p>
 * <p>release year</p>
 * <p>length of the song in seconds </p>
 * 
 *
 */
class Song {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String songArtist;
	private String songTitle;
	private String songAlbum;
	private double songPrice;
	private int songYear;
	private int songLength; // Length in seconds

	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public Song(String songTitle, String songArtist, String songAlbum,
			int songYear, int songLength, double songPrice) {

		this.songArtist = songArtist;
		this.songTitle = songTitle;
		this.songAlbum = songAlbum;
		this.songPrice = songPrice; 
		this.songYear = songYear;
		this.songLength = songLength; // length in seconds
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public String getSongArtist() {
		return songArtist;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public String getSongTitle() {
		return songTitle;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public String getSongAlbum() {
		return songAlbum;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongAlbum(String songAlbum) {
		this.songAlbum = songAlbum;
	}

	public double getSongPrice() {
		return songPrice;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongPrice(double songPrice) {
		this.songPrice = songPrice;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public int getSongYear() {
		return songYear;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongYear(int songYear) {
		this.songYear = songYear;
	}

	public int getSongLength() {
		return songLength;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongLength(int songLength) {
		this.songLength = songLength;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	@Override
	public String toString() {
		return String.format("Song|%-20s|%-15s|%-20s|%6s|%d:%02d|%6.2f", this.songTitle, this.songArtist,
				this.songAlbum, this.songYear > 0 ? String.format("%d", this.songYear) : "", this.songLength / 60,
				this.songLength % 60, this.songPrice);
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	@Override
	public int hashCode() {
		return Objects.hash(songAlbum, songArtist, songLength, songPrice, songTitle, songYear);
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(songAlbum, other.songAlbum) && Objects.equals(songArtist, other.songArtist)
				&& songLength == other.songLength
				&& Double.doubleToLongBits(songPrice) == Double.doubleToLongBits(other.songPrice)
				&& Objects.equals(songTitle, other.songTitle) && songYear == other.songYear;
	}

	
	
}
