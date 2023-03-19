package Test;
import java. util. Scanner;
public class Keross1 {
	    public static void main(String[] args) {
	        int[] arr={1,2,3,4,5};
	        Scanner sc=new Scanner(System.in);
	       String s="";
	        while(true)
	        {
	            for(int i=0;i<arr.length;i++) 
	            {
	            	System. out. println("give enter:");
	    	        String s1=sc.nextLine() ;
	            	if(s.equals(s1))
	                System. out. println(arr[i]);
	            }
	        }
	    }
	}
