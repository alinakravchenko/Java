package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		/*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> evenNumbers = numbers.stream()
				                           .filter(n -> n%2 == 0)
				                           .collect(Collectors.toList());
	for(Integer num:evenNumbers)
     System.out.println(num);*/
		
		/*List<String> words = Arrays.asList("text1", "text2", "text3", "text4", "text5");
		List<String> filterWords = words.stream()
				                        .filter(word -> word.startsWith("t"))
				                        .limit(3)
				                        .collect(Collectors.toList());
		for(String word: filterWords)
		     System.out.println(word);*/
		
		/*List<String> data = Arrays.asList("text1", "2", "3", "text4", "text5");
		List<Integer> numOnly = data.stream()
				                        .filter(str -> str.matches("\\d+"))
				                        .map(Integer::parseInt)
				                        .collect(Collectors.toList());
		     System.out.println(numOnly);*/
		
		/*List<String> names = new ArrayList<>();
		 names.add("Alfa");
	        names.add("Beta");
	        names.add("Omega");
	        
	        List<Integer> lengths = names.stream()
	                                      .map(String::length)
	                                      .collect(Collectors.toList());
	        
	        System.out.println(lengths);*/
		
		/*List<Integer> numbers = Arrays.asList(3,4,1,2,7,6,8,9,45,15);
		List<Integer> sorted = numbers.stream()
				                      .sorted()
				                      .collect(Collectors.toList());
		System.out.println(numbers);
		System.out.println(sorted);*/
		
		//List<String> strings = Arrays.asList("java", "python", "C--", "Hello Word!");
		/*List<String> filteredStrings = strings.stream()
                                                .filter(s -> s.length() > 4)
                                                .collect(Collectors.toList());
       System.out.println(filteredStrings);*/
		/*List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());
       System.out.println(uppercaseStrings);*/
		
	   List<String> data = Arrays.asList("text1", "2", "3", "text4", "orange");
	   List<String> founds = data.stream()
			                      .filter(word -> word.equals("text4"))
			                      .collect(Collectors.toList());
	   System.out.println(data);
       System.out.println(founds);
		
	}

}
