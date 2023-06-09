import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
//The array is a fixed sized data structure thus, the array always needs to mention the size of the elements. 
//On the other hand, ArrayList is not a fixed sized data structure, thus there is no need to mention the size of the ArrayList especially creating its object.
//Operations such as indexOf(), remove() are supported by ArrayList in Java but are no supported by array.  
public  class MyArrayList {
    public  static void main(String[] args)
    {
        // Construct an ArrayList
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(10,20,5000,600,40));
 
        // Add elements in array
        array.add(100);
        array.add(120);
        array.add(500);
        array.add(220);
        array.add(150);
        
        System.out.println("ArrayList array is "+ array+"\n"+"Size of the array is : "+array.size()+"\n");//result is [100, 120, 500, 220, 150]
        //  Insert the elements in specified index
        // array.add(index, element);
        array.add(4, 50);
        
        System.out.println("ArrayList array after adding 50 at index 4 is: \n "+array + "\n");// result is [100, 120, 500, 220, 50, 150]
  
        // Add all the elements together
        // array.addAll(collection)
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(90, 20, 40, 10, 15));/* an arraylist named "list" is created
        with elements 90,20,40,10,15 **/
        //print command for list
        System.out.println("ArrayList list is : "+list+"\n");// here result would be [90,20,40,10,15]
        
        array.addAll(list);/* here array.addAll means adding elements into existing arraylist named "array" 
        and (list) in parenthesis means add all the elements of list into array.**/
       
        System.out.println("After 'array.addAll(list)' command ArrayList array became \n  "+array+"\n");//after addAll command result would be [100, 120, 500, 220, 50, 150, 90, 20, 40, 10, 15]

        // Create copy of array
        ArrayList<Integer> array1;
        array1 = array;
        
        System.out.println("ArrayList array got copied into ArrayList array1,");
        System.out.println("ArrayList array1 is following : \n"+array1+"\n");
        
        
        // Clear all the element from the list
        array.clear();
        System.out.println("ArrayList array is cleared, \n"+" array and array1 became : "+"\n"+array+"\n"+array1+"\n");
  
        // Check whether the particular element is present
        // in the list or not array.contains(object)
        array1.add(100);
        array1.add(120);
        array1.add(500);
        array1.add(220);
        array1.add(150);
        array1.add(100);
        
        System.out.println("After adding many elements in array1 , \n"+"array1 is:"+array1+"\n");
  
        System.out.println("Contains 120? : "
            + array1.contains(120)); // returns true
        System.out.println("Contains 200? : "
            + array1.contains(200)); // returns false
        System.out.println("Contains 1000 : " 
            + array1.contains(1000)+"\n\n"); //returns false
  
        // To ensure the minimum capacity of array
        // ArrayList<E> arrayname = new ArrayList<E>(int
        // minCapacity)
        ArrayList<Integer> array2 = new ArrayList<Integer>(10);
        array2=array1;
        // Iterate through the ArrayList
        System.out.println("Elements of the array using a for loop: ");
        for (int i = 0; i < array2.size(); i++)
            // Printing and display the elements in ArrayList
            System.out.print(array2.get(i) + ","); 
        	
        System.out.println("\n");
      
        // Get the particular element from specified index
        // array.get(index)
        System.out.println("Element at index 2 is : "
                           + array2.get(2));
  
        // Get the position of particular element
        // array.indexOf(object)
        System.out.println("Element 500 is at index position : "
            + array2.indexOf(500));

      // Check whether list is empty or not
        System.out.println("Array2 is empty? "
                           + array2.isEmpty());
  
        // Get the last index of element in array
        // array.lastIndexOf(object)
        System.out.println("Last index of the element 100 is : "
            + array2.lastIndexOf(100));
  
        // Remove the particular element
        // array.remove(index)
        System.out.println("Remove the element which is at index 3 : "
            + array.remove(3));
  
          // Display the size of arraylist
        System.out.println("Size of the array2 is : "
                           + array2.size()+"\n\n");
        
        Iterator<Integer> it= array2.iterator();//An Iterator is an object that can be used to loop through collections
    	System.out.println("Printing Every Element of the Array:");
        while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    	System.out.println("\n\n");
    	
        Collections.sort(array2);
       
  
        System.out.println("Array2 elements after sorting : "
                           + array2);
  
        System.out.println();
    }
}