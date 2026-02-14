package InstructorA.src.study20260106;

import java.util.Scanner;

public class LoopMain2 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 과제 2 풀이 및 실습
//	Scanner Scan = new Scanner(System.in);
		
		// 최대, 최소값 변수 선언
		System.out.println("1~50 중 입력 : "); // 반복해야할 요소들이므로 반복문 안에 적음
		int user = scan.nextInt();
		int max = 50;
		int min = 1;
				
		while (true) {
			int com = (int)Math.floor(Math.random() * (max-min+1)) + min; //오히려 컴퓨터가 반복문 안으로, 50*1 섣불리 쓰면 안됨! 
						
			if (com > user) { // com 이랑 user 자리 체인지!, ex 내가 제시한 수 25, com에서 나온 수 40
				System.out.println(" DOWN ");
				max = com - 1; // 최대값 감소
			}
			if (com < user) { // ex 내가 제시한 수 25, com에서 나온 수 20, 여기는 else if 아님!!
				System.out.println(" UP ");
				min = com + 1;
			}
			if (com == user) {
				System.out.println(" 정답!" );
				break;
			} 
//			System.out.println("내 숫자 : "+ user);
//			System.out.print("컴퓨터 숫자 : "+ com);
		}
	}

}
