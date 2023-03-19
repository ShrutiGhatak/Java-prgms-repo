package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Sample5 {
	public static void main(String[] args)throws IOException {
		File f1=new File("D:/FileTopics/java.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("Hello java");
		fw.flush(); 
		System.out.println("Data written");
	}
}
