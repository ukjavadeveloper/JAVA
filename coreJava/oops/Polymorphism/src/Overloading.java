
public class Overloading {

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(1, 2);
		addition.add(1, 2.0);
		System.out.println("Addition of 3 integer value:"+ addition.add(1, 2, 3));
	}
	public static void main(int val) {
		Calculator cal = new Calculator();
		System.out.println(cal.add("abc", "xyz"));
	}
	
}
class Addition{
	public int add(int a, int b) {
		System.out.println("2 int addtion");
		return a+b;
	}
	public double add(int a, double b) {
		System.out.println("1 integer + 1 double addition ");
		return a+b;
	}
	final int add(int a, int b , int c) {
		System.out.println("3 int addition");
		return a+b+c;
	}
}

class Calculator extends Addition {
	public final String add(String a, String b) {
		System.out.println("2 String addition");
		return a+b;
	}
}