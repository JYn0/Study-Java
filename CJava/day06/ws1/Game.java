package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game { // 숫자야구

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int strike = 0, ball = 0, homerun = 0, out = 0;
		int count = 0;

		while (true) {
			// 1. 랜덤 4자리 숫자 받기(0~9) 중복X
			System.out.println("숫자야구 시작 (종료 : 10)");
			Random r = new Random();
			int num[] = new int[4];
			for (int i = 0; i < num.length; i++) {
				num[i] = r.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) { // 중복 확인
						i--;
					}
				}
			}
			System.out.println(Arrays.toString(num));

			// 2. 사용자가 4자리 숫자 입력
			System.out.println("숫자 4개를 입력");
			int user[] = new int[4];
			for (int i = 0; i < user.length; i++) {
				user[i] = Integer.parseInt(sc.next());
				if(user[i] == 10) {
					System.out.println("강제종료");
					sc.close();
					System.exit(0);
				}
			}
			//System.out.println(Arrays.toString(user));

			
			// 3. 숫자가 있으면 ball, 자리도 같으면 strike
			// 4. 아예 안맞으면 out
			// 5. 완전히 일치하게 되면 홈런으로 게임 끝
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
				System.out.println("Homerun 경기종료");
				sc.close();
				System.exit(0);
			}
			
		}

	}

}
