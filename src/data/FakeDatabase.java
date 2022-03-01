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
		inventoryItems.add(item);
		System.out.println(inventoryItems);
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
