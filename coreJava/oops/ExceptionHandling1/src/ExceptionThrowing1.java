
public class ExceptionThrowing1 {

	public static void main(String[] args) throws DivisionException{
		
		int result = division(21 , -2);
		System.out.println("result:" + result);
		
	}
	public static int division(int a , int b) throws DivisionException{
		
		if(a<0 || b<0) {
			throw new DivisionException();
		}
		int ans = (a/b);
		return ans;
	}

}
