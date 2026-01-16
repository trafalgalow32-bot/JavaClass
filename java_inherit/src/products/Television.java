package products;

import common.Appliance;

public class Television extends Appliance { // TV
	
	public int sound;
	public int ch;	
	
	@Override // 컴퓨터에게 주석을 건다? '@'? Annotation(주석) - 일종의 태깅 작업,
	// 오버라이드는 부모 클래스의 메서드를 다른 내용을 구현하는 것을 컴퓨터가 인지시키는 작업이라 보면 됨!
	
	public void power () {
		onoff = !onoff; // 부모 클래스에서 이 메서드를 protected 선언해줘야!
		if(onoff)
			System.out.println("TV 전원이 켜짐");
		else
			System.out.println("TV 전원이 꺼짐");
		
	}
	
	//
	
}
