package ws;

import java.util.Arrays;
import java.util.Random;

public class Vote {

	public static void main(String[] args) {
		// �ĺ��� 5��
		int a[] = new int[5];
		
		// 50�� 1~5��ǥ
		int b[] = new int [50];
		Random r = new Random();
		for(int i=0; i<b.length; i++) {
			b[i] = r.nextInt(5) + 1;
			System.out.printf("%d : %d\t", i+1, b[i]);
		}
		System.out.println();
		
		// ��ǥ
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(b[i] == j+1) {
					a[j]++;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.printf("%d��-%d��\t", i+1, a[i]);
		}
		System.out.println();
		
		// ���̹����� ����
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}

		System.out.printf("�ִٵ�ǥ�� : %d", a[0]);
		System.out.println();
		System.out.println(Arrays.toString(a));
		
		// ���Թ����� ����
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}
		System.out.printf("�ּҵ�ǥ�� : %d", a[0]);
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
