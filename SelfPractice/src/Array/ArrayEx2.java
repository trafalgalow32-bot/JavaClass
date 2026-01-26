package Array;

public class ArrayEx2 {

	public static void main(String[] args) {
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
		// double형 배열 gradeArr 선언 및 초기화
		double sum = 0.0;
		
		for (int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		
		double average = sum / gradeArr.length;
		System.out.println("합계 : " + sum);
		System.out.format("평균: %.2f", average);
	}

}
