package study20260112;

import java.util.Arrays;

public class CarMethod {

	public static void main(String[] args) {
		// 자동차
//		Vehicle vehicles = new Vehicle("Kia", "Hybrid", 2026, "Auto6");
		
		Vehicle[] vehicles = {
				new Vehicle("Kia","Hybrid",2026,"Auto6"),
				new Vehicle("Hyundai","Hybrid",2013,"Auto6"),
				new Vehicle("BMW","Gasoline",2019,"DCT6"),
				new Vehicle("Benz","Diesel",2020,"Auto8"),
				new Vehicle("Renault","Gasoline",2011,"CVT")				
		};
		
//		System.out.println( vehicles );
		
		Driving dm = new Driving();			
		
		dm.selectCar ( vehicles ); // 이렇게 하면 연식 선택은 잘됨!
		
//		dm.DriveMode( vehicles ); 
	}
}

	