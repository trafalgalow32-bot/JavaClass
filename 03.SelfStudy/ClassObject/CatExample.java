package ClassObject;

public class CatExample {

	public static void main(String[] args) {
		Cat cat1 = new Cat(); // 기본 생성자 호출
//		cat1.breed = "페르시안 고양이";
//		cat1.color= "흰색";
		
//		System.out.println("품종 : " + cat1.breed);
//		System.out.println("색상 : " + cat1.color);
//		cat1.meow();
//		
		Cat cat2 = new Cat("샴"); // 기본 생성자 호출
//		cat2.breed = "샴";
//		cat2.eat();
		
		Cat cat3 = new Cat("러시안블루","회색"); // 기본 생성자 호출
//		cat3.breed = "러시안블루";
//		cat3.scratch();
		
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed);

	}

}