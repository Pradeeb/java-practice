package com.java.learn.dsa;

public class Test {

	public static void main(String[] args) {
		
		ArrayStack<Integer> stack =new ArrayStack<Integer>();
		stack.push(1);
		stack.push(5);
		System.out.println(stack.peek());
		
		StackLinkList<Integer> sll=new StackLinkList<>();
		sll.push(5);	sll.push(15);
		System.out.println(sll.pop());

		
/*		LinkedList02<Integer> list=new LinkedList02<Integer>();
		
		list.addBeginning(5);
		list.addBeginning(6);
		list.addBeginning(4);
		
		list.insert(3,10);
		list.display();
		System.out.println("");
	//	list.deleteAtPossition(5);
		list.display();
		
		for(int a:list) {
			System.out.println(a);
		}

	}
*/
	}
}
