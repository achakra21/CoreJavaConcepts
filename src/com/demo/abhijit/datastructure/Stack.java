package com.demo.abhijit.datastructure;

import java.util.Arrays;

/* stack uses LIFO data structure*/

public class Stack {

	private static final int capacity = 10;
	int arr[] = new int[capacity];
	int top = -1;

	public void push(int number) {
		if (top <= capacity - 1) {
			top++;
			arr[top] = number;
		} else {
			System.out.println("Stack Overflow");
		}

	}

	public void pop() {
		top--;
		if (top <= 0) {
			System.out.println("Stack Underflow");
		}
	}

	public void printntElemet() {
		
		for(int i =0; i<=top;i++){
			System.out.println("Array is   "+arr[i]);
		}

	}

	public static void main(String args[]) {

		Stack stack = new Stack();
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		System.out.println("Stack After push");
		stack.printntElemet();

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printntElemet();

	}

}
