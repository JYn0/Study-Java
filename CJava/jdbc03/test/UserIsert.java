package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserIsert {
	
	public static void main(String[] args) {
		User u= new User("id69", "pwd69", "OOO");
		Biz<String,User> biz = new UserBiz();
		
		try {
			biz.register(u);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
}
