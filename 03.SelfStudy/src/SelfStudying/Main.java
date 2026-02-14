package SelfStudying;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동");
		Person p3 = new Person("김철수", 25);
		
		Phone galaxy = new Phone("Galaxy S23 Ultra");
		
		p3.buyPhone(galaxy);
		p3.call("엄마");
	}

}
