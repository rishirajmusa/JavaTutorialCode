class Cow{
	public  void SayMooooooo() {
		System.out.println("Mooooooooooooooooooooooo");
	}
}
public  class ArrayOfObjectsForFun {

	public  static void main(String[] args) {
		Cow cow0=new Cow();
		Cow cow1=new Cow();
		Cow cow2=new Cow();
		Cow cow3=new Cow();
		Cow cow4=new Cow();
		int i=0;
		Cow[] cowArray = {cow0,cow1,cow2,cow3,cow4};//if you are wondering what type of array is this
		//it's an object array to make this you should use class name
		//and use for each loop to iterate through the array 
		for(Cow c: cowArray ) {
			System.out.println("Number-"+i+" cow say :");
			c.SayMooooooo();
			i++;
		}
		
	}

}
