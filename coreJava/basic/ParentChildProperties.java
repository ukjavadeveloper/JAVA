public class ParentChildProperties{
    public static void main(String[] args) {
    	print();
    }
    public static void print() {
    	child c =new child();
    	System.out.println("value of a : "+c.a);
    	System.out.println("Addition : "+c.add(10,20));
    }
}
class child extends ParentChildProperties {
	int a =10;
	public int add(int b, int c) {
		return b+c;
	}
}
