package InstructorA.src.Method;

public class MethodEx5 { // 매개변수와 반환값 없는 메서드
	// 매개변수 없이 1부터 10의 합을 구하여 출력
	public static void sumCount() { // 변수랑 매서드랑 이름이 똑같으니
		// 헷갈려서 서로 다르게 지정함.
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		System.out.println("1부터 10까지의 합계");
		sumCount();
		}

}
