package InstructorB.src.exam11;

import java.util.HashSet;
import java.util.Set;

public class _Exec {

	public static void main(String[] args) {
		//Set - 중복을 허용하지 않는, 순서가 없음(수정 불가!)
		Set<String> set = new HashSet<>(); // 출력값 []
//		System.out.println(set);
		set.add("사과");
		System.out.println("set : " + set); // [사과]
		set.add("바나나");
		System.out.println("set : " + set); // [사과, 바나나]
		set.add("포도");
		System.out.println("set : " + set); // [포도, 사과, 바나나] 순서가 바뀜!!!
		set.add("사과");
		System.out.println("set : " + set); // [포도, 사과, 바나나] 중복을 허용하지 않으므로 또 다른 사과는 보이지도 않음!!
		
		System.out.println("담긴 개수 : " + set.size()); // [포도, 사과, 바나나] 중복을 허용하지 않으므로 또 다른 사과는 보이지도 않음!!
		
		System.out.println("");
		if (set.contains("사과")) {
			System.out.println("사과가 있네.");
		} 
		
		System.out.println("");
		for (String s : set)  {
			System.out.println(s);
		}
		
		System.out.println("");
//		set.remove("체리");
//		System.out.println(set);
		
		if (set.contains("체리")) {
			set.remove("체리");
			set.add("cherry");
		}
		
	}

}
