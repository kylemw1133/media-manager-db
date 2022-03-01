package commands;
import data.*;
import entities.*;
import java.util.Scanner;

public class AddCommand {
	
	public static void exec(String type) {
		InventoryItem newItem = null;
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter inventory quantity: ");
		int quantity = Integer.parseInt(s.next());
		System.out.println("Enter inventory format: ");
		String format = s.next();
		System.out.println("Enter inventory location: ");
		String location = s.next();
		System.out.println("Enter inventory licensingNumber: ");
		int licensingNumber = Integer.parseInt(s.next());

		switch (type) {
			case "album":
				newItem = new Album();
				break;
			case "movie":
				System.out.println("Enter Name: ");
				String name = s.next();
				System.out.println("Enter Length: ");
				int length = Integer.parseInt(s.next());
				System.out.println("Enter Year: ");
				int year = Integer.parseInt(s.next());
				System.out.println("Content Rating: ");
				int contentRating = Integer.parseInt(s.next());
				newItem = new Movie(name, length, year, contentRating, quantity, format, location, licensingNumber);
				break;
			
			default:
				System.out.println("Invalid item type");
				s.close();
				return;
		}
		
		s.close();
		FakeDatabase database = FakeDatabase.getInstance();
		database.addItem(newItem);
		System.out.println("New " + type + " added.");
	}

}
