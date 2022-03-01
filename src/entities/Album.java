package entities;

public class Album extends InventoryItem {
	public int length;
	public int year;
	public String name;
	public Album(int len, int y, String nm, int quan, String form, String loc, long lic) {
		super(quan, form, loc, lic);
		length = len;
		year = y;
		name = nm;
	}
}
