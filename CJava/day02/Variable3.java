package day02;

import java.util.Scanner;

public class Variable3 {

	public static void main(String[] args) {
		// 4과목의 점수를 정수로 입력받는다.
		// 합계와 평균을 구하시오.
		double sum = 0.0;
		double avg = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 4 Number..?");
		
		String data1 = sc.next();
		String data2 = sc.next();
		String data3 = sc.next();
		String data4 = sc.next();
		
		int a = Integer.parseInt(data1);
		int b = Integer.parseInt(data2);
		int c = Integer.parseInt(data3);
		int d = Integer.parseInt(data4);
		
		sum = a + b + c + d;
		avg = sum / 4.0;
		
		System.out.printf("점수 -> %d  %d  %d  %d\n",a, b, c, d);
		System.out.printf("합계 : %f, 평균 : %10.3f", sum, avg);
		
		sc.close();
	}

}
