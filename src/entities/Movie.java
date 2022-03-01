package entities;

public class Movie extends InventoryItem {
	public String name;
	public int length;
	public int year;
	public int contentRating;
	public Movie(String n, int len, int y, int conRat, int quant, String form, String loc,long licNum) {
		super(quant, form, loc, licNum);
		name = n;
		length = len;
		year = y;
		contentRating = conRat;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Name: " + name + "\nLength: " + length + "\nYear: " + year + "\nContent Rating: " + contentRating + "\n";
	}

}
