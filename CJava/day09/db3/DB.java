package db3;

/*
public abstract class DB {
	public abstract void insert(Object obj);
	public abstract Object select(Object obj);	
}*/

public abstract class DB<T,U>{ // Type 종류, 여러개써도 됨
	public abstract void insert(T obj); // T:user
	public abstract T select(U obj); // 리턴되는 정보, U : String
	
	
}
