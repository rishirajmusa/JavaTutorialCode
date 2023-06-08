import java.util.LinkedList;
import java.util.Queue;

public class QueuesAreFun {

	public static void main(String[] args) {
		Queue<String> waitingLine = new LinkedList<String>();//Syntax of creating queues
		waitingLine.add("First Customer ");
		waitingLine.add("Second Customer ");//that's how we add elements in a queue
		System.out.println(waitingLine);//Result is [First Customer , Second Customer ]
		//let's try some more methods with queue
		waitingLine.poll();//i used poll method , it's quite similar to pop of stack
		//let's see the result
		System.out.println(waitingLine);//The result is [Second Customer ]
		//as i can see we added first customer in line 8 at index 0;
		//if it would have been a stack the last elements would have gotten out
		//but its a Queue
		//Queue follow FIFO data structure first in first out
		// IT MEANS THE FIRST ELEMENT I ADDED WILL BE THE FIRST ONE TO GOT OUT
		//SIMILAR TO A LINE AT BANK ATM
		//THE FIRST ONE AT LINE WILL ENTER ATM FIRST AND WILL GET OUT FIRST
		//HERE'S SOME PROPER DEFINITION FROM GOOGLE
		
		// The primary difference between Stack and Queue Data Structures is that 
		//Stack follows LIFO while Queue follows FIFO data structure type. 
		//LIFO refers to Last In First Out. It means that when we put data in a Stack, 
		//it processes the last entry first. Conversely, FIFO refers to First In First Out.
		
		//let's try some other methods with queue
		waitingLine.add("Third Customer ");
		System.out.println(waitingLine);
	System.out.println(waitingLine.toArray()[1]);//print the element at index 1
	System.out.println(waitingLine.peek());//peek is similar to peek of stack
	}

}
