package Test;
import java.util.Scanner;
public class Task3 {
		//int[] arr1= {10,8,9,10,3,8,9,15,18};
        //String[] arr2={"hello","lol","lol","koo","hoo"};
		static void duplicates1(int x) 
		{
			int[] arr=new int[x];
			int c=0;
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter values in the array1:");
		for(int i=0;i<x;i++)
		{
			arr[i]=sc1.nextInt();
		}
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            	if(arr[i]==arr[j])
            	{
            		c++;
            		break;
            	}
            	
            }
        }
        System.out.println(c);
		}
		static void duplicates2(int y) 
		{
			String[] arr=new String[y];
			int d=0;
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter values in the array2:");
		for(int i=0;i<y;i++)
		{
			arr[i]=sc2.next();
		}
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            	if(arr[i].equals(arr[j]))
            	{
            		d++;
            		break;
            	}
            	
            }
        }
        System.out.println(d);
		}
        public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the size of array1:");
    		int n=sc.nextInt();
    		System.out.println("Enter the size of array2:");
    		int m=sc.nextInt();
    		duplicates1(n);
    		duplicates2(m);
    }

}
