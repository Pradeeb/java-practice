package com.java.learn.dsa;

public class StackLinkList<T> {

	class Node {
		T data;
		Node next;
		
		Node(T value){
			data=value;
			next=null;
		}
	}

	Node top;

	StackLinkList() {
		top = null;
	}

	public void push(T value) {
		Node newnode =new Node(value);
		newnode.next=top;
		top=newnode;
	}
	
	public T pop() {
		if(top == null) {
			throw new IndexOutOfBoundsException("Stock is empty");	
		}
		
		T temp=top.data;
		top = top.next;
		return temp;
	}

}
