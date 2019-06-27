package ws2;

import java.util.Random;
import java.util.Scanner;

public class Game { // 캔디크러쉬

	public static void main(String[] args) {
		// 1. 9x9 캔디판 생성
		int candy[][] = new int[11][11];
		System.out.println("캔디크러쉬\n");

		// 2. 캔디판에 ABCDE와 같이 서로 다른 종류 4개이상을 사용해서 캔디판에 넣는다.
		Random r = new Random();
		for (int i = 0; i < candy.length; i++) {
			for (int j = 0; j < candy[i].length; j++) {
				candy[i][j] = r.nextInt(5) + 1; // 5종류
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

		// 3. 게임시작, 사용자가 판을 보고 바꾸고 싶어하는 알파벳의 좌표를 선택하고,
		// 그 알파벳의 이웃 알파벳의 좌표를 입력해서 자리를 바꿈
		Scanner sc = new Scanner(System.in);
		int score = 0;

		while (true) {

			System.out.println("기준 좌표 입력");
			int x1 = 0, y1 = 0;
			x1 = Integer.parseInt(sc.next());
			y1 = Integer.parseInt(sc.next());

			System.out.println("바꿀 좌표 입력");
			int x2 = 0, y2 = 0;
			x2 = Integer.parseInt(sc.next());
			y2 = Integer.parseInt(sc.next());

			// 3-1 단, 이웃한 문자만 바꿀수 잇음, 이외의 경우 에러 메시지 출력
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

			// 4. 3개 이상의 문자가 아웃되면 없어지고 점수 카운트 추가
			// 가로
			if ((x1 == x2) && (y1 > y2)) {
				if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("가로 candy");
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
					System.out.println("가로 candy");
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
					System.out.println("가로 candy");
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
					System.out.println("가로 candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("가로 candy");
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
					System.out.println("가로 candy");
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
					System.out.println("가로 candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) { // (n,n-2)(n,n-1)(n,n)
					System.out.println("가로 candy");
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
					System.out.println("가로 candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) { // (n,n-2)(n,n-1)(n,n)
					System.out.println("가로 candy");
					score += 100;
				} else if ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2])) {// (n,n)(n,n+1)(n,n+2))
					System.out.println("가로 candy");
					score += 100;
				} else {
					System.out.println("Fail");
					str[x2][y2] = str[x1][y1];
					str[x1][y1] = change;
					score -= 50;
					continue;
				}
			}

			System.out.printf("점수 : %d", score);
			System.out.println();

//		if (((str[x1][y1] == str[x1][y1 - 1]) && (str[x1][y1] == str[x1][y1 + 1])) // (n,n-1)(n,n)(n,n+1)
//				|| ((str[x1][y1] == str[x1][y1 - 2]) && (str[x1][y1] == str[x1][y1 - 1])) // (n,n-2)(n,n-1)(n,n)
//				|| ((str[x1][y1] == str[x1][y1 + 1]) && (str[x1][y1] == str[x1][y1 + 2]))) // (n,n)(n,n+1)(n,n+2))

			if (score >= 300) {
				System.out.println("게임 종료");
				sc.close();
				System.exit(0);
			}
		}
	}

}
