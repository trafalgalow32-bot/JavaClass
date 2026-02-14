package InstructorA.src.Condition;

public class DoWhile2 {

	public static void main(String[] args) {
	// 구구단 출력
		
		for (int i = 1; i <= 9; i++) {
				System.out.println("");
				System.out.println("구구단 " + i + "단");
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		
	}

}
