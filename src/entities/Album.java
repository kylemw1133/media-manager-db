package entities;

import java.util.Scanner;

public class Album extends InventoryItem {
	public int length;
	public int year;
	public String artist;
	
	public Album(int len, int yr, String art, int quant, String form, String loc, long lic, String nm) {
		super(quant, form, loc, lic, nm);
		length = len;
		year = yr;
		artist = art;
	}
	
	public Album(Scanner s) {
		super(s);
	}
}
