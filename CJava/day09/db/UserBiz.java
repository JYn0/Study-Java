package db;

public class UserBiz extends Biz {
	Dao dao;

	public UserBiz(String ip) {
		dao = new UserDao(ip);
	}

	@Override
	public void register(Object obj) {
		// Transaction start ...
		dao.insert(obj);
		// Transaction end end...
	}

	@Override
	public void remove(Object obj) {
		// Transaction start ...
		dao.delete(obj);
		// Transaction end end...
	}

	@Override
	public Object get(Object obj) {
		User user = null;
		// Transaction start ...
		user = (User)dao.select(obj);
		// Transaction end end...
		return user;
	}

}
