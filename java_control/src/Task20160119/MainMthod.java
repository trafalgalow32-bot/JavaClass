package Task20160119;

public class MainMthod {

	public static void main(String[] args) {
		/*
		알림 내용은 같지만  전달방식은 서로 다르다.
		하나의 이벤트가 발생했을때, 여러방식으로 사용자에게 알림을 보낼수 있다.
		예를 들어
		회원가입 완료
		주문완료
		비밀번호 변경
		배송시작
		이와 같은 알림은 이메일, 문자, 앱 푸시 등 다양한방식을 전달 될수 있다. 

		인터페이스 이름 : Notifier
		메서드 1개 이상 정의  (예 : send(String message)  )
		모든 알림 방식은 이 인터페이스를 구현해야 한다.

		클래스 작성
		이메일방식(email),  문자(textMessage), 앱 푸시(appPush)  

		클래스 작성하여 인터페이스를 구현하고  
		main 에서  인터페이스 타입으로  세개의 클래스 객체를 다루어  메세지를 보낼수 있게 한다.
		*/
		 
		
		eMail email = new eMail();
		textMessage textmessage = new textMessage();
		appPush apppush = new appPush();
		
		email.signIn();
		textmessage.orderPass();
		apppush.isDeliver();
	}

}
