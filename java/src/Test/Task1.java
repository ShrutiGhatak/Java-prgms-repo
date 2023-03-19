package Test;
public class Task1 {
	    public static void main(String[] args) {
	        String[] arr={"lol","hello","koo"};
	        for(int i=0;i<arr.length;i++)
	        {
	            String s1=arr[i];
	            System.out.println(s1);
	            char c=s1.charAt(0);
	            System.out.println("First character of the given String is:"+c) ;
	            char d=s1.charAt(s1.length()-1);
	            System.out.println("Last character of the given String is:"+d);
	        }
	    }
	}
