package Information;

public class PersonInfo {
	private String Name; // 이름
	private String ID; // 아이디
	private String PW; // 비밀번호
	private String phone; //전화번호
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "\n <인적사항>  성명 : " + Name + ", ID : " + ID + ", PW : " + PW + ", 전화번호 : " + phone;
	}
	public PersonInfo(String name, String iD, String pW, String phone) {
		super();
		Name = name;
		ID = iD;
		PW = pW;
		this.phone = phone;
	}
	
	
	
}
