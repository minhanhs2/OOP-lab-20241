package Lab02.Code;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        
        store.addDvd(dvd1);
        store.addDvd(dvd2);
        store.addDvd(dvd3);

        System.out.println("Store List");
        store.printStore();

        store.removeDvd(dvd3);

        System.out.println("Store List");
        store.printStore();

        store.removeDvd(dvd3);
    }
}