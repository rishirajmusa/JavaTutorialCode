package ArgumentsAndParametersPackage;

public class ArgumentsAndParameters {

	public static void main(String[] args) {
	saySomething("Hi! Nice to meet You.");//here we write the value of string s of the method saySomething and it's called Arguments
	add(5,9);//here i passed the arguments of method add. This is called Method Parameters.
	//this is the most important step in programming.
	//by using this we can specify a method once and use that accordingly 
	System.out.println(multiply(5,41));
	//i can also assign result of the method to another variable
	int result1=multiply(405,2);
	int result2=multiply(4,2);
	int result3=multiply(145,2);
	int result4=multiply(45,12);
	int result5=multiply(4,12);
	System.out.println(result1 +"\n"+ result2 +"\n"+ result3 +"\n"+ result4 +"\n"+  result5 +"\n");
	}
	public static void saySomething(String s) {
		System.out.println(s);//here in above line and in this line s is a parameter and it stays the same
	}
	public static void add(int x, int y) {
		System.out.println(x+y);
	}
	public static int multiply(int x, int y) {
		return x*y;//here i have specified the parameter in above line and method in this.
		// now i just have to call this method with needed arguments
		// i can use this as many time as needed 
	}
}
