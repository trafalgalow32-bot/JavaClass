package Inheritance;

public class CatEx {

	public static void main(String[] args) {
		BabyCat babycat = new BabyCat();
		ParentCat momcat = new ParentCat();
		
		System.out.println("어미 고양이 품종: " + momcat.breed);
//		System.out.println("어미 고양이 색상: " + momcat.color); ParentCat은 color 변수가 없다.
		System.out.println("");		
		System.out.println("아기 고양이 품종: " + babycat.breed);
		System.out.println("아기 고양이 색상: " + babycat.color);
		System.out.println("");
		
		babycat.eat();
		babycat.meow();	
		System.out.println("");
		momcat.eat();
//		momcat.meow(); ParentCat은 meow 메서드가 없다.	
		
	}

}
