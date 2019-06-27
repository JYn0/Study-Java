package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game { // ���ھ߱�

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int strike = 0, ball = 0, homerun = 0, out = 0;
		int count = 0;

		while (true) {
			// 1. ���� 4�ڸ� ���� �ޱ�(0~9) �ߺ�X
			System.out.println("���ھ߱� ���� (���� : 10)");
			Random r = new Random();
			int num[] = new int[4];
			for (int i = 0; i < num.length; i++) {
				num[i] = r.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) { // �ߺ� Ȯ��
						i--;
					}
				}
			}
			System.out.println(Arrays.toString(num));

			// 2. ����ڰ� 4�ڸ� ���� �Է�
			System.out.println("���� 4���� �Է�");
			int user[] = new int[4];
			for (int i = 0; i < user.length; i++) {
				user[i] = Integer.parseInt(sc.next());
				if(user[i] == 10) {
					System.out.println("��������");
					sc.close();
					System.exit(0);
				}
			}
			//System.out.println(Arrays.toString(user));

			
			// 3. ���ڰ� ������ ball, �ڸ��� ������ strike
			// 4. �ƿ� �ȸ����� out
			// 5. ������ ��ġ�ϰ� �Ǹ� Ȩ������ ���� ��
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if ((num[i] == user[j]) && (i == j)) {
						strike++;
						count++;
					} else if ((num[i] == user[j]) && (i != j)) {
						ball++;
					}
				}
			}
			
			if ((strike == 0) && (ball == 0)) {
				out++;
			}
			
			if (count == 4) {
				homerun = 1;
				strike = 0;
				count = 0;
			}

			System.out.printf("%d Strike - %d Ball\n", strike, ball);
			System.out.printf("%d Homerun %d Out\n", homerun, out);
			System.out.println();
			strike = 0;
			count = 0;
			ball = 0;
			out = 0;
			
			if(homerun == 1) {
				System.out.println("Homerun �������");
				sc.close();
				System.exit(0);
			}
			
		}

	}

}
