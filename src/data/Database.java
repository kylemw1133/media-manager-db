package data;

import entities.InventoryItem;

public interface Database {
	
	public void addItem(InventoryItem item);
	
	// TODO:
	public void editItem(String name, String attribute, String value);
	public void findItems(String name);
	public void orderItem();	
}
