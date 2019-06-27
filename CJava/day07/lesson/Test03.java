package lesson;

import java.util.Arrays;
import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		int a[] = new int[10];
		Random r= new Random();
		for(int i=0;i<a.length;i++) {
			a[i] = r.nextInt(89)+10;
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		// 큰 수 부터 정렬하시오
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
