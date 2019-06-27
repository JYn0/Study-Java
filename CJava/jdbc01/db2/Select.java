package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

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
		
		// 3. SQL Àü¼Û & Receive
		String sql = "SELECT * FROM T_PRODUCT WHERE ID=?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "P10");
			rset = pstmt.executeQuery();
			rset.next(); //ÇÑÄ­¿Å±â°í
			String uid = rset.getString("ID");//Column¸íÄª
			String uname = rset.getString("NAME");
			double uprice = rset.getDouble("PRICE");
			Date regdate = rset.getDate("REGDATE");
			System.out.println(uid+" "+uname+" "+uprice+" " +regdate);
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
