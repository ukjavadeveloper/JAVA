import java.util.Scanner;

public class FactorialOfNoTask {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
}
