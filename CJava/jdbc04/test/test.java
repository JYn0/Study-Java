package test;

import java.util.ArrayList;

import com.FactoryBiz;
import com.ProductsBiz;
import com.ProductsDao;

import frame.Biz;
import frame.Dao;
import vo.Factory;
import vo.Products;

public class test {

	public static void main(String[] args) {

		
		ArrayList<Factory> fac = new ArrayList<Factory>();
		Factory f = new Factory("A04", "SONY", "JAPAN");
		Biz<String, Factory> dao = new FactoryBiz();
		try {

			f = dao.get("A01");
			System.out.println(f);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
