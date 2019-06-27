package forwhile;

public class WEx4 {

	public static void main(String[] args) {
/*		int sum = 0;
		int i = 0;
				
		while((sum += ++i) <= 100) {
			System.out.println(i+" "+sum);
		}
*/
		
		// for 문으로 변경
		for(int ss=1,ii=1; ss<=100; ss+=++ii ) {
			System.out.println(ii+" "+ss);
		}
	}

}
