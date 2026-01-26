package Array;

import java.util.Scanner;

public class ArrayEx4 {
// 2차원 배열 심화
	public static void main(String[] args) {
		double[][] marks = new double[2][3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("학생번호 : " + (i + 1));
			System.out.print("국어점수 : ");
			marks[i][0] = sc.nextDouble();
			
			System.out.print("수학점수 : ");
			marks[i][1] = sc.nextDouble();
			
			marks[i][2] = (marks[i][0] + marks[i][1]) / marks.length;
		}
		// 셀프 학습 : 이중 for 문으로 배열의 구성 요소 출력
//		for (int i = 0; i < marks.length; i++) {
//			System.out.print("국어점수 : ");
//			marks[i][0] = sc.nextDouble();
//			for (int j = 0; j < marks.length; j++) {
//
//				System.out.print("수학점수 : ");
//				marks[i][1] = sc.nextDouble();
//				System.out.println(marks[i][j]);
//			}
//		}
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("학생번호 : " + (i + 1));
			System.out.print("국어 : " + marks[i][0] + " ");
			System.out.print("수학 : " + marks[i][1] + " ");
			System.out.println("평균 : " + marks[i][2] + " ");
		}
	}

}
