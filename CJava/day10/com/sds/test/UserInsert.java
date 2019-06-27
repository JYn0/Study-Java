package com.sds.test;

import com.sds.component.UserBiz;
import com.sds.frame.Biz;
import com.sds.vo.User;

public class UserInsert {

	public static void main(String[] args) {
		// Test는 Biz가 필요하고 UserBiz 갖다붙이기
		Biz<String, User> biz = new UserBiz();
		User u1 = new User("id02", "jame", "pwd01");
		try {
			biz.register(u1);
		} catch (Exception e) {
			System.out.println("Insert Error");
			System.out.println(e.getMessage());
		}
	}

}
