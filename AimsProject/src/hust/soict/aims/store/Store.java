package src.hust.soict.aims.store;

import java.util.ArrayList;
import src.hust.soict.aims.media.Media;
 
 
public class Store {
   	private ArrayList<Media> itemsInStore = new ArrayList<>();
   	
   	public void addMedia(Media media) {
          	if(!itemsInStore.contains(media)) {
                 	itemsInStore.add(media);
                 	System.out.println("Add successfully");
          	}
          	else System.out.println("Already have!!!");
   	}
   	
   	public void removeMedia(Media media) {
          	if(itemsInStore.contains(media)) {
                 	itemsInStore.remove(media);
                 	System.out.println("Remove successfully");
          	}
          	else System.out.println("Don't have!!!");
   	}
   	
   	public void printStore() {
          	System.out.println("******************************************");
          	for(Media media : itemsInStore) {
                 	media.print();
          	}
   	   	System.out.println("*********************************************");
   	}
   	
   	public Media searchMediaByTitle(String title) {
          	for(Media media : itemsInStore) {
                 	if(media.isMatch(title)) {
                       	return media;
                 	}
          	}
                 	return null;
   	}
}
