import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//there are many methods by which a string can be reversed
//in this i am goint to show some methods to reverse a string
public  class ReverseString {

	public  static void main(String[] args) {
		String s= "This is a simple string";
		String reverse = "";
		for(int i = 0;i<s.length();i++) {
			char ch=s.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println(reverse);
		System.out.println(reverse("this is a new string"));
		System.out.println(reverse1());
	}
	//this is one way of doing it
	//let me show you another way of doing it using StringBuffer or StringBuilder
	public  static StringBuffer reverse(String s) {
		StringBuffer br = new StringBuffer();
		br.append(s);
		br.reverse();
		return br;
	}
	//let's take input from user and then reverse it
	public  static StringBuilder reverse1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string you want to reverse : ");
		StringBuilder sb = new StringBuilder();
		try {
			String input = br.readLine();
			sb.append(input);
			sb.reverse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return sb;
		
	}
	
}