
public class Overriding {

	public static void main(String[] args) {
		Shape s = new Circle(); // PolymorphicObj
		s.drow();
		Circle c = new Circle();
		c.drow();
	}

}
class Shape{
	protected void drow() {
		System.out.println("Drawing shapes");
	}
}
class Circle extends Shape{
	public void drow(){
		System.out.println("Drowing circle");
	}
}
