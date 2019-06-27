package day02;

public class Operator2 {

	public static void main(String[] args) {
		double d = 3.14356523;
		
		// 소숫점 3자리 이하 버림을 계산하고 출력
		//double pi1 = (int)(d * 1000) / 1000.0;
		double d1 = Math.floor(d * 1000) / 1000.0;
		System.out.println(d1);
		
		// 소숫점 3자리 이하 반울림을 계산하고 출력
		//double pi2 = (int)(d * 1000 + 0.5) / 1000.0;
		//System.out.println(pi2);
		double d2 = Math.round(d * 1000) / 1000.0;
		System.out.println(d2);
		
		//System.out.printf("버림 : %10.3f, 반올림 : %10.3f", pi1, pi2);
		
		
		//직각 삼각형 가로세로가 5,4인 삼각형의 빗변의 길이를 구하시오
		//hint Math API를 이용할 것
		double result = 0.0;
		double sum = Math.pow(5, 2) + Math.pow(4, 2);
		//result = Math.sqrt(sum);
		result = Math.sqrt((Math.pow(5, 2) + Math.pow(4, 2)));
		System.out.println(result);		
		
	}

}
