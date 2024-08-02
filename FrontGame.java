package gamebetting;
import java.util.Scanner;
public class FrontGame {
	private static Scanner s = new Scanner(System.in);
	
	EvenOdd game = new EvenOdd();
	TossCoin game2 = new TossCoin();
	Lucky21 game3 = new Lucky21();
	
	public void runMain() {
		
		int repeat = 1;
		
		while(repeat > 0) {
		System.out.println("==========================");
        System.out.println("Java Game");
		System.out.println("1 - Even & Odd ");
		System.out.println("2 - Toss Coin");
		System.out.println("3 - Lucky21(New Edition)");
		System.out.println("4 - Exit");
		System.out.println("==========================");
		System.out.print("\nChoose Number To Play : ");
		
	    int chooseGame = s.nextInt();
	    
	    if(chooseGame == 1) {
	    	game.runEvenOdd();
	    }else if(chooseGame == 2) {
	    	game2.runCoin();
	    }else if(chooseGame == 3) {
	    	game3.runL21();
	    }else if(chooseGame == 4) {
	    	System.out.println("\n-Game Exit.-");
	    	repeat--;
	    }else
	    	System.out.println("\nError Input! Please Try Again.");
	        
		}
}
}
