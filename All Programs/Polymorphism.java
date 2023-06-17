//This type of polymorphism is known as method overriding or run time polymorphism
//so there comes a question
//why method overriding happens at run time not at compile time
//the reason behind it is following
//objects are created at run time 
//so which object is pointing to which method is decided at run time after the object is created
//so that's why method overriding happens at runtime


class Bird{//Polymorphism in java means many form of a method  
	public  void sing() {//here as we can see there is one sing method saying tweet
		System.out.println("Tweet Tweet Tweet");
	}
}
class Rooster extends Bird{
	public  void sing() {//again same sing method saying kukduku
		System.out.println("Kukduku");
	}
}
class Peacock extends Bird{
	public  void sing() {//and same sing method saying pihu pihu
		System.out.println("Pihu Pihu Pihu");
	}//this can be achieved by method overriding 
}



public  class Polymorphism {

	public  static void main(String[] args) {
		Bird b ;
		b=new Rooster();
		b.sing();
		b=new Bird();
		b.sing();
		b=new Peacock();
		b.sing();
	}

}




//Another type of polymorphism is compile time polymorphism
//its another name is method overloading
//its called compile time polymorphism because at the time of compilation it's decided that which method will be called based on there type.
//
//This is an Example of Static binding or compile time polymorphism or method overloading
//during compilation it'll decide which add method it'll call 
//
class SimpleCalculator
{
    int add(int a, int b)
    {
         return a+b;
    }
    int  add(int a, int b, int c)
    {
         return a+b+c;
    }
}
public class Main
{
   public static void main(String args[])
   {
       SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
   }
}

