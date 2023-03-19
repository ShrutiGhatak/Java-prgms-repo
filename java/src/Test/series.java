package Test;
import java.util.Scanner;
import java.util.lang.Math;
public class series {
       public static void main(String[] args) {
		int i,n,a,m=1;
		double s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		n=sc.nextInt();
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			m=m*(-1);
			s=s+Math.pow(a,i)*m;
		}
		System.out.println(s);
	}
}
