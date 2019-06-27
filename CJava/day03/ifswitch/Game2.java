package ifswitch;

public class Game2 {

	public static void main(String[] args) {
		String str = "1616jojo@naver.com";
//		char c = str.charAt(5);
//		System.out.println(c);
		String id = str.substring(0, str.indexOf("@"));
		String domain = str.substring(str.indexOf("@")+1, str.indexOf("."));
		System.out.println(id + " " + domain);	
		
	}

}
