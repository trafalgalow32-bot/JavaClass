package InstructorB.src.exam11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoExec {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>(); 
		Random random = new Random(); // 1 ~ 45
		
		while (lotto.size() < 6) {
			int num = random.nextInt(45) + 1; // 1 ~ 45까지 랜덤 추출
			lotto.add(num);				
		}
		
		System.out.println("이번 주 로또 당첨 번호 : " + lotto);

	}

}
