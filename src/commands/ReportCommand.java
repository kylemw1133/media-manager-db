package commands;

import java.util.ArrayList;

import data.FakeDatabase;
import entities.Album;
import entities.InventoryItem;

public class ReportCommand {

	public static void exec() {
		System.out.println("Example report: all albums with length greater than 50.");

		ArrayList<Album> validAlbums = new ArrayList<Album>();
		for (InventoryItem i : FakeDatabase.getInstance().inventoryItems) {
			if (i instanceof Album) {
				Album a = (Album) i;
				if (a.length > 50) {
					validAlbums.add(a);
				}
			}
		}
		
		if (validAlbums.isEmpty()) {
			System.out.println("No items found.\n");
			return;
		}
		
		System.out.println(validAlbums);
	}

}
