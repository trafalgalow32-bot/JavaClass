package InstructorB.src.exam30;

import java.sql.Date;
import java.util.Scanner;

// 한 사람분의 데이터를 저장

public class StudentDTO {
	private int hakbun;
	private String name;
	private String ssn;
	private String phone;
	private String address;
	private Date createdDate;
	
	public StudentDTO() {
		
	}
	
	//method
	public void inputField(String gubun) {
		Scanner sc = new Scanner(System.in);
		
		if (gubun.equals("view") || gubun.equals("sujung") || gubun.equals("sakje")) {
			System.out.print("학번 : ");
			String hakbun_ = sc.nextLine();
			this.hakbun = Integer.parseInt(hakbun_);
		}
		
		if (gubun.equals("chuga")){
			System.out.print("이름 : ");
			this.name = sc.nextLine();
			System.out.print("주민번호 : ");
			this.ssn = sc.nextLine();
			System.out.print("전화번호 : ");
			this.phone = sc.nextLine();
			System.out.print("주소 : ");
			this.address = sc.nextLine();
		} else if (gubun.equals("sujung")) {
			System.out.print("전화번호 : ");
			this.phone = sc.nextLine();
			System.out.print("주소 : ");
			this.address = sc.nextLine();			
		} 
//		else if (gubun.equals("sakje")) {
//			System.out.print("학번 : ");
//			String hakbun_ = sc.nextLine();
//			this.hakbun = Integer.parseInt(hakbun_);			
//		}
	}
	
	public void display() {
		System.out.printf("%d \t %s \t %s \t %s \t %s \t %s\n",hakbun, name, ssn, phone, address, createdDate);
	}
	
	public final int getHakbun() {
		return hakbun;
	}
	public final void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getSsn() {
		return ssn;
	}
	public final void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public final String getPhone() {
		return phone;
	}
	public final void setPhone(String phone) {
		this.phone = phone;
	}
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public final Date getCreatedDate() {
		return createdDate;
	}
	public final void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
