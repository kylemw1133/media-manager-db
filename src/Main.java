import java.util.Scanner;

import commands.*;
import data.*;

public class Main {

	public static void main(String[] args) {
		boolean promptUser = true;
		Scanner s = new Scanner(System.in);
		while (promptUser) {
			System.out.println("Enter db command (add, edit, search, order, report, exit):");
			String command = s.nextLine();
			switch (command) {
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
