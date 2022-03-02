import java.util.Scanner;

import commands.*;
import data.*;

public class Main {

	public static void main(String[] args) {
		boolean promptUser = true;
		Scanner s = new Scanner(System.in);
		InitializeCommand.exec();
		while (promptUser) {
			System.out.print("Enter db command (add, edit, search, order, report, print, exit): ");
			String command = s.nextLine();
			switch (command) {
<<<<<<< HEAD
				case "add":
					System.out.println("Enter type of item to add: ");
					String inventoryType = s.next();
					AddCommand.exec(inventoryType, s);
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
=======
			case "add":
				AddCommand.exec(s);
				break;
			case "edit":
				EditCommand.exec(s);
				break;
			case "search":
				SearchCommand.exec(s);
				break;
			case "order":
				OrderCommand.exec();
				break;
			case "report":
				ReportCommand.exec();
				break;
			case "print":
				FakeDatabase.getInstance().printItems();
				break;
			case "exit":
				promptUser = false;
				break;
			default:
				System.out.println("Invalid subcommand: " + command);
>>>>>>> 2ab679c6dde585374194c93a726534c6334d4256
			}
		}
		s.close();
	}

}
