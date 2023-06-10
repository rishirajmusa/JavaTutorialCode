import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialwithLimit {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		try
		{
		System.out.println("-----------FACTORIAL CALCULATOR-----------");
		System.out.println("Enter the Number : ");
		int x=scan.nextInt();
		System.out.println("Enter the Limit : ");
		System.out.println("Hint: Limit should be less then Number");
		int y=scan.nextInt();
		scan.close();
		if(y>x)
		{
			System.out.println("limit should be smaller then number");
			throw  new Exception("Invalid Input ");
		}
		long z=1;
		for (int i=x;i>=y;i--)
		{
			z=z*i;
		}
		System.out.println("Factorial is : "+z);
		}catch(InputMismatchException e) {
		System.out.println("Input Mismatched. Please Enter a Valid Input");
		}
		}

}
