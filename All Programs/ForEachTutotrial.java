import java.util.ArrayList;
import java.util.Arrays;

public class ForEachTutotrial {

	public static void main(String[] args) {
		//In Java, the for-each loop is used to
		//iterate through elements of arrays and collections (like ArrayList)
	ArrayList<Integer> myMarks = new ArrayList<Integer>(Arrays.asList(10,20,50,400,500,453));
	System.out.println(myMarks);
	//i have made an arraylist
	//lets use foreach loop in it
	//Syntax of ForEach Loop
	for(Integer I : myMarks) {//it iterate through myMarks arraylist and assigns value to I
		System.out.println(I);
	}
	}

}
