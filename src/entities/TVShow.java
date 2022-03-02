package entities;

import java.util.Scanner;

public class TVShow extends InventoryItem {
	public int rating;
	public int year;
	
	public TVShow(int rat, int yr, int quant, String form, String loc, long lic, String nm) {
		super(quant, form, loc, lic, nm);
		rating = rat;
		year = yr;
	}
	
	public TVShow(Scanner s) {
		super(s);
	}
}
