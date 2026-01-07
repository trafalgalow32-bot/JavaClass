package study20260107;

import java.util.Scanner;

public class Move {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int[][] board = {
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 }
		}; 
		
		int posX = 0, posY = 0;
		
		while(true) {
		for(int i=0; i<board.length; i++) {
			for (int k=0; k<board[i].length; k++) {
				
				if(board[i][k] == 1 ) 
					System.out.printf("%c",'■');
				else if ( board[i][k] == 0)
					System.out.printf(" ");
				else if (board [i][k] == 2) {
					System.out.printf("%c",'∞');
					posX = k; posY = i;
			}
		} 
		System.out.println();		
	}
		char key = scan.nextLine().charAt(0);
		
		// 이동하기 w 위, s 아래, a 왼쪽, d 오른쪽
		board[posY][posX] = 0; 
		switch ( key ) {
		
		case 'w':
			if(board[posY-1][posX] != 1) { // 이걸 추가해줬어야.... 허무....
		//	board[posY][posX] = 0; 이걸 위쪽으로! 아래도 다 삭제! 
		//	board[posY-1][posX] = 2; 이건 아래쪽들도 죄다 생략!
			posY--; // 그리고 이걸로 간소화...
			}
			break;
		case 's':
			if(board[posY+1][posX] != 1) {
		//	board[posY][posX] = 0;
		//	board[posY+1][posX] = 2;
			posY++;
			}
			break;
		case 'a':
			if(board[posY][posX-1] != 1) {
		//	board[posY][posX] = 0;
		//	board[posY][posX-1] = 2;
			posX--;
			}
			break;
		case 'd':
			if(board[posY][posX+1] != 1) {
		//	board[posY][posX] = 0;
		//	board[posY][posX+1] = 2;
			posX++;
			}
			break;
		// 예외처리: 주어진 값 이외의 값을 입력한 경우
		default :
			System.out.println("올바른 이동키를 입력하세요.");		
		}		
		board[posY][posX] = 2; // switch 문 밖으로 이걸 빼냄...
		// 가쪽으로 이동 불가 제한: if 문? 아니면 새롭게 for문 작성?? 1(■)의 위치로는 이동 불가능하게 제약!
		// 어떤 식으로 기능을 구현할지?
		// 위에 구현했다! 키보드 기능 설계할 때 미리 if문을 걸어서...
	
	}
				
//		int[][] board = {{10,20,30,40}, {1,2,3,4}}; // 2차원 배열은 이런 식으로! 1차원 배열 안에 다른 1차원 배열을 넣는 구조!(중괄호 두번)
//		
//		int [] a = {1,2,3,4};
		
		// 2차원 배열(주로 x축, y축)
		// 2차원 배열은 1차원 배열에 1차원배열을 할당하는 것 1차원 배열은 크기가 한 개, 2차원은 두 개
		
//		int[][] arr = new int[3][4];
//		// 3의 크기인 1차원 배열에 4의 크기인 1차원배열을 만드는 것
//		
//		arr[0][0] =1;
//		arr[0][1] =2;
//		arr[0][2] = 20;
//		arr[0][3] = 50;
//		
//		for(int a = 0; a < arr.length; a++) { // 2차원 배열의 첫번째 크기만큼 반복
//			for(int b = 0; b < arr[a].length; b++) { //2차원 배열의 두번째 크기만큼 반복
//				System.out.println( arr[a][b]);
//			}
//		}
				
		// 90~100 A , 80~89 B, 70~79 C, 나머지 F
//		int score = 88;
//		
//		switch( score/10 ) {
////		case 90: 이렇게 하면 아무 결과도 뜨지 않음!
////			System.out.println("A등급");
////		case 80:
////			System.out.println("B등급");
////		case 70:
////			System.out.println("C등급");
////		case 0:
////			System.out.println("F등급");
//		case 10:
//		case 9:
//			System.out.println("A등급");
//			break;
//		case 8:
//			System.out.println("B등급");
//			break;
//		case 7:
//			System.out.println("C등급");
//			break;
//		case 6:
//		case 5:
//		case 4:
//		case 3:
//		case 2:
//		case 1:
//		case 0:
//			System.out.println("C등급");
//			break;
//		}
		
//		double num = 2.0;
//				
//		switch( num ) { // 내가 선택한 것만 실행되게 하기 위해 모든 케이스에 "break;"를 건다!(안 그러면 20보다 큰 케이스 전부 출력됨!)
//		// case에는 범위 있는 값을 입력하면 안됨(*비교 연산자* 사용 불가)! 범위 입력하려면 if문으로... 딱딱 떨어지는 값만...   
//		case 2.8f:
//			System.out.println("2번 선택됨 실행!");
//			break;
//		case 4:
//			System.out.println("4번 선택됨 실행!");
//			break;
//		case 20:
//			System.out.println("20번 선택인데.... 흠");
//			break;
//		case 54:
//			System.out.println("난 54번 인데?? 흠..");
//			break;		
		}
	}