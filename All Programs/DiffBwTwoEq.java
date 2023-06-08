
public class DiffBwTwoEq {

	public static void main(String[] args) {
		//here i am going to show the difference between "==" and ".equals"
		//let's create two strings
		String s ="dog";//here i have declared two strings both with same value
		String d ="dog";
		if(s==d)
			System.out.println("true");//result would be true
		else
			System.out.println("false");
		if(s.equals(d))
			System.out.println("true");//result would be true
		else
			System.out.println("false");
		//when comparing both strings with both both types of comparison
		//result came true
		//let's make Strings objects and then try comparison
		String s1="man";
		String s2=new String("man");
		//now s1 is a string and s2 is a string object
		//let's do the comparison
		if(s1==s2)
			System.out.println("true");//result would be false
		//the result is false because s1 is string and s2 is an object
		else
			System.out.println("false");
		if(s1.equals(s2))
			System.out.println("true");//result would be true
		//here result is true because .equals method takes the value of an object and compares them
		else
			System.out.println("false");
		//lets' do it one more time 
		//and this time make the both string objects
		String d1=new String("dog");
		String d2=new String("dog");
		if(d1==d2)
			System.out.println("true");//result would be false because d1 and d2 are two separate unique objects   
		else
			System.out.println("false");
		if(d1.equals(d2))
			System.out.println("true");//result would be true
		else
			System.out.println("false");
		//there is one more bonus tip
		
		
		
		String d3=new String("DOg");
		String d4=new String("dog");
		if(d3.toLowerCase().equals(d4.toLowerCase()))//this is how  i can use the the result of one method to feed value to another method
			System.out.println("true");//result would be true
		else
			System.out.println("false");
		
		//this gets used alot in the real programming 	
		
	}

}
