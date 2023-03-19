package Test;
import java.util.Scanner;
public class Keross2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.nextLine();
	System.out.println("Enter the word:");
	String p=sc.nextLine();
	//int x=s.indexOf("p");
	System.out.println("The index value of the 1st character is:");	
	System.out.println(s.indexOf(p));
	}
}

