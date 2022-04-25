
public class AbstractClassDemo {

	public static void main(String[] args) {
		car car = new Audi_ABEV();//PolymorphicObject
		car.brandName();
		car.fualType();
		car.noOfwheel();
	}
}
abstract class car{
	public car() {
		System.out.println("This is class car constructor.");
	}
	public abstract void brandName();
	public abstract void fualType();
	public void noOfwheel() {
		System.out.println("Audi car have 4 wheels and spare wheel");
	}
}
abstract class Audi extends car{
	public void brandName() {
		System.out.println("car Brand Name : Audi");
	}
	
}
class Audi_ABEV extends Audi{
	public void fualType() {
		System.out.println("Audi-AB is an electrical vehical");
	}
}