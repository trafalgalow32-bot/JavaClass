package InstructorA.src.study20260114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelfConnect {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public SelfConnect() {
		connect();
	}
	
	private void connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "hkkim";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/hkkim";
			conn = DriverManager.getConnection(url, username, password);
			
		} catch ( Exception e) {
			System.out.println("접속 실패");
		}
		
	}
	
	public Item[] findAll() {
		Item[] items = new Item[10];
		
		String sql = "select * from item";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i=0;
			while(rs.next()) {
				Item data = new Item(
				rs.getString("item_Name"), rs.getInt("item_Price"),
				rs.getString("item_Main_Image"), rs.getInt("item_Stock")						
				);
				
				items[i] = data;
				i++;
			}
		} catch (Exception e ) {
			System.out.println("질의 실패 및 객체생성 실패");
		}
		
		return items;
	}
}
