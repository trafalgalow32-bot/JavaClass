package exam27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedExampleEx {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry"));
		List<Integer> intList = Arrays.asList(1,2,3);
	
		
		
//---------------------------------------- 크기 변경 안됨으로 이 영역은 오류 뜸!
//		strList.add("aaaa");
//		strList.remove(0);
//		System.out.println(strList);
//-----------------------------------------
		// But, 수정은 가능함! 추가, 삭제가 안될 뿐! 배열과 비슷한 원리!
		
		strList.set(1, "한라봉");
		System.out.println(strList);
		
		System.out.print("문자열 리스트 : ");
		UnboundedExample.printAll(strList);
		
		System.out.print("숫자 리스트 : ");
		UnboundedExample.printAll(intList);

	}

}
