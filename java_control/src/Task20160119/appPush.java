package Task20160119;

public class appPush implements Notification{

	@Override
	public void signIn() {
		System.out.println("[한라봉닷컴]회원가입 완료");		
	}

	@Override
	public void orderPass() {
		System.out.println("[한라봉닷컴]주문완료");		
	}

	@Override
	public void changePw() {
		System.out.println("[한라봉닷컴]비밀번호 변경");		
	}

	@Override
	public void isDeliver() {
		System.out.println("[한라봉닷컴]배송 시작");		
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("[한라봉닷컴 관련 알림]");
		
	}

}
