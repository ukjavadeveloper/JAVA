/* take two number from user and find prime numbers between this  numbers */
import java.util.Scanner;
public class PrimeNOTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num = scan.nextInt(), flag=0, n ;
		n = num/2;
		for(int i = 1; i<=num; i++) {
			if(n%i==0) {
				System.out.println("Prime Number");
			}else {
				flag ++;
				System.out.println("Not Prime Number");
			}
		}
		
		scan.close();
	}
}