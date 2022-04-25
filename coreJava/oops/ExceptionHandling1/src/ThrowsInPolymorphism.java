import java.io.FileNotFoundException;
import java.io.IOException;
public class ThrowsInPolymorphism {

	public static void main(String[] args) {
		

	}
}
class A {
	public void m() throws IOException {
		
	}
	public void m(int a) throws IOException {// overloading
		
	}
}
class B extends A{
	public void m() {//overriding
		
	}
}