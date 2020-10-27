import java.util.function.IntBinaryOperator;
//by this functional interface only we can use lambda expressions
@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
}

public class FunctionalInterfaces {

	   public static void main(String args[]) {
	        // lambda expression with predefined functional interface
	        IntBinaryOperator sum = (a, b) -> a + b;
	        System.out.println("Result for predefined interface: " + sum.applyAsInt(120, 6));
	        
	        //with own defined interface 
	        MyFunctionalInterface sum1 = (a, b) -> a + b;
	        System.out.println("Result for own inteface: "+sum1.addMethod(12, 100));
	    }
	
}

