package src.hust.soict.aims;


 
import java.util.Collections;
import java.util.List; 
import java.util.Scanner;
import src.hust.soict.aims.cart.Cart;
import src.hust.soict.aims.media.Book;
import src.hust.soict.aims.media.CompactDisc;
import src.hust.soict.aims.media.DigitalVideoDisc;
import src.hust.soict.aims.media.Media;
import src.hust.soict.aims.media.Playable;
import src.hust.soict.aims.store.Store;
import src.hust.soict.test.store.StoreTest;
 
public class Aims {
 
                public static void showMenu() {
                    System.out.println("AIMS: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. View store");
                    System.out.println("2. Update store");
                    System.out.println("3. See current cart");
                    System.out.println("0. Exit");
                    System.out.println("--------------------------------");
                    System.out.println("Please choose a number: 0-1-2-3");
                }
 
                public static void storeMenu(Scanner scanner) {
                    int storeChoice;
                    do {
                        System.out.println("Options: ");
                        System.out.println("--------------------------------");
                        System.out.println("1. See details of media");
                        System.out.println("2. Add a media to cart");
                        System.out.println("3. Play a media");
                        System.out.println("4. See current cart");
                        System.out.println("0. Back");
                        System.out.println("--------------------------------");
                        System.out.println("Please choose a number: 0-1-2-3-4");
 
                        storeChoice = scanner.nextInt();
                        scanner.nextLine();
 
                        switch (storeChoice) {
                            case 1:
                                System.out.println("Enter the title of the media:");
                                String title = scanner.nextLine();
 
                                Media foundMedia = store.searchMediaByTitle(title);
                                if (foundMedia != null) {
                                            foundMedia.print();
                                    int mediaChoice;
                                    do {
                                        mediaDetailsMenu();
                                        mediaChoice = scanner.nextInt();
                                        scanner.nextLine();
 
                                        switch (mediaChoice) {
                                            case 1:
                                                cart.addMedia(foundMedia);
                                                System.out.println("Media added to cart successfully.");
                                                break;
 
                                            case 2:
                                                if (foundMedia instanceof Playable) {
                                                    ((Playable)foundMedia).play();
                                                } else {
                                                    System.out.println("This media cannot be played.");
                                                }
                                                break;
 
                                            case 0:
                                                System.out.println("Returning to store menu...");
                                                break;
 
                                            default:
                                                System.out.println("Invalid choice! Please choose again.");
                                        }
                                    } while (mediaChoice != 0);
                                } else {
                                    System.out.println("Media not found.");
                                }
                                break;
 
                            case 2: // Add a media to cart
                                System.out.println("Enter the title of the media to add:");
                                String mediaTitle = scanner.nextLine();
                                Media mediaToAdd = store.searchMediaByTitle(mediaTitle);
                                if (mediaToAdd != null) {
                                    cart.addMedia(mediaToAdd);
                                    System.out.println("Media added to cart successfully.");
                                    System.out.println("Current cart size: " + cart.getSize());
                                } else {
                                    System.out.println("Media not found!!!");
                                }
                                break;
 
                            case 3: // Play a media
                                System.out.println("Enter the title of the media:");
                                String playTitle = scanner.nextLine();
                                Media mediaToPlay = store.searchMediaByTitle(playTitle);
                                if (mediaToPlay instanceof Playable) {
                                    ((Playable)mediaToPlay).play();
                                } else {
                                    System.out.println("This media cannot be played.");
                                }
                                break;
 
                            case 4: // See current cart
                                cart.printCart();
                                break;
 
                            case 0: // Back
                                System.out.println("Returning to main menu...");
                                break;
 
                            default:
                                System.out.println("Invalid choice! Please choose again.");
                        }
                    } while (storeChoice != 0);
                }
 
               
 
                public static void mediaDetailsMenu() {
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Add to cart");
                    System.out.println("2. Play");
                    System.out.println("0. Back");
                    System.out.println("--------------------------------");
                    System.out.println("Please choose a number: 0-1-2");
                }
               
