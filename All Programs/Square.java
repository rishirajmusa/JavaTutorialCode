import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Square {
	static Scanner scan = new Scanner(System.in);
	Square(){
		int i,j,row;
		try{
			System.out.println("Enter Side : "+"\n");
			row = scan.nextInt();
		scan.close();
			System.out.print("Printing ");
			for(i=0;i<3;i++) {
				try {
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.print(".");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n\n");
			for(i=0;i<=row;i++) {
				for(j=0;j<=row;j++) {
					System.out.print("   ");
				}
				for(j=0;j<=row;j++) {
					System.out.print(" * ");
				}System.out.println();
			}
		}catch(InputMismatchException e){
			System.out.println("Input Mismatched"+"\n"+"Try Again With a Positive Integer Value");
			}
	}

}
