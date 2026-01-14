package study20260114;

public class Item {	
	private String item_Name;
	private int item_Price;
	private String item_Main_Image;
	private int item_Stock;
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public int getItem_Price() {
		return item_Price;
	}
	public void setItem_Price(int item_Price) {
		this.item_Price = item_Price;
	}
	public String getItem_Main_Image() {
		return item_Main_Image;
	}
	public void setItem_Main_Image(String item_Main_Image) {
		this.item_Main_Image = item_Main_Image;
	}
	public int getItem_Stock() {
		return item_Stock;
	}
	public void setItem_Stock(int item_Stock) {
		this.item_Stock = item_Stock;
	}
	@Override
	public String toString() {
		return "Item [item_Name=" + item_Name + ", item_Price=" + item_Price + ", item_Main_Image=" + item_Main_Image
				+ ", item_Stock=" + item_Stock + "]";
	}
	public Item(String item_Name, int item_Price, String item_Main_Image, int item_Stock) {
		super();
		this.item_Name = item_Name;
		this.item_Price = item_Price;
		this.item_Main_Image = item_Main_Image;
		this.item_Stock = item_Stock;
	}
	
	
	
	
}
