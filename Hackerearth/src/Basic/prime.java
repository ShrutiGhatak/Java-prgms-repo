package Basic;

public class prime {
	static boolean primeno(int x)
	{
		boolean flag=true;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=false;
				break;
			}
		}
		return(flag);	
	}
	public static void main(String[] args) {
		boolean flag1=primeno(5);
		if(flag1==true)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
