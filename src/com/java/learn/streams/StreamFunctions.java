package com.java.learn.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFunctions {

	//distinct() limit() count() min() max() sorted()
	public static void main(String[] args) {
	
		//distinct() 
		List<String> vehicles=Arrays.asList("bus","car","bike","car","by cycle","car","flight","train");
		vehicles=vehicles.stream().distinct().collect(Collectors.toList()); //remove the duplicates
		System.out.println(vehicles);
		
		//toArray()
		Object names[]=vehicles.stream().toArray();
		System.out.println(names.length);
		
		//limit()
        long countOfVehicles=vehicles.stream().distinct().count(); //get the object count
		System.out.println(countOfVehicles);
		
		//count()		
		vehicles=vehicles.stream().limit(3).collect(Collectors.toList()); //limit return
		System.out.println(vehicles);
	
		//min()
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Optional<Integer>num1=num.stream().min((x,y) -> {return x.compareTo(y);});
		
		Optional<Integer> num2 = num.stream().min(Integer::compareTo);
		
		System.out.println(num1.get()+" "+num2.get());
		
		//max()
		Optional<Integer>num3=num.stream().max((x,y) -> {return x.compareTo(y);});
		System.out.println(num3.get());
		
		//sorted()
		System.out.println(num.stream().sorted().collect(Collectors.toList()));
		System.out.println(vehicles.stream().sorted().collect(Collectors.toList())); //String sorted ASC

		//sorted() ==> reverse
		System.out.println(num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(vehicles.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));//String sorted DSCE
	}

}
