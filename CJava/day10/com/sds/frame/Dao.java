package com.sds.frame;

import java.util.ArrayList;

public abstract class Dao<K,V> { // Key, Value(user)
	public abstract void insert(V v) throws Exception;
	public abstract void delete(K k) throws Exception;
	public abstract void update(V v) throws Exception;
	public abstract V select(K k) throws Exception;//k���� �ָ� V����
	public abstract ArrayList<V> select() throws Exception;//��ü�� select�ϸ� �迭�� v��ƿ�
	
}
