package study20260106;

import java.util.Scanner;

public class NumbMatch_Self {

	public static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 숫자 맞추기(내가 숫자 제시하고, 컴퓨터의 난수 맞추기)
		
		System.out.println("1~50 중 입력 :");
		int user = kbd.nextInt();
		
		int min = 1, max = 50;
		
		while(true) {
			int com = (int)Math.floor(Math.random() * (max-min+1))+min;
			System.out.println("내 숫자 : " + user + " 컴퓨터 숫자 : " + com);
			// Good! 내가 제시한 숫자, 컴퓨터가 뽑은 숫자 같이 보여주려면 이런식으로!
			if( com > user ) {
				System.out.println("DOWN");
				max = com - 1;
			}
			if ( com < user) {
				System.out.println("UP");
				min = com + 1;
			}
			if (user == com ) {
				System.out.println("정답");
				break;
			}
		}
		

	}

}
