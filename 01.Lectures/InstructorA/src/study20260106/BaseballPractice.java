package InstructorA.src.study20260106;

import java.util.Scanner;

public class BaseballPractice {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 숫자 야구
		System.out.println("======= 숫자 야구 =======");
		
		int com1 = (int)Math.floor(Math.random()* 9 ) + 1, com2 = 0, com3 = 0; // com2, com3를 while문 밖으로!
		
//		while (true) { // 숫자 3개 중복 없이 나오게 하기
//			com2 = (int)Math.floor(Math.random()* 9 ) + 1; // 랜덤 들어가야 하는 건 똑같음
//			com3 = (int)Math.floor(Math.random()* 9 ) + 1; // 여기까지는 맞음!
//			if ( com1 != com2 && com1 != com3 && com2 != com3 ) break; 
//		}
		
		do {
			com2 = (int)Math.floor(Math.random()* 9 ) + 1; 
			com3 = (int)Math.floor(Math.random()* 9 ) + 1; 
		} while( !(com1 != com2 && com1 != com3 && com2 != com3 ) );
		
//		System.out.println("세 자릿수 : " +com1+com2+com3);			
			
		while (true) { //반복문 안에 스트라이트, 볼 있음(누적되면 x)
			
			int str=0 , ball = 0;
			System.out.println("1~9 중에 숫자 세 개 입력 : ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();

			if (com1 == user1 ) str++;
			if (com2 == user2 ) str++;
			if (com3 == user3 ) str++;
			
			if( user1 == com2 || user1 == com3) ball++;
			if( user2 == com1 || user2 == com3) ball++;
			if( user3 == com1 || user3 == com2) ball++;
			
			System.out.println(str + "스트라이크 ,"+ball+"볼 ,"+(3-str-ball)+"아웃");
			if(str == 3) {
				System.out.println("정답!!!");
				break;
			}	
		}
		
		
	}

}
