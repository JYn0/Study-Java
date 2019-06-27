package bank;

public class AccountApp {

	public static void main(String[] args) {
		Account acc1 = null, acc2 = null;
		try {
			acc1 = new Account("Kim", "12345", 10000);
			System.out.println(acc1);
			System.out.println(Account.cnt);// class 변수 접근 : 객체 안만들고 다이렉트로 접근 가능 class이름.변수
			acc2 = new Account("Lee", "12346", 20000);
			System.out.println(acc2);
			System.out.println(Account.cnt);
//			System.out.println(acc1);
//			acc1.deposit(100300);
//			System.out.println(acc1);
//			acc1.withdraw(5000000);
//			System.out.println(acc1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
