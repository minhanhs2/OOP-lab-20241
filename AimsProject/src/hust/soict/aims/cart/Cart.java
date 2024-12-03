package src.hust.soict.aims.cart;


import java.util.ArrayList;
import java.util.List;
import src.hust.soict.aims.media.Media;
 
public class Cart {
                private List<Media> itemsOrdered = new ArrayList<>();
               
                public void addMedia(Media media) {
                                if(!itemsOrdered.contains(media)) {
                                                itemsOrdered.add(media);
                                                System.out.println("Add successfully");
                                }
                                else System.out.println("Already have!!!");
                }
               
                public void removeMedia(Media media) {
                                if(itemsOrdered.contains(media)) {
                                                itemsOrdered.remove(media);
                                                System.out.println("Remove successfully");
                                }
                                else System.out.println("Don't have!!!");
                }
 
                public float totalCost() {
                                float total = 0;
                                for(Media media : itemsOrdered) {
                                                total += media.getCost();
                                }
                                return total;
                }
               
                public void printCart() {
                                System.out.println("***********************CART***********************");
                                System.out.println("Ordered Items:");
                                for(Media media : itemsOrdered) {
                                                media.print();
                                }
                                System.out.println("Total cost: " + totalCost());
                                System.out.println("***************************************************");
                }
               
                public void searchByTitle(String title) {
                                boolean found = false;
                                for(Media media : itemsOrdered) {
                                                if(media.isMatch(title)) {
                                                                found = true;
                                                                media.print();
                                                }
                                }
                                if(!found) System.out.println("Can't found!!!");
                }
               
                public void searchByID(int id) {
                                boolean found = false;
                                for(Media media : itemsOrdered) {
                                                if(media.getId() == id) {
                                                                found = true;
                                                                System.out.println(media.toString());
                                                }
                                }
                                if(!found) System.out.println("Can't found!!!");
                }
               
                public int getSize() {
                                return itemsOrdered.size();
                }
               
                public Media searchMediaByTitle(String title) {
                                for(Media media : itemsOrdered) {
                                                if(media.isMatch(title)) {
                                                                return media;
                                                }
                                }
                                                return null;
                                }
               
                public void emptyCart() {
                                if(itemsOrdered.isEmpty()) {
                                                System.out.println("The cart is already empty.");
                                } else {
                                                itemsOrdered.clear();
                                                System.out.println("The cart has been emptied");
                                }
                }
               
                public List<Media> filterById(int id){
                                List<Media> filteredMedia = new ArrayList<>();
                                for(Media media : itemsOrdered) {
                                                if(media.getId() == id) {
                                                                filteredMedia.add(media);
                                                }
                                }
                                return filteredMedia;
                }
               
                public List<Media> filterByTitle(String title){
                                List<Media> filteredMedia = new ArrayList<>();
                                for(Media media : itemsOrdered) {
                                                if(media.isMatch(title)) {
                                                                filteredMedia.add(media);
                                                }
                                }
                                return filteredMedia;
                }
               
                public List<Media> getItemsInCart(){
                                return itemsOrdered;
                }
}





