package com.java.learn.dsa;

public class LinkedList02 {

	LinkedList02() {
		head = null;
	}

	Node head;

	class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	public void addBeginning(int a) {
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

	public void insert(int possition, int value) {
		Node newNode = new Node(value);
		Node temp=head;
		 
		 
		 for(int i=0; i<possition-1; i++) {
			 temp=temp.next;
		 }
		 newNode.next=temp.next;
		 temp.next=newNode;
	}
	
	
}
