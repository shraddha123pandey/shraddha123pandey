package javaProject;

import java.util.Scanner;

/**
 * 
 * @author SHRADDHA PANDEY
 * Question->
 * 
 * One interesting application of computers is to 
 * display  graphs and bar charts. Write an application 
 * that  reads  five  numbers between  1  and  30.  For
 * each  number  that  is  read, your  program  should 
 *display  the  same  number  of  adjacent  asterisks. 
 * For  example,  if your  program  reads  the  number  
 *7,  it  should  display  *******.  Display  the  bars
 *of asterisks after your read all five numbers.
 *
 */
public class GraphPrinting {

	public static void main(String[] args) {
		/**
		 * Array to store the 5 values
		 */
		int array[]= new int[5];
		/**
		 * To take the the input from the user
		 */
		Scanner intInput= new Scanner(System.in);
		/**
		 * For loop to ask the user 5 values and store into array
		 */
		for(int i=0;i<array.length; i++) {
			System.out.println("Enter a number "
					+"between 1-30->");
			array[i]=intInput.nextInt();
			/**
			 * To check whether value is within our range
			 * or not if not ask user to enter anthor value that is 
			 * within our range.
			 * 
			 */
			
			while(array[i]>30||array[i]<1) {
				System.out.println("Value is not in between 1-30 please "
						+ "enter other value:");
				
					array[i]=intInput.nextInt();
				
			}
			
		}
		/**
		 * Close the Scanner class
		 */
		intInput.close();
		
		/**
		 * For loop for printing the star 
		 * according to values store in the array.
		 */
		System.out.print("The output is:"+"\n"+"\n");
		
		for(int i= 0; i<array.length; i++) {
			for(int j=0;j<array[i]; j++) {
				
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
		
}

// Name- Shraddha Pandey 20MEI10029
