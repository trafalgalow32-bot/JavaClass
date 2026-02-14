package CarPractice;

public class CarFunction {

	public static void main(String[] args) {
		Car K3 = new Car("기아","가솔린",2018);
		Car Sorrento = new Car("기아","하이브리드",2026);
		Car Sm3 = new Car("르노","가솔린",2011);
		Car Sonata = new Car("현대","하이브리드",2014);
		
		System.out.println("K3 정보: "+ K3.brand + " "+K3.fueltype+" "+K3.year);
		System.out.println("Sorrento 정보: "+ Sorrento.brand + " "+Sorrento.fueltype+" "+Sorrento.year);
		System.out.println("Sm3 정보: "+ Sm3.brand + " "+Sm3.fueltype+" "+Sm3.year);
		System.out.println("Sonata 정보: "+ Sonata.brand + " "+Sonata.fueltype+" "+Sonata.year);
	}

}
