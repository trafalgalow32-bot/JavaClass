package exam15;

public class Calcul {

	public static void main(String[] args) { // 초토화!
		/* 영수증 (실습)

		예시)
		상품명	단가		개수	단가*개수
		라면		1000	5	5000
		맥주		5000	3	15000
		소주		5000	2	10000
		-----------------------------------------
		합계 : 30000
		 */
		
		Product pr1 = new Product();
		pr1.name = "라면";
		pr1.price = 1000;
		pr1.quan = 5;
		
		
		System.out.println(pr1.name + " "+ pr1.price + " "+pr1.quan);
//		Product pr2 = new Product("맥주", 5000, 3);
//		Product pr3 = new Product("소주", 5000, 2);
	}

}
