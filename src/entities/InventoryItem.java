package entities;

import java.lang.reflect.Field;
import java.util.Scanner;

public class InventoryItem {
	public int quantity;
	public String format;
	public String location;
	public long licensingNumber;
	public String name;

	public void promptForAttributes(Scanner s) {
		for (Field f : this.getClass().getFields()) {
			Class<?> type = f.getType();
			System.out.print("Enter " + f.getName() + " (" + type.getSimpleName() + "): ");

			String input = s.nextLine();
			Object value = null;

			switch (type.getSimpleName()) {
			case "String":
				value = input;
				break;
			case "int":
				value = Integer.parseInt(input);
				break;
			case "long":
				value = Long.parseLong(input);
				break;
			}

			try {
				f.set(this, value);
			} catch (IllegalArgumentException e) {
				System.out.println("Error: Field '" + f + "' not found in '" + this + "'.");
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				System.out.println("Error: Field '" + f + "' not accessible for '" + this + "'.");
				e.printStackTrace();
			}
		}
	}

	public InventoryItem(Scanner s) {
		this.promptForAttributes(s);
	}
	
	public InventoryItem(int quant, String form, String loc, long lic, String nm) {
		quantity = quant;
		format = form;
		location = loc;
		licensingNumber = lic;
		name = nm;
	}
	
	public boolean canEdit(String attribute, String valueType) {
		for(Field f : this.getClass().getFields()) {
			Class<?> type = f.getType();
			if(f.getName().equals(attribute) && type.getSimpleName().equals(valueType)) {
				return true;
			} 
		}
		return false;
	}

	@Override
	public boolean equals(Object i) {
		if (i instanceof InventoryItem)
			return licensingNumber == ((InventoryItem) i).licensingNumber && location == ((InventoryItem) i).location;
		return false;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();

		for (Field f : this.getClass().getFields()) {
			try {
				s.append(f.getName() + ": " + f.get(this) + "\n");
			} catch (IllegalArgumentException | IllegalAccessException e) {
				s.append(f.getName() + ": null\n");
			}
		}

		return s.toString();
	}
}
