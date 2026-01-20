package exam03;

import java.util.ArrayList; // 첫글자가 대문자, 따라서 클래스!
import java.util.List;

public class _Exec {

	public static void main(String[] args) { // list
		// 리스트 : 큰 가방
//		ArrayList<String> list = new ArrayList<>(); 
				
		// 제너릭(Generric) : 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법		
		List<Integer> list = new ArrayList<>(); // 리스트 생성
		System.out.println("list : " + list); // []
		
		list.add(1); 
		System.out.println("list : " + list); //[1]
		
		list.add(2); 
		System.out.println("list : " + list); //[1, 2]
		
		list.add(300); 
		System.out.println("list : " + list); //[1, 2, 300]
		
		System.out.println("리스트의 길이 : "+list.size()); // 3
		
		// 리스트 내 값 하나씩 뽑기
//		System.out.println(list.get(0));
//		System.out.println("리스트의 0번째 인덱스의 값 : "+list.get(0)); // 1
//		System.out.println("리스트의 1번째 인덱스의 값 : "+list.get(1)); // 1
//		System.out.println("리스트의 2번째 인덱스의 값 : "+list.get(2)); // 1

		for(int i=0; i<list.size(); i++) {
			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : " + list.get(i)); 
		}
		
		System.out.println("=======================");
		
//		list.remove(2);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : " + list.get(i));		
//		}
		System.out.println("=======================");
		list.set(0, 100); // list.set(i,j) => i번째 인덱스의 값을 j로 변경
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : " + list.get(i)); 
		}
		
		System.out.println("=======================");
		
		int i = 0;
		for (int a : list) { // 향상된 for 문, [100, 2]
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
			i++;
		}
		
	}

}
