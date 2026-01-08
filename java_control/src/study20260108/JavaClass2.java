package study20260108;

public class JavaClass2 {

	public static void main(String[] args) {
		
		Movie movie = new Movie();   
	    // new movie() 생성자 메서드 ; 초기데이터(초기화)
		                            //new ClassName();
								    //이것도 메서드임... 
							       //작은 괄호() 붙은 건 
								   //메서드라 보면 됨!
		System.out.println(movie.title);
		
		
		movie.title = "아바타 불과재";
		movie.dir = "카메론";
		movie.year = 2026;
		movie.limitAge = 12;
		System.out.println(movie.title);
		
		Movie movie2 = new Movie("굿포춘",2026);
		
		System.out.println(movie2.title);
		System.out.println(movie2.year);
		
		// (실습) Music 클래스의 객체 생성하여
		// 음악 제목, 가수, 재생시간(총 몇분) 저장되게 하기
		// 매개변수 있는 생성자 메서드로 데이터 저장하고
		// 출력하기
		System.out.println("");
		Music music = new Music("천상연","이창섭", 4);
		System.out.println(music.title);
		System.out.println(music.artist);
		System.out.println(music.playTime);
		
		music.title = "No Reason";
		music.artist = "Sum41";
		music.playTime = 4;
		System.out.println(music.title);
		
		Music music2 = new Music("Still Waiting","Sum41",3);
		
		System.out.println(music2.title);
		System.out.println(music2.artist);
		System.out.println(music2.playTime);
	}

}
