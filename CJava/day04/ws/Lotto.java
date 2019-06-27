package ws;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 1.6�� ���� �Է�
		System.out.println("���� 6���� �Է��ϼ��� 1~10");
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
		
		
		// 2. ��÷��ȣ 6�� ����(1~10), �ߺ�X
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
		
		
		// 3. ��÷�� ����(10��~100��)->���� 10�� ��������
		double money = r.nextDouble() * 10000000000F;		
		System.out.printf("�� ��÷�ݾ� : %10.0f\n", money);
		
		
		// 4. �Է¹��� ���ڿ� ��÷��ȣ Ȯ��
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
		
		
		// 5. ��� ���
		System.out.print("��    ��ȣ: ");
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d\t", num[i]);
		}
		System.out.println();

		System.out.print("��÷ ��ȣ��: ");
		for(int i=0; i<lottonum.length; i++) {
			System.out.printf("%d\t", lottonum[i]);
		}
		System.out.println();

		System.out.printf("���: %d", win);
		System.out.println();
		
		
		String m = String.format("%,3.0f", money);
		System.out.printf("�� ��÷��:  %s�� �Դϴ�.", m);
		System.out.println();
		
		double result = (double)money * per;
		String res = String.format("%,3.0f", result);
		System.out.printf("��û���� :  %s�� �Դϴ�.", res);
		System.out.println();
	}

}
