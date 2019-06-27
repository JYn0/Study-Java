package ws3;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 1. 8X8 ��������� �����(�׵θ��� ǥ��)
		int m[][] = new int[8][8];

		// 2. �÷��̾� 1, 2���� ���� ����Ʈ�� �ش�.(1000P)
		int p1 = 1000, p2 = 1000;

		// 3. �׵θ��� 1~100������ ���ڸ� �����ϰ� �迭�Ѵ�.
		Random r = new Random();
		for (int i = 0; i < m.length; i++) {
			m[0][i] = r.nextInt(100) + 1;
			m[i][0] = r.nextInt(100) + 1;
			m[m.length - 1][i] = r.nextInt(100) + 1;
			m[i][m.length - 1] = r.nextInt(100) + 1;
		}
		int line[] = new int[28];
		for (int i = 0; i < 7; i++) {
			line[i] = m[0][i]; // 0~6
			line[7 + i] = m[i][7]; // 7~13
		}
		for (int i = 7; i > 0; i--) {
			line[21 - i] = m[7][i];// 14~20
			line[28 - i] = m[i][0];// 21~27
		}

		// System.out.println(Arrays.toString(line));
		System.out.println();
		for (int temp[] : m) {
			for (int data : temp) {
				// System.out.print("____");
				System.out.printf("\t%s", data);
			}
			System.out.println();
		}

		// 4. �� �÷��̾ �ֻ����� �ѹ��� ���� ���� ���ڸ�ŭ �̵�
		int dice1 = 0, dice2 = 0;
		int user1 = 0, user2 = 0;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			dice1 = sc.nextInt(6)+1;
			user1 += dice1 -1;

			// 5. �ش� ��ġ�� �ִ� ���ڸ�ŭ ����Ʈ ����
			p1 -= line[user1];
			System.out.printf("�÷��̾� 1   �ֻ��� : %d, ��ġ : %d, user1 ����Ʈ : %d", dice1, user1, p1);
			
			dice2 = sc.nextInt(6)+1;
			user2 += dice2-1;

			p2 -= line[user2];
			System.out.printf("�÷��̾� 2   �ֻ��� : %d, ��ġ : %d, user1 ����Ʈ : %d", dice1, user1, p1);

			
			if ((p1 < 0) || (p1 < 0)) {
				System.out.println("���� ����");
			}

		}

		// 6. ����ؼ� ������ �� ����Ʈ�� 0���ϰ� �� �÷��̾� �й�
	}

}
