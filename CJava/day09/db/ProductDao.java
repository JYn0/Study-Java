package db;

public class ProductDao extends Dao {
	
	String ip;

	public ProductDao() {

	}

	public ProductDao(String ip) {
		super(ip);
	}
	
	@Override
	public void insert(Object obj) {
		connection();
		Product product = (Product) obj;
		System.out.println(product.getId() + "  " + product.getName() + " " 
						+ product.getPrice() + " Inserted...");
		close();
	}

	@Override
	public Object select(Object obj) {
		Product product = null;
		String str = (String)obj;
		// DB에서 Select해서 데이터를 가져온다.
		connection();
		product = new Product("p01", "pants", 10000);
		close();
		return product;
	}

	@Override
	public void delete(Object obj) {
		String str = (String)obj;
		connection();
		System.out.println(str+" Deleted...");
		close();
	}

}
