package InstructorA.src.study20260105;

import java.util.Scanner;

public class SelfRepeat {

	public static void main(String[] args) {
		// 문제
		// 동전앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행 하기
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기

		Scanner kbd = new Scanner(System.in);
		int ok = 0; // 맞춘 횟수 카운팅
		// 앞면 - 1, 뒷면 - 2

		for (int i = 1; i <= 10; i++) {
			int coin = (int) Math.floor(Math.random() * 2) + 1;
			System.out.println("앞뒷면 일치여부 맞춘 횟수");
			System.out.print("앞면(1), 뒷면(2) \n 입력 : ");
			int user = kbd.nextInt();
			if (user == coin) {
				System.out.println("일치");
				ok++;
			} else
				System.out.println("불일치");
		}
		kbd.close();
		System.out.println("맞춘 횟수 : " + ok + "회");
	}

}
