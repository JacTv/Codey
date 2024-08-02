package gamebetting;

import java.util.Scanner;

public class Lucky21 {
	
	private static Scanner scan = new Scanner(System.in);
	
	private int cards[] = {1,2,3,4,5,6,7,8,9,10};	
	public String name;
	private int bet;
	public int number;
	private int choose;
	private boolean result;
	private int playercard1;
	private int playercard2;
	private int playergoodtotal;
	private int playercard3;
	private int playertotal;
	private int enemycard1;
	private int enemycard2;
	private int enemycard3;
	private int enemytotal;
	private int enemygoodtotal;
	
	Counting count = new Counting();
	
	public void gameBetting(String name, int bet, int number, int choose, int playercard1 , int playercard2
			, int playercard3, int enemycard1, int enemycard2, int enemycard3, int playertotal, int enemytotal) {
		this.name = name;
		this.bet = bet;
		this.number = number;
		this.choose = choose;
		this.playercard1 = playercard1;
		this.playercard2 = playercard2;
		this.playercard3 = playercard3;
		this.playertotal = playertotal;
		this.enemycard1 = enemycard1;
		this.enemycard2 = enemycard2;
		this.enemycard3 = enemycard3;
		this.enemytotal = enemytotal;
	}
	
	public void runL21() {
		count.delay();
		lucky21();
		
        int repeat = 1;
		
		while(repeat > 0) {
		scan.nextLine();
		
		System.out.print("\nDo you want to play again(Yes or No) ? ");
		String play = scan.nextLine().toUpperCase();
		
		if(play.equals("YES")) {
         lucky21();
          
		}else if(play.equals("NO")){
			System.out.println("\n----- Thank You, Bye! -----");
			repeat--;
    		       
		}
		
		}
	}
	
