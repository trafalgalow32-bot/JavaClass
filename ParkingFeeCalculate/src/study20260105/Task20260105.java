package study20260105;

import java.util.Scanner;

public class Task20260105 {

	public static void main(String[] args) {
//		<1월 5일 과제>
//		
//		가위 바위 보 게임을 총 15판 진행
//		게임을 진행 하면서 1판 끝날 때마다 
//		몇 승, 몇 패, 몇 무 전적 출력하기

		Scanner kbd = new Scanner(System.in);
		int win = 0; // 승리 횟수 // int winCount = 0, loseCount = 0, drawCount = 0; 이런식으로 한 줄에 나열해도 됨!
		int lose = 0; // 패배 횟수
		int draw = 0; // 무승부 횟수, 반복문 안에 포함시키면 안되는 변수(변수는 2개든 3개든 무관)

		for (int i = 1; i <= 15; i++) { // 반복문 걸기
			// 가위 = 1, 바위 = 2, 보 = 3
			int com = (int) Math.floor(Math.random() * 3) + 1;
			System.out.println("1 가위, 2 바위, 3 보 ");
			System.out.print("패를 제시하시오. \n 입력 : ");
			int user = kbd.nextInt();

			if (user == com) { // 실행되는 코드가 2개 이상이니 중괄호는 필수!
				System.out.println("무승부"); // 비김
				draw++; // 혹은 drawCount++;
			} else if ((user - com == -2) || (user - com == 1)) {// 이김 ( 가위1 보3, 바위2 가위1, 보3 바위2)
				System.out.println("승리");
				win++;
			} else { // else도 중괄호 쳐줘야!
				System.out.println("패배");
				lose++;}
			System.out.println("승리 : " + win + " 무승부 : " + draw + " 패배 : " + lose); // lose 변수 선언 및 ++
																	// 처리시 패배가 계속 15로 잡힘
																	// for  문 안쪽에 써줘야 했네... 
		}
	}
}
