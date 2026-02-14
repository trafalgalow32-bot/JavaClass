package InstructorB.src.exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import InstructorB.src.exam28.Information;

/* 회원 관리 : 목록, 상세보기, 등록, 수정, 삭제
아이디 비밀번호 이름 연락처 주소(대전 서울 충남)

*/
public class Manage {
	public static void main(String[] args) {
	List<Information> infoList = new ArrayList<>();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("0. 프로그램 종료 1. 목록 2. 상세보기 3. 등록 4. 수정 5. 삭제");
			String menu = sc.nextLine();
			if (menu.equals("0")) {
				System.out.println("-- 프로그램 종료 --");
			break;
			} else if (menu.equals("1") ) {
//				System.out.println("-- 목록 -- ");
			for (int i = 0; i < infoList.size(); i++) {
				infoList.get(i).display();
			}
				
			} else if (menu.equals("2") ) {
				System.out.println("-- 상세보기 -- ");
			} else if (menu.equals("3")) {
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("연락처 : ");
				String phone = sc.nextLine();
				System.out.print("주소 : ");
				String address = sc.nextLine();
				
				Information info = new Information(id, password, name, phone, address);				
				infoList.add(info);				
				
				
			} else if (menu.equals("4")) {
				System.out.println("-- 수정 --");				
				
				
			} else if (menu.equals("5")) {
				System.out.println("-- 삭제 --");
				
				
			}
		}
	}

}
