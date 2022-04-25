/*accept two number and display table of numbers between them*/
import java.util.Scanner;
public class TaskNumberTable30 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = scan.nextInt();
		
		if(num1<num2) {
			for(int i=(num1+1); i<=(num2-1); i++) {
				for(int j =1; j<=10;j++) {
					System.out.println(i + "*"+ j + "=" +(i*j));
				}
			}
		} else if( num1 > num2) {
			//System.out.println("enter in else part");
			for(int i=(num1-1); i>=(num2+1);i--) {
				for(int j =1; j<=10;j++) {
					System.out.println(i + "*"+ j + "=" +(i*j));
				}
			}
		}
	}
}
