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
//			if(i == 7) { //�˻縦 �����ؼ� �������� ������ ����
//				break;
//			}
//			
//			if (i%2 == 0) {
//				i++;
//				continue; //¦���̸� �ؿ� �ǳʶٰ� �ٽ� while�� ����
//			}
//			//Ȧ���ֶ��� ����
//			sum += i;
//			i++;
//			System.out.println("Process");
//			
//		}
//		System.out.println(sum);
		
		//for������ �ٲٱ�
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
