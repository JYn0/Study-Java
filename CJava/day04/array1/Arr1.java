package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr1 {

	public static void main(String[] args) {
//		int i = 10;
		int a[] = new int[6]; // fix�ϱ�
		
//		a[0] = 10;
//		a[1] = 30;
//		a[2] = 20;
		
		// a �迭�� �� �ε����� 1~9������ ������ �߻��Ͽ� ��ġ���ʰ� �Է��Ͻÿ�
		Random r = new Random();
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(6)+1;
			for(int j=0; j<i; j++) {
				if(a[i] == a[j]) {
					i--;
				}
			}
		}

		
		System.out.println(Arrays.toString(a));
/*		
		System.out.println(a);
		System.out.println(a.length);
		
		System.out.println(a);// �ּ�
		System.out.println(a.length); //�迭 ����
		for(int ind=0; ind < a.length; ind++) {
			System.out.println(a[ind]);
		} //��� ���Ҵ��� �� �� ���� -> ind
		
		for(int temp:a) {
			System.out.println(temp);
		} //��� ���Ҵ��� �� �� ����
*/	
	}
}
