package src.hust.soict.test.cart;

import java.util.ArrayList;
import java.util.List;
 
import src.hust.soict.aims.media.Book;
import src.hust.soict.aims.media.CompactDisc;
import src.hust.soict.aims.media.DigitalVideoDisc;
import src.hust.soict.aims.media.Media;
 
public class CartTest {
 
   	public static void main(String[] args) {
          	List<Media> media = new ArrayList<>();
 
          	CompactDisc cd = new CompactDisc(1, "CD1", "Animation", 13.05f, "HA", 70, "Lucas");
          	DigitalVideoDisc dvd = new DigitalVideoDisc(2, "DVD1", "Fiction", 15.45f, "HA", 100);
          	Book book = new Book(3, "Book1", "Romantic", 25.52f);
          	
          	media.add(cd);
          	media.add(dvd);
          	media.add(book);
          	
          	for(Media m : media) {
                 	System.out.println(m.toString());
          	}
   	}
 
}
