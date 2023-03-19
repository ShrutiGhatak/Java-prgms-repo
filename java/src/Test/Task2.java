package Test;
public class Task2 {
	public static void main(String[] args) {
        String[] arr={"hello","loool","madam","koo","mom"};
        for(int i=0;i<arr.length;i++)
        {
            String s1=arr[i];
            String s2="";
            for(int j=s1.length()-1;j>=0;j--)
            {
            	s2=s2+s1.charAt(j);
            }
            if(s1.equals(s2))
            	System.out.print(s1+"  ");
        }
    }
}
