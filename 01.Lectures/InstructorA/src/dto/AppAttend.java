package InstructorA.src.dto;

import InstructorA.src.able.Attendance;

public class AppAttend implements Attendance {

	private boolean present = false; // 출석 상태
	
	@Override
	public void checkIn() {		
		present = true;
		System.out.println("앱 출석 완료");		
	}

	@Override
	public void chectOut() {
		present = true;
		System.out.println("앱 퇴실 완료");
	}

	@Override
	public boolean isPresent() {
		return present;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
