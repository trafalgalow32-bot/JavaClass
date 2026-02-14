package Task20160119;

public interface Notification {
	
	void sendMessage(String message);
	
	void signIn(); // 회원가입 완료
	void orderPass(); // 주문완료
	void changePw(); // 비번 변경
	void isDeliver(); // 배송시작
	
	
	/* 알림 시스템 만들기
	구현하고자 하는 알림 시스템은?
	  회원가입 완료
	  주문완료
	  비밀번호 변경
	  배송시작
	=> 이러한 알림들을 각각 이메일, 문자, 앱 푸시로 전달!
	
	send(String message)와 같은 메서드 1개 이상 정의
	=> send message 메서드를 각각 클래스에서 구현?하면 안되고....
	  
	 */
}
