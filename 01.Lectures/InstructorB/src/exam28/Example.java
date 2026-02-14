package InstructorB.src.exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
//		int num = 0;
		
//		for (int i = 0; i < 9; i++) {
//			num = sc.nextInt();
//			if (num == 0) {
//				System.out.println("프로그램 종료");
//			break;
//			} if (num == 1) {
//				System.out.println("- 목록 -");
//			} if (num == 2) {
//				System.out.println("- 등록 -");
//			} if (num == 3) {
//				System.out.println("- 수정 -");
//			} if (num == 4) {
//				System.out.println("- 삭제 -");
//			} else {
//				System.out.println("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)");
//			}
//		}
		List<ProductDTO> productList = new ArrayList<>(); // 수정, 삭제도 해야하므로!
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
//		String select = "선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)"; // 이것도 반복문에 넣어야!
		while (true) {// (num != 0) { // while문을 이렇게 못 다룰 줄이야.. 문구도 반복문 안에 넣어 줬어야!			
			System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)"); // num 변수랑 초기 멘트를 반복문 안에 다 넣어줬어야...
			String num = sc.nextLine();
			if (num.equals("0")) {// (num == 0) {				 
				break;
			} else if (num.equals("1")) { // 여기다 for문을 써서 주소 안에 들어있는 값을 끄집어 내야?? Bingo!!!
				int hab = 0;
				 for (int i =0; i < productList.size(); i++) {
					 productList.get(i).display(); // 아래 코드 대신 DTO 클래스에 새롭게 써놓은 메서드를 실행시킨다!
					 //System.out.println(productList.get(i).getProductName() + " / " + productList.get(i).getProductPrice()); 
					 //get을 써도 주소가 찍힘... 그럼 어케 해야?? get.getter값!
					 hab += productList.get(i).getTot();
				 } 			
			System.out.println("-----------------------------");
			System.out.println("합계 : " + hab);
			
				
			} else if (num.equals("2")) {
				/* 내가 입력한 코드
				System.out.println("-- 등록 -- \n 메뉴명 단가 개수 단가*개수 입력");		
				List<String> listMenu = new ArrayList<String>();
				String name = sc.nextLine();
				listMenu.add(name);
				System.out.println("현재 등록한 메뉴 : " + listMenu);
				*/
				System.out.print("상품이름 : ");
				String productName = sc.nextLine();
				System.out.print("상품가격 : ");
				String productPrice_ = sc.nextLine();
				int productPrice = Integer.parseInt(productPrice_);
				System.out.print("구매수량 : ");
				String buyCounter_ = sc.nextLine();
				int buyCounter = Integer.parseInt(buyCounter_);
//				int tot = productPrice * buyCounter;
				
				ProductDTO dto = new ProductDTO(productName, productPrice, buyCounter); // 작은 가방
				productList.add(dto); // 큰 가방 안에 작은 가방을(내용물 포함해서!)
				
//				String msg = productName + " / " + productPrice + " / "; 
//				msg += buyCounter + " / " + tot;
//				System.out.println(msg);
				
			} else if (num.equals("3")) {
				System.out.println("-- 수정 --");				
				
				
			} else if (num.equals("4")) {
				System.out.println("-- 삭제 --");				
			}
//			else if (num == 1) {
//				System.out.println("- 목록 -");		
//				return;
//			} else if (num == 2) {
//				System.out.println("- 등록 -");
//				return;
//			} else if (num == 3) {
//				System.out.println("- 수정 -");
//				return;
//			} else if (num == 4) {
//				System.out.println("- 삭제 -");
//				return;
//			} else {
////				System.out.println("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)");
//				continue;
//			}
		}
		System.out.println("-- 프로그램 종료 --");				
		

	}

}
