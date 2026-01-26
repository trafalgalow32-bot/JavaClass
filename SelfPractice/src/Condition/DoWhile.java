package Condition;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
//		int i = 1;
//		do {
//			System.out.println("Hello World"); // 우선 실행
//			i++;
//		} while (i < 6); // i가 6보다 작은지 확인, 6보다 작으면 참이므로 출력값 출력
		
		// 예제 4-8.
		//10보다 큰 수부터 10까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while (true) { // 추가(10보다 작은 수 입력 시 빠꾸!)
			System.out.println("10보다 큰 숫자를 입력");
			i = sc.nextInt(); // i를 while문 진입 전에 미리 변수 선언!
			
			if ( i > 10) {
				break;
			} else {
				System.out.println("10보다 큰 수를 입력하시오!");
				System.out.println("");
			}
			
		}
		
		int sum = 0;		
		
		do {
			sum += i; // 입력한 값 증가 연산
			i--; //  단, 입력한 값이 10보다 클 때까지만!
			
		} while (i >= 10);
		
		System.out.println("합계 : " + sum);
		sc.close();
	}

}
