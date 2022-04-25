/*
	Accept the Full name from user and print if use input is (Xyz lmn pqr)
	First Name: Xyz 
	Last Name: Pqr
	Middle Name: lmn
*/
import java.util.*;
import java.lang.*;
public class StringTask1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name:");
		String user_name = scan.nextLine();

		String str_user_name[]= user_name.split(" ");
		
		System.out.println("First name:" +str_user_name[0]);
		System.out.println("Last name:" +str_user_name[2]);
		System.out.println("Middle name:" +str_user_name[1]);
	}
}
