package Method;

import java.util.Scanner;

public class MethodEx4 { // 매개변수(입력), 출력이 모두 있는 메서드
	// (가장 일반적인), 다른 예제( 큰 수 판별) max 메서드
	public static int max(int x, int y) {
		int result;
		if (x > y) result = x;
		else result = y;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("두 개의 정수 입력");
		Scanner sc = new Scanner(System.in); // 직접 값을 입력받는 형태로 변경!
		int a = sc.nextInt(), b = sc.nextInt();
		int num = max(a,b);
		System.out.println(a + "와(과) + " + b + "의 수 중 " + num + "이 큽니다.");
	}

}
