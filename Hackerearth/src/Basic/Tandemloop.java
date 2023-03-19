package Basic;
import java.util.Scanner;
public class Tandemloop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of rows:");
	int x=sc.nextInt();
	System.out.println("Enter the the no. of columns:");
//	int y=sc.nextInt();
//	for (int i = 1; i <= x; i++) {
//		for (int j = 1; j <= x; j++) {
//			if(i==j || i+j==x+1)
//				System.out.print("*");
//			else
//				System.out.print(" ");
//		}
//		System.out.println();
//	}
	int d=0,c=0;
	if(x%2==0)
	d=x/2;
	else if(x%2!=0)
		d=(x/2)+1;
	for (int i = 0; i < d; i++) {
		for (int j = 0; j < x; j++) {
			if(i==d-1) {
				for (int j2 = 0; j2 < d-2; j2++)
					System.out.print(" ");
			}
			if(i==j&&j!=x-i-1)
				System.out.print(x-i);
			c=j;
			for (int k = 0; k < x-2*(i+1); k++) {
				System.out.print(" ");
				j++;
			}
			j++;
			if(j==x-i-1)
				System.out.print(x-j);
			j=c;
		}
		System.out.println();
	}
	
	for (int i = 0; i < x-d; i++) {
		for (int j = 0; j < x; j++) {
			if(i==d-1) {
				for (int j2 = 0; j2 < d-2; j2++)
					System.out.print(" ");
			}
			if(i==j&&j!=x-i-1)
				System.out.print(x-i);
			c=j;
			for (int k = 0; k < x-2*(i+1); k++) {
				System.out.print(" ");
				j++;
			}
			j++;
			if(j==x-i-1)
				System.out.print(x-j);
			j=c;
		}
		System.out.println();
	}
}
}
