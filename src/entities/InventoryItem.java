package entities;

public class InventoryItem {
	public int quantity;
	public String format;
	public String location;
	public long licensingNumber;
	public InventoryItem(int quant, String form, String loc, long licNum) {
		quantity = quant;
		format = form;
		location = loc;
		licensingNumber = licNum;
	}
	public void printAttributes() {
		System.out.println(quantity);
		System.out.println(format);
		System.out.println(location);
		System.out.println(licensingNumber);
	}
}
