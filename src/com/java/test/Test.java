package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class Test{
	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6,8,4};
		int target=8;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0 ; i < num.length ;i++){
			int complement=target-num[i];
			
			if(map.containsKey(complement)) {
				System.out.println("Index{}:"+map.get(complement)+","+i);
				break;
			}else {
				map.put(num[i], i);
			}
		}
		
	}
}
