package exam07;

public class Student { //데이터클래스 ; 한 사람 분의 데이터를 저장! 한 사람당 객체 한 개! 클래스란? 설계도; 종이쪼가리!
	// 이 설계도를 바탕으로 나온 결과물, 즉 물건이 객체! 한 사람분의 데이터를 저장하는 게 객체!
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	// constructor (역할? 매개변수를 받아서 필드에 직접 집어넣는다!) 
	public Student(String name, int kor, int eng, int math) {
		this.name = name; // 매개변수를 쓰는 이유? 외부 값을 필드에 집어넣기 위함!
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total();
		average();
	}
	
	public void total() {
		tot = kor + eng + math;
	}
	
//	public int total() {
//		return tot;
//	}
	
	public void average() {
		avg = tot / 3.0;
	}
	
//	public double average() {
//		avg = tot / 3.0;
//		return avg;		
//	}
	
	// method	
	public void display() {
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\n",name, kor, eng, math, tot, avg);
	}
	
	// getter & setter (위 변수들의 접근제어자가 private이므로 이 작업 필수!)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}
