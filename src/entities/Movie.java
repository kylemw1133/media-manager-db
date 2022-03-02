package entities;

import java.util.Scanner;

public class Movie extends InventoryItem {
	public int length;
	public int year;
	public int contentRating;
	
	public Movie(int len, int yr, int rating, int quant, String form, String loc, long lic, String nm) {
		super(quant, form, loc, lic, nm);
		length = len;
		year = yr;
		contentRating = rating;
	}
	
	public Movie(Scanner s) {
		super(s);
	}
}
