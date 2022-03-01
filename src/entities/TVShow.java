package entities;

import java.util.Scanner;

public class TVShow extends InventoryItem {
	public int rating;
	public int year;
	public String name;
	
	public TVShow(Scanner s) {
		super(s);
	}
}
