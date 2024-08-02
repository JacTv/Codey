package gamebetting;
import java.util.Scanner;
public class TossCoin{
	
	private static Scanner scan = new Scanner(System.in);
	
	public String name;
	public String tail, head;
	public String choose;
	public int bet;
	public int number;
	public boolean result;
	
	public void gameBetting(String name, String tail, String head, String choose, int bet, int number) {
		this.name = name;
		this.tail = tail;
		this.head = head;
		this.choose = choose;
		this.bet = bet;
		this.number = number;
	}
	
    Counting count = new Counting();
	
	public void runCoin() {
		
		
		start();
		
        int repeat = 1;
		
		while(repeat > 0) {
		
			scan.nextLine();
		
		System.out.print("\nDo you want to play again(Yes or No) ? ");
		String play = scan.nextLine().toUpperCase();
		
		if(play.equals("YES")) {
          start();
          
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
	
	public void playerName2() {
		System.out.println("________________________________________________________________");
		System.out.print("Enter Your Name : ");
		name = scan.nextLine();
		System.out.println("________________________________________________________________");
	}
	
	public void playerChoose2() {
		choose = "";
		result = false;
		do {
			try {
				 System.out.print("Choose your bet(Tail or Head): ");
			        choose = scan.nextLine().toUpperCase();
			        if (choose.equals("TAIL")||choose.equals("HEAD")) {
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
	
	public void playerBet2() {
		System.out.println("________________________________________________________________");
		System.out.print("Enter Your Bet : ");
        bet = scan.nextInt();	
	}
	
	public void start() {
		playerName2();
		playerChoose2();
		playerBet2();
		count.counting();
		random();
		result();
	}
	
	public void random() {
	   number = (int) ((Math.random() + 0) *100);
	}
		
	public void result() {
        System.out.println("________________________________________________________________");
		String result = "";
		
		if(number %2 == 0) {
			String h = "HEAD";
			result = h;
		
		}else if(number %1 == 0) {
			String t = "TAIL";
			result = t;
		}
		
		count.delay();
		System.out.println("\nResult : " + result);
		
		System.out.println("\n  =================  ");
		System.out.println(" =                 = ");
		System.out.println("|                   |");
		System.out.println("|                   |");
		System.out.println("|                   |");
		System.out.println("|       "+result+"        |");
		System.out.println("|                   |");
		System.out.println("|                   |");
		System.out.println("|                   |");
		System.out.println(" =                 = ");
		System.out.println("  =================  ");
		
		
		if(choose.equals(result)) {
			count.delay();
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

