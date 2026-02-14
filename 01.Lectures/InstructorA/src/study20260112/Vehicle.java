package InstructorA.src.study20260112;

public class Vehicle {
	private String brandName;
	private String fuel;
	private int year;
	private String TransMission;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTransMission() {
		return TransMission;
	}
	public void setTransMission(String transMission) {
		TransMission = transMission;
	}
	@Override
	public String toString() {
		return "Vehicle [brandName=" + brandName + ", fuel=" + fuel + ", year=" + year + ", TransMission="
				+ TransMission + "]";
	}
	public Vehicle(String brandName, String fuel, int year, String transMission) {
		super();
		this.brandName = brandName;
		this.fuel = fuel;
		this.year = year;
		TransMission = transMission;
	}
	

	
}
