package src.hust.soict.aims.media;

import src.hust.soict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
       
       public DigitalVideoDisc(int id, String title) {
              super(id,title);
       }
       
       public DigitalVideoDisc(int id, String title, String category, float cost) {
              super(id, title, category, cost);
       }
       
       public DigitalVideoDisc(int id, String title, String category, float cost, String director,int length) {
              super(id, title, category, cost, director, length);
       }
       
       @Override
       public void print() {
              System.out.println("" + getId() + ". DVD - "
                                                 + getTitle() + " - " + getCategory() + " - "
                                                 + getDirector() + " - " + getLength() + " - " + getCost() + "$");
       }
       
	public String play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		
			return "Playing DVD: " + this.getTitle() + "\n" +
        	"DVD length: " + this.getLength() + "\n";
		} else {
			throw new PlayerException("ERROR: DVD length is non-positive.");
		}
	}
}





