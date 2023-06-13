import java.util.Arrays;
import java.util.Scanner;

public class array {
@SuppressWarnings("resource")
public static void main(String[] args) {
	System.out.println("----------One & Two Dimensional Array----------"+"\n");
	boolean ValidInput = false;
	do {
		System.out.println("What would you like to print : "+"\n"+
	"1. One Dimensional Array "+"\n"+"2. Two Dimensional Array"+"\n"+
				"Enter your Choice (1-2)");
		try{
			Scanner scan = new Scanner(System.in);
			 int x = scan.nextInt();
			if(x<=0 || x>=3) {
				System.out.println("Input Invalid, Try Again. "+"\n");
				ValidInput = false;
			}else { 
				ValidInput = true;
				if(x==1) {
					System.out.println("You Chose One Dimensional Array!");
					printOneDarray();
				}else if(x==2) {
					System.out.println("You Chose two Dimensional Array!");
					printTwoDarray();
				}
			}
		}catch(Exception e) {
			System.out.println("Exception Occured, Please try again!" +"\n");
		}
	}while(!ValidInput);
}





@SuppressWarnings("resource")
public static void printOneDarray() {
	boolean ValidInput =false;
	int x = 0;
	do {
		System.out.println("Enter the length of the Array");
		try{
			Scanner scan = new Scanner(System.in);
			 x = scan.nextInt();
			if(x<=0) {
				System.out.println("Input Invalid");
				ValidInput = false;
			}else { 
				ValidInput = true;
			}
		}catch(Exception e) {
			System.out.println("Exception Occured, Please try again!" +"\n");
		}
	}while(!ValidInput);
	
	ValidInput=false;
	int array[] = null ;
	do {
		try{
			Scanner scan = new Scanner(System.in);
			 array = new int[x];
		    int i=1, k=1;
		    for (i = 0; i < x; i++) {
		      System.out.println("enter the value number = " + k);
		      array[i] = scan.nextInt();
		      k++;
		    }
		    ValidInput = true;
		}catch(Exception e) {
			System.out.println("Exception Occured, Please try again!" +"\n");
		}
	}while(!ValidInput);
    System.out.println(Arrays.toString(array));
}





@SuppressWarnings("resource")
public static void printTwoDarray() {
	boolean ValidInput =false;
	int row =0;
	int column =0;
	do {
		System.out.println("Enter the length of the Array in Rows & Columns : ");
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of Rows : ");
			 row = scan.nextInt();
			System.out.println("Enter the number of Columns : ");
			 column = scan.nextInt();
			if(row<=0 || column<=0) {
				System.out.println("Input Invalid");
				ValidInput = false;
			}else { 
				ValidInput = true;
			}
		}catch(Exception e) {
			System.out.println("Exception Occured, Please try again!" +"\n");
		}
	}while(!ValidInput);
	
	ValidInput=false;
	int array[][] = null ;
	do {
		try{
			Scanner scan = new Scanner(System.in);
			 array = new int[row][column];
			 for (int i = 0; i < row; i++) {
			      for (int j = 0; j < column; j++) {
			        System.out.println("Enter the value of position : " + i + j);
			        array[i][j] = scan.nextInt();
			      }
			    }
		    ValidInput = true;
		}catch(Exception e) {
			System.out.println("Exception Occured, Please try again!" +"\n");
		}
	}while(!ValidInput);
    System.out.println(Arrays.deepToString(array));
}
}