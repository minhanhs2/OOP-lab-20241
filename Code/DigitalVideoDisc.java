package Lab02.Code; 

import java.util.List;

public class DigitalVideoDisc {
    String name;
    String description;
    double price;
    int inStock;
    int review;
    String genre;
    int releaseDate;
    String category;
    String author;


    public DigitalVideoDisc(String name, String genre, String author, int releaseDate, double price) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public DigitalVideoDisc(String name, String description, double price, int inStock, int rating, String genre, int releaseDate, int review) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
        this.review = review;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public DigitalVideoDisc(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public DigitalVideoDisc(String name, String genre, double price) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public DigitalVideoDisc(String name, String genre, int releaseDate) {
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getdescription() {
        return description;
    }
    
    public double getprice() {
        return price;
    }

    public int getinStock() {
        return inStock;
    }

    public void ShowDetail() {
        System.out.println("DVD's detail:");
        System.out.println("Title: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Quantity in stock: " + inStock);
        System.out.println("Review of buyer: " + review);
        System.out.println("Genre: " + genre);
        System.out.println("Release year: " + releaseDate);
    }

    public void updateQuantity(int quantity) {
        inStock += quantity;
        System.out.println(name + "in stock:" + inStock);
    }

    public void checkInStock() {
        if (inStock > 0) {
            System.out.println("This DVD is available.");
        } else {
            System.out.println("This DVD is out of stock.");
        }
    }


}