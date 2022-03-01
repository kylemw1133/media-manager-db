package entities;

import java.util.Scanner;

public class Album extends InventoryItem {
	public int length;
	public int year;
	public String name;
	
	public Album(Scanner s) {
		super(s);
	}
}
