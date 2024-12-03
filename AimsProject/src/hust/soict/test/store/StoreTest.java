package src.hust.soict.test.store;

import java.util.ArrayList;
import java.util.List;
import src.hust.soict.aims.media.Book;
import src.hust.soict.aims.media.CompactDisc;
import src.hust.soict.aims.media.DigitalVideoDisc;
import src.hust.soict.aims.media.Media;
import src.hust.soict.aims.store.Store;
 
public class StoreTest {
 
   	public static Store createStore() {
          	// TODO Auto-generated method stub
          	Store store = new Store();
          	List<Media> media = new ArrayList<>();
          	
          	CompactDisc cd1 = new CompactDisc(1, "Greatest Hits", "Pop", 15.99f, "Sony Music", 60, "Michael Jackson");
          	CompactDisc cd2 = new CompactDisc(2, "Jazz Classics", "Jazz", 12.50f, "Blue Note", 70, "Miles Davis");
          	CompactDisc cd3 = new CompactDisc(3, "Rock Legends", "Rock", 14.99f, "Warner Bros", 80, "Queen");
          	CompactDisc cd4 = new CompactDisc(4, "Classical Essentials", "Classical", 19.99f, "Deutsche Grammophon", 100, "Beethoven");
          	CompactDisc cd5 = new CompactDisc(5, "Electronic Beats", "Electronic", 13.99f, "Universal", 50, "Daft Punk");
 
          	DigitalVideoDisc dvd1 = new DigitalVideoDisc(6, "The Avengers", "Action", 20.99f, "Marvel Studios", 50);
          	DigitalVideoDisc dvd2 = new DigitalVideoDisc(7, "Inception", "Science Fiction", 18.99f, "Warner Bros", 40);
          	DigitalVideoDisc dvd3 = new DigitalVideoDisc(8, "The Lion King", "Animation", 15.49f, "Disney", 70);
          	DigitalVideoDisc dvd4 = new DigitalVideoDisc(9, "The Godfather", "Drama", 19.99f, "Paramount Pictures", 60);
          	DigitalVideoDisc dvd5 = new DigitalVideoDisc(10, "The Conjuring", "Horror", 14.99f, "Warner Bros", 75);
 
          	Book book1 = new Book(11, "To Kill a Mockingbird", "Fiction", 10.99f);
          	Book book2 = new Book(12, "1984", "Dystopian", 8.99f);
          	Book book3 = new Book(13, "The Great Gatsby", "Classic", 12.99f);
          	Book book4 = new Book(14, "Sapiens", "History", 15.99f);
          	Book book5 = new Book(15, "The Catcher in the Rye", "Fiction", 9.99f);
 
          	
          	media.add(cd1);
          	media.add(cd2);
          	media.add(cd3);
          	media.add(cd4);
          	media.add(cd5);
          	media.add(dvd1);
          	media.add(dvd2);
          	media.add(dvd3);
          	media.add(dvd4);
          	media.add(dvd5);
          	media.add(book1);
          	media.add(book2);
          	media.add(book3);
          	media.add(book4);
          	media.add(book5);
          	
          	store.addMedia(cd1);
          	store.addMedia(cd2);
          	store.addMedia(cd3);
          	store.addMedia(cd4);
          	store.addMedia(cd5);
          	store.addMedia(dvd1);
          	store.addMedia(dvd2);
          	store.addMedia(dvd3);
          	store.addMedia(dvd4);
          	store.addMedia(dvd5);
          	store.addMedia(book1);
          	store.addMedia(book2);
          	store.addMedia(book3);
          	store.addMedia(book4);
          	store.addMedia(book5);
          	
          	return store;
   	}
 
}
