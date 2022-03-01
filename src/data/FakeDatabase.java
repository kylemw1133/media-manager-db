package data;

import java.util.ArrayList;
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
		for(InventoryItem i : inventoryItems) {
			System.out.println(i);
		}
	}
	
	// TODO:
	public void editItem() {
		System.out.println("Not implemented");
	}
	
	public void findItems() {
		System.out.println("Not implemented");
	}
	
	public void orderItem() {
		System.out.println("Not implemented");
	}

	
}
