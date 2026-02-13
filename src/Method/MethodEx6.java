package Method;

import java.util.Scanner;

public class MethodEx6 { // 입력이 있고 출력이 없는 메서드
	public static void add(int x, int y) { // 매개 변수 있는 메서드
		System.out.println(x + "와(과) " + y + "의 합은 " + (x + y) 
				+ "입니다.");		
		}	
	
	public static void main(String[] args) {
//		int a = 5, b = 6;
		// 값을 직접 입력받는 형태로 변환
	System.out.println("두 정수를 입력");
	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		add(a,b);
		}

}
