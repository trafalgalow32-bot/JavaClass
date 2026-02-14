package InstructorA.src.study20260105;

import java.util.Scanner;

public class Plus20260105 {

	public static void main(String[] args) {
		/*+ 과제2 - 내일 (1/6일자) 실습 : 랜덤 숫자 맞추기, 업다운 게임 제작! 입장 바꿔서? 내가 숫자를 제시하고, 컴퓨터도 범위를 좁혀 가며 맞출 수 있도록.
				랜덤 범위가 줄어들어야. up & down . user 변수랑 com 변수를 서로 맞바꿔줘야. 
				ex) user가 37 제시
				range / com's Randomnum /result(range) 
				1~50 		25 				down 
				26~50 		40 				up
				26~39 		27 				down
				28~39 		31 				down
				32~39
		*/
		
		Scanner kbd = new Scanner(System.in);
		
		// 최대, 최소값 변수를 따로 두는 방법이...
		int user = kbd.nextInt();
		int max = 50; // Max number
		int min = 1; // Min number
		
		while (true) {
			System.out.println("1~50 중 입력 : ");
		int com = (int)Math.floor(Math.random()*50)+1;
		
		if (user > com ) { // 범위 좁히기에서 감이 안 잡히네;;;
			System.out.println("down");
			com --; 
		}
			
		}
	}

}
