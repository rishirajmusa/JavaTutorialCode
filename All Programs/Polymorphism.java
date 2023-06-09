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
