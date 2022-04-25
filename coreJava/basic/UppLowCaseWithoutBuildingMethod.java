import java.util.Scanner;

/* Convert String to Upper case or Lower case without building methods */
public class UppLowCaseWithoutBuildingMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		
		String str = scan.next();
		char  str1[] = str.toCharArray();
		
		for(int i = 0 ; i<str1.length;i++) {
			if(str1[i]>='A' && str1[i]<='Z') {
				str1[i]=(char)((int)str1[i]+32);
			}
		}
		System.out.println("The String in Lowercase is : ");
		for(int i=0; i<str1.length;i++) {
			System.out.print(str1[i]);
		}
		
	/*	System.out.println("\n"+"=========Lower To Upper case==========");
		System.out.println("Enter String : ");
		String strU = scan.next();
		char  strL[] = strU.toCharArray();
		
		for(int i = 0 ; i<strL.length;i++) {
			if(strL[i]>='a' && strL[i]<='z') {
				strL[i]=(char)((int)strL[i]-32);
			}
		}
		System.out.println("The String in Lower case is : ");
		for(int i=0; i<strL.length;i++) {
			System.out.print(strL[i]);
		}*/
		scan.close();
	}
}
