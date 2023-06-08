import java.util.Stack;

public class StacksAreFin {

	
	public static void main(String[] args) {
	Stack<Integer> stk=new Stack<Integer>();//The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
	System.out.println(stk);
	stk.add(5);
	stk.add(7);
	stk.add(66);
	System.out.println("\n"+stk);//output would be [5, 7, 66]
	//lets try taking one element out
	stk.pop();
	System.out.println("\n"+stk);//the output would be [5,7]
	//as i can see i added 66 in the last but it got taken out first
	//this is the concept of stack
	//lets try some more things
	Stack<String> stk1=new Stack<String>();//if we don't specify what type of stack we are going to use, it default takes object type stack
	stk1.add("Bugati");
	stk1.add("Lambo");
	stk1.add("Safari");
	stk1.add("Jeep");
	System.out.println("\n"+stk1);
	System.out.println("\n"+"Pop Output :  "+stk1.pop());
	//pop will take the last element out
	//i can also use peek to look the last element
	System.out.println("\n"+"Peek output :  "+stk1.peek());
	//now when i peeked the result shown is Safari
	//this is because i have popped out jeep already
	//and now let's print stk1
	System.out.println("\n"+"After 'Pop' Stack is : "+stk1);
	System.out.println("\n"+"Index of Lambo is :  "+stk1.indexOf("Lambo"));
	System.out.println("\n"+"Size of Stack is :  "+stk1.size());
	System.out.println("\n"+"First Element is :  "+stk1.firstElement());
	//There are lot of things to do with a stack
	//Now let's discuss why stack are important
	// Stacks are particularly useful when the computation has to go back in reverse order. This happens often in artificial intelligence applications: games, logic programs, theorem provers, etc.
	//Think of walking through a maze. Whenever you have options to move in more than one direction, push all but one of the options onto the stack and then go in the direction you didn’t push. When you run into a dead end, walk backwards to your last option (i.e. pop the stack) and proceed from there.
	}
}
