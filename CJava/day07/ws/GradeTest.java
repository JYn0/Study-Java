package ws;

import java.util.Arrays;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ���� ���� ���� �Է�");
		int score[] = new int[4];
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		Grade g = new Grade(score);
		
		System.out.println(g.sum(score));
		System.out.println(g.avg(score));
		System.out.println(g.level(score));
		System.out.println(g.max(score));
		System.out.println(g.min(score));
		System.out.println(Arrays.toString(g.asort(score)));
		System.out.println(Arrays.toString(g.dsort(score)));
		sc.close();
	}

}
