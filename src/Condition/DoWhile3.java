package Condition;

public class DoWhile3 {

	public static void main(String[] args) {
		// continue(3, 6, 9)

//	for ( int i = 0; i <= 10; i++) {
//		if ( i == 3 || i == 6 || i == 9) {
//			continue;
//		}
//		System.out.print(i + " ");
//	}

		// 3x2 건너뛰기

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < 3; j++) {
				if (i == 3 && j == 2) {
					continue;
				}
				System.out.println(i + " * " + j);
			}

		}

	}
}
