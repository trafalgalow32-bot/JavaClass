package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {
	// 목록 보기(테이블 내용)
	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUser = "javaUser";
		String dbPw = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);

			//----------------------------------------------------
			String sql = "select * from member order by no desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String id  = rs.getString("id");
				// ★패스워드는 절대 찍지 말 것!!!!!★
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date createdDate = rs.getDate("createdDate"); //Date.sql import
				System.out.printf("%s \t %s \t %s \t %s \t %s\n",no,id,name,phone,createdDate);
			}			
//			System.out.printf("\n-----------------------------------\n");
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패..");			
		} finally {
			try { // 닫고 나갈 때는 역순으로! (rs pstmt conn)
				if (rs != null) {rs.close();}
				if (pstmt != null) {pstmt.close();}
				if (conn != null) {conn.close();}				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
//		System.out.printf("-- 프로그램 종료 --");

	}

}
