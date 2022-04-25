import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerializationDemo {
	public static void main(String[] args) {
		Student st =null;
			try {
			FileInputStream fin = new FileInputStream("D:\\WorkSpace\\FileHandling\\newFile\\studObj.data");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			st=(Student)objin.readObject();
			
			System.out.println("Id :" + st.stude_id);
			System.out.println("Name :"+ st.stud_name);
			
			fin.close();
			objin.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