                public static void updateStoreMenu(Scanner scanner) {
                                int updateChoice;
                               
                                do {
                                                System.out.println("Update Store Options: ");
                                                System.out.println("--------------------------------");
                                                System.out.println("1. Add a media to the store");
                                                System.out.println("2. Remove a media from the store");
                                                System.out.println("0. Back");
                                                System.out.println("--------------------------------");
                                                System.out.println("Please choose a number: 0-1-2");
                                                   
                                                updateChoice = scanner.nextInt();
                                                scanner.nextLine();
                                               
                                                switch (updateChoice) {
            case 1:
               System.out.println("Enter the type of media (Book/CD/DVD): ");
                String type = scanner.nextLine().toLowerCase();
 
                System.out.println("Enter the ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
 
                System.out.println("Enter the title: ");
                String title = scanner.nextLine();
 
                System.out.println("Enter the category: ");
                String category = scanner.nextLine();
 
                System.out.println("Enter the cost: ");
                float cost = scanner.nextFloat();
                scanner.nextLine(); // Clear buffer
 
                if (type.equals("book")) {
                    store.addMedia(new Book(id, title, category, cost));
                } else if (type.equals("cd")) {
                    System.out.println("Enter the artist: ");
                    String artist = scanner.nextLine();
 
                    System.out.println("Enter the length: ");
                    int length = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
 
                    System.out.println("Enter the director: ");
                    String director = scanner.nextLine();
 
                    store.addMedia(new CompactDisc(id, title, category, cost, director, length, artist));
                } else if (type.equals("dvd")) {
                    System.out.println("Enter the length: ");
                    int length = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
 
                    System.out.println("Enter the director: ");
                    String director = scanner.nextLine();
 
                    store.addMedia(new DigitalVideoDisc(id, title, category, cost, director, length));
                } else {
                    System.out.println("Invalid media type!");
                }
                break;
           
            case 2:
               System.out.println("Enter the title of the media to remove: ");
                String removeTitle = scanner.nextLine();
                Media mediaToRemove = store.searchMediaByTitle(removeTitle);
 
                if (mediaToRemove != null) {
                    store.removeMedia(mediaToRemove);
                } else {
                    System.out.println("Media not found!!!");
                }
                break;
               
            case 0: // Back
                System.out.println("Returning to main menu...");
                break;
 
            default:
                System.out.println("Invalid choice! Please choose again.");
        }
                                } while (updateChoice != 0);
                }
 
               
                public static void cartMenu(Scanner scanner) {
                                int cartChoice;
                               
                                do {
                                                System.out.println("Options: ");
                                    System.out.println("--------------------------------");
                                    System.out.println("1. Filter medias in cart");
                                    System.out.println("2. Sort medias in cart");
                                    System.out.println("3. Remove media from cart");
                                    System.out.println("4. Play a media");
                                    System.out.println("5. Place order");
                                    System.out.println("0. Back");
                                    System.out.println("--------------------------------");
                                    System.out.println("Please choose a number: 0-1-2-3-4-5");
                                   
                                    cartChoice = scanner.nextInt();
                                    scanner.nextLine();
                                   
                                    switch(cartChoice) {
                                    case 1: // Filter medias in cart
                                        System.out.println("Choose an option to filter by: ");
                                        System.out.println("1. Filter by ID");
                                        System.out.println("2. Filter by Title");
                                       
                                        int filterChoice = scanner.nextInt();
                                        scanner.nextLine();  // Clear buffer
 
                                        if (filterChoice == 1) {
                                            System.out.println("Enter the ID to filter by: ");
                                            int id = scanner.nextInt();
                                            List<Media> result = cart.filterById(id);  // Lọc theo ID
                                            if (result.isEmpty()) {
                                                System.out.println("No media found with ID " + id);
                                            } else {
                                                System.out.println("Filtered media by ID " + id + ": ");
                                                for (Media media : result) {
                                                    media.print();  // In ra thông tin của media
                                                }
                                            }
                                        } else if (filterChoice == 2) {
                                            System.out.println("Enter the title to filter by: ");
                                            String title = scanner.nextLine();
                                            List<Media> result = cart.filterByTitle(title);  // Lọc theo title
                                            if (result.isEmpty()) {
                                                System.out.println("No media found with title containing " + title );
                                            } else {
                                                System.out.println("Filtered media by title containing " + title + ": ");
                                                for (Media media : result) {
                                                    media.print();  // In ra thông tin của media
                                                }
                                            }
                                        } else {
                                            System.out.println("Invalid choice! Please choose again.");
                                        }
                                        break;
 
                                                case 2:
                                                                System.out.println("Choose an option to sort: ");
                                                        System.out.println("1. Sort by Title");
                                                        System.out.println("2. Sort by Cost");
                                                        int sortChoice = scanner.nextInt();
                                                        scanner.nextLine();  // Clear buffer
                                                               
                                                        if(sortChoice == 1) {
                                                            Collections.sort(cart.getItemsInCart(), Media.COMPARE_BY_TITLE_COST);
                                                        } else if(sortChoice == 2) {
                                                            Collections.sort(cart.getItemsInCart(), Media.COMPARE_BY_COST_TITLE);
                                                        } else {
                                                            System.out.println("Invalid choice! Please choose again.");
                                                        }
                                                       
                                                        cart.printCart();
                                                        break;
                                                case 3:
                                                                System.out.println("Enter the title of the media to remove: ");
                                String removeTitle = scanner.nextLine();
                                Media mediaToRemove = cart.searchMediaByTitle(removeTitle);
 
                                if (mediaToRemove != null) {
                                    cart.removeMedia(mediaToRemove);
                                } else {
                                    System.out.println("Media not found!!!");
                                }
                                break;
                                                case 4:
                                                                System.out.println("Enter the title of the media:");
                                String playTitle = scanner.nextLine();
                                Media mediaToPlay = cart.searchMediaByTitle(playTitle);
                                if (mediaToPlay instanceof Playable) {
                                    ((Playable)mediaToPlay).play();
                                } else {
                                    System.out.println("This media cannot be played.");
                                }
                                break;
                                                               
                                                               
                                                case 5:
                                                                System.out.println("Order has been placed successfully!");
                                                                cart.emptyCart();
                                                                break;
                                                               
                                                case 0:
                                                                System.out.println("Returning to main menu...");
                                                                break;
                                                               
                                                default:
                                                                System.out.println("Invalid choice! Please choose again.");
                                    }
                                } while(cartChoice != 0);
                }
 
                public static Store store = StoreTest.createStore();
    public static Cart cart = new Cart();
   
                public static void main(String[] args) {
                                Scanner scanner = new Scanner(System.in);
                                int choice;
                               
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                            store.printStore();
                    storeMenu(scanner);
                    break;
                case 2:
                    updateStoreMenu(scanner);
                    break;
                case 3:
                    cartMenu(scanner);
                    break;
                case 0:
                    System.out.println("Exiting AIMS...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 0);
    }
               
}



