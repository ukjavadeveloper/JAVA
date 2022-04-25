import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Student st =new Student();
		try {
			FileOutputStream fout = new FileOutputStream("D:\\WorkSpace\\FileHandling\\newFile\\studObj.data");
			ObjectOutputStream objout = new ObjectOutputStream(fout); 
			
			objout.writeObject(st);
			
			objout.flush();
			fout.flush();
			
			objout.close();
			fout.close();
			
			System.out.println("Serialization done successfully....");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
