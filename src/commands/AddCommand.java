package commands;
import data.*;
import entities.*;
import java.util.Scanner;

public class AddCommand {
	
	public static void exec(String type, Scanner s) {
		InventoryItem newItem = null;
	
		switch (type) {
			case "album":
				newItem = new Album(s);
				break;
			case "movie":
				newItem = new Movie(s);
				break;
            case "tvshow":
                newItem = new TVShow(s);
                break;
			default:
				System.out.println("Invalid item type");
				return;
		}

		FakeDatabase.getInstance().addItem(newItem);
		System.out.println("New " + type + " added.");
	}

}
