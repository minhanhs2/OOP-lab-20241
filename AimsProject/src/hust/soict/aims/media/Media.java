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
          	Media media = (Media) o;
          	try {
                 	String title = media.getTitle();
                 	return title.equals(this.getTitle());
          	} catch (NullPointerException e) {
                 	return false;
          	}
   	}
   	
   	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
   	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
   	
}
