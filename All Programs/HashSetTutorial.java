//HashSet has a built in function 
//it removes duplicate entries on its own
//it's the main difference between HashSet And ArrayList
//
//I can also used LinkedHashSet because it remembers the insertion order
//
import java.util.HashSet;
import java.util.Iterator;

public  class HashSetTutorial {

	public  static void main(String[] args) {
	HashSet<Integer> h=new HashSet<Integer>();
	h.add(5);
	h.add(51);
	h.add(44);
	h.add(22);
	h.add(511);
	h.add(68);
	h.add(78);
	Iterator<Integer> it= h.iterator();//An Iterator is an object that can be used to loop through collections
    System.out.println("");
    System.out.println("Printing Every Element One By One :");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	//Iterator can also be used to remove things
	//for example
	Iterator<Integer> I =h.iterator();
	while(I.hasNext()) {
		Integer i = I.next();
		if(i < 50){//In this way we can make sure that every element that is smaller then 50 will be removed
			I.remove();
		}
	}
	System.out.println("\n"+"After removing everything less then 50 :  ");
	System.out.println("The new HashSet is : ");
	System.out.println("HashSet h is :  "+h);//the output would be similar to  [51, 68, 78, 511]
	//because Hashset doesn't put values according to the index like list
    System.out.println("");
	System.out.println("Size of HashSet is :  "+h.size()+"\n");
  
	System.out.println("Does the HashSet Contains 511 ? : "+h.contains(511)+"\n");

	
	}

}
