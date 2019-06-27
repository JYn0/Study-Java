package stat;

public class Calc {
	public static int sum(int a, int b) {
		//¸â¹ö º¯¼ö°¡ ¾øÀ»¶© static
		return (a+b);
	}
	public static int sum(int a[]) {
		int sum = 0;
		for(int data:a) {
			sum += data;
		}
		return sum;
	}
	

}
