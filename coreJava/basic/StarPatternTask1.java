/* star pattern program  */
public class StarPatternTask1 {
	public static void main(String[] args) {
		
		for(int r=1; r<=10; r++) {
			for(int s=10; s>r; s--) {
				System.out.print(" ");
			}
			for(int c= 1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		for(int r=1; r<=10; r++) {
			for(int s=1; s<r; s++) {
				System.out.print(" ");
			}
			for(int c=10; c>=r; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("======================");
		
		for(int r=1; r<=10; r++) {
			for(int c=1 ;c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int r=1; r<=10; r++) {
			for(int c=10; c>=r; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int r=1; r<=7; r++) {
			for(int s=10; s>r; s--) {
				System.out.print(" ");
			}
			for(int c=1; c<=(r*2)-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		
	}
}
