package study20260108;

public class JavaClasses {

	public static void main(String[] args) {
	
		User u = new User(); // 이(u) 안에 데이터 없다! 참조변수이므로.
		User u2 = new User(); // 두번째 객체
		User u3 = u;
		
		u.age = 30;
		System.out.println(u.age);
//		System.out.println(u3.age);
		u.name = "이순신";
		u.job = "군인";
		System.out.println(u.name);
		System.out.println(u.job);

		// 책 이름, 저자, 출판년도를 저장할 수 있는 클래스 정의
		// 객체 생성하여 데이터 넣고 출력하기
		System.out.println("");
		Book b = new Book();
		
		b.name = "우리는 모두 죽는다는 것을 기억하라";
		b.author = "웨인 다이어";
		b.year = 2019;
		System.out.println("서명 : "+b.name);
		System.out.println("저자명 : "+b.author);
		System.out.println("출판년도 : "+b.year);
//		System.out.println(b.name+ " "+b.author+" "+b.year);
	}

}

	class User { // User 라는 이름의 클래스 정의
		
		int age;
		String name;
		String job;
		
	}

	class Book { // 책 클래스. 공간 정의만 해둔 상태.
		String name;
		String author;
		int year;
	}
/*
	자바 클래스
	
	데이터 저장 방법 - 변수 , 배열 , 구조체, 클래스




*/