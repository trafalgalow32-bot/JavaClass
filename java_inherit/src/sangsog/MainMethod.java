package sangsog;

import products.Aircon;
import products.Refrigerator;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.power();
		tv.power();
		
		Refrigerator refrigerator = new Refrigerator();
		
		Aircon air = new Aircon("LG 휘센" , 310);
		
		System.out.println( air );
	}

}

// 자바의 상속
// 오버라이딩
// ★다형성★ - 상속과 긴밀히 연관. 상속의 주된 이유(하나를 가지고 여러 가지를 표현하는 특성)
// 추상화
// protected
// final
// instanceof

// 상속공부 하기 위해 사용할만한 주제
// 동물에 대한 상속
// 직원 급여 계산 시스템 - 직원이 부모 - 풀타임 파트타임 직원 분류
// 결제 시스템 결제 부모, 카드 결제 & 계좌 이체 & 현금
// 게임 캐릭터 캐릭터 부모, 직업들이 자식
// 교통 수단 시스템 교통 수단 부모, 버스 기차 자차 오토바이 자전거가 자식