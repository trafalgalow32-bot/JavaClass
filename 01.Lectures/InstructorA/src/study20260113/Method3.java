package InstructorA.src.study20260113;

public class Method3 {

	public static void main(String[] args) {
		
//		int[] a = new int [5];
//		a[0] = 20;
//		a[2] = 50;
//		
//		User[] users = new User[5];
//		
//		// User클래스 객체생성(new 연산자 써서 실제 객체 공간 만들어야!)
//		users[0] = new User("lee","1234","이순신","010-1234-5678"); // User클래스 객체 생성
//		
////		users[0].setName("이순신"); //set으로 시작하는 메서드는 대개 저장
//		
//		// 공간에 대한 초기화를 해야...
//		System.out.println( users[0].getName()); //get으로 시작하는 메서드는 대개 출력
		
		User[] users = {
				new User("lee","1234","이순신","01012345678"),
				new User("kim","4321","김유신","01011325273"),
				new User("hong","2354","홍길동","01021556778"),
				new User("sky","5617","하늘","01015365218"),
				new User("musk","1762","일론머스크","01056125231")				
		};
		
		UserService us = new UserService();
		// 아이디랑 비번 찾기
//		us.findId( users );
//		
//		us.findPassword ( users );
//		
//		System.out.println( Arrays.toString(users) );
		
		// 로그인 메서드
		
		us.logIn( users ); 
	}

}
