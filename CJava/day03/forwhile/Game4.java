package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Game4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0, num = 0;
		
		while(true) {			
			// q 종료
			System.out.println("시작하려면 아무키나 누르시오. 종료 : q");
			String str = sc.next();
			if (str.equals("q")) {
				System.out.println("종료");
				sc.close();
				return;
			} else {
				System.out.println("가위바위보");				
							
				// 가위바위보
				int user = Integer.parseInt(sc.next());
				
				if(1>user || user>3 ) {
					System.out.println("가위바위보 실패");
					//sc.close();
					//return;
				} else {			
					int com = 0;
					Random r = new Random();
					com = r.nextInt(3) + 1;
					System.out.printf("user : %d, com : %d\n", user, com);
			
					int temp = user - com;
					String result = "";
					if (temp == 0) {
						result = "무승부";
					}
					else if (temp == 1 | temp == -2) {
						result = "user win";
						win++;
					}
					else if (temp == -1 | temp == 2) {
						result = "user lose";
					}
					num++;			
					System.out.print("결과 : "+result+"\t");
					System.out.printf("게임 수 : %d, 이긴 수 : %d \n\n", num,win);
				}
			}			
		}
	}
}