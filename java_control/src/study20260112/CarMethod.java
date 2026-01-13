package study20260112;

import java.util.Scanner;

public class CarMethod {

	public static void main(String[] args) {
		// 자동차
		Vehicle vehicle = new Vehicle("Kia", "Hybrid", 2026, "Auto6");
		System.out.println( vehicle );
		
		Scanner sc = new Scanner(System.in);		
		
		vehicle.DriveMode();
		if(sc.equals("Normal")) {
			System.out.println("파란 조명과 함께 무난한 주행을 시작합니다.");
		} if(sc.equals("Eco")) {
			System.out.println("초록 조명과 함께 친환경적 주행을 시작합니다.");
		} if(sc.equals("Sports")) {
			System.out.println("빨간 조명과 함께 다이나믹한 주행을 시작합니다.");
		}
	}

}
