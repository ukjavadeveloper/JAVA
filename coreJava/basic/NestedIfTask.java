/*
	Task 5-Oct-21
	Declare a percent variable of type int, and print the grades
	Percent is 40-49 – Pass Class
	Percent is 50-59 – Second Class
	Percent is 60-74 – First Class 
	Percent is 75-100 – Distinction 
	Percent is 1-39 – Fail
	If Percent is not between 1-100 then print invalid message.
*/
public class NestedIfTask{
	public static void main(String args[]){
		int percent=101;
		if(percent>=1 && percent<=100){
			if(percent>=40 && percent<=49){
				System.out.println("Pass Class");
			}else if(percent>=50 && percent<=59){
				System.out.println("Second Class");
			}else if(percent>=60 && percent<=74){
				System.out.println("First Class");
			}else if(percent>=75 && percent<=100){
				System.out.println("Distinction");
			}else if(percent>=1 && percent<=39){
				System.out.println("Fail!");
			}

		}
		else{
			System.out.println("This is Invalid Percentage value...");
		}	
	}
}