package marray;

import java.util.Arrays;
import java.util.Random;

public class Marr3 {

	public static void main(String[] args) {
		System.out.println("A\tB\tC\tD");
		
		// 2차원 배열을 이용하여 5명 학생의 4과목 점수를 생성하여 출력하시오	
		int a[][] = new int[5][4];
		
		Random r = new Random();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = r.nextInt(101);
			}
		}
		
		for(int temp[]:a) {
			for(int data:temp) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
		
		// 학생 별 평균을 출력하시오
		System.out.println("학생 별 평균");
		double e[] = new double[a.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				e[i] = (e[i] + a[i][j]);
			}
			e[i] = e[i]/a[i].length;
		}
		System.out.println(Arrays.toString(e));
		
		// 과목 별 평균을 출력하시오
		System.out.println("과목 별 평균");
		double f[] = new double[a[0].length];
		for(int i=0; i<a[i].length; i++) {
			for(int j=0; j<a.length; j++) {
				f[i] = (f[i] + a[j][i]);
			}
			f[i] = f[i] / a.length;
		}
		System.out.println(Arrays.toString(f));
		
/*		double cavg = 0.0;
		for(int j=0;j<a[0].length;j++) {
			int sum = 0;
			for(int i=0;i<a.length;i++) {
				sum += a[i][j];
			}
			cavg = (double)sum/(a.length);
			System.out.println(cavg);
		}
*/

	}

}
