package FileHandling;
import java.io.IOException;
import java.io.File;

public class Sample4 {
	public static void main(String[] args)throws IOException {
		File f1=new File("D:/FileTopics.pdf");
		if(f1.createNewFile())
			System.out.println("File is created");
		else 
			System.out.println("File is not created");
	}

}
