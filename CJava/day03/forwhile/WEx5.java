package forwhile;

public class WEx5 {

	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
///*			if (i%2 == 1) { // i%2 != 0
//				sum += i;
//			}
//			i++;
//			System.out.println("Process");
//			if(i == 6) {
//				break;
//			}
//*/
//			//continue
//			if(i == 7) { //검사를 먼저해서 진행할지 안할지 결정
//				break;
//			}
//			
//			if (i%2 == 0) {
//				i++;
//				continue; //짝수이면 밑에 건너뛰고 다시 while문 수행
//			}
//			//홀수있때만 실행
//			sum += i;
//			i++;
//			System.out.println("Process");
//			
//		}
//		System.out.println(sum);
		
		//for문으로 바꾸기
		int ss = 0;
		for(int ii=1; ii<10; ii++) {
			if(ii == 6){
				break;
			}
			if(ii %2 == 0) {
				continue;
			}
			ss += ii;
			ii++;
			System.out.println("Process");
		}
		System.out.println(ss);
	}

}
