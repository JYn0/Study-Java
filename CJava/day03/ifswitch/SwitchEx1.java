package ifswitch;

public class SwitchEx1 {

	public static void main(String[] args) {
		// admin Permission Control
		
		int a = 1;
		//char a = '1'; -> case '1':, String a = "1"; -> case "1":
		String str = "";
		switch(a) { // -> ½Ç¼ö ¾ÈµÊ, int value, String
		case 1: str += "Super Admin ";
		//break;
		case 2: str += "Middle Admin ";
		//break;
		case 3: str += "Admin ";
		break;
		default: str = "FAIL";
		break;
		}
		System.out.println(str);
	}

}
