/*
Task (19-Oct-21)
	Store 5 students 5 subject marks in 2-D array
	Print the makes and the percentage of every student in table format
	Also print the index of student who is having highest percentage. 
*/
public class Array2DTask{
	public static void main(String args[]){
		int stud_sub_marks[][]={{67,72,56,78,84},{91,96,63,83,82},{67,78,56,71,52},{51,65,52,72,67},{89,78,81,76,85}};
		double max=0;
		for(int r=0; r<stud_sub_marks.length;r++){
			int total=0; double percentage=0; 
			for(int c=0; c<stud_sub_marks[r].length; c++){
				total=total+ stud_sub_marks[r][c] ;
				System.out.print(stud_sub_marks[r][c] +"\t");	
				percentage=(total/5);		
			}
			if(max<percentage){
				max=percentage ;
			} 
			System.out.println(" || " + percentage);
 		}
			System.out.print("Highest percentage is :" +  max);
	}
}