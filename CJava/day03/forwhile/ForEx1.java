package forwhile;

public class ForEx1 {

	public static void main(String[] args) {
		System.out.println("Start");

//		// 10부터 0까지 출력하시오
//		for(int i=10; i>=0; i--) {
//			System.out.print(i);
//		}
		
		
//		// 1부터 10까지 홀수만 출력 하시오
//		for(int i=1; i<=10; i+=2) {
//			System.out.print(i);
//		}
		
		
//		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {
//				System.out.println();
//			}
//		}
		
		
//		int i=1, j=1;
//		for(; i<=10 && j<=5; i++,j++) {//i,j -> local variable
//			System.out.print(i + "  " + j + ",");
//		}
//		
//		System.out.println("Last Value : " + (i+j));
//		System.out.println("End");
		
		
//		int i = 1, j = 10;
//		for(; i<=10 && j>= 0; i++, j--) {
//			System.out.println(i + "  " + j);
//		}
		
		
		// 두 수의 곱이 5의 배수인 것들의 합을 구하시오
		int i = 1, j = 10;
		int sum = 0;
		for(;i<=10; i++, j--) {
			//System.out.print(i+" "+j+"\n");
			if((i*j)%5 == 0) {
				sum += i*j;
				//System.out.print(sum+"\n");
			}
		}	
		System.out.print(sum+"\n");
		System.out.println("End");
	}

}
