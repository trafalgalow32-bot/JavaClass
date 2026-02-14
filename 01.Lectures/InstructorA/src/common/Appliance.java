package InstructorA.src.common;

public abstract class Appliance { // 가전 제품(부모클래스)

	protected boolean onoff = false; // 전원 여부 protected는 패키지는 달라도 자식 클래스에서 사용 가능하게!
	protected String name; // 제품명
	protected int powerCon; // 소비전력
	
	protected Appliance() {}
	protected Appliance(String name, int powerCon) {
		this.name = name;
		this.powerCon = powerCon;
	}
	
	
	@Override
	public String toString() {
		return "Appliance [onoff=" + onoff + ", name=" + name + ", powerCon=" + powerCon + "]";
	}
	public abstract void power(); { // 추상메서드
		
		// 추상 메서드를 가지고 있는 클래스는 반드시 추상클래스여야만 한다!
	

		onoff = !onoff; // 논리 연산자(!) 활용하여 아래 내용을 간단히 표현!
//		if( onoff ) onoff = false;
//		else 
//			onoff = true;
		String res = onoff ? "켜짐" : "꺼짐";
		
		System.out.println("전원 " + res);		
		// 아래 내용을 간단히 표현 ↑
		
//		if( onoff ) {
//			System.out.println("전원 켜짐");
//		} 
//		else {
//			System.out.println("전원 꺼짐");	
//		}
	}
}
