import java.text.DecimalFormat;

public class ScientificCalculator extends StandardCalculator{

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
    }

    public void cos(double a){
        result = Math.cos(a);
    }

    public void square(double a){
        multiply(a,a);
    }

    public void tan(double a){
        result = Math.tan(a);
    }
    
    public void log(double a){
        result = Math.log(a);
    }
    
    public void sqrt(double a){
        result = Math.sqrt(a);
    }
    
    public void cbrt(double a){
        result = Math.cbrt(a);
    }
    @Override
    public void printResult(){
        DecimalFormat format = new DecimalFormat("0.####");
        System.out.println("Scientific Calculator Result:"+format.format(result));
    
    }
}

