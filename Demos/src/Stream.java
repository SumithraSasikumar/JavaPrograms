import java.util.ArrayList;
import java.util.List;
	
public class Stream {
	   public static void main(String[] args) {   
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		
		/*//without stream lines of code and no parallel execution
		int count = 0;
		for (String str : names) {
		   if (str.length() < 6 ) 
			count++; 
	}	*/
		
		long count = names.stream().filter(str->str.length()<6).count();   //using stream parallel execution so it is fast
	        System.out.println("There are "+count+" strings with length less than 6");
		   
	    }

	
	       
	   }  
	

