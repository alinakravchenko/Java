package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
		
	  /* List<String> data = Arrays.asList("text1", "2", "3", "text4", "orange");
	   List<String> founds = data.stream()
			                      .filter(word -> word.equals("text4"))
			                      .collect(Collectors.toList());
	   System.out.println(data);
       System.out.println(founds);*/
		
		/*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		int sum = numbers.stream()
                         .mapToInt(Integer::intValue).sum();		
		System.out.println(sum);*/
		
		/*List<String> words = Arrays.asList("text1", "2", "3", "text4", "orange");
		   List<String> filtered = words.stream()
				                      .filter(word -> word.length()>5)
				                      .collect(Collectors.toList());
		   System.out.println(words);
	       System.out.println(filtered);*/
		
		/*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		int multiplier = 3;

        List<Integer> result = numbers.stream()
                .map(n -> n * multiplier)
                .collect(Collectors.toList());

        System.out.println("Умноженные элементы: " + result);*/
		
		/*List<String> strings = Arrays.asList("java", "python", "C--", "Hello Word!");
		Comparator<String> lineLengthComparator = Comparator.comparingInt(String::length);

        List<String> sortedStrings = strings.stream()
                .sorted(lineLengthComparator)
                .collect(Collectors.toList());

        System.out.println("Sorted elements by line length: " + sortedStrings);*/
		
		/*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		 double average = numbers.stream()
	                .mapToInt(Integer::intValue).average()
	                .orElse(0); //args.the orElse method is used to provide a default value in case the stream is empty.

	        System.out.println("Average value: " + average);*/
		
		 List<String> strings = Arrays.asList("java", "python", "C--", "Hello Word!", "244");

	        List<String> sortedUppercaseStrings = strings.stream()
	                .map(String::toUpperCase)
	                .sorted(Comparator.comparingInt(String::length))
	                .collect(Collectors.toList());

	        System.out.println("Отсортированные и приведённые к верхнему регистру: " + sortedUppercaseStrings);
	        boolean contains = sortedUppercaseStrings.contains("244");
	        System.out.println("Строка 244: " + contains);
	}

}
