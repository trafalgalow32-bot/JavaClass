package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec { // 실행 메서드(메인 메서드)

	public static void main(String[] args) {
		
//		Student s1 = new Student("홍길동", 80); // Student 클래스를 이용하여 s1이라는 변수 생성. 이 변수는 홍길동, 80의 매개변수 가짐
//		Student s2 = new Student("이성순", 90); 
//		Student s3 = new Student("장천용", 100); 
		
		List<Student> list = new ArrayList<>(); // [] [s1, s2, ...]
		list.add(new Student("홍길동", 80)); // [s1]
		list.add(new Student("이성순", 90)); // [s1, s2]
		list.add(new Student("장천용", 100)); // [s1, s2, s3]
		
		// 람다를 이용한 정렬 (점수 내림차순)
//		list.sort((s1,s2) -> s2.score - s1.score);
//		
//		System.out.println("성적순 정렬 결과 :");
//		System.out.println(list);

		
		
	}

}
