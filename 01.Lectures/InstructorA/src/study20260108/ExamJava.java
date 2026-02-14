package InstructorA.src.study20260108;

public class ExamJava {

	public static void main(String[] args) {
		// 문제1. 다음 정보를 각각 알맞은 자료형의 변수로 선언하고 값을 저장한 뒤 출력하시오.
		System.out.println("=========문제1=========");
		String name; // 이름
		int age = 0; // 나이
		double height = 0.0; // 키
		char gender; // 성별
		boolean teen = false; //학생여부
		
		name = "홍길동";
		age = 25;
		height = 175.5;
		gender = '남';
		if(age >= 19) teen = true;
		System.out.println(" 이름 : "+name +"\n 나이 : "+age+"\n 키 : "+height+"\n 성별 : "+gender+"\n 학생여부 : "+teen);		

		System.out.println("");
		/* 문제2. 정수형 변수 a와 b가 다음과 같이 선언되어 있다.
			a = 10
			b = 20
			임시 변수(temp)를 사용하여 두 변수의 값을 서로 바꾼 뒤 출력하시오.		
		 */
		System.out.println("=========문제2=========");
		int a = 10;
		int b = 20;
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a : "+ b +", b : "+ a);
		System.out.println("");
		
		System.out.println("=========문제3=========");
		/* 문제3. 가로(width)가 8, 세로(height)가 5인 사각형이 있다. 
		 		 사각형의 넓이를 계산하여 출력하시오.
		 */
		int w = 8;
		int h = 5; // ★ 1번 문제의 height와 변수 중첩되는 관계로 약어 사용 ★
		
		System.out.println("사각형의 넓이 : " + w*h);
		
		System.out.println("");
		
		System.out.println("=========문제4=========");
		/* 문제4. 다음 세 과목 점수가 주어져 있다. 
		 국어 : 85, 영어 90, 수학 78
		 총점을 계산하시오. 평균을 계산하시오. (단, 평균은 정수로 출력)
		 */
		
		int kor = 85;
		int eng = 90;
		int math = 78;
		int tot = kor+eng+math;
		double avg = (kor+eng+math)/3;
		
		System.out.println(" 총점 : " +tot+" 평균 : "+(int)avg);
		
		System.out.println("");
		
		System.out.println("=========문제5=========");
		/* 문제5. 전체 초(second)가 3,726초로 주어져 있다. 이를 다음과 같이 변환하여 출력하시오. 
		 */
		int tsecond = 3726;
		int second = (tsecond % 60); // 초
		int minute = (tsecond / 60) % 60; //분
		int hour = (tsecond / 60) / 60; //시
		System.out.println(hour+"시간 "+minute+"분 "+second+"초");
		
		System.out.println("");
		
		System.out.println("=========문제6=========");
		/* 문제6. 정수형 변수 score에 시험 점수가 저장되어 있다. 
		  점수가 60점 이상이면 합격, 그렇지 않으면 불합격을 출력하시오.
		 */
		
		int score = 72;
		if(score >= 60) System.out.println("합격");
		else System.out.println("불합격");
		
		System.out.println("");
		
		System.out.println("=========문제7=========");
		/* 문제7. 정수형 변수 score가 다음과 같이 주어진다. 
		  점수에 따라 아래 기준으로 학점을 출력하시오.
		  
		  점수 범위		학점
		  90 이상			A
		  80 이상			B
		  70 이상			C
		  60 이상			D
		  60 미만			F		  
		 */
		
		int score1 = 55; // 문제 6번에 score 변수가 이미 존재하므로 별도 표기.
		if (score1 >= 90) System.out.println("A");
		else if (score1 >= 80) System.out.println("B");
		else if (score1 >= 70) System.out.println("C");
		else if (score1 >= 60) System.out.println("D");
		else  System.out.println("F");		
		
		System.out.println("");
		
		System.out.println("=========문제8=========");
		/* 문제8. 정수형 변수 n에 값이 저장되어 있다. 
		 	1부터 n까지의 합을 계산하여 출력하시오.		 	
		 */
		
		int n = 10;
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		} System.out.println(n+"까지의 총합 : "+sum);
		
		System.out.println("");
		
		System.out.println("=========문제9=========");
		/* 문제9. 다음 정수 배열이 주어진다.
		 	 	int[] arr = {10,20,30,40,50}
		 	 배열의 모든 값의 총합을 구하고 평균(정수)을 구하여 출력하시오.
		 */
		
		int[] arr = {10,20,30,40,50};
		int suma = 0; // 중복 변수 존재하므로 뒤에 a붙여서 명명
		int avga = 0; // 중복 변수 존재하므로 뒤에 a붙여서 명명
		
		
		for(int i=0;i<arr.length;i++) {
			suma = suma + arr[i];
		}
		avga = suma / arr.length;
		System.out.println("총합 : "+suma+" 평균 : "+avga);
		
		System.out.println("");
		
		System.out.println("=========문제10=========");
		/* 문제10. 다음 정수 배열이 주어진다.
		 	 	int[] scores = {87,65,92,100,74}
		 	 배열에서 최대값과 최소값을 찾아 출력하시오.
		 */
		int[] scores = {87,65,92,100,74};
		int max = scores[0];
		int min = scores[0];
		
		for(int i=0; i < scores.length ;i++) {
			if( scores[i] > max) max = scores[i];
			if( scores[i] < min) min = scores[i];
		}
		System.out.println("최대 값 : "+max+" 최소 값 : "+min);
		
		System.out.println("");
		
		System.out.println("=========문제11=========");
		/* 문제11. 다음 정수 배열이 주어진다.
		 	 	int[] nums = {3,8,15,22,7,10};
		 	 배열을 순회하면서 아래 규칙으로 result를 계산하시오.
		 	 값이 짝수면 result에 더한다.
		 	 값이 홀수면 result에서 뺀다.
		 	 마지막 result 값을 출력하시오.
		 */
		int[] nums = {3,8,15,22,7,10};
		int result = nums[0];
		
		for(int i=0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result += nums[i];
			} else
				result -= nums[i];
		}
		System.out.println(result);
		
	}

}
