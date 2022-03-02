package data;

import java.util.Scanner;

import entities.InventoryItem;

public interface Database {
	
	public void addItem(InventoryItem item);
	
	// TODO:
	public void editItem(String name, Scanner s);
	public void findItems(String name);
	public void orderItem(String name, int quantity);	
}
