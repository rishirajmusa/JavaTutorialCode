import java.util.Scanner;

public class ReactionTimeCalculate {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Reaction Time Calculator--------");
		System.out.println("Insert the value at GO!!! and press Enter");
		try {
		System.out.print("Press Enter to Continue...");
		System.in.read();
		}catch(Exception e) {}
		System.out.println("3");
		Thread.sleep(800);
		System.out.println("2");
		Thread.sleep(800);
		System.out.println("1");
		Thread.sleep(800);
		System.out.println("GO!!!");
		long startTime=System.currentTimeMillis();
		scan.next();
		long stopTime=System.currentTimeMillis();
		scan.close();
		long reactionTime= stopTime - startTime;
		System.out.println("You reaction time is : "+reactionTime);
	}

}

