package ws2;

import java.util.Random;
import java.util.Scanner;

public class Game { // ĵ��ũ����

	public static void main(String[] args) {
		// 1. 9x9 ĵ���� ����
		int candy[][] = new int[11][11];
		System.out.println("ĵ��ũ����\n");

		// 2. ĵ���ǿ� ABCDE�� ���� ���� �ٸ� ���� 4���̻��� ����ؼ� ĵ���ǿ� �ִ´�.
		Random r = new Random();
		for (int i = 0; i < candy.length; i++) {
			for (int j = 0; j < candy[i].length; j++) {
				candy[i][j] = r.nextInt(5) + 1; // 5����
			}
		}
		for (int i = 0; i < candy.length; i++) {
			candy[i][0] = 0;
			candy[0][i] = 0;
			candy[i][candy.length - 1] = 0;
			candy[candy.length - 1][i] = 0;
		}

		String str[][] = new String[candy.length][candy.length];
		for (int i = 0; i < candy.length; i++) {
			for (int j = 0; j < candy.length; j++) {
				switch (candy[i][j]) {
				case 1:
					str[i][j] = "A";
					break;
				case 2:
					str[i][j] = "B";
					break;
				case 3:
					str[i][j] = "C";
					break;
				case 4:
					str[i][j] = "D";
					break;
				case 5:
					str[i][j] = "E";
					break;
				default:
					str[i][j] = "";
					break;
				}
			}
		}
		for (String temp[] : str) {
			for (String data : temp) {
				System.out.printf("%S\t", data);
			}
			System.out.println();
		}

		// 3. ���ӽ���, ����ڰ� ���� ���� �ٲٰ� �;��ϴ� ���ĺ��� ��ǥ�� �����ϰ�,
		// �� ���ĺ��� �̿� ���ĺ��� ��ǥ�� �Է��ؼ� �ڸ��� �ٲ�
		Scanner sc = new Scanner(System.in);
		int score = 0;

		while (true) {

			System.out.println("���� ��ǥ �Է�");
			int x1 = 0, y1 = 0;
			x1 = Integer.parseInt(sc.next());
			y1 = Integer.parseInt(sc.next());

			System.out.println("�ٲ� ��ǥ �Է�");
			int x2 = 0, y2 = 0;
			x2 = Integer.parseInt(sc.next());
			y2 = Integer.parseInt(sc.next());

			// 3-1 ��, �̿��� ���ڸ� �ٲܼ� ����, �̿��� ��� ���� �޽��� ���
			String change = "";
			if (((x1 == x2) && ((Math.abs(Math.subtractExact(y1, y2))) == 1))
					|| ((y1 == y2) && ((Math.abs(Math.subtractExact(x1, x2))) == 1))) {
				change = str[x1][y1];
				str[x1][y1] = str[x2][y2];
				str[x2][y2] = change;

				for (String temp[] : str) {
					for (String data : temp) {
						System.out.printf("%S\t", data);
					}
					System.out.println();
				}
			} else {
				System.out.println("Error");
				continue;
			}

			// 4. 3�� �̻��� ���ڰ� �ƿ��Ǹ� �������� ���� ī��Ʈ �߰�
			// ����
			if ((x1 == x2) && (y1 > y2)) {
				if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			} else if ((x1 == x2) && (y1 < y2)) {
				if ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) { // (n,n-2)(n,n-1)(n,n)
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			} else if (((y1 == y2) && (x1 == 1)) || ((y1 == y2) && (y1 == 1))) {
				if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			} else if (((y1 == y2) && (x1 == 2)) || ((y1 == y2) && (y1 == 2))) {
				if ((str[x1][y1] == str[x1][y1 - 1]) && (str[x1][y1] == str[x1][y1 + 1])) { // (n,n-1)(n,n)(n,n+1)
					System.out.println("���� candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			} else if ((y1 == y2) && (x1 == candy.length)) {
				if ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) { // (n,n-2)(n,n-1)(n,n)
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			} else if ((y1 == y2) && (x1 == candy.length - 1)) {
				if (((str[x1][y1] == str[x1][y1 - 1]) && (str[x1][y1] == str[x1][y1 + 1]))) {// (n,n-1)(n,n)(n,n+1)
					System.out.println("���� candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) { // (n,n-2)(n,n-1)(n,n)
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			} else {
				if (((str[x1][y1] == str[x1][y1 - 1]) && (str[x1][y1] == str[x1][y1 + 1]))) {// (n,n-1)(n,n)(n,n+1)
					System.out.println("���� candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) { // (n,n-2)(n,n-1)(n,n)
					System.out.println("���� candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("���� candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			}

			System.out.printf("���� : %d", score);
			System.out.println();

//		if (((str[x1][y1] == str[x1][y1 - 1]) && (str[x1][y1] == str[x1][y1 + 1])) // (n,n-1)(n,n)(n,n+1)
//				|| ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) // (n,n-2)(n,n-1)(n,n)
//				|| ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2]))) // (n,n)(n,n+1)(n,n+2))

			if (score >= 300) {
				System.out.println("���� ����");
				sc.close();
				System.exit(0);
			}
		}
	}

}
