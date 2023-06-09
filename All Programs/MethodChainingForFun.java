//
//public  class MethodChainingForFun {
//
//	public  static void main(String[] args) {
//		Student s= new Student();
//		s.setAge(23);
//		s.setName("Rishi");						//Output Would be
//		System.out.println("Name is : "+s.name);//Name is : Rishi
//		System.out.println("Age is  : "+s.Age);//Age is  : 23
//	}
//}
//class Student{
//	String name;
//	int Age;
//	public  void setName(String name){
//		this.name=name;
//	}
//	public  void setAge(int Age) {
//		this.Age=Age;
//	}
//	
//}
//So What I am going to do now is change S.setAge And S.setName into one line code 
//With the help of method chaining
//And for that we are going to use "return this"
//When you return "this" from a method the current object will be returned.


public  class MethodChainingForFun {

	public  static void main(String[] args) {
		Student s= new Student();
		s.setName("Rishi").setAge(23);
		System.out.println("Name is : "+s.name);//Output would be same as above one.
		System.out.println("Age is  : "+s.Age);//but using method chaining we made our code smaller and more readable
	}
}
class Student{
	String name;
	int Age;
	public  Student setName(String name){//and because of this keyword this method is return a new refrence to student object
		this.name=name;
		return this;// now i have put here 'return this'
	}
	public  void setAge(int Age) {
		this.Age=Age;
	}
	
}
