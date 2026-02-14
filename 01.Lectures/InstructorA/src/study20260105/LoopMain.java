package study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {

//		for( int i =1 ; i <= 10 ; i++) {
//			System.out.println( i );			
//		}

//		for( int i=1 ; i <= 100 ; i++)
//			if(i%10==0)
//			System.out.println(i);

//		Scanner scan = new Scanner(System.in);

//		System.out.println("점수 입력 : ");
//		int num = scan.nextInt();
//		
//		for (int i=1 ; i<=num ; i++)
//			System.out.println(i);		
//	}

		// <실습> 1부터 12까지 출력하는데
		// 4의 배수에는 four라고 출력하시오.

//		for (int i = 1; i <= 12; i++) {
//			if (i % 4 == 0)
//				System.out.println("four");
//			else
//				System.out.println(i);
//		}
//
//		int count = 0;
//		
//		for ( int i = 1; i<=1000 ; i++) {
//			if ( i%17==0) {
//				count++;
//			}
//							
//		}
//		
//		System.out.println("17의 배수 : "+count+"개"); // ★ 한 번만 실행되어야 하는 코드는 for문 밖에 적어줘야!!	
		
		// 문제
		// 동전앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행 하기
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기
		
		Scanner kbd = new Scanner(System.in);
		// 앞면 - 1, 뒷면 - 2
//		System.out.println("앞면(1), 뒷면(2)를 입력하시오.");
//		int com = (int) Math.floor(Math.random() *2 + 1);
//		int user = kbd.nextInt();
//		int count;
//		
//		for (int i=1;i<=10;i++) { // 여기서 독립 시행을 만들려면 어떻게....??
								  // 위 com, user 변수를 for문 안에 넣었어야...
								  // 멘트도 for 문 안쪽으로 가져왔어야...
//		if(com == user)
//				System.out.println(i+" 번째 게임 결과 : 두 동전은 같습니다.");
//		else
//				System.out.println(i+" 번째 게임 결과 : 두 동전은 다릅니다.");
//		}
		//모범답안
		
//			int ok = 0; // 내가 맞춘건지 누적저장 변수
//			for (int i = 1; i <= 10; i++) {
//			int coin = (int)Math.floor(Math.random() * 2) +1;
//			// 1 - 앞면, 2 - 뒷면
//			System.out.println("동전 앞면 뒷면 맞추기");
//			System.out.print("1-앞면, 2-뒷면 \n 입력 : ");
//			int user = kbd.nextInt();
//			
//			if (user == coin) {
//				System.out.println("맞추기 성공!!!");
//				ok++;
//			}else
//				System.out.println("맞추기 실패....");
//			}
//			System.out.println("내가 맞춘 횟수 : "+ ok);
//		
		// 무한 루프 = 반복문은 조건식이 참인 경우에 계속 반복 수행을 한다. 
		// 			무조건 참이 되게 조건식을 설정하면 무한 반복을 할 수 있다. 
		// 무한 루프는 지정된 횟수가 없기에 멈추지 않고 계속 동작한다. 
		// 그래서 무한루프 구현시 특정 조건을 걸어 둔다. 
		
//		for ( ; true ; ) {
//			
//		}
		
//		for ( ; ; ) {
//			
//			
//		}
		
//		int i = 10;
//		while(true) {
//			System.out.println(i);
//			i++;
//			if ( i==40) break;
//		}
		
//		while (true) {
//			int num = (int)Math.floor(Math.random()*20)+1;
//			System.out.println(num);
//			if (num == 11) break;
//		}
		
		int com = (int)Math.floor(Math.random()*50)+1; 
		
		while (true) {
			System.out.println("1~50 중 입력 : "); // 반복해야할 요소들이므로 반복문 안에 적음
			int user = kbd.nextInt();
			
			if (user >com) {
				System.out.println(" DOWN ");
			}
			if (user <com) {
				System.out.println(" UP ");
			}
			if (user == com) {
				System.out.println(" 정답!" );
				break;
			}
		}
		
		
		kbd.close();
		
	}
}

/*

	<1월 5일 과제>
	
	가위 바위 보 게임을 총 15판 진행
	게임을 진행 하면서 1판 끝날 때마다 
	몇 승, 몇 패, 몇 무 전적 출력하기

	+ 과제2 - 내일 (1/6일자) 실습 : 랜덤 숫자 맞추기, 업다운 게임 제작! 입장 바꿔서? 내가 숫자를 제시하고, 컴퓨터도 범위를 좁혀 가며 맞출 수 있도록.
	랜덤 범위가 줄어들어야. up & down . user 변수랑 com 변수를 서로 맞바꿔줘야. 
	ex) 내가 37 제시
	range / show up /result(range) 
	1~50 	25 		up 
	26~50 	40 		down
	26~39 	27 		up
	28~39 	31 		up
	32~39 


 * 반복문 - for, while, do~while 반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정이다. 또는 횟수의 제한 없이 동작
 * 시킬 수 있다.
 * 
 * for문(반복 횟수가 정해져 있는 경우)
 * 
 * for (초기값 ; 조건식 ; 증감식 ) { 반복 실행할 내용; 반복 실행 할 내용; }
 * 
 * for ( int i=1; i<=5 ; i++) {
 * 
 * }
 * 
 * 1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다. 그래야 몇 번 반복 시킬것인지 작성하기도 편하고 파악하기도 빠르고
 * 
 * for ( Member m : MemberList) {
 * 
 * }
 * 
 * 반복 횟수가 정해져 있지 않은 경우 : while, do~while(인터넷 통신 & 채팅 프로그램)
 * 
 * 
 * 
 */