package day02;

public class Operator2 {

	public static void main(String[] args) {
		double d = 3.14356523;
		
		// �Ҽ��� 3�ڸ� ���� ������ ����ϰ� ���
		//double pi1 = (int)(d * 1000) / 1000.0;
		double d1 = Math.floor(d * 1000) / 1000.0;
		System.out.println(d1);
		
		// �Ҽ��� 3�ڸ� ���� �ݿ︲�� ����ϰ� ���
		//double pi2 = (int)(d * 1000 + 0.5) / 1000.0;
		//System.out.println(pi2);
		double d2 = Math.round(d * 1000) / 1000.0;
		System.out.println(d2);
		
		//System.out.printf("���� : %10.3f, �ݿø� : %10.3f", pi1, pi2);
		
		
		//���� �ﰢ�� ���μ��ΰ� 5,4�� �ﰢ���� ������ ���̸� ���Ͻÿ�
		//hint Math API�� �̿��� ��
		double result = 0.0;
		double sum = Math.pow(5, 2) + Math.pow(4, 2);
		//result = Math.sqrt(sum);
		result = Math.sqrt((Math.pow(5, 2) + Math.pow(4, 2)));
		System.out.println(result);		
		
	}

}
