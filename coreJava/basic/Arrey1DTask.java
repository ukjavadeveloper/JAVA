/*
	Task (15-Oct-2021)
	Create a 1-D array and store min 10 int values.
	Print the values from even Index.
	Print the Odd values only from the array.
	Print the Square of all the odd index values
*/
public class Arrey1DTask{
	public static void main(String orgs[]){
		int arr[]={21,7,42,88,51,67,3,7,2,17,19,61,34,23,26};
		for(int i=0; i<=arr.length-1;i++){
			if(i%2==0){
				System.out.println(arr[i]);//even index values							
			}
		}
		System.out.println("==========");
		for(int i=0; i<=arr.length-1;i++){
			if(arr[i]%2!=0){
				System.out.println(arr[i]);//odd values arrey						
			}
		}
		System.out.println("==========");
		for(int i=0; i<=arr.length-1;i++){
			if(i%2!=0){
				System.out.println(arr[i]+"*"+arr[i]+"="+arr[i]*arr[i]);//square of odd index values						
			}
		}
	}
}