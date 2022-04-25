/*find total average min and max value from array*/
public class FindMaxMinAvgTotalTask {
	public static void main(String[] args) {
		 
		int arr[] = {12,7,45,78,9} , total=0, max, min;
		max=min=arr[0];
		
		for(int i =0; i<=arr.length-1 ; i++) {
			
			total =total+ arr[i];
			
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Total is : "+total);
		System.out.println("Avg : "+ (total/arr.length));
		System.out.println("Max value : "+ max);
		System.out.println("Min value : "+ min);
	}
}
