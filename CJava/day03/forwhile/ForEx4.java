package forwhile;

public class ForEx4 {

	public static void main(String[] args) {
		//�ֻ����� 3���������� ���� �� �ִ� �� ���ϱ�(3~18����)
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for(int k=1; k<=6; k++) {
					System.out.printf("%d%d%d \t", i,j,k);
					//int sum = i+j+k;
					//System.out.print(sum+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
