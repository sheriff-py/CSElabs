/*------------------------------------------------------------ 
 * // AUTHOR: Kyle Harris
// FILENAME: Lab1.java
// SPECIFICATION: CSE 110 - Lab 1: test average program
// FOR: CSE 110- Lab #1
// TIME SPENT: start 8:49pm -  
//-------------------- 
 * ---------------------------------------*/

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //initialized scanner (ready to use)
		
		double test1, test2, test3;	//test variables
		final int NUM_TESTS = 3;	//total number of tests taken	
		
		System.out.print("Enter the score of the first test: ");	// prompt user input
		test1 = in.nextInt();	//enters int for 1st test
		System.out.print("Enter the score of the second test: ");	// prompts 2nd test
		test2  = in.nextInt();	//enters int for 2nd test
		System.out.print("Enter the score of the third test: ");	// prompts 3rd test
		test3 = in.nextInt();	// enters int for 3rd test
		
		double average = (double) ((test1 + test2 + test3) / NUM_TESTS);	//average of the 3 tests
		
		System.out.println("Your test average is: " + average);
		
	}
	

}
