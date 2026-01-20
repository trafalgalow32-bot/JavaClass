package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class MemberUpdate {
	// 회원 수정 프로그램 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("새로운 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("새로운 전화번호 : ");
		String phone = sc.nextLine();
		sc.close();
		
		// from JAVA to DB!!
		
		// dbURL, USER, PASSWORD를 변수로 선언해서 getConnection에 집어 넣음!!
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUser = "javaUser";
		String dbPw = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 예외처리 : 예외(에러) 발생 시 프로그램을 정상적으로 종료시키기 위한, 강제로 멈추게 하려는 것이 아니라!
		try { // 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			//----------------------------------------------------
			String sql = "update member set name = ?, phone = ? where id = ?";
// update member set name = '홍이동', phone = '0000' where id = 'hong'; 키보드로 입력받는 값은 ?로 바꿈
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);			
			pstmt.setString(2, phone);
			pstmt.setString(3, id);			
			int result = pstmt.executeUpdate(); // 0, 1
			if (result > 0 ) {
				System.out.println("수정성공.");
			} else {
				System.out.println("수정실패.");
			}
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {
			try {
				if (rs != null) {rs.close();}
				if (pstmt != null) {pstmt.close();}
				if (conn != null) {conn.close();}				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("-- 프로그램 종료 --");
		
	}

}
