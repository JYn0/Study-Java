package ws;

import java.util.Arrays;
import java.util.Random;

public class SumTest {

	public static void main(String[] args) {
		// ������ �迭�� 1~100�� ���� �߻�, �ߺ�X
		int a[] = new int[100];
		Random r = new Random();
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100) + 1;
			for(int j=0; j<i; j++) {
				if(a[i] == a[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		int x[] = new int[50];
		int y[] = new int[50];
		for(int i=0; i<a.length; i++) {
			if(i%2 == 0) { //¦��
				x[i/2] = a[i];
			}else { //Ȧ��
				y[i/2] = a[i];
			}
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		
		// �迭+�迭
		int sum[] = new int[50];
		int key = y.length -1 ;
		for(int i=0; i<x.length; i++) {
			sum[i] = x[i] + y[key];
			key -= 1;
		}
		System.out.println(Arrays.toString(sum));
	}

}
