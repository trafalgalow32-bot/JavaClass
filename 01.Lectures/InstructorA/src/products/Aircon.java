package InstructorA.src.products;

import InstructorA.src.common.Appliance;

public class Aircon extends Appliance { // 에어컨

	public Aircon() { }
	public Aircon(String name, int powerCon) {
		
		super(name, powerCon); // 부모클래스의 생성자 메서드
		// 상속 받은 메서드이므로 아래와 같이(this) 표현 하면 안됨! super(부모꺼)로 표현해야!
//		this.name = name;
//		this.powerCon = powerCon;
	}
	
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff) System.out.println("냉방을 시작합니다. ");
		else System.out.println("자동건조를 시작합니다. 바이!");
	}
}

