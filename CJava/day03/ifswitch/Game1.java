package ifswitch;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
/*		// 1. Math.Random 
		int num = 0;
		// Math.random() -> 0.0~1.0
		num = (int)(Math.random() * 10) + 1; // 1~10
		System.out.println(num);
		
		// 2. Random
		Random r = new Random();
		int num2 = 0;
		num2 = r.nextInt(3) + 1; // 0 ~ n-1
		System.out.println(num2);
*/		
		// 1. 사용자는 1~3값을 입력한다.
		// 2. 1~3 이외의 문자가 들어오면 "안녕"출력 프로그램 종료.
		// 3. 컴퓨터는 1~3의 숫자를 랜덤하게 만든다.
		// 4. 사용자 숫자와 비교하여 이겼는지 졌는지 출력 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1~3");
		int user = Integer.parseInt(sc.next());
		
		if(1>user && user>3 ) {
			System.out.println("안녕");
			sc.close();
			return;
		}
		
		int com = 0;
		Random r = new Random();
		com = r.nextInt(3) + 1;
		
		System.out.printf("user : %d, com : %d\n", user, com);
		
		int temp = user - com;
		int key = 0;
		
		if (temp == 0) {
			key = 0;
		}
		else if (temp == 1 | temp == -2) {
			key = 1; //user win
		}
		else if (temp == -1 | temp == 2) {
			key = 2; //com win
		}
		//String result = "";
		
		switch(key) {
		case 0: System.out.println("무승부");
		break;
		
		case 1: System.out.println("User win");
		break;
		
		case 2: System.out.println("Com win");
		break;
		
		}
		
		sc.close();
		
	}

}
