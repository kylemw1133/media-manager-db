package data;

import java.util.List;
import java.util.Scanner;

import entities.InventoryItem;

public interface Database {

	public void addItem(InventoryItem item);

	public void editItem(String name, Scanner s);

	public List<InventoryItem> findItems(String name);

	public void orderItem(String name, int quantity);
}
