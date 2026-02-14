package SelfStudying;

public class Person {
	private String name;
	private int age;
	private Phone phone;
	
	public Person() {
		this("이름없음", 0);
	}
	
	public Person(String name) {
		this(name, 0);
	}
	
	public Person(String name, int age) { // 이름 + 나이 생성자		
		this.name = name;
		this.age = age;
	}
	
	public void buyPhone(Phone phone) {
		this.phone = phone;
		System.out.println(name + "이(가) " + phone.getModel() + "을(를) 구매했습니다.");
	}
	
	public void call(String target) {
		if (phone == null) {
			System.out.println(name + "은(는) 아직 스마트폰이 없습니다.");
			return;
		}
		phone.call(target); // Phone 객체에게 메시지 전달
	}
	
}
