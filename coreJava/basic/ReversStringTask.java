/* 
	reverse a given string
	i/p "java string"
	o/p "gnirts avaj"
*/
import java.io.*;
import java.util.Scanner;
public class ReversStringTask{
	public static void main(String args[]){
		String str="java string", rstr=" ";
		char ch;
		System.out.println("Original String:"+str);
		for(int i=0; i<str.length();i++){
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println("Reverse String:"+rstr);	
	}
}
