package day02;

public class Variable4 {

	public static void main(String[] args) {
		// Primitive Type
		int a = 10;
		char c = 'a';
		
		// Reference Type
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		// String -> Java API를 이용한 문자열
		
		if(s1.equals(s3)) {// -> 문자 비교, s1 == s2 => 주소 비교
			System.out.println("case1");
		}
		
		int i1 = 10;   // 10진수
		int i2 = 010;  // 8진수
		int i3 = 0x10; // 16진수
		
		System.out.println(i1 + " " + i2 + " " + i3);
	}

}
