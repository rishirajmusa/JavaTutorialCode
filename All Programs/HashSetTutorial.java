//HashSet has a built in function 
//it removes duplicate entries on its own
//it's the main difference between HashSet And ArrayList
//
//I can also used LinkedHashSet because it remembers the insertion order
//
//
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class MyHashSet {
public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<Integer>();//Making a collection of arraylist
    collection.addAll(Arrays.asList(1,4,6,9,3));//feeding values to collection
   System.out.println("ArrayList Original Output: ");
   //Now Iterating through the ArrayList
    Iterator<Integer> ita = collection.iterator();
    while (ita.hasNext()) {
        System.out.println(ita.next());
    }
    //Making a Linked HashSet
    //and adding collection of arraylist that we made above into linked HashSet
    Set<Integer> set1 = new LinkedHashSet<>();
   set1.addAll(collection);
   //
   //making a HashSet and feeding collection of arraylist to that HashSet
    Set<Integer> set = new HashSet<>();
    set.addAll(collection);
    // Create an iterator using the iterator() method
   System.out.println("HashSet Output: "+"\n"+"HashSet OutPut would be different because it does not care about the order :");
    Iterator<Integer> it = set.iterator();//Iterating through HashSet
    while (it.hasNext()) {
        System.out.println(it.next());
    }
   System.out.println("LinkedHashSet Output: "+"\n"+"LinkedHashSet cares about the order"+"\n"+ "That's the difference between HashSet & LinkedHashset : ");
    Iterator<Integer> it1 = set1.iterator();//Iterating through Linked HashSet
    while (it1.hasNext()) {
        System.out.println(it1.next());
    }
}

}






//Here's a second example on how to use HashSet
//
//
//
//
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
