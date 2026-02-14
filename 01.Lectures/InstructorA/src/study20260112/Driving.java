package InstructorA.src.study20260112;

import java.util.Scanner;

public class Driving {
	private Scanner sc = new Scanner(System.in);
	private String drivemode = sc.nextLine();

	// 드라이브 모드
	// 조건 : 차량 연식이 2018년식 이전이면 드라이브 모드 기능 없음
	// 드라이브 모드는 Normal, Eco, Sports 세 가지
	// Normal : 파란 조명과 함께 무난한 주행을 시작합니다. 
	// Eco : 초록 조명과 함께 친환경적 주행을 시작합니다. 
	// Sports : 빨간 조명과 함께 다이나믹한 주행을 시작합니다.
	// 위와 같이 메시지를 표출할 것!	
	
	public void selectCar(Vehicle[] vehicles) {
		System.out.println("====차량 선택====");
		System.out.print("차량 입력 : ");
		String carName = sc.nextLine(); // 차량명 입력
		
		for ( Vehicle vehicle : vehicles) {
			if(vehicle.getBrandName().equals(carName)) {
				System.out.println("본 차량은 "+ vehicle.getYear()+"년 식입니다.");
				break; // 브랜드명에 해당하는 차량 연식 표출
			}
		}
		boolean isOldcar = false;
		for (Vehicle vehicle : vehicles ) {
			if ( vehicle.getYear() <= 2018) {
				System.out.println("본 차량은 구형이라 드라이브 모드 기능이 없습니다.");			
				isOldcar = true;
				break;	
		} if(isOldcar = false) { // DriveMode에 대해서도 변수 선언 해줘야 할듯...
			System.out.println("====Gear Knob====");
			System.out.print("====Normal, Eco, Sports====");
			if (drivemode.equals("normal")) {
				System.out.println("Normal : 파란 조명과 함께 무난한 주행을 시작합니다.");
			} else if (drivemode.equals("eco")) {
				System.out.println("Eco : 초록 조명과 함께 친환경적 주행을 시작합니다.");
			} else if (drivemode.equals("sports")) {
				System.out.println("Sports : 빨간 조명과 함께 다이나믹한 주행을 시작합니다.");
			} else {
				System.out.println("Such Gear Mode doesn't exist!");
			}
		}
		} 
	}
	
//	// 드라이브 모드를 하는 건 좋은데, 위에서 선택된 연식을 반영해야!
//	public void DriveMode (Vehicle[] vehicles) {
////		String gear = sc.nextLine();
//		String drivemode = sc.nextLine();
//		
//		boolean isOldcar = false;
//		for (Vehicle vehicle : vehicles ) {
//			if ( vehicle.getYear() <= 2018) {
//				System.out.println("본 차량은 구형이라 드라이브 모드 기능이 없습니다.");			
//				isOldcar = true;
//				break;
//			}
//		 if(isOldcar = false) { // DriveMode에 대해서도 변수 선언 해줘야 할듯...
//			System.out.println("====Gear Knob====");
//			System.out.print("====Normal, Eco, Sports====");
//			if (drivemode.equals("normal")) {
//				System.out.println("Normal : 파란 조명과 함께 무난한 주행을 시작합니다.");
//			} else if (drivemode.equals("eco")) {
//				System.out.println("Eco : 초록 조명과 함께 친환경적 주행을 시작합니다.");
//			} else if (drivemode.equals("sports")) {
//				System.out.println("Sports : 빨간 조명과 함께 다이나믹한 주행을 시작합니다.");
//			} else {
//				System.out.println("Such Gear Mode doesn't exist!");
//			}
//		}
//		} 
//	}
}
