package commands;
import data.*;
import entities.*;

public class AddCommand {
	
	public static void exec() {
		String type = "album";
		InventoryItem newItem = null;
		
		switch (type) {
		case "album":
			newItem = new Album();
			break;
		case "tvshow":
			newItem = new TVShow();
			break;
		default:
			System.out.println("Invalid item type");
			return;
		}
		
		FakeDatabase database = FakeDatabase.getInstance();
		database.addItem(newItem);
		System.out.println("New " + type + " added.");
	}

}
