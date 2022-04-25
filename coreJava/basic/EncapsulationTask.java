/*
	Create a encapsulated Student class with id name contact.
	Apply the following validation 
	Name: name must not be empty and must be 2-20 length
	Contact: Contact must not be empty and must be 10 length
	If validation fails then print the error message and terminate the program.
*/
import java.util.regex.*; 
public class EncapsulationTask{
	public static void main(String args[]){
		Student stud = new Student();
		stud.setId(1);
		stud.setName("senorita");
		stud.setContact("9128431231");
		stud.printStudDetail();
	}
}
class Student{
	private int id;
	private String Name;
	private String contact;

	public static boolean isValidMobileNo(String str){  
		//(0/91): number starts with (0/91)  
		//[7-9]: starting of the number may contain a digit between 0 to 9  
		//[0-9]: then contains digits 0 to 9  
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
		//the matcher() method creates a matcher that will match the given input against this pattern  
		Matcher match = ptrn.matcher(str);  
		//returns a boolean value  
		return (match.find() && match.group().equals(str));  
	}  

	 public static boolean isValidUsername(String name){
  	// Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);
  
        // Return if the username
        // matched the ReGex
        return m.matches();
	}

	public void setId(int i){
		if(i >= 1 && i <= 1000){
			this.id=i;
		} else{
			System.err.println("Invalid Id, It must be between 1-10000");
			System.exit(0);
		}
	}

	public void setName(String name){
		if(isValidUsername(name)){ 
			Name = name; 
		} else{
			System.err.println("Invalid Name,Name must not be empty and must be 2-20 length");
			System.exit(0);
		}
	}

	public void setContact(String contact){
		if (isValidMobileNo(contact))  {
			this.contact = contact;
		} else{
			System.err.println("Invalid Contact,Contact must not be empty and must be 10 length");
			System.exit(0);
		}
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public String getContact() {
		return contact;
	}
	public void printStudDetail(){
		System.out.println("Student Id:"+ id);
		System.out.println("Student Name : " + Name);
		System.out.println("Student Contact: " + contact);
	}

}//Student class