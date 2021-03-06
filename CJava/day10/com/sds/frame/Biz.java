package com.sds.frame;

import java.util.ArrayList;

public abstract class Biz<K, V> {
	public abstract void register(V v) throws Exception;//Value가 들어오면 등록
	public abstract void remove(K k) throws Exception;
	public abstract void modify(V v) throws Exception;
	public abstract V get(K k) throws Exception;
	public abstract ArrayList<V> get() throws Exception;
	public void checkData(V v) { //검증
		System.out.println("Check OK ...");
	}
	public void transactionStart() {
		System.out.println("Transaction Start ...");
	}
	public void transactionEnd() {
		System.out.println("Transaction End ...");
	}
}
