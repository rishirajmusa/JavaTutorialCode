import java.util.Iterator;
import java.util.LinkedList;

public  class Linky {

	public  static void main(String[] args) {
		LinkedList<String> linky=new LinkedList<String>();
		linky.add("Abc");
		linky.add("Def");
		linky.add("Ghi");
		linky.add("Jkl");
//		linky.remove("Jkl");//we can just write the string
//		linky.remove(2);//or we can wite the index
//		linky.clear();//or we can just clear it with clear keyword
		//I can also use Iterator to llop through the linked list
		Iterator<String> it = linky.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
