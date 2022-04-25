
public class OverloadingTask {

	public static void main(String[] args) {
		CalculateSquare obj_squ = new CalculateSquare();
		obj_squ.square(1.2);
		obj_squ.square(1500);
		obj_squ.square(21);
	}

}
class CalculateSquare{
	public void square(int number) {
		int squr = number * number;
		System.out.println("Method with Integer Argument:" + squr);
	}
	public void square(double number) {
		double squr = number * number;
		System.out.println("Method with double Argument:" + squr);
	}
	public void square(long number) {
		long squr = number * number;
		System.out.println("Method with long Argument:" + squr);
	}
}