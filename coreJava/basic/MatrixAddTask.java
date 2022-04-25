/*
	WAP to perform matrix addition, (Create two 2-D array) 
	{3,4,2,1}  {1,5,3,7} = {4,5,9,8}
*/
public class MatrixAddTask{
	public static void main(String args[]){
		int A[][]={{3,4},{2,1}}; int B[][]={{1,5},{3,7}};
		int C[][]= new int[2][2];
		for(int r=0 ; r<A.length && r<B.length; r++){
			for(int c=0; c<A[r].length; c++){
				System.out.print(A[r][c] +"\t");
			}
				System.out.print("|");
				for(int c=0; c<B[r].length; c++){
					System.out.print(B[r][c] +"\t");
				}	
			System.out.println();
		}
		for(int r=0; r<C.length; r++){
			for(int c=0; c<C[r].length; c++){
				C[r][c] = A[r][c] + B[r][c];
			}
		}
		System.out.println("---Addition of matrix---");
		for(int row[] : C) {
			for (int column : row) {
                		System.out.print(column + "    ");
            		}
            		System.out.println();
        	}
		
	}
}