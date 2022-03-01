import java.util.Scanner;

import commands.*;
import data.*;

public class Main {
	
	public static void main(String[] args) {
		boolean promptUser = true;
		Scanner s = new Scanner(System.in);
		while(promptUser) {
			System.out.println("Enter db command (add, edit, search, order, report, exit):");
			String command = s.next();
			switch (command) {
			case "add":
				AddCommand.exec(args);
				break;
			case "edit":
				EditCommand.exec(args);
				break;
			case "search":
				SearchCommand.exec(args);
				break;
			case "order":
				OrderCommand.exec(args);
				break;
			case "report":
				ReportCommand.exec(args);
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
