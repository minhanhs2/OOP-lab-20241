package src.hust.soict.aims.media;

import java.util.Comparator;
 
public abstract class Media {
   	
   	private int id;
   	private String title;
   	private String category;
   	private float cost;
   	
   	public Media(int id, String title) {
          	// TODO Auto-generated constructor stub
          	this.id = id;
          	this.title = title;
   	}
   	
   	public Media(int id, String title, String category, float cost) {
          	// TODO Auto-generated constructor stub
          	this.id = id;
          	this.title = title;
          	this.category = category;
          	this.cost = cost;
   	}
   	
   	public Media(String title) {
          	this.title = title;
   	}
 
   	public int getId() {
          	return id;
   	}
 
   	public void setId(int id) {
          	this.id = id;
   	}
 
   	public String getTitle() {
          	return title;
   	}
 
   	public void setTitle(String title) {
          	this.title = title;
   	}
 
   	public String getCategory() {
          	return category;
   	}
 
   	public void setCategory(String category) {
          	this.category = category;
   	}
 
   	public float getCost() {
          	return cost;
   	}
 
   	public void setCost(float cost) {
          	this.cost = cost;
   	}
 
   	@Override
   	public String toString() {
          	return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
   	}
   	
   	public boolean isMatch(String title) {
          	return getTitle().toLowerCase().contains(title.toLowerCase());
   	}
 
   	public void print() {
   	
   	}
   	
   	@Override
	public boolean equals(Object o) {
		try {
	        if (this == o) return true;

	        if (o == null || getClass() != o.getClass()) return false;

	        Media media = (Media) o;
	        return this.title != null && this.title.equals(media.title);
	        
	    } catch (NullPointerException e) {
	        System.err.println("NullPointerException: Title của đối tượng hoặc đối tượng là null.");
	        return false;
	        
	    } catch (ClassCastException e) {
	        System.err.println("ClassCastException: Không thể ép kiểu đối tượng so sánh.");
	        return false;
	    }
	}
   	
   	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
   	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
   	
}
