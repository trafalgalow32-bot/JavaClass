package Task20160119;

public class eMail implements Notification {

	@Override
	public void signIn() {
		System.out.println("귀하의 회원가입이 정상처리 되었습니다.");				
	}

	@Override
	public void orderPass() {
		System.out.println("상품 주문이 완료되었습니다.");		
	}

	@Override
	public void changePw() {
		System.out.println("귀하의 계정 비밀 번호가 변경되었습니다.");			
	}

	@Override
	public void isDeliver() {
		System.out.println("귀하께서 주문하신 상품의 배송이 시작되었습니다.");			
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("귀하의 이메일로 알림이 전송되었으니 확인해 주시기 바랍니다.");
		
	}

}
