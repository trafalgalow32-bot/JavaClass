package study20260108;

import java.util.Arrays;

//import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {

		// 이정도까지는 해야 된다 - 배열 실습
		
		// 문제1. 10개의 무작위 정수 값 저장하기 ( 배열에 ) - 못 풀었음...
		// 		 랜덤 범위는 1~50
//		int nums = (int)Math.floor(Math.random() * 50) + 1;
//		
//		int[] num = new int[10];
//		for(int i=0; i < 10; i++) {			
//			System.out.print(num[i]+" ");			
//		}
////		for(int i=0; i < 10; i++) {
////			System.out.print(nums[i]);
//		}
		
		// 모범답안
		int[] num = new int[10]; // 여기까진 오케이
		for(int i=0; i<num.length; i++) { // 여기서는 num.length 잊어버림
			num[i] = (int)(Math.random()*50) + 1; // 여기부터 전혀 안됨
		}
		System.out.println("------문제1.------");
		
		for(int n : num)
			System.out.print(n+" ");
		
//		System.out.print(Arrays.toString(num));		
		
		// 문제2. (Clear! Luckily!)
		// int[] score = {99,66,77,56,78,98,83};
		// 1학년 3반 학생들의 점수를 배열에 저장하였다. 
		// 3반 학생들 성적의 평균값을 구하세요.
		// 반복문 이용하여 하세요!! 반드시!
		
		int[] score = {99,66,77,56,78,98,83};
		int tot = 0;
		int avg = 0;
		System.out.println(" ");
		System.out.println("\n------문제2.------");
		
		for (int i=0; i<score.length; i++) { //일반 for문 
			tot = tot + score[i]; // 누적 합계! 이걸 몰라서 확장된 for문을 처리함...
		}
		avg = tot / score.length;
		System.out.println("평균 : "+avg);
		
//		for(int i : score) { //확장된 for문 이용
//			tot += i;
//		}
//		avg = (tot / score.length);
//		System.out.println("3반 학생 성적 평균 : " + avg);
//		
		// 문제3. 정수 10개를 저장할 수 있는 배열을 선언 
		//		 1~50의 무작위값 저장하기
		//		 배열의 첫번째 값과 마지막 값 출력 (Great Job!)
//		
		System.out.println(" ");
		System.out.println("------문제3.------");
		int[] numb = new int[10]; // 배열 선언, 그리고 배열의 크기 선언!
		
		for(int i=0; i < numb.length; i++) {
			numb[i] = (int)(Math.random()*50) + 1; // math.random 써준 다음에 
												   //앞에 "int"타입으로 바꿔주는 거 자주 빼먹는듯...
			}
		System.out.print("첫째 값 : "+numb[0]+", 마지막 값 : "+numb[numb.length-1]); // 반복문 안에서 출력시 반복되서 출력되니 유의!!!!
		
		// 문제 4. 문제3번의 배열에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력하시오. 
		
		System.out.println(" ");
		System.out.println("------문제4.------"); //Not Bad.
//		for(int i=0; i < numb.length; i++) {
//			numb[i] = (int)(Math.random()*50) + 1;
//			if(numb[i]%2==0)
//				System.out.print(numb[i]+" "); // "배열 내 짝수 : " 와 같은 문구를 함께 출력할 수는 없는지? 짝수가 무조건 나오는데, 안 나오게는 할 수 없는지?
//			else System.out.print(" "); // 중복 제거는 따로 처리 안함. 방법 찾아볼 것!
//		}
		for (int n : numb) { // (다른 풀이) 확장된 for문 이용
			if(n%2==0)
				System.out.print(n+" ");
		}
		
		// 문제 5. 마지막
		// int[] temp = {6,0,5,-2,0,4,6,0}
		// temp 배열은 일별 최고기온을 저장한 것이다. 
		// 배열에 저장된 기온중 가장 높은 기온과 가장 낮은 기온을 찾으세요.
		// 0번 인덱스의 기온은 12월 11일 데이터이다. 
		// 가장 높은 기온의 날짜와 가장 낮은 기온의 날짜도 출력하세요.
		// (가장 높은 기온, 가장 낮은 기온만 찾아서 출력하는 것만 해도 성공!!)
		
		System.out.println(" ");
		System.out.println("------문제5.------");
		
		int[] temp = {6,0,5,-2,0,4,8,0};
		int max = temp[0];
		int min = temp[0];
//		int date = 11;
		for(int i=0; i < temp.length; i++) {
			if (temp[i] > max) max = temp[i];
			if (temp[i] < min) min = temp[i];
		}
		System.out.println("최고 기온 : "+ max+", 최저 기온 : "+min);
//		System.out.println("날짜 : "+11+"일");
		
		// 0번 인덱스의 기온은 12월 11일이다. 
		// 가장 높은 기온이 몇번째 인덱스에 있는지 찾아야 한다. 
		for (int i=0; i< temp.length; i++) {
			if(temp[i] == max) {
				System.out.println("가장 높은 기온 : " + max + " 날짜 : 12월 " + (i+11)+"일");
			}
			if(temp[i] == min) {
				System.out.println("가장 낮은 기온 : " + min + " 날짜 : 12월 " + (i+11)+"일");
			}			
		}
		
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
		System.out.println("가장 높은 기온 : " + max + " 날짜 : 12월 " + maxDay+"일");
		System.out.println("가장 낮은 기온 : " + min + " 날짜 : 12월 " + minDay+"일");
	}


}
