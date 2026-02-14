package InstructorB.src.exam28;

public class ProductDTO { //객체에 저장! 데이터클래스에!
	private String productName;
	private int productPrice;
	private int buyCounter;
	private int tot; // 필드는 무조건 접근 제어자 private으로 사용!
	
	
	// 입력받는 값만! 즉, 매개변수가 있는 값만!
	public ProductDTO(String productName, int productPrice, int buyCounter) { 
		this.productName = productName;
		this.productPrice = productPrice;
		this.buyCounter = buyCounter;
		this.tot = productPrice * buyCounter;
	}
	
	// method
	public void display() { // 실행 클래스에서 코딩이 길어지는 (get.getnnn() ...) 코드 보다는 이렇게 메서드를 선언하는게!
		System.out.printf("%s \t %d \t %d \t %d\n", productName, productPrice, buyCounter, tot);
	}
	
	
	// getter & setter ; private 접근 제어자 때문에!
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getBuyCounter() {
		return buyCounter;
	}
	public void setBuyCounter(int buyCounter) {
		this.buyCounter = buyCounter;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	
}
