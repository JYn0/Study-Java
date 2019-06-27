package test;

import java.util.ArrayList;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class test1 {

	public static void main(String[] args) {
		ArrayList<Products> pro = new ArrayList<Products>();
		Products p = new Products(33, "BB", "CC", "A01", null, 10, 10, 10);
		Biz<String, Products> dao = new ProductsBiz();
		try {
			
			p = dao.get("197505");
			System.out.println(p);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
