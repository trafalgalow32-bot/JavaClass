package study20260105;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
//		double num = Math.floor(Math.random()*10 + 1);
//		
//		System.out.println(num);
		
		// 동전의 앞면 뒷면 맞추기
		
		Scanner sc = new Scanner(System.in);
		
//		int coin = (int)Math.floor(Math.random() * 2) + 1;
//		// 1 - 앞면, 2 - 뒷면
//		System.out.println("동전 앞면 뒷면 맞추기");
//		System.out.print("1-앞면, 2-뒷면 \n 입력 : ");
//		int user = sc.nextInt();
//		
//		if( user == coin ) 
//			System.out.println("맞추기 성공!!!");
//		else
//			System.out.println("맞추기 실패.....");
	
		// 주사위 1개
		
//		int dice = (int)Math.floor(Math.random() * 6) + 1;
//		
//		System.out.println("주사위 맞추기 게임!!!");
//		System.out.print("1~6 중에 하나 입력 : ");
//		int num = sc.nextInt();
//		
//		if (dice == num) 
//			System.out.println("맞추기 성공!!!");
//		else 
//			System.out.println("맞추기 실패");		
		
		// 주사위 2개 크기 비교
		
		// 컴퓨터 주사위
		int com = (int)Math.floor(Math.random() * 6 ) + 1;
		
		// 나의 주사위
		int user = (int)Math.floor(Math.random() * 6) + 1;
		
		// 내가 컴퓨터보다 큰가? 작은가? 아니면 같은가?
		if (user > com)
			System.out.println(" 나의 승!!");
		else if ( user == com )
			System.out.println(" 비김....");
		else
			System.out.println(" 나의 패배...");
		
		
		
		sc.close();		
	}

}
