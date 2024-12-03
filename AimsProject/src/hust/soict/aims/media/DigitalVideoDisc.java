package src.hust.soict.aims.media;


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
       
       public void play() {
              System.out.println("Playing DVD: " + this.getTitle());
              System.out.println("DVD length: " + this.getLength());
       }
}





