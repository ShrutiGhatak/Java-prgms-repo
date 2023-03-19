package FileHandling;

import java.io.File;

public class Sample3 {
	public static void main(String[] args) {
		File f1=new File("D:/FileTopics");
		if(f1.delete())
			System.out.println("Folder is deleted");
		else 
			System.out.println("Folder is not deleted");
	}
}
