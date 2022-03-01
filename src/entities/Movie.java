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
	public void printAttributes() {
		System.out.println(name);
		System.out.println(length);
		System.out.println(year);
		System.out.println(contentRating);
	}
	

}
