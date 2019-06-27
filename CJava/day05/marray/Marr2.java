package marray;

import java.util.Random;

public class Marr2 {

	public static void main(String[] args) {
		//int ma[][] = new int[3][4];
		int ma[][] = new int[3][]; //-> 3За
		ma[0] = new int[5]; //4
		ma[1] = new int[2]; //4
		ma[2] = new int[3]; //4
		// ma : 3За4ї­
	
//		int ma[][] = {
//				{2,4,3,5},
//				{0,4,1,5,2},
//				{2,5,3,},
//				{7,4,3,5},
//		};
				
		Random r = new Random();
		
		for(int i=0; i<ma.length; i++) {
			for(int j=0; j<ma[i].length; j++) {
				ma[i][j] = r.nextInt(10) + 1;
			}
		}
		//System.out.println(Arrays.toString(ma));
		
		for(int temp[]:ma) {
			for(int data:temp) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
	}

}
