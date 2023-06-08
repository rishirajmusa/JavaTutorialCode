
public class Main {

	public static void main(String[] args) {
		
		Shoe s=new Shoe("Nike", 9.2);
		Running R = new Running(4.2, "Sketchers", 9.1);
		Walking w=new Walking(false, "Adidas", 8.9);
		System.out.println("Shoe Brand is "+s.Brand+"\n"+"Size is "+s.Size+"\n");
		System.out.println("Walking Shoe Brand is "+w.Brand+"\n"+"Size is "+w.Size+" And Tax is "+w.goreTax+"\n");
		System.out.println("Running Shoe Brand is "+R.Brand+"\n"+"Size is "+R.Size+" And Weight is "+R.weight+"\n");
	}

}
//Here I have explained Inheritance and Use of SuperKeyword and Use of constructor 
//It was a real Problem given to a college Student