package src.hust.soict.test.cart;

import src.hust.soict.aims.cart.Cart;
import src.hust.soict.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker, Ron Clements", 90, 18.99f); 
        cart.addDVD(dvd3);

        cart.printCart();
    
    DigitalVideoDisc searchByID = cart.searchByID(1); // Starwar ID
        if (searchByID != null) {
            System.out.println("Founded DVD with ID: " + searchByID.getName());
        }

        // Search with Title
        cart.searchByTitle("Lion");
    }
}