package exam01;

import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {		
		/* 
		입력 : 이름, 주민번호, 나이
		출력 : 이름, 주민번호, 나이
		입력 -> 처리 -> 출력
		*/			
		
		Scanner sc = new Scanner(System.in);
		
		String strs = "";
		System.out.println("이름, 주민번호, 나이를 입력하시오.");
		
		System.out.print("이름 : ");
		String name = sc.nextLine(); // 이름 입력
		System.out.print("주민번호 : ");
		String pn = sc.nextLine(); // 주민번호 입력
		System.out.print("나이 : ");		
		String age = sc.nextLine(); // 나이 입력
		
//		System.out.println(name + "\t"+pn+"\t"+age); // \t, 여기까지 한 명분
		// 두 사람 분? 복붙해도 되지만... 변수명이 겹치는 문제가 생김. 변수의 갯수를 줄이는 것이 관건. 한 덩어리로! 클래스로! 
		strs = strs +"/"+name+","+pn+","+age;
		
		System.out.print("이름 : ");
		name = sc.nextLine(); // 이름 입력
		System.out.print("주민번호 : ");
		pn = sc.nextLine(); // 주민번호 입력
		System.out.print("나이 : ");		
		age = sc.nextLine(); // 나이 입력
		strs = strs +"/"+name+","+pn+","+age;

		System.out.println(strs);
		strs = strs.substring(1);
		System.out.println(strs);
		String[] array = strs.split("/"); // {"홍길동,123456-1234567,19","이성순,111111-1111111,21"}
		
		System.out.println(array[0]); // "홍길동,123456-1234567,19"
		System.out.println(array[1]); // "이성순,111111-1111111,21"
		
		String imsi = array[0]; // "홍길동,123456-1234567,19"
		String[] array2 = imsi.split(",");
		System.out.println(array2[0]+"\t" +array2[1]+"\t"+array2[2]); // {"홍길동", "123456-1234567", "19"}
		
		
		sc.close();
		
	}

}
