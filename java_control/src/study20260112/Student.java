package study20260112;

public class Student {
	
	static String schoolName; // 클래스 변수
	
	public String name; // 인스턴스 변수
	public String age; // 인스턴스 변수
	private int tall; // 인스턴스 변수
	private int grade; // 인스턴스 변수
	
	public Student () {} // 생성자 메서드
	public Student (String name, String age, int tall) { // 매개(지역) 변수
		this.name = name; // this : 현재 만들어서 사용하는 객체!
		this.age = age;
		this.tall = tall;		
	}
	public Student(String nae, int tall) {
		this.name = name;
		this.tall = tall;		
	}
	
	// 클래스 객체에 저장되어있는 값을 출력할 때 
	// 자바에서는 일반적으로 toString 메서드를 사용한다. 
	public String toString() {
		return name+" : " + age + " : " + tall + " : " + grade;
	}
	
}
