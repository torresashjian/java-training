package stacks;

import java.util.*;

class Stacks {
	public static void main (String[] args){
		// Create new Stack
		Stack<String> myStack = new Stack<String>();
		myStack.push("A");
		myStack.push("B");
		
		String elem = myStack.pop();
		
		String peekElem = myStack.peek();
	}
}