package InstructorB.src.exam25;

import java.util.List;

public class LowerBoundExample { // 이거 exam26 이었네 제길!
	// Integer를 담을 수 있는 리스트(Integer, Number, Object)에 숫자 추가
	public static void addIntegers(List<? super Integer> list) {
		for (int i = 1; i <= 3; i++) {
			list.add(i); // Integer를 안전하게 저장 가능
		}
	}
}
