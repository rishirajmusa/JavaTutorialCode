interface Fly {
	
}
public class MyObject {

	public static void main(String[] args) {
		MyObject o = new MyObject();
		System.out.println(o instanceof MyObject);//output is true
		//instanceof gives boolean values
		//The java instanceof operator is used to test 
		//whether the object is an instance of the 
		//specified class or subclass or interface.
		//lets try instanceof with subclass object 
		Eagle e = new Eagle();
		System.out.println(e instanceof Bird);//output is true
		//let's try an interface now
		Aeroplane a = new Aeroplane();
		System.out.println(a instanceof Fly);//output is true
		//lets use instanceof with a null object and see
		Aeroplane ar = null;
		System.out.println(ar instanceof Fly);//output is false
	}

}
class Bird{
	
}
class Eagle extends Bird{
	
}
class Aeroplane implements Fly{
	
}