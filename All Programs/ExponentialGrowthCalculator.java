import java.util.Scanner;

public class ExponentialGrowthCalculator {

	public static void main(String[] args) {
		System.out.println("----------Exponential Growth Calculator----------"
							+"\n"+"Formula for calculating growth is :"+"\n"+
							"a(1+r)^x "+"\n\n"+"In this formula "
							+"\n"+ "a is Initial Value"
							+"\n"+ "r is Growth Rate"
							+"\n"+ "x is Time in years"+"\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Initial Value : ");
		int a = scan.nextInt();
		System.out.println("Enter the Growth rate : ");
		double r = scan.nextDouble();
		System.out.println("Enter the Time in years : ");
		double x = scan.nextDouble();
		scan.close();
		System.out.println(growthCalculator(a,r,x));
	}
	
	public static int growthCalculator(int a ,double r,double x) {
		return (int) (a*Math.pow(1+r, x));
	}

}//output:

//----------Exponential Growth Calculator----------
//Formula for calculating growth is :
//a(1+r)^x 
//
//In this formula 
//a is Initial Value
//r is Growth Rate
//x is Time in years
//
//Enter the Initial Value : 
//4000
//Enter the Growth rate : 
//1.25
//Enter the Time in years : 
//2.5
//30375
