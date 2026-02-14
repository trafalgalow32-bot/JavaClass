package Information;

public class StockInfo {
	private String title;
	private int price;
	private String Catog;
	private int Quan;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCatog() {
		return Catog;
	}
	public void setCatog(String catog) {
		Catog = catog;
	}
	public int getQuan() {
		return Quan;
	}
	public void setQuan(int quan) {
		Quan = quan;
	}
	
	@Override
	public String toString() {
		return " \n 상품명 : " + title + ", 가격 : " + price + ", 종류 : " + Catog + ", 남은 수량 : " + Quan;
	}
	
	public StockInfo(String title, int price, String catog, int quan) {
		super();
		this.title = title;
		this.price = price;
		Catog = catog;
		Quan = quan;
	}
	
//	// 주류 판매 불가 메서드 (시도해보았으나 실패했습니다...)
//	
//	public void check ( ) { 
//		if (Catog.equals("주류"))
//			System.out.println("카페에서는 술을 팔지 않습니다...");		
//	}
//	
	
}
