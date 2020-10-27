import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
	 public static void main(String[] args){  
		 Stream.iterate(1, count->count+1)  
	        .filter(number->number%3==0)  
	        .limit(6)  
	        .forEach(System.out::println);  
	     
		 List<String> alphabets = Arrays.asList("A","B","C");
			//list 2
			List<String> names = Arrays.asList("Sansa","Jon","Arya");
				
			//creating two streams from the two lists and concatenating them into one
			Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
				
			//displaying the elements of the concatenated stream
			opstream.forEach(str->System.out.print(str+" "));
		
}
}
