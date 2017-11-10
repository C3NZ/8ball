import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		boolean running = true;
		
		Eightball ball = new Eightball();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ask the magic 8ball anything, enter quit to exit");
		
		while(running) {
			if(scanner.nextLine().equals("quit")) {
				running = false;
				scanner.close();
			}else{
				System.out.println(ball.getQuote());
			}
		}	
	}
}
