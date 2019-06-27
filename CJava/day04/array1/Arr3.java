package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {

	public static void main(String[] args) {
		int a[] = new int[30];
		// 10~99까지의 숫자를 랜덤하게 배열에 입력
		// 합과 평균을 구하시오		
		Random r = new Random();
		int sum  = 0;
		double average = 0.0;
		for(int in=0; in<a.length; in++) {
			a[in] = r.nextInt(90) + 10; //10~99		
			sum += a[in];			
		}
		average = (double)sum / a.length;
		System.out.println(Arrays.toString(a));
		System.out.printf("총합 = %d, 평균 = %3.2f\n", sum, average);
		System.out.println("----------------------");
		
		// 최대값과 최소값을 출력하시오
		int max=a[0], min=a[0];
		for(int i=1; i<a.length; i++) { //a배열을 하나씩 다 꺼내본다
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);		
		System.out.println("----------------------");

		// 작은 수 부터 정렬하시오
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
		System.out.println("----------------------");
		
		// 배열에 있는 숫자들의 합을 구하시오
		int []count = new int[100];
		for(int i=0; i<a.length; i++) {
			count[a[i]]++;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(i+":"+count[i]);
		}
	}
}
