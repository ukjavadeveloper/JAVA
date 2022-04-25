/* Accept 4 numbers and display smallest and greatest number*/
import java.util.Scanner;
public class Task7SmallerGreaterNo {
	public static void main(String[] args) {
		int smaller, greater;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of array elements : ");
		int n= scan.nextInt();
		int arr_Num[]= new int[n];
		
		for(int i = 0 ;i<n ; i++) {
			System.out.println("Enter number: "+(i+1)+": ");
			arr_Num[i]=scan.nextInt();
		}
		
		greater=smaller=arr_Num[0];
		
		for(int i = 0; i<n ; i++) {
			if(arr_Num[i]>greater) {
				greater=arr_Num[i];
			}else if(arr_Num[i]<smaller) {
				smaller=arr_Num[i];
			}
		}
		System.out.println("Smallest number:"+smaller);
		System.out.println("Greatest number:"+greater);
	}

}