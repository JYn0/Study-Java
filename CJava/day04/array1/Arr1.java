package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr1 {

	public static void main(String[] args) {
//		int i = 10;
		int a[] = new int[6]; // fix하기
		
//		a[0] = 10;
//		a[1] = 30;
//		a[2] = 20;
		
		// a 배열에 각 인덱스에 1~9까지의 난수를 발생하여 겹치지않게 입력하시오
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
		
		System.out.println(a);// 주소
		System.out.println(a.length); //배열 길이
		for(int ind=0; ind < a.length; ind++) {
			System.out.println(a[ind]);
		} //몇번 돌았는지 알 수 있음 -> ind
		
		for(int temp:a) {
			System.out.println(temp);
		} //몇번 돌았는지 알 수 없음
*/	
	}
}
