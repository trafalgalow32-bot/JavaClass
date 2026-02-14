package Array;

public class ArrayEx5 {
// 2차원 배열 심화
	public static void main(String[] args) {
		int Arr[][]  = { {1,2,3,4,5},
						 {6,7,8,9,10},
						 {11,12,13,14,15}};
		
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length + 2; j++) {
				System.out.print(Arr[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("Arr[0][1] 값: " + Arr[0][1]);
		}
	}