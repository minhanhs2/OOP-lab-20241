package src.hust.soict.aims;

import src.hust.soict.aims.cart.Cart;
import src.hust.soict.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalPrice());

        System.out.println("List before remove:");
        anOrder.showbill();
        anOrder.remove("Star Wars");
        System.out.println("\nList after remove:");
        anOrder.showbill(); 
    }
}