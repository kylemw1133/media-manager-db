import java.util.Scanner;

import commands.*;
import data.*;
import entities.InventoryItem;
import entities.Movie;

public class Main {
	
	public static void main(String[] args) {
		boolean promptUser = true;
		Scanner s = new Scanner(System.in);
		while(promptUser) {
			System.out.println("Enter db command (add, edit, search, order, report, exit):");
			String command = s.next();
			switch (command) {
			case "add":
				
				System.out.println("Enter type of item to add: ");
				String inventoryType = s.next();
				
				AddCommand.exec(inventoryType);
				break;
			case "edit":
				EditCommand.exec();
				break;
			case "search":
				SearchCommand.exec();
				break;
			case "order":
				OrderCommand.exec();
				break;
			case "report":
				ReportCommand.exec();
				break;
			case "exit":
				promptUser = false;
				break;
			default:
				System.out.println("Invalid subcommand: " + command);
			}
		}
		s.close();
	}	

}
