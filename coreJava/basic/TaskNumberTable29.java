/*display number table*/
import java.util.Scanner;
public class TaskNumberTable29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		/*for(int i = 1; i<=10 ; i++) {
			System.out.println(num+ "*" + i +"="+ (i*num));
		}*/
		int count =1;
		while(count<=10) {
			System.out.println(num+ "*" + count +"="+ (count*num));
			count++;
		}
	}
}
