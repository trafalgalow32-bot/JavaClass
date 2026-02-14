package Task20160119;

public class textMessage implements Notification{

	@Override
	public void signIn() {
		System.out.println("[Web발신]회원가입 완료");		
	}

	@Override
	public void orderPass() {
		System.out.println("[Web발신]주문완료");		
	}

	@Override
	public void changePw() {
		System.out.println("[Web발신]비밀번호 변경");		
	}

	@Override
	public void isDeliver() {
		System.out.println("[Web발신]배송 시작");		
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("(Web발신)한라봉닷컴 관련 안내");
		
	}

}
