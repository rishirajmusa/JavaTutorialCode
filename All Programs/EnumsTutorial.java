enum Level{//We can make enums OutSide and inside of a Class
	//This enums was made outside of a class, so let's make one inside of a class
	Low,Medium,High;
}
public class EnumsTutorial {
	
	enum Taste{
		Sweet,Sour,Tangy,Bitter,Salty,Spicy;
	}
	static String[] levels = {"low","medium","high"};/* let's say we are not using enums 
	and we are strings to define levels , we'll have to specify specific index
	 for every level , for example System.out.println(levels[0]); something like that
	 but i don't want to make my code more messy, so that's why its a good practice to create enums   */ 
	
	//So enum is basically for those things which do not change
	
	public static void main(String[] args) {
		System.out.println(levels[0]);
		System.out.println(levels[1]);
		System.out.println(levels[2]);
		//output is: 
		//low
		//medium
	    //high

		//that's how we have to do if we are not using enums
		// so let's use enums
		
		//I have created an enum in line 1
		
		Level H=Level.High;
		switch(H) {//switch is a glorified if else statement
		case High:
			System.out.println("Level Is High");
			break;
		case Medium:
			System.out.println("Level Is Medium");
			break;
		case Low:
			System.out.println("Level Is Low");
			break;		
		}
		//Now i am going to make enum inside the class 
		//new enum is available in line 7 
		// let's make a code for enum taste
		Taste SpicyTaste = Taste.Spicy;
		if(SpicyTaste == EnumsTutorial.Taste.Spicy)//Here i should have done just Taste.Spicy but
			//I am doing EnumsTutorial.Taste.Spicy because the enum Taste is declared before main method and is static
			//so to access a static field One should use Static Method 
			//and to access a static method Syntax is 
			// ClassName.enumName.Variable
		System.out.println("Taste is Spicy");
		else if(SpicyTaste == EnumsTutorial.Taste.Bitter)
			System.out.println("Taste is Bitter");
		else if(SpicyTaste == EnumsTutorial.Taste.Salty)
			System.out.println("Taste is Salty");
		else if(SpicyTaste == EnumsTutorial.Taste.Sour)
			System.out.println("Taste is Sour");
		else if(SpicyTaste == EnumsTutorial.Taste.Sweet)
			System.out.println("Taste is Sweet");
	}

}
