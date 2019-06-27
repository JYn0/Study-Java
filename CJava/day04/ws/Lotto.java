package ws;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 1.6개 숫자 입력
		System.out.println("숫자 6개를 입력하세요 1~10");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		num[0] = Integer.parseInt(sc.next());
		num[1] = Integer.parseInt(sc.next());
		num[2] = Integer.parseInt(sc.next());
		num[3] = Integer.parseInt(sc.next());
		num[4] = Integer.parseInt(sc.next());
		num[5] = Integer.parseInt(sc.next());
		//System.out.println(Arrays.toString(num));
		sc.close();
		
		
		// 2. 당첨번호 6개 생성(1~10), 중복X
		Random r = new Random();
		int lottonum[] = new int[6];		
		for(int i=0; i<lottonum.length; i++) {
			lottonum[i] = r.nextInt(10)+1;
			for(int j=0; j<i; j++) {
				if(lottonum[i] == lottonum[j]) {
					i--;
				}
			}
		}
		
		//System.out.println(Arrays.toString(lottonum));
		
		
		// 3. 당첨금 생성(10억~100억)->숫자 10개 랜덤생성
		double money = r.nextDouble() * 10000000000F;		
		System.out.printf("총 당첨금액 : %10.0f\n", money);
		
		
		// 4. 입력받은 숫자와 당첨번호 확인
		int count = 0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<lottonum.length; j++) {
				if(num[i] == lottonum[j]) {
					count++;
				}
			}	
		}
		int win=0;
		double per=0.0;
		switch(count) {
		case 6:
			win = 1;
			per = 0.5;
			break;
		case 5:
			win = 2;
			per = 0.2;
			break;
		case 4:
			win = 3;
			per = 0.1;
			break;
		case 3:
			win = 4;
			per = 0.05;
			break;
		default:
			win = 0;
			per = 0;
			break;			
		}
		
		
		// 5. 결과 출력
		System.out.print("내    번호: ");
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d\t", num[i]);
		}
		System.out.println();

		System.out.print("당첨 번호는: ");
		for(int i=0; i<lottonum.length; i++) {
			System.out.printf("%d\t", lottonum[i]);
		}
		System.out.println();

		System.out.printf("등수: %d", win);
		System.out.println();
		
		
		String m = String.format("%,3.0f", money);
		System.out.printf("총 당첨금:  %s원 입니다.", m);
		System.out.println();
		
		double result = (double)money * per;
		String res = String.format("%,3.0f", result);
		System.out.printf("당청금은 :  %s원 입니다.", res);
		System.out.println();
	}

}
