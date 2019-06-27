package forwhile;

public class WEx3 {

	public static void main(String[] args) throws InterruptedException {
		int i = 5;
		while(i-- != 0) {
			Thread.sleep(1000);// 현재 동작중인 프로그램을 1초동안 멈춰라
			System.out.println(i);
		}
	}

}