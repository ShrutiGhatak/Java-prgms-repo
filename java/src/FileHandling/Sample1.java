package FileHandling;
import java.io.File;
public class Sample1 {
	public static void main(String[] args) {
		File f1=new File("D:/FileTopics");
		if(f1.mkdirs())
			System.out.println("Folder is created");
		else 
			System.out.println("Folder is not created");
	}

}
