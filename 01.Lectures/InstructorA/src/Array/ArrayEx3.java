package Array;

public class ArrayEx3 {
// 2차원 배열(
	public static void main(String[] args) {
		int[][] Arr = new int[2][4];
		Arr[0][0] = 2;				// 2 5 7 4
		Arr[0][1] = 5;				// 9 3 2 8
		Arr[0][2] = 7;
		Arr[0][3] = 4;
		Arr[1][0] = 9;
		Arr[1][1] = 3;
		Arr[1][2] = 2;
		Arr[1][3] = 8;
		
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < Arr.length; i++) {
			sum1 += Arr[0][i];
		}
		
		System.out.println("첫 번째 행의 합계 : " + sum1);
		
		for (int i = 0; i < Arr.length; i++) {
			sum2 += Arr[1][i];
		}
		System.out.println("두 번째 행의 합계 : " + sum2);
	}

}
