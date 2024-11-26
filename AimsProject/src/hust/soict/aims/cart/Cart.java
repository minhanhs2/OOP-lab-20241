package src.hust.soict.aims.cart; 
import src.hust.soict.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    int Order;
    List<DigitalVideoDisc> listDVDInCart = new ArrayList<>();

    public void showbill() {
        if (listDVDInCart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("List of DVDs in cart:");
        for (DigitalVideoDisc dvd : listDVDInCart) {
            System.out.println(dvd.getName() + " - " + dvd.getprice());
        }
        System.out.println("Your bill: " + totalPrice());
    }

    public void remove(String dvdTitle) {
        for (int i = 0; i < listDVDInCart.size(); i++) {
        	DigitalVideoDisc dvd = listDVDInCart.get(i);
            if (dvd.getName().equals(dvdTitle)) {
                listDVDInCart.remove(i);
                Order--;
                System.out.println("Removed " + dvdTitle + " from cart.");
                return;
            }
        }
        System.out.println( dvdTitle + " not found in cart.");
    }

    public void addDVD(DigitalVideoDisc dvd) {
        listDVDInCart.add(dvd);
        Order++;
        System.out.println("Already added" + dvd.getName() + " to cart.");
    }
    public void addDVD(DigitalVideoDisc[] dvdList) {
    	if (dvdList == null) {
            return;
        }
        for (DigitalVideoDisc dvd : dvdList) {
            addDVD(dvd);
        }
    }
    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDVD(dvd1);
        addDVD(dvd2);
    }
    public double totalPrice() {
        double total = 0;
        for (DigitalVideoDisc dvd : listDVDInCart) {
            total += dvd.getprice();
        }
        return total;
    }

    public void bill() {
        if (listDVDInCart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("List of DVDs in cart:");
        for (DigitalVideoDisc dvd : listDVDInCart) {
            System.out.println(dvd.getName() + " - " + dvd.getprice());
        }
        System.out.println("Your bill: " + totalPrice());
    }

    public void searchDVD(String dvdTitle) {
        for (DigitalVideoDisc dvd : listDVDInCart) {
            if (dvd.getName().equals(dvdTitle)) {
                System.out.println("DVD's detail:");
                dvd.ShowDetail();
                return;
            }
        }
        System.out.println("DVD '" + dvdTitle + "' not found in cart.");
    }
    
    public void printCart() {
        if (listDVDInCart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < listDVDInCart.size(); i++) {
            DigitalVideoDisc dvd = listDVDInCart.get(i);
            System.out.println((i + 1) + ". " + dvd.toString()); 
        }
}

public DigitalVideoDisc searchByID(int id) {
    for (int i = 0; i < listDVDInCart.size(); i++) { 
        if (listDVDInCart.get(i).getId() == id) { 
            return listDVDInCart.get(i); 
        }
    }
    System.out.println("Not found DVD with ID: " + id); 
    return null; 
}

// Search by Title
public void searchByTitle(String title) {
    boolean found = false;
    for (int i = 0; i < listDVDInCart.size(); i++) { 
        if (listDVDInCart.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) { 
            System.out.println("Founded DVD with title: " + listDVDInCart.get(i).getTitle()); 
            found = true;
        }
    }
    if (!found) {
        System.out.println("Not found DVD with title: " + title);
    }
}
}