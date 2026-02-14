package InstructorB.src.exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO { // 실행 클래스에 insert 기능을 한꺼번에 코딩하면 코드가 너무 길어지니... 객체를 별도로 생성, 그리고 실행
	// 클래스에서 객체 생성한 이곳을 불러오기!
	// 메소드 값을 넣어주는 역할, 매개변수!
	String dbDrv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
	String dbUser = "javaUser";
	String dbPw = "1234";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;	
	
	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) {rs.close();}
			if (pstmt != null) {pstmt.close();}
			if (conn != null) {conn.close();}				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<StudentDTO> getSelectAll() {
		List<StudentDTO> list = new ArrayList<>();
		
		try { // 드라이버 로딩
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			//----------------------------------------------------			 
			String sql = "select * from student order by hakbun desc";			
//			System.out.println("sql : " + sql);
			pstmt = conn.prepareStatement(sql);		
			rs = pstmt.executeQuery(); // 0, 1	
			while (rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getDate("createdDate"));				
				list.add(dto);
			}
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {
			dbClose(rs, pstmt, conn);	
		}		
		return list;		
		
	}
	
	public StudentDTO getSelectOne(StudentDTO paramDTO) {
		StudentDTO dto = new StudentDTO();
		
		try { // 드라이버 로딩
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			//----------------------------------------------------			 
			String sql = "select * from student where hakbun = ?";			
//			System.out.println("sql : " + sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, paramDTO.getHakbun());
			rs = pstmt.executeQuery(); // 0, 1	
			if (rs.next()) {				
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getDate("createdDate"));				
			}
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {
			dbClose(rs, pstmt, conn);	
		}				
		
		return dto;
	}	
	
	public int setInsert(StudentDTO dto) {		
		int result = 0;
		
		// 예외처리 : 예외(에러) 발생 시 프로그램을 정상적으로 종료시키기 위한, 강제로 멈추게 하려는 것이 아니라!
		try { // 드라이버 로딩
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			//----------------------------------------------------
			String sql = ""; 
			sql += "insert into student (hakbun, name, ssn, phone, address, createdDate) values";
			sql += "(null, ?, ?, ?, ?, now())";
//			System.out.println("sql : " + sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSsn());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddress());			
			result = pstmt.executeUpdate(); // 0, 1	
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {			
			dbClose(rs, pstmt, conn);
		}
		
		return result;
	}
	
	public int setDelete(StudentDTO dto) {
		int result = 0;
		
		try { // 드라이버 로딩
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			//----------------------------------------------------
			String sql = "delete from student where hakbun = ?";			
//			System.out.println("sql : " + sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getHakbun());
			result = pstmt.executeUpdate(); // 0, 1			
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {			
			dbClose(rs, pstmt, conn);
		}
		
		return result;
	}
	
	public int setUpdate(StudentDTO dto) {
		int result = 0;
		try { // 드라이버 로딩
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			//----------------------------------------------------
			String sql = "update student set phone = ?, address = ?, where hakbun = ?";
//			sql += ;
//			System.out.println("sql : " + sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPhone());
			pstmt.setString(2, dto.getAddress());
			result = pstmt.executeUpdate(); // 0, 1			
			//----------------------------------------------------			
		} catch (Exception e) {// 데이터베이스 접속
			System.out.println("드라이버 로딩 실패 또는 접속 실패");			
		} finally {			
			dbClose(rs, pstmt, conn);
		}		
		
		return result;
	}
	
}
