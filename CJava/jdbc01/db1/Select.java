package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {
		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}
		
		// 2. Connection 1521 db(workspace) db(pwd)
		String id = "db";
		String password = "db";
		String url = "jdbc:oracle:thin:@70.12.50.227:1521:xe"; //ip adress
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		// 3. SQL ���� & Receive
		String sql = "SELECT * FROM T_USER WHERE ID=?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "ID01");
			rset = pstmt.executeQuery();
			rset.next(); //��ĭ�ű��
			String uid = rset.getString("ID");//Column��Ī
			String upwd = rset.getString("PWD");
			String uname = rset.getString("NAME");
			System.out.println(uid+" "+upwd+" "+uname);
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 4. close
		try {
			rset.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
