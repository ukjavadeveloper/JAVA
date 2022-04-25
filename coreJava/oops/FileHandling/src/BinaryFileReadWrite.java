import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BinaryFileReadWrite{

	public static void main(String[] args) {
		
		try {
			FileInputStream freader = new FileInputStream("C:\\Users\\241924\\Desktop\\html basics\\CSS\\day11\\image\\download (3).jpg");
			FileOutputStream fwriter = new FileOutputStream("D:\\WorkSpace\\FileHandling\\newFile\\newImage.jpg.");
			
			int data =0;
			
			while((data = freader.read())!= -1) {
				fwriter.write(data);
			}
			fwriter.flush();// it ensure that all byte written inside file.
			fwriter.close();
			freader.close();
			
			System.out.println("File copy past done...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
