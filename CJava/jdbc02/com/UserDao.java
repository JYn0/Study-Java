package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.User;

public class UserDao extends Dao<String, User> {

	@Override
	public void insert(User v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.insertUser);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
	}

	@Override
	public void delete(String k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.deleteUser);
			pstmt.setString(1, k);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
	}

	@Override
	public void update(User v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.upadateUser);
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
	}

	@Override
	public User select(String k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectUser);
			pstmt.setString(1, k);
			rset = pstmt.executeQuery();
			rset.next();

			String uid = rset.getString("ID");// Column��Ī
			String upwd = rset.getString("PWD");
			String uname = rset.getString("NAME");
			System.out.println(uid + " " + upwd + " " + uname);

		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		return null;
	}

	@Override
	public ArrayList<User> select() throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		ArrayList<User> result = new ArrayList<User>();
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectAllUser);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				String uid = rset.getString("ID");// Column��Ī
				String upwd = rset.getString("PWD");
				String uname = rset.getString("NAME");
				System.out.println(uid + " " + upwd + " " + uname);
				User userr = new User(uid,upwd, uname);
				result.add(userr);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		return result;
	}

}
