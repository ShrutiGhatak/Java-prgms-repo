package Overriding_with_upcasting;
import java.util.HashSet;
public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr= {1,2,5,8,2,5,2};
		String[] arr1= {"Geeta","Meeta","Seeta","Seeta"};
		HashSet<Integer>h1=new HashSet<>();
		HashSet<String>h2=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			h1.add(arr[i]);
		}
		System.out.println(h1);
		for(int i=0;i<arr1.length;i++)
		{
			h2.add(arr1[i]);
		}
		System.out.println(h2);
	}
	}
