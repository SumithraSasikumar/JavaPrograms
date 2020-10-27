
//we can able to write many default and static methods with diff name
interface StaticInterface{
	default void newMethod(){
		System.out.println("this is defaultMethod");
	}
	static void staticMethod(){
		System.out.println("this is staticMethod");
	}
     void existingMethod(int n);
     
     default void newMethod1(){
 		System.out.println("this is defaultMethod1");
 	}	
	
}
public class DefaultStaticExample implements StaticInterface{

	@Override
	public void existingMethod(int n) {
		
		System.out.println("Result:::::"+n);
	}

	public static void main(String args[]){
		DefaultStaticExample ex=new DefaultStaticExample();
		ex.existingMethod(2);
		StaticInterface.staticMethod();
		ex.newMethod();
		ex.newMethod1();
	}
}
