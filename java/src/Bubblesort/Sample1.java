package Bubblesort;

public class Sample1 {
public static void main(String[] args) {
	int[] arr= {10,70,80,40,100};
	for(int i=1;i<arr.length;i++ ) 
	{
		for(int j=1;j<arr.length;j++ ) {
			if(arr[j-1]>arr[j]) 
			{
				int t=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=t;
			}
		}
	}
	for(int i=0;i<arr.length;i++ ) 
	{
		System.out.print(arr[i]+" ");
	}
}
}
