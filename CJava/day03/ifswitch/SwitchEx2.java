package ifswitch;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// �ش� ���� ������ ���ڸ� ����Ͻÿ�
		int month = 1;
		int lastDayOfMonth = 0;
		System.out.println("�� �Է�");
		Scanner sc = new Scanner(System.in);
		month = Integer.parseInt(sc.nextLine());
		//31 - 1,3,5,7,8,10,12
		//30 - 4,6,9,11
		//28 - 2

		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDayOfMonth = 31;
		break;
		case 2: lastDayOfMonth = 28;
		break;
		case 4: case 6: case 9: case 11:
			lastDayOfMonth = 30;
		break;
		}
		
		System.out.println(lastDayOfMonth);
		sc.close();
	}

}
