package Interface;

public class BirdEx {
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		Bird bird = new Bird();
		
		chicken.fly();
		chicken.walk();
		bird.fly();
	}

}
