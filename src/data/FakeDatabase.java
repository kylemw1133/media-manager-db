package data;

import java.util.ArrayList;
import entities.InventoryItem;
import entities.Movie;

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
	
	// TODO:
	public void editItem(String type, String name, String attribute, String value) {
		for(int i = 0; i<inventoryItems.size();i++) {
			InventoryItem item = inventoryItems.get(i);
			if(item.canEdit(attribute, value.getClass().getSimpleName())) {
				//can edit item (how do we reach specific media item's attributes???
				
			}
		}
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
	
	public void orderItem() {
		System.out.println("Not implemented");
	}

	@Override
	public void editItem(String name, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	
}
