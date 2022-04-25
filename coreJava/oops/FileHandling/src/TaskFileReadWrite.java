import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TaskFileReadWrite {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fin = new FileInputStream("D:\\WorkSpace\\FileHandling\\newFile\\test.txt");
			FileOutputStream fout = new FileOutputStream("D:\\WorkSpace\\FileHandling\\newFile\\test1.txt");
			
			int data = 0;
			while((data = fin.read())!= -1) {
				fout.write(data);
			}
			fout.flush();// to ensure that all the characters written inside file.
			fout.close();
			fin.close();
			System.out.println("copy paste is done....");
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
