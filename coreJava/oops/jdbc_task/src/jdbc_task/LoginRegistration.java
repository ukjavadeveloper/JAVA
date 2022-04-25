/* Login Registration  */
package jdbc_task;
import java.util.Scanner;
public class LoginRegistration {
	public static void main(String[] args) {
		int choice , option=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Registration");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.println("Select Option : ");
		 choice = scan.nextInt();
		 
		 switch(choice) {
		 	case 1 :
		 		option= 1 ;
		 		break;
		 	case 2 :
		 		option= 2 ;
		 		break;
		 	case 3 :
		 		option= 3 ;
		 		break;
			default :
				System.out.println("Invalid choice");
		 }
		 //System.out.println(option);
		 if(option==1)
		 {
			 register();
		 }else if(option==2) {
			 login(); 
		 }else if(option==3) {
			 System.exit(0);
		 }
		 scan.close();
	}
	public static void register() {
		
	}
	public static void login() {
		
	}
}
