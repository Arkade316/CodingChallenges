import java.io.IOException;
import java.util.Arrays;

/**
 * Author: Kade Lawson 
 * Date: September 18, 2018
 * 
 * Purpose: create a program that contain a method SecondGreatLow, that takes numbers in an array and return 
 * the second lowest and second greatest numbers, separated by a space. 
 */


public class codingChallenge4 
{
	
	
	/** This method will take numbers in an array and return the lowest and second highest numbers.*/
	public static void SecondGreatLow( float [] num) 
	{
		
		Arrays.sort(num);							//rearrange array in ascending order
		
		System.out.println("second lowest number is " + num[1]);		//print second lowest number 
		System.out.println("Second highest number is " + (num[num.length-2]));	//print second highest number
		
	}
	     public static void main (String [] args) throws IOException
	     {
	    	 
	    	 float [] myArray = {7,100,18,9,21,36,42,68,86,9}; 		//declare and initiate array with float values
	    	 SecondGreatLow(myArray);								//invoke SecondGreatLow method and send myArray to it
	    	 
	     
	     }
}
	       
	

