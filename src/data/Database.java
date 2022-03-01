package data;

import entities.InventoryItem;

public interface Database {
	
	public void addItem(InventoryItem item);
	
	// TODO:
	public void editItem();
	public void findItems();
	public void orderItem();	
}
