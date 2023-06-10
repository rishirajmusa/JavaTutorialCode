import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleFactorial {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		try
		{
		System.out.println("-----------FACTORIAL CALCULATOR-----------");
		System.out.println("Enter the Number : ");
		int x=scan.nextInt();
		long y=1;
		for (int i=x;i>=1;i--)
		{
			y=y*i;
		}
		System.out.println("Factorial is : "+y);
		}catch(InputMismatchException e) {
		System.out.println("Input Mismatched. Please Enter a Valid Input");
		}finally {
			scan.close();
		}
		}

}
