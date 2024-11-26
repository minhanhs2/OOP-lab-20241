package src.hust.soict.test.disc;

import src.hust.soict.aims.disc.DigitalVideoDisc;

public class TestingPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle"); 
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD); 
		System.out.println("jungle dvd title: " + jungleDVD.getName());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getName());
	
			changeName (jungleDVD, cinderellaDVD.getName());
			System.out.println("jungle dvd name: " + jungleDVD.getName());
	
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	public static void changeName (DigitalVideoDisc dvd, String name) {
		String oldName = dvd.getName(); 
		dvd.setName(name); 
		dvd = new DigitalVideoDisc(oldName);
	}
}

