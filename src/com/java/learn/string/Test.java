package com.java.learn.string;

import java.util.Arrays;


 
/*
 *
 *  String without parameter Method()
 *
 1. trim()
 2. toUpperCase();
 3. toLowerCaes();
 4. toCharArray();
 5. isEmpty();
 
 *  String with parameter Method
 *  
 *  string parameter
 *  
 6. contains(CharSequence value);
 7. concat(String value);
 8. equals(String value);
 9. equalsIgnoreCase(String value);
 10. split(String value);  split(String regex, int limit)
 11. indexOf(String value);
 12. endsWith(String suffix);
 * 
 *  Integer parameter
 *  
 13. charAt(int index);
 14. subString(int start); subString(int start, int end);
 
 15. replace(String old,String new); replaceAll(String regex, String replacement)
 16. getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex);
 *   
  */

public class Test {

	public static void main(String[] args) {
        
		//1. public char charAt(int index)    
		findTheCaracter();
	
		//2. public String concat(String anotherString)  
		stringConcat();
		
		//3. public boolean contains(CharSequence sequence)    1. Case Sensitivity
        stringContain();
        
        //4. public boolean endsWith(String suffix)		       1. Case Sensitivity
        stringEndsWith();
        
        //5. public boolean equals(Object anotherObject)  
        stringEquals();
        
        //6. public boolean equalsIgnoreCase(String str)  
        stringEqualsIgnoreCase();
        
        //7.public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)    
        stringGetChars();
        
        //8. int indexOf(int ch) , int indexOf(int ch, int fromIndex) , int indexOf(String substring) , int indexOf(String substring, int fromIndex)   1. Case Sensitivity  
             //***lastIndexOf() same function but look at last first
        stringIndexOf();
        
        //9. public boolean isEmpty()    
        stringIsEmpty();
        
        //10. public String replace(char oldChar, char newChar) , public String replace(CharSequence target, CharSequence replacement)  1. Case Sensitivity 2.Does not support regular expressions.  
             //***public String replaceAll(String regex, String replacement)  1.support regular expressions
        stringReplace();
        
        //11. public String split(String regex)  , public String split(String regex, int limit)  
        stringSplit();
        
        /*
         public String substring(int startIndex)
         public String substring(int startIndex, int endIndex)
         
         public char[] toCharArray()  
         
         public String toLowerCase()  
         public String toLowerCase(Locale locale)  
         
         public String toUpperCase()  
         public String toUpperCase(Locale locale)  
         
         public String trim()  

         */
	}


	// 1
	public static void findTheCaracter() {
		String name="valan pradeeb";
		char ch=name.charAt(6);
		System.out.println("1. "+ch); //return p
	}
	
	// 2
	private static void stringConcat() {
	  
		String firstName="valan";
		String seondName="Pradeeb";
		String fullNmae=firstName.concat(" ").concat(seondName);
		
		System.out.println("2. "+fullNmae);
		
	}
	
	// 3
	private static void stringContain() {
		String name="Valan Pradeeb";
		
		if(name.contains("n P")) {
			System.out.println("3. "+"Yes the name is contained");
		}else {
			System.out.println("3. "+"No the name is not contained");
		}
		
		
	}
	
	// 4
	private static void stringEndsWith() {

		String name="Valan Pradeeb";
		
		if(name.endsWith("n Pradeeb")) {
			System.out.println("4. "+"Yes the name is ends with");
		}else {
			System.out.println("4. "+"No the name is not ends with");
		}
	}
	
	// 5
	private static void stringEquals() {

        String name="Valan Pradeeb";
        String fullName=new String("Valan Pradeeb");
		
		if(name.equals(fullName)) {                          // we can pass the direct value  if(name.equals("Valan Pradeeb")) 
			System.out.println("5. "+"Yes the name is same");
		}else {
			System.out.println("5. "+"No the name is not same");
		}
	}
	
	// 6
	private static void stringEqualsIgnoreCase() {


        String name="Valan Pradeeb";
        String fullName=new String("valan pradeeb");
		
		if(name.equalsIgnoreCase(fullName)) {                          // we can pass the direct value  if(name.equals("Valan Pradeeb")) 
			System.out.println("6. "+"Yes the name is same");
		}else {
			System.out.println("6. "+"No the name is not same");
		}
	
		
	}
	
	// 7
	private static void stringGetChars() {
		
		 String name="Valan Pradeeb";
		 
		 char[] nameAsChars=new char[name.length()];
		 
		 name.getChars(0, name.length(), nameAsChars, 0);
		 
		System.out.println("7. "+ Arrays.toString(nameAsChars));
	}

    // 8 
	private static void stringIndexOf() {
		
		 String name="Valan Pradeeb";
		 
	   //System.out.println("8. "+ name.indexOf("a"))
		 System.out.println("8. "+ name.indexOf("a",2));
		
	}
	
	// 9
	private static void stringIsEmpty() {
		String name="";
		
		if(name.isEmpty()) {
			 System.out.println("9. "+"The String is empty");
		}
		
	}

	// 10
	private static void stringReplace() {
		String name="Valan Pradeeb";
		
		String replaced =name.replace("a","e");
	    
	    System.out.println("10. "+replaced);
		
	}
  
	//11
	private static void stringSplit() {
		String s1="Valan Pradeeb";
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		for(String w:words){  
			System.out.println("11. "+(w));  
		} 
	}



}
