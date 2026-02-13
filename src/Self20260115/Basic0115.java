package Self20260115;

import java.util.Scanner;

public class Basic0115 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 삼항 연산자 기본
//		int a = 10,  b  = 15;
//		int max= ( a > b ) ? a : b;
//		System.out.println("최대값 : "+ max);

		// 중첩 삼항 연산자 기본
//		int number = -8;
//		
//		String result = (number % 2 == 0)
//				? "짝수, 절대값 : " + Math.abs(number)
//				: "홀수, 절대값 : " + Math.abs(number);
//		
//		System.out.println(result);
	
		// 반복문 기본
			// for 문 : *반복 횟수가 명확히 정해져* 있을 때 사용
			// 배열, 리스트 순회에 자주 활용
		
			// 1부터 10까지의 합
//		int sum = 0;
//		for (int i = 1; i <=10; i++) {
//			sum += i;
//		}
//		System.out.println("합 : "+sum);
		
			// 구구단 출력
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + (i*j)+"\n");
//			}
//		}
		
			// 배열 순회
//		int[] arr = {10, 20, 30, 40};
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		// while 반복문
			// 조건식이 true일 동안 반복
			// *반복 횟수가 불명확*한 경우
		
			// 사용자 입력 받기 (0 입력 시 종료)
//		System.out.println("====입력값 입력====");
//		int num;
//		while ((num = sc.nextInt()) != 0 ) {
//			System.out.println("입력값: " + num);
//		}
		// do ~ while 문 이용
//		int num;
//		do {
//		System.out.println("====입력값 입력====");
//			num = sc.nextInt();
//		} while(num != 0);
//		System.out.println("입력 종료");
		
		
			// 1부터 100까지 짝수 출력
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
			// 랜덤 숫자 맞추기 게임
//		int target = (int)(Math.random() * 10) + 1; // 10개 숫자 중 1개 뽑기
//		int guess = -1;	// 더미값(실제 정답이 될 수 없는 값)
//		
//		while (guess != target) { // 입력한 숫자가 정답과 다를 때만 반복한다!
//			System.out.println("숫자를 맞춰보세요: ");
//			guess = sc.nextInt();
//		}
//		System.out.println("정답!");
		
		// do~while 반복문
			// 조건을 나중에 검사, 최소 1회는 반드시 실행됨
			// 사용자 입력을 최소 한 번은 받아야 하는 경우 유용
			// 메뉴 선택, 재시도 로직 등에 자주 활용
		
			// 예제1. 메뉴 선택 반복
//			int choice;
//			do {
//				System.out.println("1. 시작 | 2. 종료");
//				choice = sc.nextInt();
//			} while (choice != 2);
//			System.out.println("프로그램 종료");
		
			// 예제2. 비밀번호 확인
//			String password;
//			do {
//				System.out.println("비밀번호 입력 : ");
//				password = sc.nextLine();				
//			} while (!password.equals("1234"));
//			System.out.println("접속 성공");
			
			// 예제3. 1부터 10까지 출력
//			int i = 1;
//			do {
//				System.out.println(i);
//				i++;
//			} while (i <= 10);	
			
		// 스캐너 입력 종료
		sc.close();
	}
}
