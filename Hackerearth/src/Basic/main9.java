package Basic;

import java.util.Scanner;

public class main9 {
	static int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int x=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int y=sc.nextInt();
		System.out.println(add(x,y));
	}

}
