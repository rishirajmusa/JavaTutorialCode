
public class TryCatchFinallyExample {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] array = null;
		int[] a = new int[2];
		a[0]=1;
		a[1]=22;
		try{
			System.out.println(array[0]);
		}catch(NullPointerException e) {
			System.out.println("Array is Null");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not available, Please enter a valid Index");
		}catch(Exception e) {
			System.out.println("Something Wrong Happend!");
		}
		
		
		finally {//finally is a method which always runs
			//i can put scanner.close in this to save the memory
			System.out.println("it's in finally it always runs");
			
		}
		
		
		
		try {
			System.out.println(a[2]);//here i am asking for value at intex 2 which is not available
			//so it'll give an exception	
		}catch(NullPointerException e) {
			System.out.println("Array is Null");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not available, Please enter a valid Index");
		}catch(Exception e) {
			System.out.println("Something Wrong Happend!");
		}
		
		
		
		finally {//finally is a method which always runs
			//i can put scanner.close in this to save the memory
			System.out.println("it's in finally it always runs");
			
		}
	}

}
