package study20260106;

public class ArrayMain {

	public static void main(String[] args) {
	
//		String a = "good"; // 클래스 타입, 사용자 정의 데이터 타입
//		String aa = new String("member"); // 원래는 new 연산자를 붙이는 게 정석!
//		
//		System.out.println( aa + "     " + a);
//		
//		String word = "I like banana";
//		System.out.println(word);
//		
//		System.out.println(word.charAt(4));
//		
//		System.out.println(word.indexOf("b"));
//		
//		System.out.println(word.substring(2));
//		
		String name = "이순신-김유신-김춘추-이성계-박문수-박팽년";
		
//		System.out.println(name);
		
		String [] names = name.split("-"); // 자바 주소가 나오네?? "-" 기준으로 분리해서 배열에 저장!
		// String [] names = {"이순신","김유신","김춘추","이성계","박문수","박팽년"};
		
//		System.out.println( names [1]); // [0] 이순신 출력 [1] 김유신 출력/  그냥 names만 프린트하면 주소값이 출력됨!
		
		// <★실습> 반복문으로 이름을 전부 출력하세요. (한 줄에 하나씩)
		for (int i = 0 ; i < names.length ; i++) {
		
		System.out.println(names[i]+" ");
		}
		
		// 다른 풀이
		for (String wow : names) {
			// 위 중 성씨가 "김"씨인 사람만 출력
//			if (wow.charAt(0) == '김')
			// "신"이 들어간 이름 출력
			if (wow.indexOf('신') != -1 ) // -1은 배열에서 없는 케이스. 즉, indexOf으로 신을 찾을 때 -1이 안뜨는 값 표출 
			System.out.println("\n"+wow + " ");
		}
		
		String[] fruits = {"사과", "딸기","배","수박",
				"바나나","복숭아","파인애플","아보카도",
				"오렌지","감","한라봉","망고"
				};
		
		// 문제1. fruits 배열에서 과일이름이 3자 이상인것만 출력하세요.
		System.out.println(" ");
//		for (String fruit : fruits) {
//			if(fruit.length() >= 3)
//			System.out.println(fruit);
//		}
			
		// 문제2. fruits 배열에서 딸기와 수박은 제외하고 출력하세요!
		for (String fruit : fruits) { // 반복문을 벗어나면 변수 그대로 써도 됨(위에 쓴 fruit)
			// 고전적인 방법: 그냥 미일치 항목만 조건 걸어 출력
//			if(fruit != "딸기" && fruit != "수박")
			// 고차원적인 방법: 메서드 활용!
//			if(fruit.indexOf("딸기") == -1 && fruit.indexOf("수박")== -1) // != 0으로 해도, == -1로 해도 결과는 출력된다. 위랑 별 다를 바 없어서...
			if(!fruit.equals("딸기") && !fruit.equals("수박"))
			System.out.println(fruit);
		}
		
		System.out.println("\n\n\n");
		
		// 과일을 한 줄에 4개씩 세 줄로 출력할 것이다. 
		for(int i=0; i < fruits.length ; i++) {
			if (i%4==0)
				System.out.println();
			
			System.out.print( fruits[i]+" ");
			
		}
		
//		int b; // 기본데이터 타입
//		
//		char c = 'a'; // 한 글자만 포현 가능. ab 같은 건 불가! 문자열은? 아래!
//		
//		char[] temp = new char[5]; // 문자열은 주소
//		
//		temp[0] = 'g'; temp[1] = 'o'; temp[2] = 'o'; temp[3] = 'd';
//		System.out.println( temp ); 

//		// 타입 지정(변수)
////		int arr;
//		
//		// 배열 ("[]" 대괄호 사용) - "정적 배열"
//		int[] arr = new int[5]; // 크기가 5인 배열, 프로그램 실행 중 배열 크기 변경 불가!("동적 배열"만 가능)
//								// new : 새로운 공간 할당의 개념
//								// arr은 참조 변수이다. 참조 변수는 메모리 주소를 저장할 수 있는 변수이다. 
////		System.out.println(arr); // 이렇게 쓰면 메모리 주소를 16진수로 표출("[I@378fd1ac")
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 55;
//		arr[3] = 11;
//		arr[4] = 99;
//		
//		System.out.println(arr[2]);
//		
//		for (int i=0; i < arr.length ; i++) { // 배열의 크기를 직접 숫자로 적기 보다는, length로 표기!
//											  // 저장 및 수정은 이 코드를 써야!
//			
//			System.out.print( arr[i]);
//		}
//		
//		for ( int num : arr ) { // 향상된 for 문(배열에 저장된 값을 뽑아서 변수에 담아 출력. 데이터 저장은 불가능! 인덱스가 없다!)
//								// 하지만 이 for 문을 많이 이용할 것...
//			if (num > 50 )
//			System.out.println( num );
//		}
//		
//		int[] arr2 = {10,20,30}; //10, 20, 30이 저장된 배열(크기가 3인 배열)
//		
//		
//		
	}

}

/*
	배열 - 동일한 데이터타입의 데이터 저장공간이 연속적으로 나열되어있는 구조
	
	

*/