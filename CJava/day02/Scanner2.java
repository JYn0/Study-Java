package day02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// 2개의 숫자를 받아 들인다.
		// a / b를 계산한다
		// 출력 시 소숫점 3자리까지 출력 하시오
		double c;
		Scanner sc = new Scanner(System.in);
		
		//data1 space data2 enter -> 값 2개 받을 수 있음
		String data1 = sc.next();
		String data2 = sc.next();
		
//		System.out.println("Input Number a..?");
//		String data1 = sc.nextLine();
//		System.out.println("Input Number b..?");
//		String data2 = sc.nextLine();
		
		//double a = Double.parseDouble(data1);
		//double b = Double.parseDouble(data2);
		//System.out.printf("\t result = %f, %f\n",a,b);
		
		int a = Integer.parseInt(data1);
		int b = Integer.parseInt(data2);
		c = (double)a / (double)b;
		System.out.printf("\t result = %d, %d\n",a,b);
		
		//c =  a / b;
		System.out.printf("\t c = %10.3f\n",c);
		
		sc.close();	
	}

}