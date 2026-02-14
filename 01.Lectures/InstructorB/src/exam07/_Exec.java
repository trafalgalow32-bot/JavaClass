package InstructorB.src.exam07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 큰가방(Student)
		List<Student> list = new ArrayList<>(); // [{"홍길동","90","80","70","240","80"};strs, strs, strs] 제네릭 "문자열 배열"로!
		// 이렇게 한 덩어리로
		
//		for (int i=0; i<3; i++) {
		while (true) {
			// 여기부터
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
//		int tot = kor + eng + math;
//		double avg = tot / 3.0;
		// 여기까지 데이터 클래스 적절히 수정해서 없앨 수 있다! input 메서드 추가해서!
		
		// 작은 가방(student)
		Student student = new Student(name, kor, eng, math); // 기본 생성자 (Student 기본 생성자에 의해 student라는 객체 하나를 만들어라!)
//		student.setName(name); 기본 생성자를 안 쓰게 되면 이런 항목들은 필요 없게 되고, 위와 같이 간소화!
//		student.setKor(kor); // 단, 기본 생성자를 쓰게 되면 new Student() 를 쓰고 이 내용들 살려줘야 함!
//		student.setEng(eng);
//		student.setMath(math);
//		student.setTot(tot);
//		student.setAvg(avg);
		
		list.add(student); // 인덱스를 쓰면 무조건 for 문 사용!
		}
		
		for (int i=0; i<list.size(); i++) {
//			Student s = list.get(i);
//			System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\n",s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTot(), s.getAvg());
			list.get(i).display();
		}
	}

}
