
public class StarPatternTask25 {

	public static void main(String[] args) {
		int row=9;
		for(int r = 9; r>=0; r--) {
			for (int j=(row-r); j>=0; j--)         
			{       
			System.out.print(" ");   
			}  
				for(int c = 1; c<=r ; c++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
