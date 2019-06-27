package forwhile;

public class ForEx2 {

	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=5; j++) {
//				System.out.println(i+" "+j);
//			}
//		}
		
		// 가위바위보 매트릭스를 출력하시오
		// i : 유저, j : com
		//String result = " ";
		for(int i=1; i<4; i++) {
			for(int j=1; j<4; j++) {
//				if(i==j) {
//					result = "무승부";				
//				}
//				else if(i-j==1 | i-j==-2) {
//					result = "유저승";
//				}
//				else if(i-j==-1 | i-j==2) {
//					result = "컴승";
//				}
				int z = i - j;
				String str = "";
				if(z == 0) {
					str = "무승부";
				}
				if(z==-1 || z==2) {
					str = "컴승";
				}
				if(z==-2 || z==1) {
					str = "유저승";
				}
				System.out.print(str+"\t");
				//System.out.print(result+"\t");
			}
			System.out.println();
		}

	}

}
