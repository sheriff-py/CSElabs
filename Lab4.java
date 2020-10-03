/*-------------------------------------------------------------
// AUTHOR: Kyle Harris
// FILENAME: Lab4.java
// SPECIFICATION: Perform summation, factorial, and find leftmost digit operations based on user input
// FOR: CSE 110- Lab #4
// TIME SPENT: 3
//-----------------------------------------------------------*/

// Import Scanner class
import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {
        // Declare some variables you need
        int option; 
        int sum;
        int m;
    	// use loop for summation, not the formula 
    	// use loop for factorial also

        do {
            // Display the menu
            displayMenu();

            // Ask the user for one option
            Scanner in = new Scanner(System.in);           
            option = in.nextInt();

            switch (option) {
                // Define four cases for different options. Don't forget "break".
            case 1 :
            	sum = 0;
            	System.out.println("Enter a number: ");
            	m = in.nextInt();
            	for (int i = 1; i <= m; i++) {
            		sum += i;
            	}
            	System.out.println("The sum of 1 to " + m + " is " + sum);
            	
            break;
            
            case 2 :
            	sum = 1;
            	System.out.println("Enter a number: ");
            	m = in.nextInt();
            	for (int i = 1; i <= m; i++) {
            		sum *= i;
            	}
            	System.out.println("The factorial of 5 is " + sum);
            	
            break;
            
            case 3 :
            	sum = 1;
            	System.out.println("Enter a number: ");
            	m = in.nextInt();
            	int firstDig = m;
            	while(firstDig >= 10) {
            		firstDig /= 10;
            	}
            	System.out.println("The leftmost digit of " + m + " is " + firstDig);
            	
            break;
            
            case 4 :
            	System.out.println("Bye");
            	
            return;
            }
            
        }while (option > 0 && option < 5);

    }

    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }    
}