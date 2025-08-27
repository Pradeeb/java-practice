package com.java.learn.dsa;

import java.util.Iterator;

public class LinkedList02<T> implements Iterable<T> {

	LinkedList02() {
		head = null;
	}

	Node head;

	class Node {
		T data;
		Node next;

		Node(T value) {
			data = value;
			next = null;
		}
	}

	public void addBeginning(T a) {
		Node newNode = new Node(a);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
            Node temp=head;
            while(temp != null) {
            	System.out.print(temp.data+" ");
            	temp=temp.next;
            }
	}

	public void insert(int possition, T value) {
		Node newNode = new Node(value);
		Node temp=head;
		 
		 
		 for(int i=0; i<possition-1; i++) {
			 temp=temp.next;
			 if(temp ==  null) {
				 throw new IndexOutOfBoundsException("Invalid posstion :"+ possition);
			 }
		 }
		 newNode.next=temp.next;
		 temp.next=newNode;
	}
	
	public void deleteAtPossition(int pos) {
		
		if(head == null ) throw new IndexOutOfBoundsException("Invalid posstion :"+ pos);
	
		if(pos == 0) {
			head =head.next;
		}
		
		Node temp = head;
		Node prev = null;
		for(int i=1 ; i<= pos ; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	
	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>(){
           Node temp=head;
			@Override
			public boolean hasNext() {

				return temp != null;
			}

			@Override
			public T next() {
				T val = temp.data;
				temp = temp.next;
				return val;
			}
			
		};
	}
	
	
}
