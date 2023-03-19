package FileHandling;

import java.io.File;

public class Sample2 {
	public static void main(String[] args) {
		File f1=new File("D:/FileTopics");
		if(f1.exists())
			System.out.println("Folder is present");
		else 
			System.out.println("Folder is not present");
	}
}
