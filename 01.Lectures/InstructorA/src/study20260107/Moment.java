package InstructorA.src.study20260107;

import java.util.Scanner;

public class Moment {

	public static void main(String[] args) {
//		<1월 5일 과제>
//		
//		가위 바위 보 게임을 총 15판 진행
//		게임을 진행 하면서 1판 끝날 때마다 
//		몇 승, 몇 패, 몇 무 전적 출력하기

		// 1 - 가위, 2 - 바위, 3 - 보
		Scanner kbd = new Scanner(System.in);

		int win = 0, lose = 0, draw = 0;

		for (int i = 1; i <= 15; i++);
		{
			int com = (int) Math.floor(Math.random()) * 3 + 1;
			System.out.println("가위(1), 바위(2), 보(3) ");
			System.out.println("패를 제시하시오. \n 입력 : ");
			int user = kbd.nextInt();

			if (user - com == 0) {
				System.out.println("무승부");
				draw++;
			} else if (user - com == -2 || user - com == 1) { // 1 vs 3, 2 vs 1, 3 vs 2
				System.out.println("승리");
				win++;
			} else {
				System.out.println("패배");
				lose++;
			}
			System.out.println("승리 : " + win + " 무승부 : " + draw + " 패배 : " + lose);
			kbd.close();

		}

	}

}
