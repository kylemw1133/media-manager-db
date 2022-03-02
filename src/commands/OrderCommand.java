package commands;

import java.util.Scanner;

import data.FakeDatabase;

public class OrderCommand {

	public static void exec(Scanner s) {
		
		System.out.println("Enter the name of the item you want to order:");
		String name = s.nextLine();
		System.out.println("Enter how many of that item you want to order:");
		int quantity = Integer.parseInt(s.next());
		
		FakeDatabase.getInstance().orderItem(name, quantity);
	}

}
