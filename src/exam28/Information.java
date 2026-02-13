package exam28; // 왜 이걸 다른 패키지에 만들어서 import를 시키고 앉아 있냐!

public class Information {
	// 아이디 비밀번호 이름 연락처 주소
	
	private String id;
	private String password;
	private String name;
	private String phone;
	private String address;
	
	public Information(String id, String password, String name, String phone, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	// method
	public void display() {
		System.out.printf("%s \t %s \t %s \t %s \t %s\n", id, password, name, phone, address);
	}
	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
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
	
	
}
