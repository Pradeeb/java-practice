package com.java.learn.dsa;

public class ArrayStack<T> {
	static final int MAX_SIZE=30;
	T arr[] =(T[]) new Object[MAX_SIZE];
	int top;
	
	ArrayStack() {
		top=-1;
	}
	
	void push(T value) {
		if(top ==MAX_SIZE-1) throw new IndexOutOfBoundsException("Stack over flow");
		arr[++top]=value;
	}
	
	T pop() {
		if(top==-1) throw new IndexOutOfBoundsException("Stack over flow");
		return arr[top--];
	}
	
	T peek() {
		return arr[top];
	}
 
}
