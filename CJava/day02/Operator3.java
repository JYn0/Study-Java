package day02;

import java.util.Scanner; //Ctrl + Shift + O

public class Operator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		char c = data.charAt(0);
		if(('a'<=c && c<='z')||('a'<=c && c<='z')) {
			System.out.println("문자입니다.");
			sc.close();
			return; //함수가 끝남
		}else {
			System.out.println("숫자입니다.");
		}
		c++;
		System.out.println(c);
		sc.close();
		
	}

}
