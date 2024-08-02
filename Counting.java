package gamebetting;

public class Counting{
	
	public void counting() {
		System.out.println("________________________________________________________________");
		for(int seconds = 10; seconds >= 1; seconds--) {
			System.out.println("Starting in " + seconds);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void delay() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void countingLN() {
		System.out.println("________________________________________________________________");
		System.out.println("THE GAME WILL START IN:");
		for(int seconds = 5; seconds > 0; seconds--) {
			System.out.println("Starting in " + seconds );
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
