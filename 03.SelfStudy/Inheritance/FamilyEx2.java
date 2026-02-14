package Inheritance;

public class FamilyEx2 {

	public static void main(String[] args) {
		SubSon subson = new SubSon();
		subson.printSon(); // SubSon 클래스가 직접 갖고 있는 메서드
		subson.printFather(); // SubFather 부모클래스에서 상속받은 메서드
//		subson.printGrandFather(); /* GrandFather 부모 클래스로부터 
//		다중 상속받은 메서드(GrandFather -> SubFather -> Subson) */
		System.out.println("");
		SubDaughter subdaughter = new SubDaughter();
		subdaughter.printDaughter();
		subdaughter.printFather();
	}

}
