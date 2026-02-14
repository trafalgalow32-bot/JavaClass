package Self20260115;

public class MethodClass { //메서드와 클래스
	// 4가지 유형의 메서드
	
	// 1. 매개변수 x / 반환값 x
	// 아무 입력도 받지 않고, 아무 값도 돌려주지 않는 메서드 (단순 실행용)
	
//	public void printHello() {
//		System.out.println("Hello, Java!");		
//		//  단순 출력, 로그 남기기, 상태 초기화 등
//	}
	
	// 2. 매개변수 o / 반환값 x
	// 입력은 받지만, 결과를 반환하지 않는 메서드
	// 입력값 기반으로 동작만 수행
	
//	public void printNumber(int num) {
//		System.out.println("입력한 숫자 : " + num);
		// 전달받은 값으로 화면 출력, 객체 상태 변경, 파일 저장 등
//	}
	
	// 3. 매개변수 x / 반환값 o
	// 입력은 없지만 결과를 반환하는 메서드
	// 내부에서 계산하거나 값을 생성해 반환
//	public int getRandomNumber() {
//		return (int)(Math.random) * 100);
//	}
	
	
	// 4. 매개변수 o / 반환값 o
	// 입력도 받고 결과도 반환하는 가장 일반적인 형태
	// 계산, 변환, 로직 처리에 가장 많이 사용
	
//	public int add(int a, int b) {
//		return a+b;
	// 계산, 데이터 변환, 조건 처리 후 결과 반환 등
//	}
	
	/* 클래스란 ? 객체를 만들기 위한 설계도.
	클래스의 구성 요소
	필드(Field) : 객체의 속성(변수)
	메서드(Method) : 객체의 행동(함수)
	toString() 메서드 : 객체 정보를 문자열로 표현하는 메서드
	
	생성자(Constructor) : 객체가 생성될 때 자동으로 호출되는 초기화 메서드
	클래스 이름과 동일, 반환 타입 없음, 객체의 초기 상태를 설정하는 역할.
	*/
	
//	public class Person {
//		String name;
//		int age;
		
		// 생성자 (마우스 우클릭 - Source - Generate Constructor Using Field)
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//		}		
//	}
	
	
} // 클래스 중괄호
