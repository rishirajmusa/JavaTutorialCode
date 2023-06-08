import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Triangle {
	static Scanner scan = new Scanner(System.in);
Triangle(){
	try{
		System.out.println("How Many Rows Do You Want : "+"\n");
		int row = scan.nextInt();
		scan.close();
		int i,j;
		System.out.print("Printing ");
		for(i=0;i<3;i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n");
		for(i=0;i<row;i++) {
			for(j=3*row;j>=i;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("* ");
			}System.out.println("\n");
		}
	}catch(InputMismatchException e){
		System.out.println("Input Mismatched"+"\n"+"Try Again With a Positive Integer Value");
		}
	}
}
