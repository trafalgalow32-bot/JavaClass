package InstructorA.src.Array;

public class ArrayEx6 {
// 2차원 배열 심화: 두 행렬의 합
	public static void main(String[] args) {
		
		int r = 2, c = 3; //2행 3열짜리 배열 선언
		// 각 배열에 값 부여
		int[][] firstMatrix = {{2,3,4}, {3,2,1}}; 
		int[][] secondMatrix = {{1,2,3}, {-4,-2,1}};
		
		int[][] sum = new int[r][c]; // 배열의 합 변수sum 선언 
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		
		System.out.println("두 행렬의 합: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sum[i][j] + "   ");
			}
			System.out.println();
		}
		}
	}