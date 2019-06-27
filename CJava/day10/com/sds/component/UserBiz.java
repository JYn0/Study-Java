package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.User;

public class UserBiz extends Biz<String, User> {

	Dao<String, User> dao;

	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void register(User v) throws Exception {
		checkData(v);
		transactionStart();
		try {
			dao.insert(v);
			// BIZ -> Dao, UserDao insert에서 에러나서 돌아오면 얘도 exception던짐, 밑에 실행X
			// 에러나고 End를 안해주면 비정상적인 종료, End 꼭 해줘야함
		} catch (Exception e) {
			throw e;
		} finally { // == 결국엔, 정상적으로 실행되면 실행, 문제가 생겨서 Exception 튀어나오고 e를 던져도 실행
			transactionEnd();
		}
	}

	@Override
	public void remove(String k) throws Exception {
		transactionStart();
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		} finally {
			transactionEnd();
		}
	}

	@Override
	public void modify(User v) throws Exception {
		checkData(v);
		transactionStart();
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		} finally {
			transactionEnd();
		}
	}

	// get은 transaction 필요X, transaction은 데이터 조작할 때 필요 
	@Override
	public User get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<User> get() throws Exception {
		return dao.select();
	}

}
