package db3;

/*
public abstract class DB {
	public abstract void insert(Object obj);
	public abstract Object select(Object obj);	
}*/

public abstract class DB<T,U>{ // Type ����, �������ᵵ ��
	public abstract void insert(T obj); // T:user
	public abstract T select(U obj); // ���ϵǴ� ����, U : String
	
	
}
