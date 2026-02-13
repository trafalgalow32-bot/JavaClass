package study20260112;

public class Method2 {

	public static void main(String[] args) {
		
		Vending orange = new Vending("쌕쌕 오렌지", 1500, 4);
		Vending grape = new Vending("자연은 청포도",2000, 3);
		Vending apple = new Vending("과수원 사과", 1250, 2);
		
//		orange.buyDrink(1600, "쌕쌕 오렌지");
		orange.buy(1600);
		grape.buy(2000);
		
//		orange.checkSurplus(4);
		orange.supply(3);
		orange.check();
		
		System.out.println( orange );
//		System.out.println( grape );
//		System.out.println( apple );
	}

}
