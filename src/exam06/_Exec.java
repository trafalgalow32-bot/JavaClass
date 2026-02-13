package exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 이름, 국어 , 영어, 수학
		// 이름 	국어 	  영어  수학 총점 평균
		// 3명분
		
		Scanner sc = new Scanner(System.in);
		
		List<String[]> list = new ArrayList<>(); // [{"홍길동","90","80","70","240","80"};strs, strs, strs] 제네릭 "문자열 배열"로!
		// 이렇게 한 덩어리로
		
//		for (int i=0; i<3; i++) {
		while (true) {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
//		if (name.equals("q") || name.equals("Q")) {
		if (name.toLowerCase().equals("q")) { // 대문자 Q를 입력해도 소문자인 q로 인식!
			break;
		}
		
		System.out.println("국어 : ");
		String kor_ = sc.nextLine();
		
		System.out.println("영어 : ");
		String eng_ = sc.nextLine();
		
		System.out.println("수학 : ");
		String math_ = sc.nextLine();		
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int math = Integer.parseInt(math_);
		
		int tot = kor + eng + math;
		double avg = (double) tot / 3.0;		
		
		// String imsi = name + "," + kor + "," + eng + "," + math +"," + tot + "," + avg; // 문자열 덩어리
		String[] strs = new String[6]; // 배열로!
		strs[0] = name;
		strs[1] = kor + "";
		strs[2] = eng + ""; // String.valueOf(eng);
		strs[3] = math + "";
		strs[4] = tot + "";
		strs[5] = avg + "";
		
		list.add(strs); // []
	}
		
		for (int i=0; i<list.size(); i++) {
//			String[] strs = list.get(i);
//			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", strs[0], strs[1], strs[2], strs[3], strs[4], strs[5]);
						
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", list.get(i)[0],list.get(i)[1],list.get(i)[2],list.get(i)[3],list.get(i)[4],list.get(i)[5]);
		}
		
//		System.out.println("list : " + list); // 출력값 "list : 주소값"	
		
		
	}

}
