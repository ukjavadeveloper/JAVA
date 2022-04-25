/*Accept two numbers form user and display all numbers between them that are divisible by 3*/
import java.util.Scanner;
public class Task32 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter First number:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter First number:");
		int num2 = scan.nextInt();
		
		if(num1<num2) { 
			for(int i=(num1+1); i<=(num2-1);i++) {
				if(i%3 == 0) {
					System.out.println("Number divisible by 3: "+ i);
				}
			}
		}else if(num1>num2) {
			for(int i=(num1-1); i>=(num2+1);i--) {
				if(i%3 == 0) {
					System.out.println("Number divisible by 3: "+i);
				}
			}
		}else {
			System.out.println("There Is No Number Divisible by 3...");
		}
	}

}
