package animals;

import common.Animal;

public class Bird extends Animal{
	
	public Bird(String name) { // 생성자
		super(name);
	}
	@Override
	public void sound() {
		System.out.println(" 짹짹 ");
	}

}
