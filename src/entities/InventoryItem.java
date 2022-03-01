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
	
}
