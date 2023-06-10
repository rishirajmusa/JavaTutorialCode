import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialwithRecursion {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		try
		{
		System.out.println("-----------FACTORIAL CALCULATOR-----------");
		System.out.println("Enter the Number : ");
		System.out.println(factor(scan.nextInt()));}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatched. Please Enter a Valid Input");
	}finally{
		scan.close();}
	}
	public static int factor(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*factor(n-1);
		
	}

}
