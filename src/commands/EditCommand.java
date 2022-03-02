package commands;

import java.util.Scanner;

import data.FakeDatabase;

public class EditCommand {

	public static void exec(Scanner s) {

		System.out.println("Enter the name of the item you want to edit:");
		String name = s.nextLine();
		
		FakeDatabase.getInstance().editItem(name, s);
	}

}
