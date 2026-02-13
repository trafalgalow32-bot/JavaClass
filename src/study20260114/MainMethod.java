package study20260114;

public class MainMethod {

	public static void main(String[] args) {
		
		DBConnnect connect = new DBConnnect();
		
		GameMember[] gameMembers = connect.findAll();
		
		System.out.println( gameMembers[2] );

	}

}
