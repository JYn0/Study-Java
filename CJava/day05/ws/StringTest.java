package ws;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// �ҹ��ڷ� �� ���ڿ��� �Է� �޾� ���
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ҹ��� �Է�");
		str = sc.nextLine();
		System.out.println(str);
		char c[] = str.toCharArray();
		sc.close();
		
		
		// �Է¹��� ���ڿ��� �빮�ڷ� �����
		// ������ �Ųٷ��Ͽ� ���
		for(int i=0; i<c.length-1-i; i++) {
			char temp = (char)(c[i] - 32);
			c[i] = (char)(c[c.length-1-i] - 32); // �빮�� + ��
			c[c.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(c));
				

		// char +5 ��ȣȭ�Ͽ� ���
		for(int i=0; i<c.length; i++) {
			c[i] = (char)(c[i] + 5);
		}
		System.out.println(Arrays.toString(c));
		
		
		// ���� �Է¹��� ���ڿ��� ���
		// -5 +32 = +27
		for(int i=0; i<c.length-1-i; i++) {
			char temp = (char)(c[i] + 27);
			c[i] = (char)(c[c.length-1-i] + 27); // �빮�� + ��
			c[c.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(c));
	}

}
