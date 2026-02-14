package InstructorA.src.Method;

import java.util.Scanner;

public class MethodEx3 { // 매개변수(입력), 출력이 모두 있는 메서드
	// (가장 일반적인)
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		System.out.println("두 개의 정수 입력");
		Scanner sc = new Scanner(System.in); // 직접 값을 입력받는 형태로 변경!
		int a = sc.nextInt(), b = sc.nextInt();
		int sum = add(a,b);
		System.out.println(a + "와(과) + " + b + "의 합은 " + sum + "입니다.");
	}

}
