package Lab02.Code;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> DVDInStore;

    public Store() {
        DVDInStore = new ArrayList<>();
    }

    public void addDvd(DigitalVideoDisc dvd) {
        DVDInStore.add(dvd);
        System.out.println("Added DVD to store: " + dvd.getTitle());
    }

    public void removeDvd(DigitalVideoDisc dvd) {
        if (DVDInStore.remove(dvd)) {
            System.out.println("Removed DVD from store: " + dvd.getTitle());
        } else {
            System.out.println("Not Found DVD " + dvd.getTitle() + " in store");
        }
    }

    public void printStore() {
        System.out.println("********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < DVDInStore.size(); i++) {
            DigitalVideoDisc dvd = DVDInStore.get(i);
            System.out.println((i + 1) + ". DVD - " + dvd.getTitle() + " - "
                    + dvd.getCategory() + " - " + dvd.getDirector()
                    + " - " + dvd.getLength() + ": " + dvd.getCost() + " $");
        }
        System.out.println("***********************************************");
    }
}
