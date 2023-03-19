package FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample7 {
	public static void main(String[] args)throws IOException {
		File f1=new File("D:/FileTopics/java.txt");
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("Hello Mava");
		bw.newLine();
		bw.write("Hello Kava");
		bw.flush();
		System.out.println("Data written");
	}
}
