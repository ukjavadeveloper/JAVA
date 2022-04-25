/*
	Task (20-Oct-21)
	Store 5 customer any number of product price in 2-D array {{456.4,750.56, 550}, {998.78, 88.78}}
	Print the product price and the total payable cost of every customer in table format
	Also print the highest cost.
*/
public class Array2DTask2{
	public static void main(String args[]){
		double product_price[][] = {{456.4,750.56, 550},{998.78, 88.78},{520,237.32,120,156,150},{920.78,543,294,564.11},{78,457,67.99,432}};
		double max=0;
		for(int r=0; r<product_price.length ; r++){
			double sum=0;
			for(int c=0; c<product_price[r].length ; c++){
				System.out.print(product_price[r][c] + "\t");
				sum=sum+ product_price[r][c] ;
			}
				if(max<sum){
					max= sum;
				}
				System.out.println("|" + sum);
		}
			System.out.print("Highest Cost:" + max);	
			
	}
} 