import java.io.FileReader;
public class TestFileReader {

	public static void main(String[] args) {
		try {
			
				FileReader fr = new FileReader("D:\\WorkSpace\\FileHandling\\newFile\\test.txt");
				int data = 0;
				while((data = fr.read()) != -1) {
					System.out.print((char)data);//implicit type casting done here
			}
				fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
