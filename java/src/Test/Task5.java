package Test;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int smallest=a[0];
		for(int j=1;j<n;j++)
		{
			if(a[j]<smallest)
				smallest=a[j];
		}
		System.out.println("The smallest element is:"+smallest);
	}
}
