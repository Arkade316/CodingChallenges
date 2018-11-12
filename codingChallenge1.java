/*Kade Lawson

August 28, 2018
Purpose: create a program with the method StringChanges(str) , take the str parameter beig passed ,
the string will contain letters from the alphabet and return a new string bassed on the following rules.

1)
input:"MrtyNNgMM
Output:"rtyggg"

2)
input:"oMoMkkNrrN"
Output:"ooookkr"

**/
import java.util.Scanner;
public class codingChallenge1 {
	
	/** this method will take a string in its parameter and return a string  */
	public static  String StringChanges(String str){
		
		String usrWord = str;
			
		
		if (usrWord.contains("M"))
		{
			usrWord = usrWord.replace('M', 'o');
			
			if(usrWord.contains("Nr") && usrWord.contains("rN")) 
			{
				usrWord = usrWord.replace("Nr", "");
				usrWord = usrWord.replaceAll("rN", "r");
			}
			
				if (usrWord.contains("N")) 
				{
				usrWord = usrWord.replace("N", "");
				
				if(usrWord.contains("oM"))
				{
					usrWord = usrWord.replace("oM", "o");
					
				}
				if (usrWord.contains("o")) 
				{
					usrWord = usrWord.replaceFirst("o", "");
					
				}
			if(usrWord.contains("oo")) 
			{
					usrWord = usrWord.replace("oo", "gg");
			}
				
			}
		}

		
			
			str = usrWord;
		 
		 return str;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		String str = sc.next();
		sc.close();
		System.out.println(StringChanges(str));
		
		
	}
}
