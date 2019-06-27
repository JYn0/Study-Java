package day01;

// Java Application -> main Á¸Àç
public class Variable1 {

	public static void main(String[] args) {
		int a = 50;
		int b = 10;
		int c = 30;
		
		int temp = 0;
		
		if(a < b) {
			temp = b;
			if (c > temp) {
				temp = c;
			}
		}else {
			temp = a;
			if(c > temp) {
				temp = c;
			}
		}
		
//		if(a < b) {
//			temp = a;
//			if (c < temp) {
//				temp = c;
//		}else {
//			temp = b;
//			if(c < temp) {
//				temp = c;
//			}
//		}
		System.out.println(temp);
	}

}
