import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	   public static void main(String[] args) {

	        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

	       List<String> longnames = names.stream()
	                .filter(str -> str.length() > 1 && str.length() <= 8)
	               .collect(Collectors.toList());  
	          
	       longnames.forEach(System.out::println); //element wise it will iterate and gives the output
	        
	          
	          List<Integer> na=Arrays.asList(8,6,5,4,2,3);
	          List<Integer> longnsd =na.stream().map(n -> n*n).collect(Collectors.toList()); 
	          System.out.println(longnsd);
	          
	          List<Integer> number = Arrays.asList(2,3,4,5); 
	          //.collect method return before stream performedd value
	          List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList()); 
	          //.forEach will return each elements one by one with the .map methods each value
	          number.stream().map(x->x*x).forEach(y->System.out.println(y)); 
	          System.out.println(square); 
           System.out.println(longnames);
}
}