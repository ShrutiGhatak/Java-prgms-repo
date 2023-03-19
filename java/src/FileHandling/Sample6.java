package FileHandling;
import java.io.FileReader;
import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

public class Sample6 {
	public static void main(String[] args)throws IOException {
		File f1=new File("D:/FileTopics/java.txt");
		FileReader fr=new FileReader(f1);
		char[] arr=new char[(int)f1.length()];
		fr.read(arr);
		String s1=new String(arr);
		System.out.println(s1);
		System.out.println("Data read");
	}
}
