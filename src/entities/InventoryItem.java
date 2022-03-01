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
	
	@Override
	public boolean equals(Object i) {
		if(i instanceof InventoryItem)
			return licensingNumber == ((InventoryItem) i).licensingNumber && location == ((InventoryItem) i).location;
		return false;
	}
	
	@Override
	public String toString() {
		return "Quantity: " + quantity + "\nFormat: " + format + "\nLocation: " + location + "\nLicensing Num: " + licensingNumber + "\n";
	}
}
