package SelfClass;

public class MainSelf {

	public static void main(String[] args) {
		// 생성자 오버로딩 테스트
		PersonSelf p1 = new PersonSelf();
		PersonSelf p2 = new PersonSelf("홍길동");
		PersonSelf p3 = new PersonSelf("김철수", 25);
		
		// 객체 간 메시지 교환
		PhoneSelf galaxy = new PhoneSelf("Galaxy S23 Ultra");
		
		p2.buyPhone(galaxy); // 사람 -> 스마트폰에게 메세지 전달
		p2.call("엄마"); // 사람 -> 스마트폰 -> 대상

	}

}
