package test;

import java.util.ArrayList;

import com.UserDao;

import frame.Dao;
import vo.User;

public class UserSelectAll {

	public static void main(String[] args) {
		Dao<String, User> dao = new UserDao();
		ArrayList<User> userr = new ArrayList<User>();
		try {
			userr = dao.select();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
