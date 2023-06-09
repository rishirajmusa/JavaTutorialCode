package findDuplicateCharacters;
import java.util.Scanner;

public  class Duplicate {
static Scanner scan = new Scanner(System.in);



	public  static void main(String[] args) {
		System.out.println("Enter Text to find duplicacy : ");	
		String character = scan.nextLine();
		scan.close();
		findDuplicate(character);
		}
	
	
	
	public  static void findDuplicate(String s) {
		String join="";
		String temp="";
		String dup ="";
		for(int i=0;i<s.length();i++) {
			temp = temp + s.charAt(i);//one character is stored in temp as a string
			if(join.contains(temp)) {//if the character stored in temp found in join
				if(!dup.contains(temp)) {//if the character stored in temp not found in dup
					dup =  dup +"|"+ temp ;}//only then it will be added to dup and i am using pipes to seprate the characters
				}
			temp ="";//character emptied
			join = join + s.charAt(i);
		}
		System.out.println(dup+"|");
	}

}
