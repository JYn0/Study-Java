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
		// 1. ����ڴ� 1~3���� �Է��Ѵ�.
		// 2. 1~3 �̿��� ���ڰ� ������ "�ȳ�"��� ���α׷� ����.
		// 3. ��ǻ�ʹ� 1~3�� ���ڸ� �����ϰ� �����.
		// 4. ����� ���ڿ� ���Ͽ� �̰���� ������ ��� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1~3");
		int user = Integer.parseInt(sc.next());
		
		if(1>user && user>3 ) {
			System.out.println("�ȳ�");
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
		case 0: System.out.println("���º�");
		break;
		
		case 1: System.out.println("User win");
		break;
		
		case 2: System.out.println("Com win");
		break;
		
		}
		
		sc.close();
		
	}

}
