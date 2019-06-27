package db;

public class App2 {
	
	public static void main(String[] args) {
	
		Product p = new Product("p01", "pants", 10000);
		Biz biz = null;
		biz.register(p);
		//biz.remove("p01");
		
//		Product dbproduct = null;
//		dbproduct = (Product)biz.get("id01");
//		System.out.println(dbproduct);
	}
}
