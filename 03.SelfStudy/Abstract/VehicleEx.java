package Abstract;

public class VehicleEx {
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		Car car = new Car();
		
		bike.printType();
		bike.printBrand();
		bike.printPrice();
		
		System.out.println("-----------");
		
		car.printType();
		car.printBrand();
		car.printPrice();
	}
}
