package calc;

import java.util.Arrays;

public class CalcTest {

	public static void main(String[] args) {
		int a [] = {15,3,7,6,9,0};
		Calc c = new Calc(a);
		System.out.println(c.sum(a));
		System.out.println(c.avg(a));
		System.out.println(Arrays.toString(c.asort(a)));
		System.out.println(Arrays.toString(c.dsort(a)));
	}

}
