/*
	Task 7-Oct-21
	Write a program using While Loop to Print the table of 5
	Output : 5 * 1 = 5
	  	 5 * 2 = 10
	   	 5 * 3 = 15
                   .
                   .
	    	   .
	   	 5 * 10 = 50
*/
public class WhileLoopTask{
	public static void main(String[] args)
	{
		int num = 5;
		int count = 1;
		while(count<=10){
			System.out.println(num + "*" +count+ "=" + (num*count));
			count++;
		}
		
	}

}