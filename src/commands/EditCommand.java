package commands;

import java.util.Scanner;

import data.FakeDatabase;

public class EditCommand {

	public static void exec(Scanner s) {
		System.out.println("Enter the type of media you want to edit:");
		String type = s.next();
		System.out.println("Enter the name of the item you want to edit:");
		String name = s.next();
		System.out.println("Enter the attribute you want to edit:");
		String attribute  = s.next();
		System.out.println("Enter the value you want to change that attribute to:");
		String value = s.next();
		
		FakeDatabase.getInstance().editItem(type, name, attribute, value);
	}

}
