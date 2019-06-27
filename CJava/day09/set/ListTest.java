package set;

import java.util.ArrayList;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Random r = new Random();

		while (true) {
			list.add(r.nextInt(45) + 1);
			if (list.size() == 10) {
				break;
			}
		}
		// List : 순서대로 저장X, 중복가능
		// System.out.println(list.toString());

		for (Integer i:list) {
			System.out.println(i);
			
		}
	}
}
