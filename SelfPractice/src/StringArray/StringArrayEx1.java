package StringArray;


public class StringArrayEx1 {
	public static void main(String[] args) {
		String str = " Java Progamming";
		
		System.out.println("str.length(): " + str.length());
		System.out.println("str.charAt(1): " + str.charAt(1));
		System.out.println("str.substring(6): " + str.substring(6));
		System.out.println("str.substring(5,13): " + str.substring(5,13));
		System.out.println("str.indexOf('P'): " + str.indexOf('P'));
		System.out.println("str.toLowerCase(): " + str.toLowerCase());
		System.out.println("str.toUpperCase(): " + str.toUpperCase());
	}
}
