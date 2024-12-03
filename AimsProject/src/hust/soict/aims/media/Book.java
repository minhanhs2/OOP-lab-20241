package src.hust.soict.aims.media;
 
import java.util.ArrayList;
import java.util.List;
 
public class Book extends Media{
   
    private List<String> authors = new ArrayList<String>();
   
    public Book(int id, String title, String category, float cost) {
            super(id, title, category, cost);
    }
 
    public List<String> getAuthors() {
            return authors;
    }
    public void setAuthors(List<String> authors) {
            this.authors = authors;
    }
   
    public void addAuthor(String authorName) {
            if(!authors.contains(authorName)) {
                    authors.add(authorName);
                    System.out.println("Author has been added");
            }
            else System.out.println("Have this author!!!");
    }
 
    public void removeAuthor(String authorName) {
            if(authors.contains(authorName)) {
                    authors.remove(authorName);
                    System.out.println("Author has been removed");
            }
            else System.out.println("Don't have this author!!!");
    }
   
    @Override
    public void print() {
            System.out.println("" + getId() + ". Book - "
                                                + getTitle() + " - " + getCategory() + " - ");
            for(String author : authors) {
                    System.out.println(author + " - ");
            }
            System.out.println(getCost() + "$");
    }
}







