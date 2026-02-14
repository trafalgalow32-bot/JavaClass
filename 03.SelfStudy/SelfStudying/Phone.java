package SelfStudying;

public class Phone {
	private String model;
	
	public Phone(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	// 전화 걸기 기능
	public void call(String target) {
		System.out.println(model + " -> " + target + "에게 전화를 겁니다.");

	}
	
}
