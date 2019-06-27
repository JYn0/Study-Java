package ws;

import java.util.Arrays;
import java.util.Random;

public class Vote {

	public static void main(String[] args) {
		// 후보자 5명
		int a[] = new int[5];
		
		// 50명 1~5투표
		int b[] = new int [50];
		Random r = new Random();
		for(int i=0; i<b.length; i++) {
			b[i] = r.nextInt(5) + 1;
			System.out.printf("%d : %d\t", i+1, b[i]);
		}
		System.out.println();
		
		// 개표
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(b[i] == j+1) {
					a[j]++;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.printf("%d번-%d개\t", i+1, a[i]);
		}
		System.out.println();
		
		// 많이받은순 정렬
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}

		System.out.printf("최다득표수 : %d", a[0]);
		System.out.println();
		System.out.println(Arrays.toString(a));
		
		// 적게받은순 정렬
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}
		System.out.printf("최소득표수 : %d", a[0]);
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
