package InstructorA.src.study20260105;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
//		double num = Math.floor(Math.random()*10 + 1);
//		
//		System.out.println(num);

		// 동전의 앞면 뒷면 맞추기

		Scanner sc = new Scanner(System.in);

//		int coin = (int)Math.floor(Math.random() * 2) + 1;
//		// 1 - 앞면, 2 - 뒷면
//		System.out.println("동전 앞면 뒷면 맞추기");
//		System.out.print("1-앞면, 2-뒷면 \n 입력 : ");
//		int user = sc.nextInt();
//		
//		if( user == coin ) 
//			System.out.println("맞추기 성공!!!");
//		else
//			System.out.println("맞추기 실패.....");

		// 주사위 1개

//		int dice = (int)Math.floor(Math.random() * 6) + 1;
//		
//		System.out.println("주사위 맞추기 게임!!!");
//		System.out.print("1~6 중에 하나 입력 : ");
//		int num = sc.nextInt();
//		
//		if (dice == num) 
//			System.out.println("맞추기 성공!!!");
//		else 
//			System.out.println("맞추기 실패");		

//		// 주사위 2개 크기 비교
//
//		// 컴퓨터 주사위
//		int com = (int) Math.floor(Math.random() * 6) + 1;
//
//		// 나의 주사위
//		int user = (int) Math.floor(Math.random() * 6) + 1;
//
//		// 내가 컴퓨터보다 큰가? 작은가? 아니면 같은가?
//		if (user > com || (user == 1 && com == 6)) {
//			if (user == 6 && com == 1)
//				System.out.println("나의 패배....");
//			else
//				System.out.println(" 나의 승!!");
//		} else if (user == com)
//			System.out.println(" 비김....");
//		else
//			System.out.println(" 나의 패배...");

		// 컴퓨터와 함께 하는 가위바위보 게임!!!!
		// 1-가위, 2-바위, 3-보

		// 컴퓨터의 가위바위보는 랜덤으로
		// 나의 가위바위보는 키보드로 입력
		// 내가 이겼는지, 졌는지, 비겼는지 출력하세요.

		System.out.println("가위바위보!");
		int user = sc.nextInt();
//		int user = (int) Math.floor(Math.random() * 3 + 1);
		int com = (int) Math.floor(Math.random() * 3 + 1);

		System.out.println(" 컴퓨터 : " + com + " 나 : " + user); // 강사님 답안 보고 추가... ( 서로 어떤 패를 내밀었는지는 보여줘야...)

//		if (user > com || (user == 1 && com == 3)) {
//			if (user == 3 && com == 1)
//				System.out.println("내가 졌다..."); // user > com의 예외의 경우
//			else
//				System.out.println(" 나의 승!!!"); // 승리
//		} else if (user == com)
//			System.out.println(" 승부는 다음기회로..."); // 비김
//		else
//			System.out.println(" 내가 졌다..."); // 패배

		// 강사님 모범 답안
//		if (user == com )// 비김
//			System.out.println(" 비김 ");
//		else if ( (user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2)) {
//			System.out.println("나의 승리");
//		} else
//			System.out.println("나의 패배...");

		// 다른 풀이 : 숫자(뺄셈)의 관점으로 접근
		int res = user - com;
		if (res == 0)
			System.out.println(" 비김");
		else if (res == -2 || res == 1)
			System.out.println("나의 승리");
		else
			System.out.println("나의 패배...");
		sc.close();
	}

}
