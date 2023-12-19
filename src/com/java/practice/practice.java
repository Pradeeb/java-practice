package com.java.practice;

import java.io.IOException;


public class practice {

	public static void main(String[] args) throws IOException {
		System.out.println("test");
		
		practice ob = new practice();
		System.out.println(ob.getLastDigit("3", "10"));
	}
	
	protected int getLastDigit(String a, String b) {
	      //check minimun leve case
	      if(a.equals("1")) return 1;
	      
	      if(b.length()==1 && b.equals("0")) return 1;
	      
	      // Now check the modular to b
	       int pm=getModularINb(4,b);
	       int exp= pm==0 ?4 :pm;
	       
	       char ch=a.charAt(a.length()-1);
	       long ans=(long) Math.pow(ch-'0',exp);
	       
	       return (int)ans%10;
	    }
	    protected int getModularINb(int a, String b){
	        
	        int res=0;
	        for(int i=0;i<b.length() ;i++){
	            res=((res*10)+(b.charAt(i)-'0'))%a;
	        }
	        return res;
	    }

}
