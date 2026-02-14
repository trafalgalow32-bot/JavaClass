package ClassObject;

public class DogEx {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.breed = "포메라니언";
		dog1.color = "갈색";
		
//		dog2.breed = "똥개";
//		dog2.color = "똥색";
		
		System.out.println("강아지1 품종 : " + dog1.breed);
//		System.out.println("강아지2 품종 : " + dog2.breed);
		System.out.println("강아지1 색상 : " + dog1.color);
//		System.out.println("강아지2 색상 : " + dog2.color);
				
		dog1.bowwow();
		dog1.age = 10;
		System.out.println("강아지1 나이: "+ dog1.age);
		dog1.run();
		
//		dog2.age = 20;
//		System.out.println("강아지2 나이: "+ dog2.age);
//		dog1.name = "다운"; // 이렇게 쓰면 오류남
//		System.out.println("강아지 이름 : " + dog1.name);
//		dog1.sleep();
		

	}

}
