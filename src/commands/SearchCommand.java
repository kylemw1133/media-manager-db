package commands;

import java.util.Scanner;

import data.FakeDatabase;

public class SearchCommand {

	public static void exec(Scanner s) {
		System.out.println("Enter the keyword: ");
		String key = s.nextLine();
		
		FakeDatabase.getInstance().findItems(key);
	}
}
