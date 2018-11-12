
/**
 * Purpose: create an class with a constructor with file as its argument 
 * read through file and print: highest number in file, lowest number in file, 
 * total amount of number in file and the average of the numbers in file.
 * @author Kade Lawson
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
Write a class with a constructor that accepts a file name as its argument. Assume the file contains a series of numbers, each written on a separate line. The class should read the con- tents of the file into an array, and then displays the following data:
• The lowest number in the array
• The highest number in the array
• The total of the numbers in the array
• The average of the numbers in the array
"1994_Weekly_Gas_Averages.txt"
*/

public class  COSC221CodingChallenge2 {
	
	static int numOfNumbersInFile = 0;
	static float numAverage = 0;
	static float lowestNumInFile;
	static float highestNumInFile;
	static File file;

	COSC221CodingChallenge2(File f){
		file = f;
		
		}
	
	static int findTotalNumOfNumbersInFile() throws IOException{
		int numberOfLines =0;
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext()) {
			 numberOfLines++;
		}
		System.out.println(numberOfLines);
		
		return numberOfLines;
	}
	
	public static void main(String [] args) throws Exception {
		try {
		File myFile = new File("1994_Weekly_Gas_Averages.txt");
		COSC221CodingChallenge2 constructorObject = new COSC221CodingChallenge2(myFile);
		numOfNumbersInFile = findTotalNumOfNumbersInFile();
		System.out.println(numOfNumbersInFile);
		}
		catch(Exception e) {
			System.out.println("error");
		}
		
	}
	
}

