package exam02;

public class _Exec {

	public static void main(String[] args) { 
		//배열로 만들기
		int num = 10;
		
		String[] strs = new String[num]; // {null, null, null} 초깃값
		
		for (int i=0; i<strs.length ; i++) {
			String name = "홍길동";
			String ssn = "111111-1111111";
			String age = "19";
			strs[i] = name + "," + ssn + "," + age; // {"홍길동,111111-1111111,19", null, null}
			
		}
		
		// 스캐너 입력 없이!
//		String name = "홍길동";
//		String ssn = "111111-1111111";
//		String age = "19";
//		strs[0] = name + "," + ssn + "," + age; // {"홍길동,111111-1111111,19", null, null}
//		
//		name = "이성순";
//		ssn = "222222-2222222";
//		age = "21";
//		strs[1] = name + "," + ssn + "," + age; // {"홍길동,111111-1111111,19", "이성순,222222-2222222,21", null}
//		
//		name = "장천용";
//		ssn = "333333-3333333";
//		age = "23";
//		strs[2] = name + "," + ssn + "," + age;
		
	}

}
