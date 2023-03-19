package Pattern;
	import java.io.*;
	import java.util.*;
	public class P9 {

	    boolean prime(int z)
	    {
	        int num = z;
	        boolean flag = false;
	        for (int i = 2; i <= num / 2; ++i) {
	         
	          if (num % i == 0) {
	            flag = true;
	            break;
	          }
	        }

	       // if (!flag)
	            
	         // System.out.println(num + " is a prime number.");
	        //else
	         // System.out.println(num + " is not a prime number.");
	        return flag;
	    }
	    
	    public static void main(String[] args){
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        String temp="";
	        Scanner s=new Scanner(System.in);
	        P9 p=new P9();
	        for(int i=0;i<5;i++)
	            { 
	                int x;
	                    try{
	                     x=s.nextInt();
	                    
	                }
	                catch(InputMismatchException ex)
	                {
	                    continue;
	                }
	                
	                
	            boolean b1=p.prime(x);
	            String z=Integer.toString(x);
	            if(x>=2)
	                {
	                    if (!b1)
	                    {
	                        temp=temp+z+" ";
	                        System.out.println(temp);
	                
	                    }
	                    //System.out.println(temp);
	                    //System.out.println();
	                }
	            else if(x==1)
	            {
	                System.out.println(temp);
	            }
	            
	            
	            
	            }
	       
	    }
	}
