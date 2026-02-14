package Inheritance;

public class CalculEx extends Calculation{
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("두 수의 곱셈 : " + z);
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		CalculEx obj = new CalculEx();
		obj.addition(a, b);
		obj.multiplication(a, b);
		obj.multiplication(a, b);

	}

}
