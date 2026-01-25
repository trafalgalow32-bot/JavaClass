package Condition;

import java.util.Scanner;

public class DoWhile4 {

	public static void main(String[] args) {
	// 별표 역삼각형
		Scanner sc = new Scanner(System.in);
		System.out.print("길이 : ");
		
		int len = sc.nextInt();
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * len)- 1 -(i*2); j++) { // 
				System.out.print("*");
			}
		System.out.println("");
		sc.close();
		}		
	}
}
