package data;

public class FakeDatabase implements Database {
	
	/* Singleton Pattern */
	private static FakeDatabase databaseInstance = null;
	
	public static FakeDatabase getInstance() {
		if (databaseInstance == null) {
			databaseInstance = new FakeDatabase();
		}
		
		return databaseInstance;
	}
	
	/* Database Data */
	public int numberOfAlbums = 0;
	
	public void addAlbum() {
		numberOfAlbums += 1;
	}

	
}
