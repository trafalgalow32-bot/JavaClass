package study20260112;

public class Car { // 자동차 예시를 통한 상속 개념 이해
	
	void engineOn() { // 부모 클래스 Car
		System.out.println("자동차가 시동을 겁니다.");
	}
	
	class Gasoline extends Car { // 자식 클래스 Gasoline
		@Override
		void engineOn() {
			System.out.println("가솔린차 : 경쾌한 소음과 함께 시동이 걸립니다.");
		}
	}
	
	class Diesel extends Car{ // 자식 클래스 Diesel
		@Override
		void engineOn() {
			System.out.println("디젤차 : 다소 요란한 소음과 함께 시동이 걸립니다.");
			
	class Hybrid extends Car { // 자식 클래스 Hybrid
		@Override
		void engineOn() {
			System.out.println("하이브리드차 : 시동은 켜졌으나 엔진 대신 모터가 작동하여 시동이 안 걸린 듯 조용히 걸립니다.");
		}
		
		/* 부모 클래스인 Car가 갖고 있는 기능 "engineOn"이라는 기능을 자식 클래스들은 공통으로 갖고 있다. 다만 각 자식 클래스마다, 위 예시에서는 
		가솔린차, 디젤차, 하이브리드 차가 각자의 특징에 따라 공통의 기능을 달리 구현한다. 이에 각 자식 클래스에서 engineOn의 기능에 대해 각자의 특징에
		맞게 기능을 재정의(Overriding)하여 구현하는 것이 상속의 원리라 볼 수 있다. */
	}
	}
	}
}
