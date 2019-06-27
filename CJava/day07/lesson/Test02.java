package lesson;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = 0, j = 0, cnt = 0;

		while (true) {
			i = r.nextInt(6) + 1;
			j = r.nextInt(6) + 1;
			if (i + j == 6) {
				System.out.printf("(%d, %d)\n", i, j);
				cnt++;
			}
			if (cnt == 10) {
				break;
			}
		}
	}
}
