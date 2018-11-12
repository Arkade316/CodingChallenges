import java.util.*;
import java.io.*;

/**
 * Kade Lawson
 * 
 * purpose: create a method that has a parameter , which will take a 4 digit number and 
 * at least two distinct digits. program should rearrange the digits in descending order and
 * in ascending order. Subtract the smaller number from the bigger number. Then repeat the 
 * previous step. perform this routine will always reach a fixed number:6174. 
 * Then perform the routine of 6174 will always give 6174.(7641-1467 =6174).
 * Program should return the number of times this routine perform until 6174 is reached.
 *
 * 
 */
public class codingChallenge3 {
	
	
		
		
	/** this method will take in a 4 digit int variable rearrange the digits in descending
	 * and ascending order,then subtract the ascending order from the descending order until 
	 * the final value is 6174. */
	public static void  kaprekarsConstant(int num) throws IOException {
		
		
		int numOfLoops = 0;		//int varaible numOfloops , initiate to 0
		while(num != 6174) {		//execute if answer isn't 6174
		String sNum = Integer.toString(num); //change num variable type from int to string and initiate that string to string variable sNum
		
		
		char a = sNum.charAt(0);//character a initiated to the fist character in sNum
		char b = sNum.charAt(1);//character b initiated to the second character in sNum
		char c = sNum.charAt(2);//character c initiated to the third character in sNum
		char d = sNum.charAt(3);//character d initiated to the fourth character in sNum


		Character [] myArray = new Character [4];
			myArray[0] =a;	//myArray index of 0 will hold value of variable a.
			myArray[1] =b;	//myArray index of 1 will hold value of variable b
			myArray[2] =c;	//myArray index of 2 will hold value of variable c
			myArray[3] =d;	//myArray index of 3 will hold value of variable d
		
		Character [] ascend = new Character[4];	//create Character type array ascend with array size of 4. 
		
		Character [] descend = new Character[4];//create Character type array descend with array size of 4.

		Arrays.sort(myArray);	//rearrange array values in ascending order
		
		for(int j=0;j<4;++j)  
		{
			
				ascend[j] = myArray[j]; 	//initiate value of myArray at index 0 to 3 to ascend at index 0 to 3
			
		}
		
		descend[0] = ascend[3];		//initiate value of ascend at index 3 to descend at index 0
		
		descend[1] = ascend[2];		//initiate value of ascend at index 2 to descend at index 1
		
		descend[2] = ascend[1];		//initiate value of ascend at index 1 to descend at index 2
		
		descend[3] = ascend[0];		//initiate value of ascend at index 0 to descend at index 3
		
		
		
		
	
		
		
		String s1 = ascend[0].toString(); //change ascend at index 0 from character to string and initiate it to variable s1.
		
		String s2 = ascend[1].toString(); //change ascend at index 1 from character to string and initiate it to variable s2.
		
		String s3 = ascend[2].toString(); //change ascend at index 2 from character to string and initiate it to variable s3.
		
		String s4 = ascend[3].toString(); //change ascend at index 3 from character to string and initiate it to variable s4.
		
		
		String ss1 = descend[0].toString(); //change descend at index 0 from character to string and initiate it to variable ss1.
		
		String ss2 = descend[1].toString(); //change descend at index 1 from character to string and initiate it to variable ss2.
		
		String ss3 = descend[2].toString(); //change descend at index 2 from character to string and initiate it to variable ss3.
		
		String ss4 = descend[3].toString(); //change descend at index 3 from character to string and initiate it to variable ss4.
		
		String dnum = ss1+ ss2 +ss3 +ss4; //add value of ss1,ss2,ss3,ss4 and initiate to dnum
		String anum = s1+s2+s3+s4;		//add value of s1,s2,s3,s4 and initiate to anum
		int ascendInt = Integer.parseInt(anum);	//change anum to type integer
		int descendInt = Integer.parseInt(dnum); // change dnum to type integer
		num = descendInt - ascendInt;	//subtract descendInt from ascendInt
	 
		
		numOfLoops++;	//increment numOfLoops
		
							
		}
		
		System.out.println("It took "+numOfLoops + " cycle to reach 6174."); 		//print out the amount of time the loop occur to get 6174
		}
		
		
	
	
	public static void main (String [] args) throws IOException {
	try 
	{	
	Scanner sc = new Scanner (System.in);	//create a scanner object
	
	int i =0;		// declare int value and initiate it to 0
	
	while( i ==0) {		//while loop
		
	System.out.println("Enter a valid 4 digit nummber with two disticnt numbers"); // ask user to enter 4 digit number
	
	int intput = sc.nextInt();		//store user input in int variable intput
	
	if(intput<=1000 || intput>=9999) {	//if statement execute if user enter number under 1000 and over 9999
	
	}
	
	else {		//execute if user enter a valid 4 digit number
		sc.close(); //close scanner object
		i =1; //initiate i to 1;
		kaprekarsConstant(intput);	//invoke method and send the value of intput into method
	}
	}
		
	
	}
	catch(InputMismatchException e) {
		System.out.println("you entered an invalid value, PROGRAM TERMINATED ");
	}
	}

}
