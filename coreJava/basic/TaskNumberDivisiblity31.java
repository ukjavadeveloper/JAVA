/* Display 10 numbers that divisible by 5 and 7 */
public class TaskNumberDivisiblity31 {
	
	public static void main(String[] args) {
	
		int n=350;
		for(int i = 1; i<=n ;i++) {
			if(i % 5==0 && i % 7==0) {
				System.out.println(i);
			}
		}		 
	}
}
