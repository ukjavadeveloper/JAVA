/*
	Accept the file name from the user like (javaDocs.pdf)
	Print The file name on console only if file extension is .docx
	Else print the error msg stating “Invalid File please provide .docx file only
*/
import java.util.*;
public class StringTask{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 

		System.out.println("Enter a File Name:");
		String file = scan.nextLine();

		if(file.endsWith(".docx"))
		{
			System.out.println("You Entered File:"+ file);
		} else{
			System.err.println("Invalid File please provide .docx file only.....!");
		}
		
	}
}