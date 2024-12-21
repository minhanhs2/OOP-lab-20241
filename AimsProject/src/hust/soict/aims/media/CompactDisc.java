package src.hust.soict.aims.media;


import java.util.ArrayList;
import java.util.List;

import src.hust.soict.aims.exception.PlayerException;
 
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();
   
    public String getArtist() {
            return artist;
    }
   
    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist) {
            super(id, title, category, cost, director, length);
            this.artist = artist;
    }
   
    public void addTrack(Track track) {
            if(!tracks.contains(track)) {
                    tracks.add(track);
                    System.out.println("Track has been added");
            }
            else System.out.println("Have this track!!!");
    }
   
    public void removeTrack(Track track) {
            if(tracks.contains(track)) {
                    tracks.remove(track);
                    System.out.println("Track has been removed");
            }
            else System.out.println("Don't have this track!!!");
    }
 
    @Override
    public int getLength() {
            int length = 0;
            for(Track track : tracks) {
                    length += track.getLength();
            }
            return length;
    }
   
    public String play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing CD: " + this.getTitle()); // thông tin về CD
			System.out.println("CD artist: " + this.getArtist());
			System.out.println("CD length: " + this.getLength());
			for (Track track : tracks) {
				try {
					track.play(); // play từng track trong CD
				} catch (PlayerException e) {
					throw e;
				}
			}
			
			StringBuilder output = new StringBuilder();
	        output.append("Playing CD: ").append(this.getTitle()).append("\n");
	        output.append("CD artist: ").append(this.getArtist()).append("\n");
	        output.append("CD length: ").append(this.getLength()).append("\n");
	        for (Track track : tracks) {
	            output.append(track.play());
	        }
	        return output.toString();
        } else {
        	throw new PlayerException("ERROR: CD length is non-positive.");
        }
	}
   
    @Override
    public void print() {
            System.out.println("" + getId() + ". CD - "
                                                + getTitle() + " - " + getCategory() + " - "
                                                + getDirector() +" - " + artist +
                                                " - " + getLength() + " - " + getCost() + "$");
    }
}





