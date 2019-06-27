package ws3;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 1. 8X8 정방행렬을 만든다(테두리만 표시)
		int m[][] = new int[8][8];

		// 2. 플레이어 1, 2에게 각각 포인트를 준다.(1000P)
		int p1 = 1000, p2 = 1000;

		// 3. 테두리에 1~100까지의 숫자를 랜덤하게 배열한다.
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

		// 4. 각 플레이어가 주사위를 한번씩 던져 나온 숫자만큼 이동
		int dice1 = 0, dice2 = 0;
		int user1 = 0, user2 = 0;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			dice1 = sc.nextInt(6)+1;
			user1 += dice1 -1;

			// 5. 해당 위치에 있는 숫자만큼 포인트 차감
			p1 -= line[user1];
			System.out.printf("플레이어 1   주사위 : %d, 위치 : %d, user1 포인트 : %d", dice1, user1, p1);
			
			dice2 = sc.nextInt(6)+1;
			user2 += dice2-1;

			p2 -= line[user2];
			System.out.printf("플레이어 2   주사위 : %d, 위치 : %d, user1 포인트 : %d", dice1, user1, p1);

			
			if ((p1 < 0) || (p1 < 0)) {
				System.out.println("게임 종료");
			}

		}

		// 6. 계속해서 진행한 후 포인트가 0이하가 된 플레이어 패배
	}

}
