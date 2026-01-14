package study20260114;

public class SelfMethod {

	public static void main(String[] args) {

		SelfConnect connect = new SelfConnect();
		
		Item[] items = connect.findAll();
		
		System.out.println( items[3]);

	}

}
