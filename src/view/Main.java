package view;

import controller.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String wrebet = """
				
                O..O
               (____)
               ((__))
               -w--w-    
				""";
		
		System.out.println(wrebet + "WELCOME TO THE RUN, FROG, RUN!" + wrebet );
		
		System.out.println("To see the positioning of the 5 frogs \nInsert a length for the race");
		System.out.println("");
		int distance = scan.nextInt();
		
		for (int i = 0; i < 5; i++) {
			
			try {
			
				RunFrogRun croac = new RunFrogRun(i+1, distance);
				croac.start();
				//croac.run();
				//Thread.sleep(100);

			} catch(Exception e) {
				
			}
			

		}
		
		scan.close();
	}

}
