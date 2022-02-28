import commands.*;
import data.*;

public class Main {
	
	public static void main(String[] args) {
		String command = "add";
		
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
		default:
			System.out.println("Invalid subcommand: " + command);
		}
	}

}
