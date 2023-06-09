package prime;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Primey {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		System.out.println("Enter the first Number : ");
		int start = scan.nextInt();
		System.out.println("Enter the last number : ");
		int end = scan.nextInt();
		if(start > end) {
			System.out.println("First number shoild be smaller then last");
		}
		for(int x =start; x<=end; x++) {
			boolean isPrime = true;
		for(int i=2;i<=x/2;i++) {
			if(x%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime == true) {
		primeList.add(x);
		}
		}
		System.out.println("List of Prime numbers is : "+"\n"+primeList);

}
		catch(InputMismatchException e) {
		System.out.println("Enter Valid input");
		}finally {
			scan.close();
		}
		
}
}
