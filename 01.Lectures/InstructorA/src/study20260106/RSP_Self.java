package InstructorA.src.study20260106;

import java.util.Scanner;

public class RSP_Self {

	public static void main(String[] args) {
		// 컴퓨터와 함께하는 가위바위보 게임!!!!
		// 1 - 가위, 2 - 바위, 3- 보

		// 컴퓨터의 가위바위보는 랜덤으로
		// 나의 가위바위보 값은 키보드 입력으로
		// 내가 이겼는지, 졌는지, 비겼는지 출력하세요!!

		Scanner kbd = new Scanner(System.in);

		int winCount = 0, loseCount = 0, drawCount = 0;

		for (int i = 1; i <= 15; i++) {
			int com = (int) Math.floor(Math.random() * 3) + 1;
			System.out.print("1 가위 , 2 바위, 3 보 :");
			int user = kbd.nextInt();

			System.out.println(" 컴퓨터 : " + com + "  나 : " + user);

			int res = user - com;
			if (res == 0) {
				System.out.println(" 무승부 ");
				drawCount++;
			} else if (res == -2 || res == 1) {
				System.out.println("승리");
				winCount++;
			} else {
				System.out.println("패배");
				loseCount++;
			}
			System.out.println("승 : " + winCount + " 패 : " + loseCount + " 무 : " + drawCount);
		}
		kbd.close();
	}

}
