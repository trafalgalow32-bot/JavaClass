package Inheritance;

public class SubSon extends SubFather{
	void printSon() {
		System.out.println("나는 아들입니다.");
		System.out.println("나는 아버지로부터 상속받습니다.");
		System.out.println("나의 아버지는 "+ this.familyName + "입니다.");
		System.out.println("나는 집은 " + this.houseAddress + "입니다.");
	}
}
