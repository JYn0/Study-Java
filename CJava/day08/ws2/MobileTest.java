package ws2;

public class MobileTest {

	public static void main(String[] args) {
		//Mobile m = new Mobile();
		Ltab l = new Ltab("Ltab", 500, "AP-01");
		Otab o = new Otab("Otab", 1000, "AND-20");
		//System.out.println(m);
		System.out.println(l);
		System.out.println(o);
		
		System.out.println("10분 충전");
		System.out.println(l.charge(10));
		System.out.println(o.charge(10));
		
		System.out.println("5분 통화");
		System.out.println(l.operate(5));
		System.out.println(o.operate(5));
	}
}
