
class Student{
	int studentId;
	String name;
	Student(int studentId,String name ){
		this.studentId=studentId;
		this.name=name;
	}
	public String toString() {//added later 
		return studentId+" "+name;
	}
}
public class ToStringTutorial {

	public static void main(String[] args) {
		Student s=new Student(1,"Shiv");
		Student s2 =new Student(2,"Ram");
		System.out.println(s);//output would be Student@372f7a8d
		System.out.println(s2);//output would be Student@2f92e0f4
		//if we think why it's not printing 
		//it's because we are trying to print an object and it's printing the memory of that object 
		//to print an object we have to use toString 
		
	}

}
