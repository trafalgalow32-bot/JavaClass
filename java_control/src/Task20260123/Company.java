package Task20260123;

public class Company {

	// 회사명, 지역,  채용 업무
	
		private String companyName;
		private String companyRegion;
		private String recruit;
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getCompanyRegion() {
			return companyRegion;
		}
		public void setCompanyRegion(String companyRegion) {
			this.companyRegion = companyRegion;
		}
		public String getRecruit() {
			return recruit;
		}
		public void setRecruit(String recruit) {
			this.recruit = recruit;
		}
		@Override
		public String toString() {
			return "회사명 : " + companyName + ", 회사 소재지 : " + companyRegion + ", 채용업무 : " + recruit
					+ "]";
		}
}
