package bm;

public class App {

	public static void main(String[] args) {
		Game game = new Game();
		for (int temp[] : game.gnd) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		
		System.out.println("주사위 던지기");
	}

}
