package study20260108;

public class Movie {
	String title; // 영화 제목
	String dir ; //영화 감독
	int limitAge; // 관람연령
	int year; // 개봉년도
	
	// 생성자 메서드 (생략 돼 있을 뿐, 실제로는 존재)
	Movie() { // 객체를 초기화
		title = "주토피아2";
	}
	// 매개변수가 있는 생성자 메서드
	Movie(String title, int year){ //오버로딩 동작(오버라이딩이란 동작도 있는데, 이는 다음주에!)
		this.title = title;
		this.year = year;
	}
}
