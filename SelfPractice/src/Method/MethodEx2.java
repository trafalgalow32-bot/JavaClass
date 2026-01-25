package Method;

public class MethodEx2 { // 매개변수는 없고 반환값이 있는 메서드

	public static int div( ) {
		int a = 10, b = 5;
		int result = a / b;
		
		return result;
	}
	
	public static void main(String[] args) {
		int num = div();
		System.out.println(num);
	}

}
