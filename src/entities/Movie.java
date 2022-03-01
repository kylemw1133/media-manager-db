package entities;

import java.util.Scanner;

public class Movie extends InventoryItem {
	public String name;
	public int length;
	public int year;
	public int contentRating;
	
	public Movie(Scanner s) {
		super(s);
	}
}
