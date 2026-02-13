package Self20260115;

public class ArraySelf {

	public static void main(String[] args) {
		// 1차원 배열
			// 예제1. 합계 구하기
//		int[] nums = {1,2,3,4,5};
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			sum += nums[i];
//		}
//		System.out.println("합계 : "+sum);
		
		
			// 예제2. 최대값 찾기
//		int[] nums = {12,7,19,3,45};
//		int max = nums[0];
//		for (int i = 1; i < nums.length; i++) {
//			if (nums[i] > max) max = nums[i];
//		}
//		System.out.println("최대값: " + max);
	
	
			// 예제3. 배열 값 출력
//		String[] names = {"철수", "영희", "민수"};
//		for (int i = 0; i < names.length; i++) {
//			System.out.println( names[i] );
//		}
	
			// 배열 초기화 응용 문제
		// 크기 10의 배열을 생성하고, 1부터 10까지의 값을 순서대로 저장한 뒤 출력하시오.
//		int[] arr = new int[10]; // 크기 10의 배열 생성
//		for (int i = 0; i < arr.length ; i++) {
//			arr[i] = i + 1; // 1부터 10까지의 값 저장
//		}
//		for (int i = 0; i < arr.length ; i++) {
//			System.out.println(arr[i] + " "); // 배열에 저장된 1부터 10까지의 값 차례로 출력
//		}
			
		// 2차원 배열
		// 배열 안에 배열을 저장하는 구조. 
		// 흔히 행(row)과 열(column)으로 표현.
		// int [][] arr = new int[행][열];
		
			// 예제1. 2차원 배열 출력
//		int [][] arr = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//	
//		for (int i = 0; i < arr.length ; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j] + " ");
//				}
//		}
//		System.out.println();
			
		
			// 예제2. 성적 평균 구하기
//		int [][] scores = {
//				{90, 85, 70},
//				{88, 92, 76},
//				{95, 80, 85}
//		};
//		
//		for (int i = 0; i < scores.length; i++) {
//			int sum = 0;
//			for (int j = 0; j <scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//			double avg = (double) sum / scores[i].length;
//			System.out.println((i+1) + "번 학생 평균 : " + avg);
//			
//		}
		
	} // main 중괄호
} // 클래스 중괄호
