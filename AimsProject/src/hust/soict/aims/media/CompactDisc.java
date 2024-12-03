package src.hust.soict.aims.media;


import java.util.ArrayList;
import java.util.List;
 
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
   
    public void play() {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD artist: " + artist);
            System.out.println("CD length: " + this.getLength());
            for(Track track : tracks) {
                    track.play();
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





