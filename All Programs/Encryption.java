package eandd;

import java.util.Scanner;

public class Encryption {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the code you want to encrypt");
		String s = scan.nextLine();
		char[] chars=s.toCharArray();
		System.out.println("Enter the key");
		boolean ValidInput = false;
		do {
			try {
				Scanner scan1=new Scanner(System.in);
				byte key =scan1.nextByte();
				ValidInput=true;
				for(char c:chars) {
					c +=key;//don't be confuse char and in can be added together 
							//it will add that integer value to the ASCII value of the same character
				System.out.print(c);}
			}catch(Exception e) {
				System.out.println("Enter an Integer Key");
			}
			
		}while(!ValidInput);
		
	}
}
//output:
//Enter the code you want to encrypt
//Hello my name is rishi
//Enter the key
//5
//Mjqqt%r~%sfrj%nx%wnxmn


//and if i ran it again with the above output and 
//change the key from +5 to -5 , let's see what happens
//Enter the code you want to encrypt
//Mjqqt%r~%sfrj%nx%wnxmn
//Enter the key
//-5
//Hello my name is rishi