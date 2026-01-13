package study20260112;



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
	
	// 드라이브 모드
	// 조건 : 차량 연식이 2018년식 이전이면 드라이브 모드 기능 없음
	// 드라이브 모드는 Normal, Eco, Sports 세 가지
	// Normal : 파란 조명과 함께 무난한 주행을 시작합니다. 
	// Eco : 초록 조명과 함께 친환경적 주행을 시작합니다. 
	// Sports : 빨간 조명과 함께 다이나믹한 주행을 시작합니다.
	// 위와 같이 메시지를 표출할 것!	
	
	public void DriveMode () {
		if ( this.year <= 2018) {
			System.out.println("본 차량은 구형이라 드라이브 모드 기능이 없습니다.");			
		} else {
			System.out.println("드라이브 모드 선택");
		} 
	}
	
}
