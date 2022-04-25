import java.io.File;
import java.io.IOException;
public class FileFolderOperation {

	public static void main(String[] args) throws IOException {
		
		//==============Folder Level Operation====================
		
		//File file1 = new File("D:\\WorkSpace\\FileHandling\\newFile");
		//File file2 = new File("D:\\WorkSpace\\FileHandling\\file");
		
		//boolean result = file1.mkdir();
		//System.out.println("Folder Created :  " + result);
		
		//boolean result = file1.delete();
		//System.out.println("Folder Deleted :  " + result);
		
		//boolean result = file2.renameTo(file1);
		//System.out.println("Folder Deleted :  " + result);
		
		//========File Level Operation============================
		
		File file1 = new File("D:\\WorkSpace\\FileHandling\\newFile\\test.txt");
		File file2 = new File("D:\\WorkSpace\\FileHandling\\newFile\\test1.txt");
		
		//file1.createNewFile();
		//file1.renameTo(file2);
		//file2.delete();
		
		boolean readable = file1.canRead();
		System.out.println("File is readable : " + readable);
		
		boolean writeable = file1.canWrite();
		System.out.println("File is Writable : " + writeable);
		
		boolean hidden = file1.isHidden();
		System.out.println("Is File Hidden : " + hidden);
		
		boolean hidden1 = file2.isHidden();
		System.out.println("Is File Hidden : " + hidden1);
		
		if(file2.isDirectory()) {
			System.out.println("Its a folder path...");
		}else {
			System.out.println("Its a file Path...");
		}
		
		System.out.println("================================================");
		
		File file3 = new File("D:\\CoreJavaTaskProgramList\\Task_core_java");
		
		File allFile[] = file3.listFiles();
		
		for(File fl : allFile) {
			String name = fl.getName();
			//System.out.println(name);
			if(name.endsWith(".java")) {
				System.out.println(name);
			}else {
				fl.delete();
			}
		}
	}	

}
