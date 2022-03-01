package entities.audiobook;

import java.util.*;

import entities.InventoryItem;

public class Audiobook extends InventoryItem {
	// audiobook's attributes
	public String name;
	public String reader;
	public int length;
	public int year;
	// author and chapters
	public Author author;
	public ArrayList<Chapter> chapters;

	// constructor for audiobook
	public Audiobook(Scanner s) {
		super(s);
	}
}
