package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr4 {

	public static void main(String[] args) {
		int a[] = new int[100];
		// 1~4������ ���ڸ� �����ϰ� �迭�� �Է�
		Random r = new Random();
		for(int in=0; in<a.length; in++) {
			a[in] = r.nextInt(4) + 1; //1~4				
		}
		System.out.println(Arrays.toString(a));
		
		int count[] = new int[4];
		
		// ��ǥ ����� count �迭�� �ջ� �Ͻÿ�
		
		for(int i=0; i<a.length; i++) {
			for(int c=0; c<count.length; c++) {
				if(a[i] == c+1) {
					count[c]++;
				}
			}
		}
		System.out.println(Arrays.toString(count));
	}
}
