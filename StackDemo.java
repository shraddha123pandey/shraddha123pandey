package javaProject;

import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
		Scanner intInput= new Scanner(System.in);
		int size;
		System.out.print("Enter the size of the stack: ");
		size= intInput.nextInt();
		Stack mystack= new Stack(size);
		/**
		 * Push the values in the stack
		 */
		System.out.print("How many number you want to push from the stack: ");
		int pushNum=intInput.nextInt();
		for(int i=0; i<pushNum;i++) {
			System.out.println("Push the value in the stack->");
			int num=intInput.nextInt();
			mystack.push(num);
		}
		System.out.println("==============");
		System.out.print("How many number you want to pop from the stack: ");
		int popNum=intInput.nextInt(); 
		for(int i=0; i<popNum;i++) {
			System.out.println(mystack.pop());
		}
		/**
		 * Close the Scanner Object. 
		 * 
		 */
		
		intInput.close();
	}
	
}
/**
 * 
 * @author SHRADDHA PANDEY
 * Stack class that uses the 
 * length array member.
 *
 */
class Stack{
	
	
	private int stack[];
	private int top;
	// allocate and initialize stack
	Stack(int size) {
		stack= new int[size];
	}
	// Initialize top -of -stack
	Stack() {
		top= -1;
	}
	// Push the item onto the stack
	void push(int item) {
		if(top==stack.length-1) {
			System.out.print("Stack is full(StackOverFlow.)");
		}else {
			stack[++top]=item;
			System.out.println(item);
			
		}
	}
	
    int pop() {
		if(top<0) {
			System.out.print("Stack underflow.");
			return 0;
		}else {
			
			return stack[top--];
		}
	}
}
