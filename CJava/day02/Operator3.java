package day02;

import java.util.Scanner; //Ctrl + Shift + O

public class Operator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		char c = data.charAt(0);
		if(('a'<=c && c<='z')||('a'<=c && c<='z')) {
			System.out.println("�����Դϴ�.");
			sc.close();
			return; //�Լ��� ����
		}else {
			System.out.println("�����Դϴ�.");
		}
		c++;
		System.out.println(c);
		sc.close();
		
	}

}
