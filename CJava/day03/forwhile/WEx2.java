package forwhile;

import java.util.Scanner;

public class WEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command..");		
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye...");
				sc.close();
				break; // -> while break
				//return; // -> main 
				//System.exit(0); // process
			}else if(cmd.equals("i")) {
				System.out.println("Input Num");
				int a = Integer.parseInt(sc.next());
				System.out.println(a);
			}else if(cmd.equals("s")) {
				System.out.println("Selected..");
			}else {
				System.out.println("Re-Try");
				continue; //잘못 들어오면 completed 실행X
			}
			System.out.println("Completed...");
		} // end while
		
		System.out.println("System Exit..");

	}

}
