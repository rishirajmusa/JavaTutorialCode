
public  class PrimitiveDataTypes {

	public  static void main(String[] args) {
		//I always had some confusion about Primitive data type 
		//so i am making a project just to explain those
		int iMin=Integer.MIN_VALUE;
		int iMax=Integer.MAX_VALUE;
		System.out.println("Minimum int value : "+iMin);
		//output would be Minimum int value : -2147483648
		System.out.println("Maximum int value : "+iMax);
		//output would be Maximum int value : 2147483647
		//It means int is everything that comes between these two numbers (non decimal)
		long lMin=Long.MIN_VALUE;
		long lMax=Long.MAX_VALUE;
		System.out.println("Minimum long value : "+lMin);
		System.out.println("Maximum long value : "+lMax);
		/* output would be Minimum long value : -9223372036854775808
						   Maximum long value : 9223372036854775807 */
		//Basically long is just bigger int
		float fMin=Float.MIN_VALUE;
		float fMax=Float.MAX_VALUE;
		System.out.println("Minimum float value : "+fMin);
		System.out.println("Maximum float value : "+fMax);
		/* output would be Minimum float value : 1.4E-45
						   Maximum float value : 3.4028235E38 */
		
		//some people still have confusion about float
		//let me make that clear
		//float is a very big number which has 7 digit precision.
		
		
		float f=55555555555555555555555555.555445f;
		System.out.println(f);//output would be 5.5555556E25 means 5.5555556x10^25
							  //So you can see the number is pretty big but decimals precision is just unto 6-7 digits
							  //So use float when you decimals precision is not that much needed.
		double d=5644564545454545.89896565623232545d;
		//here i took a pretty big number and there are alot of decimals places .
		//let's see how much it prints
		System.out.println(d);
		//So here the output would be 5.644564545454546E32
		//it means 5.644564545454546x10^32
		//it put a point after first digit and took precise 15 digits and then neglected everything after that
		
	}

}
