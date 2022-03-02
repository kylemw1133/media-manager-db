package data;

import java.util.ArrayList;
import java.util.Scanner;

import entities.InventoryItem;


public class FakeDatabase implements Database {
	
	/* Singleton Pattern */
	private static FakeDatabase databaseInstance = null;
	
	public static FakeDatabase getInstance() {
		if (databaseInstance == null) {
			databaseInstance = new FakeDatabase();
		}
		
		return databaseInstance;
	}
	
	/* Database Data */
	public ArrayList<InventoryItem> inventoryItems = new ArrayList<InventoryItem>();
	
	public void addItem(InventoryItem item) {
		if(inventoryItems.contains(item)) {
			System.out.println("Item already in database. Check licensing number if this is an error.");
		} else {
			inventoryItems.add(item);
		}
	}
	
	public void printItems() {
		System.out.println(inventoryItems);
	}
	
	public void editItem(String name, Scanner s) {
		//Scanner sc = new Scanner(System.in);
		boolean found = false;
		for(int i = 0; i<inventoryItems.size();i++) {
			InventoryItem item = inventoryItems.get(i);
			if(item.name.equals(name)) {
				item.promptForAttributes(s);
				found = true;
			}
		}
		if(!found) {
			System.out.println("There is no item with name " +name);
		}
		//sc.close();
		
	}
	
	public void findItems(String name) {
		ArrayList<InventoryItem> foundItems = new ArrayList<InventoryItem>();
		for(InventoryItem i : inventoryItems) {
			if(i.name.toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				foundItems.add(i);
			}
		}
		if(foundItems.isEmpty()) {
			System.out.println("No items found.\n");
			return;
		}
		System.out.println(foundItems);
	}
	
	public void orderItem(String name, int orderAmount) {
		boolean found = false;
		for(int i = 0; i<inventoryItems.size();i++) {
			InventoryItem item = inventoryItems.get(i);
			if(item.name.toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				item.quantity+=orderAmount;
				found = true;
			}
		}
		if(!found) {
			System.out.println("No item could be found. Add before ordering");
		}
	}

}
