package com.java.learn.basic.oops.abstractLearn;

public class SecondMethod extends LearnAbstractt {

	   @Override
	    public void test() {
	        System.out.println("test() method implemented");
	    }

	    @Override
	    public void test1(int a) {
	        System.out.println("test1() method implemented with value: " + a);
	    }
	    
	    public static void main(String[] args) {
	    	
	    	SecondMethod test=new SecondMethod();
	    	
	    	test.test3();
	    	
	    	test.test();
	    	System.out.println(test.name);
	    	
	    	test.name="pradeeb";
	    	
	    	System.out.println(test.name);
	    	
	    }
	    

}
