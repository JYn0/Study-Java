package db2;
//App -> Oracle
public class App {
	public static void connection() {
		System.out.println("DB Connection ...");
	}
	public static void close() {
		System.out.println("DB Close ...");
	}
	public static void insertUser(String id, String name, String pwd) {
		// ������ ���� ..
		System.out.println(id+" "+name+" "+pwd+" Inserted");
	}
	
	public static String [] select(String id) {
		// ������ ����..
		// ID�� ������ �����´�.
		String [] user = {"id01","james","pwd01"};
		return user;
	}
	
	public static void main(String[] args) {
		String id = "id02";
		String name ="tom";
		String pwd = "pwd02";
		//DB db = null;
		DB db = new DBUser("192.100.100.1");
		
		User user = new User(id, name, pwd);
//		connection();
//		insertUser(id,name,pwd); //-> DB�� ��
//		close();
		db.insert(user);
		
		User dbuser = null;
		dbuser = (User)db.select("id02");
		System.out.println(dbuser);
	}

}
