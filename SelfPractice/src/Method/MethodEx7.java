package Method;

import java.util.Scanner;

public class MethodEx7 { // 입력이 있고 출력이 없는 메서드
	public static void calculate(int x, double y) { 
		// 매개 변수 있는 메서드
		System.out.println(2 * x * y);		
		}	
	
	public static void main(String[] args) {
		int r = 4; // 반지름
		double pi = 3.14;
		System.out.println("원의 둘레 구하는 공식 : 2 X 반지름(r) X 원주율");
		
		System.out.print("2 x " + r + " X " + pi + " = ");
		calculate(r, pi);
		}

}
