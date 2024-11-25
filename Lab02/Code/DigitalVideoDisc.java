package Lab02.Code; 

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0; 
	private int id;
	private String name; // = title
	private int length; // = length
	private double price; // = cost
	private String genre; // = category
	private String author; // = director



    public DigitalVideoDisc(String name, String genre, String author, int length, double price) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.price = price;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String name, int price) {
        this.name = name;
        this.price = price;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String name) {
        this.name = name;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String name, String genre, double price) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String name, String genre) {
        this.name = name;
        this.genre = genre;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getName() {
        return name;
    }
    public double getprice() {
        return price;
    }
    public void ShowDetail() {
        System.out.println("DVD's detail:");
        System.out.println("Title: " + name);
        System.out.println("Cost: " + price);
        System.out.println("Category: " + genre);
        System.out.println("Director: " + author);
        System.out.println("Length: " + length);
    }

    //public void updateQuantity(int quantity) {
    //    inStock += quantity;
    //    System.out.println(name + "in stock:" + inStock);
    //}

    //public void checkInStock() {
    //    if (inStock > 0) {
    //        System.out.println("This DVD is available.");
    //    } else {
    //        System.out.println("This DVD is out of stock.");
    //    }
    //}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name = name2;
	}
}