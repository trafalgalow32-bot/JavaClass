package InstructorB.src.exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList2 {
	// 목록 보기(테이블 내용)
	public static void main(String[] args) {
		
		List<MemberDTO> list = new ArrayList<>();
		
		
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
				
				//기본 생성자
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setNo(no);
				memberDTO.setId(id);
				memberDTO.setPassword(password);
				memberDTO.setName(name);
				memberDTO.setPhone(phone);
				memberDTO.setCreatedDate(createdDate);
				
				list.add(memberDTO);
				
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
		// [주소, 주소, 주소, ...]
		
		for (int i=0; i<list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.printf("%s \t %s \t %s \t %s \t %s\n", dto.getNo(),dto.getId(),dto.getName(),dto.getPhone(),dto.getCreatedDate());
		}
		
		

	}

}
