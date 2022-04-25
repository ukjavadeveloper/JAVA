/*take alphabet from user and show it is vowel or consonant*/
import java.util.Scanner;
public class VowelCheckingTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Alphabet : ");
		char ch = scan.next().charAt(0);
				
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
			System.out.println(ch+" : is Vowel");	
		}else {
			System.out.println(ch+" : is Consonant");
		}
		
		System.out.println("========================");
		
		switch(ch) {
			case 'a' :	case 'e' :	case 'i' :
			case 'o' :	case 'u' :	
				System.out.println(ch+" : is Vowel");
			break;
			default:
			System.out.println(ch+" : is Consonant");
			
		}
		scan.close();
	}
}
