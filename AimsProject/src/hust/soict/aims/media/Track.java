package src.hust.soict.aims.media;

public class Track implements Playable{
 
    private String title;
    private int length;
    
    public Track(String title, int length) {
           this.title = title;
           this.length = length;
    }
    
    public String getTitle() {
           return title;
    }
    public int getLength() {
           return length;
    }
    
public void play() {
    System.out.println("Playing track: " + title);
    System.out.println("Track length: " + length);
}

@Override
public boolean equals(Object obj) {
    Track track = (Track) obj;
           return track.getTitle().equals(this.getTitle()) && track.getLength() == this.getLength();
}
}

