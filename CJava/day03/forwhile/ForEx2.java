package forwhile;

public class ForEx2 {

	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=5; j++) {
//				System.out.println(i+" "+j);
//			}
//		}
		
		// ���������� ��Ʈ������ ����Ͻÿ�
		// i : ����, j : com
		//String result = " ";
		for(int i=1; i<4; i++) {
			for(int j=1; j<4; j++) {
//				if(i==j) {
//					result = "���º�";				
//				}
//				else if(i-j==1 | i-j==-2) {
//					result = "������";
//				}
//				else if(i-j==-1 | i-j==2) {
//					result = "�Ľ�";
//				}
				int z = i - j;
				String str = "";
				if(z == 0) {
					str = "���º�";
				}
				if(z==-1 || z==2) {
					str = "�Ľ�";
				}
				if(z==-2 || z==1) {
					str = "������";
				}
				System.out.print(str+"\t");
				//System.out.print(result+"\t");
			}
			System.out.println();
		}

	}

}
