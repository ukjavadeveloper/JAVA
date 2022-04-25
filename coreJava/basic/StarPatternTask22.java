/*
	111111111	
	22222222 	88
	3333333  	777
	444444  	6666
	55555 		55555
	6666  		444444
	777     	3333333
	88    		22222222
	9		111111111
*/

public class StarPatternTask22{
	public static void main(String args[]){
		for(int r=1; r<=9; r++){
			for(int c=9; c>=r; c--){
				System.out.print(r);
			}
				System.out.println();
		}
		for(int r=8; r>=1; r--){
			for(int c=9; c>=r; c--){
				System.out.print(r);
			}
				System.out.println();
		}
	}
}