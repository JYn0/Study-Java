package day02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// 2���� ���ڸ� �޾� ���δ�.
		// a / b�� ����Ѵ�
		// ��� �� �Ҽ��� 3�ڸ����� ��� �Ͻÿ�
		double c;
		Scanner sc = new Scanner(System.in);
		
		//data1 space data2 enter -> �� 2�� ���� �� ����
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