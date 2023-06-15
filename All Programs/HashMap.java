import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
public class Main {

    public static void main (String[] args) {
        ArrayList<Integer> idList = new ArrayList<Integer>(Arrays.asList(123,456,789,1234,5678));//First ArrayList
												 //Second ArrayList
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Ajay", "Amit", "Kiran", "Rathina", "Srider"));
//here I am showing how to use Arraylist to feed the HashMap
        HashMap<Integer, String> hmap = new HashMap<>();
        int index = 0;
        for (Integer id: idList) {//For each loop to feed HashMap
            hmap.put(id, nameList.get(index));//Output Will Be in order
            index++;
        }
        
System.out.println();
    Map<Integer, String> map = new HashMap<>();//Made a new map
       map.put(123,  "Value");
       map.put(456,  "Value");
       map.put(789,  "Value");
       map.put(1234,  "Value");
       map.put(5678,  "Value");

    Map<Integer, String> map1 = new LinkedHashMap<>();//Made a Linked map
        map1.put(123,  "Value");
       map1.put(456,  "Value");
       map1.put(789,  "Value");
       map1.put(1234,  "Value");
       map1.put(5678,  "Value");

      System.out.println();
      System.out.println("Original HashMap by ArrayLists");
      System.out.print(hmap);
      System.out.println("\n");
   System.out.println("Hashmap Output : "+"\n"+"HashMap does not care about the order :");
    System.out.println(map);
      System.out.println();
       System.out.println();
      System.out.println("Original HashMap by ArrayLists");
      System.out.print(hmap);
     System.out.println("\n");
   System.out.println("LinkedHashMap Output: "+"\n"+"LinkedHashMap cares about the order"+"\n"+ "That's the difference between Hashmap & LinkedHashmap : ");
   System.out.println(map1);

        // Other methods
        // map.put(Integer Key, String Value)
        // map.get(Integer key)
        // map.remove(Integer key)
        // map.containsKey(Integer key)
        // map.isEmpty()
        // map.size()
        // map.keySet()
        // map.values()

    }
}//OUTPUT:
/*Original HashMap by ArrayLists
{1234=Rathina, 789=Kiran, 456=Amit, 123=Ajay, 5678=Srider}

Hashmap Output :
HashMap does not care about the order :
{1234=Value, 789=Value, 456=Value, 123=Value, 5678=Value}


Original HashMap by ArrayLists
{1234=Rathina, 789=Kiran, 456=Amit, 123=Ajay, 5678=Srider}

LinkedHashMap Output:
LinkedHashMap cares about the order
That's the difference between Hashmap & LinkedHashmap :
{123=Value, 456=Value, 789=Value, 1234=Value, 5678=Value}
*/


