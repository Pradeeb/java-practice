package com.java.learn.java8.OptionalClass;

import java.util.Optional;

/*
 * 1. of(value)                    => If value is null through null pointer exception
 * 2. ofNullable(value)            => It can accept null 
 * 3. isPresent()                  => If a value is present, returns true, otherwise false
 * 4. isEmpty()                    => If a value is not present, returns true, otherwise false ( java 11 )*
 * 5. get()                        => If a value is present, returns the value, otherwise throws NoSuchElementException.
 * 6. orElse("default")            => If a value is present, returns the value, otherwise returns other.
 * 7. orElseGet(()->"dumy"))       => If a value is present, returns the value, otherwise returns the result produced by the supplying function.
 * 
 * 8. orElseThrow(Supplier<? extends String> supplier)  
 * 9. orElseThrow(Supplier<? extends RuntimeException> exceptionSupplier)
 * 10. isPresent(x->syso())
 * 11. filter()
 * */

public class OptionalClassLearn {

	public static void main(String[] args) {
		
		String name="valan";
		
		// 1. of(value)    
		Optional<String> opt=Optional.of(name);
		System.out.println("1. "+opt.get());
		
		//2. ofNullable(value)
		System.out.println("2. "+Optional.ofNullable(name));
		
		//3. isPresent()  
		System.out.println("3. "+Optional.ofNullable(name).isPresent());
		
		//4. isEmpty()  
		System.out.println("4. "+Optional.ofNullable(name).isEmpty());
		
		//5. get()  
		System.out.println("5. "+Optional.ofNullable(name).get());
		
		//6. orElse()  
		System.out.println("6. "+Optional.ofNullable(name).orElse("dumy"));
		
		//7. orElseGet()  
	    System.out.println("7. "+Optional.ofNullable(name).orElseGet(()->"dumy"));
	    
		//8. orElseThrow(Supplier<? extends String> supplier)  
	    System.out.println("8. "+Optional.ofNullable(name).orElseGet(()->"dumy"));
	    
	    //9. orElseThrow(Supplier<? extends RuntimeException> exceptionSupplier)
	    String o = Optional.ofNullable(name).orElseThrow(()->new RuntimeException());
	    
	    //10. map()
	    System.out.println("10. "+Optional.ofNullable(name).map(String::toUpperCase).get());
	    
	    //11. filter()
	    System.out.println("11. "+Optional.ofNullable(name).filter(x->x.startsWith("v")).get());
	    
	}
}
