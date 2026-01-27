package ClassObject;

public class StudentExample {

	public static void main(String[] args) {
		
		System.out.println("====학생 주소록==== \n");
		Student student1 = new Student(); // 기본 생성자 호출
		/* Student 클래스의 printInfo 메서드를 사용하여 
		객체 생성 */
		
		student1.insertRecord(20221004, "홍길순");
//		student1.id = 20221004;
//		student1.name = "홍길동";
		student1.printInfo();
		
		System.out.println(" "); // 가독성 제고
		// insertRecord 메서드를 사용하여 객체 생성
//		Student student2 = new Student();
//		student2.insertRecord(2002105, "홍길순");
//		student2.printInfo();
		
		Student student2 = new Student(20221005,"다른 홍길동");
		student2.printInfo();
		
	}
}
