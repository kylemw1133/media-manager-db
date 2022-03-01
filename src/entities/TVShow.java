package entities;

public class TVShow extends InventoryItem {
	public int rating;
	public int year;
	public String name;
	public TVShow(int rat, int y, String nam, int quant, String form, String loc, long lis) {
		super(quant, form, loc, lis);
		rating = rat;
		year = y;
		name = nam;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Name: " + name + "\nRating: " + rating + "\nYear: " + year + "\n";
	}
}