	public void lucky21() {
		introduction();
		playerName3();
		playerBet3();
		count.countingLN();
		player1stCard();
		player2ndCard();
		playerGoodHint();
		enemy1stCard();
		enemy2ndCard();
		enemyGoodHint();
		end();
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public boolean getResult() {
		return result;
	}
	
	public void introduction() {
		System.out.println("________________________________________________________________");
		System.out.println("Welcome to Lucky 21");
		System.out.println("\nThe rule of the game is -");
		System.out.println("1. Your cards need to be close to the number 21. ");
		System.out.println("2. If you think you have a low total, press (2 - Hint) to add another card ");
		System.out.println("3. If your total goes over 21, you are Disqualified");
	}
	
	public void playerName3() {
		count.delay();
		System.out.println("________________________________________________________________");
		System.out.print("Enter Your Name : ");
		name = scan.nextLine();
	}
	
	public void playerBet3() {
		count.delay();
		System.out.println("________________________________________________________________");
		System.out.print("Enter Your Bet : ");
        bet = scan.nextInt();
		
	}

	public void player1stCard() {
		   count.delay();
		   int result = 0;
		   number = (int) ((Math.random() +0)*9);
		   
		   result = cards[number];
		   System.out.println("________________________________________________________________");
			System.out.println("============="); 
			System.out.println("| "+result+"         |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|         "+result+" |");
			System.out.println("=============");
			
			playercard1 = result;
			
		}
	
	public void setCard1(int playercard1) {
		this.playercard1 = playercard1;
	}
	
	public int getCard1() {
		return playercard1;
	}
	
	public void player2ndCard() {
		   count.delay();
		   int result = 0;
		   number = (int) ((Math.random() +0)*9);
		   
		   result = cards[number];
			System.out.println("\n============="); 
			System.out.println("| "+result+"         |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|         "+result+" |");
			System.out.println("=============");
			
			playercard2 = result;
			
			playergoodtotal = playercard1 + playercard2;
			
			System.out.println("\nTotal : " + playergoodtotal);
			
		}
	
	public void setCard2(int playercard2) {
		this.playercard2 = playercard2;
	}
	
	public int getCard2() {
		return playercard2;
	}
	
	
	
	public void playerGoodHint() {
		count.delay();
		System.out.println("________________________________________________________________");
		
        int repeat = 1;
		
		while(repeat > 0) {
			
			System.out.print("Choose number (1 - Good) or (2 - Hint)? ");
			choose = scan.nextInt();
			
			count.delay();
			 if(choose == 1) {
			     System.out.println("\nPlayer Choose : Good");
			     playertotal = playergoodtotal;
			     System.out.println("________________________________________________________________");
			     repeat--;
			 }else if(choose == 2) {
				 System.out.println("\nPlayer Choose : Hint");
				 
				 int result = 0;
				   number = (int) ((Math.random() +0)*9);
				   
				   count.delay();
				   result = cards[number];
					System.out.println("============="); 
					System.out.println("| "+result+"         |");
					System.out.println("|           |");
					System.out.println("|           |");
					System.out.println("|           |");
					System.out.println("|           |");
					System.out.println("|           |");
					System.out.println("|           |");
					System.out.println("|           |");
					System.out.println("|         "+result+" |");
					System.out.println("=============");
					
					playercard3 = result;
					
					playertotal = (playergoodtotal+playercard3);
					
					System.out.println("________________________________________________________________");
					count.delay();
					if(playertotal <= 21) {
						System.out.println("\nPlayer Total : " + playertotal);
					}else {
						System.out.println("\nPlayer Total : " + playertotal + "(DISQUALIFIED)");
						playertotal = 0;
					}
					System.out.println("________________________________________________________________");	
					
				 repeat--;
			 }else
			    System.out.println("Error Input! Please Try Again.");
			        
		     }
		
		}
	
	public void enemy1stCard() {
		count.delay();
		   int result = 0;
		   number = (int) ((Math.random() +0)*9);
		   
		   result = cards[number];
		   
		   count.delay();
		   System.out.println(" ---Enemy Turn---");
		   count.delay();
			System.out.println("\n============="); 
			System.out.println("| "+result+"         |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|         "+result+" |");
			System.out.println("=============");
			
			 enemycard1 = result;
	}
	
	public void enemy2ndCard() {
		count.delay();
		   int result = 0;
		   number = (int) ((Math.random() +0)*9);
		   
		   count.delay();
		   result = cards[number];
			System.out.println("\n============="); 
			System.out.println("| "+result+"         |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|         "+result+" |");
			System.out.println("=============");
			
			enemycard2 = result;
			
			enemygoodtotal = (enemycard1+enemycard2);
			count.delay();
			System.out.println("\nEnemy Total : " + enemygoodtotal);	
	}
	   
	public void enemyGoodHint() {
		count.delay();
		System.out.println("________________________________________________________________");
		count.delay();
		
		if(enemygoodtotal >= 16) {
			System.out.println(" ---Enemy Choose: Good!---");
		}else if(enemygoodtotal <= 15) {
			System.out.println(" ---Enemy Choose: Hint!---");
			
			 int result = 0;
			   number = (int) ((Math.random() +0)*9);
			
			 count.delay();
			   result = cards[number];
				System.out.println("\n============="); 
				System.out.println("| "+result+"         |");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|         "+result+" |");
				System.out.println("=============");
				
				enemycard3 = result;
				
				enemytotal = (enemygoodtotal+enemycard3);
				
				System.out.println("________________________________________________________________");
				count.delay();
				if(enemytotal <= 21) {
					System.out.println("\nEnemy Total : " + enemytotal);
				}else {
					System.out.println("\nEnemy Total : " + enemytotal + "(DISQUALIFIED)");
					enemytotal = 0;
				}
				System.out.println("________________________________________________________________");	
				
		}else {
			System.out.println("Error");
		}
	}

	public void end() {
		
		
		count.delay();
		if(playertotal > enemytotal) {
			System.out.println("  \n   You Won : ₱" + bet);
			int receipt = (int) (((Math.random()+1)*10000));
			System.out.println("\n   Receipt Number : " + receipt);
			System.out.println("________________________________________________________________");
		
		}else if(playertotal == enemytotal) {	
			System.out.println("\n   ===Battle Draw=== ");
			System.out.println("________________________________________________________________");
		
		}else {
			System.out.println("\n   You Lose : ₱" + bet);
			System.out.println("________________________________________________________________");
		
	}
	}
	
	
}
		  