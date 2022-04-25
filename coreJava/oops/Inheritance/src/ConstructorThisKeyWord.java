/* this keyword and constructor */
public class ConstructorThisKeyWord {
	public static void main(String[] args) {
		parent prt = new parent(20,46);
	}
}
class parent {
	int a=10;
	public parent() {
		System.out.println("substraction : "+ this.sub(30,10));
	}
	public parent(int a , int b) {
		this();
		//a=this.a;
		//this.a=a;
		int result = this.a+b;
		System.out.println("Addition : "+result);
	}
	public int sub(int a , int b) {
		return a-b;
	}
}
class child extends parent{
	
	
}