package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserRemove {

	public static void main(String[] args) {
		Biz<String,User> biz = new UserBiz();	
		
		try {
			biz.remove("id67");
			System.out.println("User Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
