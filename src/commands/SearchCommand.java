package commands;

import java.util.Scanner;

import data.FakeDatabase;

public class SearchCommand {

	public static void exec(Scanner s) {

		System.out.println("Enter the name of the item you are searching for: ");
		String name = s.next();
		
		FakeDatabase.getInstance().findItems(name);
		
	}

}
