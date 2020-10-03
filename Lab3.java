
/*------------------------------------------------
 * AUTHOR: Kyle Harris
 * FILENAME: Lab3
 * SPECIFICATION: Weighted Total Grade Calculator 
 * FOR: CSE 110- Lab #3
 * TIME SPENT: 2.5 hours
 * -----------------------------------------------*/

 import java.util.Scanner;
 
 public class Lab3 {
	 public static void main(String[] args) {	 
	 
 		// This scanner is prepared for you to get inputs        
 		Scanner in = new Scanner(System.in);
 		
 		// Declare three variables for HW, midterm, and final exam grades
 		double HW = 0;
 		double midTerm = 0;
 		double finalExam = 0;
 		
 		// Declare a loop control variable i
 		int i = 0;
 			
		while (i < 3) {            
      
  			if (i == 0) {
  				// Ask the user for homework grade
  				System.out.print("Enter your HOMEWORK grade: ");                
  				HW = in.nextDouble();
  				
  				// Do input validation				
  				if (HW < 0 || HW > 100) {
  					// Show the error message                    
  					System.out.println("Please Enter a Number between 0 and 100");
  				} else {                    
  					// Update the loop variable                    
  					i++;
  				}
  			}
  			if (i == 1) {
  				System.out.print("Enter your MIDTERM EXAM grade: ");
  				midTerm = in.nextDouble();
  				
  				if (midTerm < 0 || midTerm > 100) {
  					System.out.println("Please Enter a Number Between 0 and 100");
  				} else {
  					i++;
  				}
  			}
  			if (i == 2) {
  				System.out.print("Enter your FINAL EXAM grade: ");
  				finalExam = in.nextDouble();
  				
  				if(finalExam < 0 || finalExam > 200) {
  					System.out.println("Please Enter a Number Between 0 and 200");
  				} else {
  					i++;
  				}
  			}
  		}
 		
  		// Calculate the weighted total by the formula showed in the PDF
  		double weighted_total = (finalExam / 200 * 50) + (midTerm * 0.25) + (HW * 0.25); 				
  		System.out.printf("Studen'ts Weight Total is %.02f%n", weighted_total);
  		
  		// Show the weighted total and tell the user s/he passed or not
  		if (weighted_total >= 50) {            
  			// Print "the student PASSED the class."
  			System.out.println("Student PASSED the class");
  		} else {            
  			// Print "the student FAILED the class."
  			System.out.println("Student FAILED the class");
  		}
  	}  // End of main
  }  // End of class