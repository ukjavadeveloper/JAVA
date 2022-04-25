import java.io.FileWriter;
import java.io.IOException;
public class TextFileWriter {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\WorkSpace\\FileHandling\\newFile\\test.txt");
			fw.write("Hello, This is my First message inside a file from java...");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
