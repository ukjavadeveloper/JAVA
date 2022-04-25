
public class ExceptionThrowing {

	public static void main(String[] args) {
		try {
			int result = division(24 , -2);
			System.out.println("result:" + result);
		}catch(DivisionException e) {
			e.showMsg();
		}
	}
	
	public static int division(int a, int b)throws DivisionException {
		if(a<0 || b<0) {
			//throw new ArithmeticException("You cannot perform division for  negative numbers...");
			throw new DivisionException();
		}
		int ans= a/b;
		return ans;
	}
}
