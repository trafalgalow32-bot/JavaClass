package InstructorB.src.exam05;

import java.time.LocalDate;

public class _Exec {

	public static void main(String[] args) {
		// 이름, 주민번호
		/*
		  
		123456-1234567  
		이름
		주민번호
		나이
		성별
		*/
		
		String name = "홍길동";
		String ssn = "143456-3234567";
		String imsi = ssn.substring(7, 8);
		
		String gender = "";
//		System.out.println(imsi);
		
		if (imsi.equals("1") || imsi.equals("3")) {
			gender = "남자";
		} else {
			gender = "여자";
		}
//		System.out.println("성별 : " + gender); // 결과 확인
		
		String temp = ssn.substring(0,2);
		System.out.println("temp : " + temp);
		
		int brithYear = 0;
		if (imsi.equals("1") || imsi.equals("2")) { // 1900년대
			brithYear = 1900 + Integer.parseInt(temp); 
		} else { // 2000년대
			brithYear = 2000 + Integer.parseInt(temp); 
		}
//		System.out.println(" brithYear : " + brithYear); // 결과 확인
		
		// 현재 날짜 정보 가져오기
		int year = LocalDate.now().getYear();
		
		int age = year - brithYear;
		System.out.println("age : " + age);
		
		System.out.printf("이름 : %s\n", name);		
		System.out.printf("주민번호 : %s\n", ssn);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("성별 : %s\n", gender);

	}

}
