package calculateAgeByUserInput;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCalculator {
static Scanner scan  = new Scanner(System.in);
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int ThisYear = LocalDate.now().getYear();
		try
		{
		System.out.println("Enter Year : ");	
		int year = scan.nextInt();
		if(year>ThisYear) {
			while(ThisYear< year) {//User won't be able to put year greater then current year
			System.out.println("Year is Invalid");
			System.out.println("Enter Year : ");	
			year = scan.nextInt();}
		}
		System.out.println("Enter Month : ");
		int month = scan.nextInt();
		System.out.println("Enter Day : ");
		int day = scan.nextInt();
		scan.close();
		LocalDate DateOfBirth = LocalDate.of( year,  month,  day);
		int Y=Period.between(today, DateOfBirth).getYears();
		int M=Period.between(today, DateOfBirth).getMonths();
		int D=Period.between(today, DateOfBirth).getDays();
		System.out.println("Years "+Y +",  Months"+M+",  Days"+D);
		}
		catch(InputMismatchException e ){
			System.out.println("Please Enter a valid Date");
		}catch(DateTimeException e) {
			System.out.println("Please Enter a valid Date");
		}
}
}
