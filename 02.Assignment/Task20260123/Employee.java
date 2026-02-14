package Task20260123;

public class Employee {
	//이름, 소속, 나이, 연락처, 업무, 희망지역, 희망업무
	
		private String name;
		private String belong;
		private int age;
		private String phone;
		private String work;
		private String region;
		private String wannawork;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBelong() {
			return belong;
		}
		public void setBelong(String belong) {
			this.belong = belong;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getWork() {
			return work;
		}
		public void setWork(String work) {
			this.work = work;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public String getWannawork() {
			return wannawork;
		}
		public void setWannawork(String wannawork) {
			this.wannawork = wannawork;
		}
		@Override
		public String toString() {
			return "이름 : " + name + ", 소속 : " + belong + ", 나이 : " + age + ", 연락처 : " + phone + ", 업무 : " + work
					+ ", 희망지역 : " + region + ", 희망업무 : " + wannawork + "]";
		}
}
