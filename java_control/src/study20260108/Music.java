package study20260108;

public class Music {
	String title; // 음악 제목
	String artist; // 가수명
	int playTime; // 재생 시간(분)

	// 생성자 메서드 (이게 없으면 다른 클래스에서 music2를 만들 수 없다!)
	Music() {
		title = "The Hell Song";
	}
	
	// 매개변수가 있는 생성자 메서드
	Music(String title, String artist, int playTime){
		this.title = title;
		this.artist = artist;
		this.playTime = playTime;
	}		
}
