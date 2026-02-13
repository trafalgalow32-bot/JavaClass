package exam30;

import java.util.Scanner;

public class SelfStudying {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 중첩 if문 
//		System.out.println("3개 숫자 입력");
//		
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if (a>b) {
//			if (a>c) {
//				System.out.println(a+"는 가장 큰 정수.");
//			} else {
//				System.out.println(a+"는 가장 큰 정수가 아님");
//			}
//		} else {
//			System.out.println(a +"는 가장 큰 정수가 아님");
//		}
//			삼항 연산자
//		
//		System.out.println("유권자의 나이 입력");
//		int age = sc.nextInt();
//		String message = (age > 18) ? "투표권이 있습니다." : "투표권이 없습니다.";
//		System.out.println(message);
		
		// switch 문
//		System.out.println("오늘 시험에서 득점한 점수 입력 : ");
//		int grade = sc.nextInt();
//		
//		switch (grade/10) {
//		case 10 :
//			System.out.println("매우 우수!");
//			break;
//		case 9 :
//			System.out.println("우수!");
//			break;
//		case 8 :
//			System.out.println("적당히 우수");
//			break;
//		case 7 :
//			System.out.println("그저 그럼");
//			break;
//		default:
//			System.out.println("당신은 낙제입니다. 공부하세요!");
//		} 
		/* 생성형 ai에 질문 : 위와 같이 코드를 짜 봤는데, 나는 switch문으로 90~99점 사이는 우수, 80~89점 사이는 적당히 우수
		이런식으로 구현하고 싶은데, 알다시피 위와 같이 코드를 짜면 98점을 입력해도 낙제(default) 값을 표출하게 돼. 
		또한 switch 문에서는 값의 범위 지정은 안되는 걸로 알고 있고, 그렇다고 99, 98, 97... 이런식으로 일일이 점수를 입력하기는
		너무 번거롭고 어렵잖아? 이걸 해결할 수 있는 방법이 없을까? 
		=> 해결! grade/10을 하면 10의 자리 숫자만 나오는데, 이걸로 범위 지정의 기능을 구현할 수 있음! 책 다음 장을 넘겨 보니 이 내용이 나오더군!
		 */
			
		// while문
		int choice = 1;
		while (choice == 1) {
			int a;
			
			System.out.println("숫자 입력 : ");
			a = sc.nextInt();
			
			if (a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			
			System.out.println("1. 계속, 2. 그만"); // 사실 1 이외의 숫자를 눌러도 됨!
			
			choice = sc.nextInt();
		}
			System.out.println("모든 숫자 확인 완료");
	}

}
