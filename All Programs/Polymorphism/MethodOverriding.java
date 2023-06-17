//Main class
public class Main {
 public static void main(String[] args) {
      ParentClass pc ;

    			pc = new ParentClass();
    			pc.methodOne();//Think about the output of this
				       //output is AB
				       //Because it's creating only parent class object
   System.out.println();
    			pc = new ChildClass();//Think about output of this one
   			pc.methodOne();//output is ADBC
				       //Let me explain
				       //its referring to child class
				       //so first call will go to child class method 'methodOne'
				       //from there super is invoked it'll go to parent class method one and A will print
				       //from there methodTwo is invoked and you are thinking B should print
				       //but no 
				       //methodTwo is currently Overridden 
				       //so the overridden methodTwo will be called and that is child class methodTwo
				       //AND D will print
				       //from ther super is invoked again which will take us to super class methodTwo
				       //and B will print and after that the remaining line of methodOne of child class 
				       //will execute and C will print
				       //and The output becomes
				       //ADBC
				       //
 
 }
}


//Parent class or base class
public class ParentClass {
   public void methodOne(){
    System.out.print("A");
     methodTwo();
   }
   public void methodTwo(){
    System.out.print("B");
   }
}
//Child class or derived class

public class ChildClass extends ParentClass {
  @Override
 public void methodOne(){
    super.methodOne();
    System.out.print("C");
   }
  @Override
   public void methodTwo(){
    System.out.print("D");
     super.methodTwo();
       }
}
