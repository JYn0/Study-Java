package forwhile;

public class WEx3 {

	public static void main(String[] args) throws InterruptedException {
		int i = 5;
		while(i-- != 0) {
			Thread.sleep(1000);// ���� �������� ���α׷��� 1�ʵ��� �����
			System.out.println(i);
		}
	}

}