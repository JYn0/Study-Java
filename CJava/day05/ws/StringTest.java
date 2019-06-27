package ws;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// 소문자로 된 문자열을 입력 받아 출력
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소문자 입력");
		str = sc.nextLine();
		System.out.println(str);
		char c[] = str.toCharArray();
		sc.close();
		
		
		// 입력받은 문자열을 대문자로 만들고
		// 순서를 거꾸로하여 출력
		for(int i=0; i<c.length-1-i; i++) {
			char temp = (char)(c[i] - 32);
			c[i] = (char)(c[c.length-1-i] - 32); // 대문자 + 역
			c[c.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(c));
				

		// char +5 암호화하여 출력
		for(int i=0; i<c.length; i++) {
			c[i] = (char)(c[i] + 5);
		}
		System.out.println(Arrays.toString(c));
		
		
		// 최초 입력받은 문자열로 출력
		// -5 +32 = +27
		for(int i=0; i<c.length-1-i; i++) {
			char temp = (char)(c[i] + 27);
			c[i] = (char)(c[c.length-1-i] + 27); // 대문자 + 역
			c[c.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(c));
	}

}
