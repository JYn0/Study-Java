package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Game4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0, num = 0;
		
		while(true) {			
			// q ����
			System.out.println("�����Ϸ��� �ƹ�Ű�� �����ÿ�. ���� : q");
			String str = sc.next();
			if (str.equals("q")) {
				System.out.println("����");
				sc.close();
				return;
			} else {
				System.out.println("����������");				
							
				// ����������
				int user = Integer.parseInt(sc.next());
				
				if(1>user || user>3 ) {
					System.out.println("���������� ����");
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
						result = "���º�";
					}
					else if (temp == 1 | temp == -2) {
						result = "user win";
						win++;
					}
					else if (temp == -1 | temp == 2) {
						result = "user lose";
					}
					num++;			
					System.out.print("��� : "+result+"\t");
					System.out.printf("���� �� : %d, �̱� �� : %d \n\n", num,win);
				}
			}			
		}
	}
}