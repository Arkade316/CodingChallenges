import java.util.*;
import java.io.*;

/**
 * Purpose : create method that accept two arguments an array and integer. Print 
 * all the elements in array greater than the integer. 
 * 
 * @author kadelawson
 *
 */
public class Challenge1 {
	
/* This method will compare values in array to integer then print the values greater than integer */
	public static void DisplayNumbers(int [] array, int n) {

		
		//iterate through array
		for(int iterator =0;iterator<array.length;++iterator) {
			if(n <array[iterator]) {
				System.out.println(array[iterator]);
			}
		}

	}
	
	public static void main(String [] args) {
		try {
			//declare and initiate an array with ten elements
		 int [] myArray = new int [10];
		
		myArray[0] = 67;
		myArray[1] = 6;
		myArray[2] = 5;
		myArray[3] = 45;
		myArray[4] = 65;
		myArray[5] = 45;
		myArray[6] = 34;
		myArray[7] = 39;
		myArray[8] = 1;		
		myArray[9] = 23;
		
		
		 //call displaynumbers method and pass array and an integer in its parameter
		 DisplayNumbers(myArray,21);
		
		
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			
		}
		
		
	}

}
