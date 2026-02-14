package InstructorA.src.Information;

public class InfoMethod {

	public static void main(String[] args) {
		
		PersonInfo Gildong = new PersonInfo("홍길동", "GDHong24","1234","042-270-2702");
		PersonInfo Hyunkyu = new PersonInfo("김현규", "HKkim","1221","042-270-2705");
		PersonInfo JKR = new PersonInfo("전계림", "MasterJKR","DW@1","042-270-2701");
		
				
		System.out.println( Gildong );
		System.out.println( Hyunkyu );
		System.out.println( JKR );
		
		StockInfo Americano = new StockInfo("아메리카노", 1500, "커피", 5);
		StockInfo GreenTea = new StockInfo("녹차", 3000, "논커피-허브티", 15);
		StockInfo Whiskey = new StockInfo("위스키", 20000, "주류", 3);

		System.out.println( Americano );
		System.out.println( GreenTea );
		System.out.println( Whiskey );
		
		
		
		
	}

}
