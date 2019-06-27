package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.Product;

public class ProductDao extends Dao<Integer, Product> {

	@Override
	public void insert(Product v) throws Exception {
		if (v.getId() == 2) {
			throw new Exception("E0001");// ID 중복
		}
		System.out.println(v + " Inserted.");
	}

	@Override
	public void delete(Integer k) throws Exception {
		if (k == 200) {
			throw new Exception("E0002");
		}
		System.out.println(k + " Deleted.");
	}

	@Override
	public void update(Product v) throws Exception {
		if (v.getId()==200) { // id02 이미 존재
			throw new Exception("E0003");
		}
		System.out.println(v + " Updated.");
	}

	@Override
	public Product select(Integer k) throws Exception {
		Product p = new Product(k, "a", 50000);
		return p;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(01, "a", 10000));
		list.add(new Product(02, "b", 20000));
		list.add(new Product(03, "c", 30000));
		list.add(new Product(04, "d", 40000));
		list.add(new Product(05, "e", 50000));
		return list;
	}

}
