package InstructorB.src.exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberView {
	// 상세보기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상세보기할 아이디 : ");
		String id = sc.nextLine();
		sc.close();
		
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
			//------------------------------------------------------------------------------------------------------
			String sql = "select * from member where id = ?"; // 상세보기도 'select' 명령어임! 입력받은 아이디에 대해 상세보기!
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int no = rs.getInt("no");
				// String id  = rs.getString("id");
				// ★패스워드는 절대 찍지 말 것!!!!!★
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date createdDate = rs.getDate("createdDate"); //Date.sql import
				System.out.printf("%s \t %s \t %s \t %s \t %s\n",no,id,name,phone,createdDate);
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}		
		
			//------------------------------------------------------------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {
			try { // 닫고 나갈 때는 역순으로! (rs pstmt conn)
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
