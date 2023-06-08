import java.util.Arrays;
import java.util.Scanner;

public class Array {
  private static int num;
  final static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
	    System.out.println("Hello world!");
	    
	    //to make comments press ctrl+/
	     Array a = new Array();
	     System.out.println("Enter the length of one dimensional array");
	     a.setNum(sc.nextInt());
	     a.printOneDimensionelArray();
	     a.printTwoDimensionelArray();
	   
  }
  public void setNum(int newNum)
  {
     if (newNum < 1) {
      System.out.println("Enter a positive value greater then 1");
      return;}
    Array.num=newNum;
  }
   void printOneDimensionelArray() {
    int i = 1;
    final int array[] = new int[Array.num];
    int k = 1;
    for (i = 0; i < Array.num; i++) {
      System.out.println("enter the value number = " + k);
      array[i] = sc.nextInt();
      k++;
    }
    System.out.println(Arrays.toString(array));
  }
  
   void printTwoDimensionelArray() {
    System.out.println("Two dimensional array");
    System.out.println("Enter the number of rows:");
    final int row = sc.nextInt();
    System.out.println("Enter the number of column");
    final int column = sc.nextInt();
    if (row < 1 || column < 1) {
      System.out.println("Value should be 1 or greate then 1");
      System.out.println("Enter a value greater then 1");
      return;
    }
    final int array[][] = new int[row][column];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println("Enter the value of position : " + i + j);
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(array));
    try{
    }
    finally { Array.sc.close();
    }
  }
}