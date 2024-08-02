package gamebetting;

import java.util.Scanner;

public class EvenOdd {
	
	private Scanner scan = new Scanner(System.in);
	
	public String name;
	private String choose;
	private int bet;
	private int number;
	private boolean result;
	
	public void gameBetting(String name, String choose, int bet){
		this.name = name;
		this.choose = choose;
		this.bet = bet;
	}
	
	Counting count = new Counting();
	
	public void runEvenOdd() {
        
		EvenOdd game = new EvenOdd();
        game.start();
  	    count.counting();
        game.end();
		
		int repeat = 1;
		
		while(repeat > 0) {
		System.out.print("\nDo you want to play again(Yes or No) ? ");
		String play = scan.nextLine().toUpperCase();
		
		if(play.equals("YES")) {
		EvenOdd games = new EvenOdd();
          games.start();
    	  count.counting();
          games.end();
          
		}else if(play.equals("NO")){
			System.out.println("\n----- Thank You, Bye! -----");
			repeat--;
    		       
		}
		
		}
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public boolean getResult() {
		return result;
	}
	
	public void playerName() {
		System.out.println("________________________________________________________________");
		System.out.print("Enter Your Name : ");
		name = scan.nextLine();
		System.out.println("________________________________________________________________");
	}
	
	public void playerChoose() {
		choose = "";
		result = false;
		  do {
		    try {
		    	
		        System.out.print("Choose your bet(Even or Odd): ");
		        choose = scan.nextLine().toUpperCase();
		        if (choose.equals("EVEN")||choose.equals("ODD")) {
		           result = true;
		        } else {
		           System.out.println("Invalid input.");
		        }
		        } catch (Exception e) {
		           System.out.println("Error in your input. Please try again.[" + e.toString() + "]");
		           scan.nextLine();
		       }
	        } while (!result);
	    }
	
	public void playerBet() {
		System.out.println("________________________________________________________________");
		System.out.print("Enter Your Bet : ");
        bet = scan.nextInt();	
	}
	
	public void start() {
		playerName();
		playerChoose();
		playerBet();
	}
	
	public void end() {
		random();
		result();
	}
	
	public void random() {
		number = (int) ((Math.random() + 0) *100);
	}
	
	public void result() {
        System.out.println("________________________________________________________________");
		System.out.println("\nResult : " + number);
		
		String result = "";
		
		if(number %2 == 0) {
			String e = "EVEN";
			result = e;
		
		}else if(number %1 == 0) {
			String o = "ODD";
			result = o;
		}
		
		count.delay();
		
		System.out.println("\n+---------------+");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("       "+result+"     ");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("+---------------+");
		
		
		if(choose.equals(result)) {
			System.out.println("________________________________________________________________");
			System.out.println("  \n   You Won : ₱" + bet);
			int receipt = (int) (((Math.random()+1)*10000));
			System.out.println("\n   Receipt Number : " + receipt);
			System.out.println("________________________________________________________________");
		}else {
			System.out.println("________________________________________________________________");
			System.out.println("\n   You Lose : ₱" + bet);
			System.out.println("________________________________________________________________");
	}
	}
}
	

