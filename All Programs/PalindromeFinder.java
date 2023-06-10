import java.util.Scanner;

public class PalindromeFinder {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		String reverse="";
		System.out.println("Enter your String : ");
		String original =scan.nextLine();
		scan.close();
		original.replace(" ", "");//Here i replaced space with nothing
		//so that we can check if the string i s really a palindrome
		//string are immutable and can't be changed so we have to assign the value to original
		original = original.replace(" ", "");
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		System.out.println("Reversed String is : "+reverse +"\n"+"Original String is : "+ original);
		if(original.equals(reverse))
			System.out.println("This string is a PALINDROME!");
		else
			System.out.println("Not a PALINDROME");
	}

}
