/*
	Task 7-Oct-21
	Write a program using Switch case to Print the following output
	If day is 1,2,3,4,5 : "Its working Day"
	If day is 6,7 : "It's a Weekend"
	If not in 1-7 : "Invalid Day value"
*/
public class SwitchCaseTask{
	public static void main(String args[]){
		int day=0;
		switch(day){
			case 1 : case 2 : case 3 : case 4 :
			case 5 :
			System.out.println("Its working Day");
			break;
			case 6 : case 7 :
			System.out.println("Its a Weekend");
			break;
			default :
			System.out.println("Invalid Day value");
		}
	}
}