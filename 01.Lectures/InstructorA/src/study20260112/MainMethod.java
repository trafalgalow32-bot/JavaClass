package InstructorA.src.study20260112;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = "이순신";
		student.age = "34";
//		student.tall = 175; // private 접근 제어자
		
		System.out.println( student );
		
		Student student2 = new Student("김유신","45",172);
		System.out.println( student2 );		
		
		BingoGame bingoGame = new BingoGame("이성계", 5, 4, 3, 6);
		System.out.println( bingoGame );
		
		bingoGame.setName("김춘추");
		
		System.out.println( bingoGame.getName() );
	}

}
