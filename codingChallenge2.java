import java.io.IOException;
import java.util.Scanner;
/**
 * September 2 2018
 * 
 * purpose:Create a program that receive a number and return the angle that is formed
 * by the minute hand and the 12 o'clock mark on the clock. 
 * @author Kade Lawson
 *
 */
public class  codingChallenge2 {
	/** This method has a parameter that will take in an integer and print a string*/
	public static void findAngle(int input) {
		int degree;
		
		
						
		degree = input*6;					//variable degree is initiate to the product of variable input and 6;
		System.out.println("Degree is " + degree);	// print to screen Degree is degree(the product of input and 6) 
		
		
	
		 
		
		
		
	}
public static void main(String [] args) throws IOException {
	Scanner sc = new Scanner (System.in);		// create an object of the scanner class
	System.out.println("enter number");			//ask user to enter a number
	
	int num = sc.nextInt();//initiate and declare variable num to store user input
	if(num>=0 && num<=60) {						//if (variable) num is between (including)0 and 60(including) this block will execute
	findAngle(num);								//call method findAngle and pass variable num through it parameter
	}
	else {
		System.out.println("error");
		
	}
	sc.close();									// close scanner object
	
	
}
}

