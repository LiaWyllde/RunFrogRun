package controller;
import java.util.Random;

public class RunFrogRun extends Thread {
	
	int frog;
	final int distance;
	final int jump;
	static int[] arrayRank = new int[5];
	static int cont = 1;
	
	public RunFrogRun(int frog, int distance) {
		this.frog = frog;
		this.distance = distance;
		this.jump = (int)(distance * 0.1);
	}
	
	private void wrebetRun(int frog, int distance, int jump) {
		
		Random rand = new Random();
		int ran = 0;
		//ran é a femea do sapo
		
		while (ran < distance) {
			int littleJump = rand.nextInt(1, jump);
			ran += littleJump;
			System.out.println("The frog " + frog + " jumps: " + littleJump + "\nNow this adorable creature ran: " + ran + "\n   ... JUMP! ...");
			
			try {
				Thread.sleep(rand.nextInt(100,1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
			System.out.println("\n**wrebet**" + "\nThe frog " + frog + " has finished!" + "\n**wrebet**\n");
			showRank(frog);
			
			cont++;
	}			
	
	private void showRank(int position) {
		//direct access because the variable cont is static 
	
		arrayRank[cont-1] = position;
		
		if (cont >= 5) {
			System.out.println("");
			String wrebet = """
					
                     O..O
                    (____)
                    ((__))
                    -w--w-    
					""";

			
			System.out.println(wrebet);
			System.out.println("-----------------------------------");
			System.out.println("------*------FROG RANK------*------");
			for (int i = 0; i < 5; i++) {
				System.out.println("-----------------------------------");
				System.out.println("     " + (i+1) + "° position: " + "Cute frog " +arrayRank[i]);
				if (i == 4) {

					System.out.println("-----------------------------------\n" + "              " + wrebet);
				}
			}
		}
	}
	
	@Override
	public void run() {
		wrebetRun(frog, distance, jump);
	}
}
