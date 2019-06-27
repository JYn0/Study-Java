package com.sds.frame;

import java.util.ArrayList;

public abstract class Dao<K,V> { // Key, Value(user)
	public abstract void insert(V v) throws Exception;
	public abstract void delete(K k) throws Exception;
	public abstract void update(V v) throws Exception;
	public abstract V select(K k) throws Exception;//k값을 주면 V리턴
	public abstract ArrayList<V> select() throws Exception;//전체를 select하면 배열에 v담아옴
	
}
