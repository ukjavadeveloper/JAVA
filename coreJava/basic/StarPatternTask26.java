
public class StarPatternTask26 {
	public static void main(String[] args) {
		
		for(int r=1 ; r<=10 ;r++) {
			for(int s=10; s>r; s--) {
				System.out.print(" ");
			}
			for(int c=1 ;c<=r ; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
