package study20260106;

import java.util.Scanner;

public class Baseball_Self {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//	// Array
//	int [] arr = new int[5]; // array whose size is 5
//	
//	// 예제1. 합계
//	int[] nums = {1,2,3,4,5}; // sum from 1 to 5
//	int sum = 0;
//	for (int i = 0; i< nums.length;i++) {
//		sum += nums[i];
//	}
//	System.out.println("Sum : " + sum);
//	
//	// 예제2. 최대값
//	int[] nums2 = {12,7,19,3,25};
//	int max = nums2[0];
//	for (int i = 0; i < nums2.length; i++) {
//		if (nums2[i] > max) {
//			max = nums2[i];
//		}
//	}
//	System.out.println("Maxium Number :" + max);
//	
//	// 예제3. 배열 값 출력
//	String [] names = {"철수","영희","민수"};
//	for (int i = 0 ; i < names.length; i++) {
//		System.out.print(names[i] + " ");
//	}
//	
	// Baseball(number)
	System.out.println("======= 숫자 야구 =======");
	
	int com1 = (int)Math.floor(Math.random() * 9) + 1, com2 = 0, com3 = 0;
	
	while(true) { // 숫자 3개 중복없이 나오게 하기
		com2 = (int)Math.floor(Math.random() * 9) + 1;
		com3 = (int)Math.floor(Math.random() * 9) + 1;	
		if (com1 != com2 && com1 != com3 && com2 != com3 ) break;
	}
//	System.out.println(com1 + "" + com2 + "" + com3); // ""없이 그냥 나열하면 숫자로 인식해서 합계를 출력함...
	
	while(true) {
		int str = 0, ball = 0;
		System.out.println("1~9 중에 숫자 세개 입력 : ");
		int user1 = scan.nextInt();
		int user2 = scan.nextInt();
		int user3 = scan.nextInt();
		
		if ( com1 == user1 ) str++;
		if ( com2 == user2 ) str++;
		if ( com3 == user3 ) str++;
		
		if ( user1 == com2 || user1 == com3) ball++;
		if ( user2 == com1 || user2 == com3) ball++;
		if ( user3 == com1 || user3 == com2) ball++;
		
		System.out.println(str+"스트라이크 , "+ball+"볼 ,"+(3-str-ball)+"아웃");
		if(str==3) {
			System.out.println("정답!!!");
			break;
		}
		
	}
	
	}

}
