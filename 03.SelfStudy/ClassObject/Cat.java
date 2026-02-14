package ClassObject;

public class Cat {
	String breed;
	String color;
	
	// 기본 생성자 선언
	Cat() { // 클래스명과 같아야!
		System.out.println("Cat() 생성자 호출합니다.");
	}
	
	Cat(String pBreed) { // 일반 생성자, 생성자 오버로딩
		System.out.println("Cat(...) 생성자 호출합니다.");
		breed = pBreed;
	}
	
	Cat(String pBreed, String pColor) { // 일반 생성자, 생성자 오버로딩
		System.out.println("Cat(..., ...) 생성자 호출합니다.");
		breed = pBreed;
		color = pColor;
	}
	
	void eat() {
		// eat() 메서드 구현
		System.out.println("먹이를 먹다");
	}
	
	void scratch() {
		System.out.println("발톱으로 할퀴다");
		// scratch() 메서드 구현
	}
	
	void meow() {
		System.out.println("야옹하고 울다");
		// meow() 메서드 구현
	}
}