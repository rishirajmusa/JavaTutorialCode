import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    try {
		System.out.println("Choose the type of pattern you want to print : ");
		System.out.println(" 1 . Square "+"\n"+" 2 . Triangle"+"\n"+" 3 . Star");
		int choice=scan.nextInt();
		if(choice>3 || choice <1) {
			System.out.println("<Please Enter 1, 2 or 3>"+"\n");
			System.out.println("Enter Your Input Again  : ");
		choice=scan.nextInt();
		scan.close();}
		switch(choice) {
			case 1:
				System.out.println("\n"+"You chose Square Shape Pattern "+"\n");
				new Square();
				break;
			case 2:
				System.out.println("\n"+"You chose Traingle Shape Pattern "+"\n");
				new Triangle();
				break;
			case 3:
				System.out.println("\n"+"You chose Star Shape Pattern "+"\n");
				new Star();
				break;
		}
	}catch(InputMismatchException e){
		System.out.println("Input Mismatched"+"\n"+"Please Enter 1, 2 or 3");	
	}
		System.out.println();
	}
    
    

}