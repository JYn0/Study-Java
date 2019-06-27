package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {

	public static void main(String[] args) {
		int a[] = new int[30];
		// 10~99������ ���ڸ� �����ϰ� �迭�� �Է�
		// �հ� ����� ���Ͻÿ�		
		Random r = new Random();
		int sum  = 0;
		double average = 0.0;
		for(int in=0; in<a.length; in++) {
			a[in] = r.nextInt(90) + 10; //10~99		
			sum += a[in];			
		}
		average = (double)sum / a.length;
		System.out.println(Arrays.toString(a));
		System.out.printf("���� = %d, ��� = %3.2f\n", sum, average);
		System.out.println("----------------------");
		
		// �ִ밪�� �ּҰ��� ����Ͻÿ�
		int max=a[0], min=a[0];
		for(int i=1; i<a.length; i++) { //a�迭�� �ϳ��� �� ��������
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.printf("�ִ밪 : %d, �ּҰ� : %d\n", max, min);		
		System.out.println("----------------------");

		// ���� �� ���� �����Ͻÿ�
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
		
		// ū �� ���� �����Ͻÿ�
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
		System.out.println("----------------------");
		
		// �迭�� �ִ� ���ڵ��� ���� ���Ͻÿ�
		int []count = new int[100];
		for(int i=0; i<a.length; i++) {
			count[a[i]]++;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(i+":"+count[i]);
		}
	}
}
