package commands;
import data.*;

public class AddCommand {
	
	public static void exec(String[] args) {
		System.out.println("add logic goes here");
		FakeDatabase database = FakeDatabase.getInstance();
		database.addAlbum();
		System.out.println("New album added. Number of albums: " + database.numberOfAlbums);
	}

}
