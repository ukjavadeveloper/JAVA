public class PracticeProg {
	public static void main(String ar[]) {
		Employee emp1;
		emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.id = 121; 
		emp1.salary = 234344;
		emp1.gender = 'M';
		emp2.print();
	}
}
class Employee {
	int id;
	double salary;
	char gender;
	public void print() {
		int id = 10000;
		System.out.println("this.id : " + this.id);
		System.out.println("Id : " + id);
		System.out.println("salary : " + salary);
		System.out.println("Gender : " + gender);
	}
}