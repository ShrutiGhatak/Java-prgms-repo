package Basic;

public class factorial {
	static int fact(int x)
	{
		int f=1;
		for(int i=x;i>=1;i--)
		{
			f=f*i;
		}
		return(f);
	}
	public static void main(String[] args) {
		int y=fact(5);
		System.out.println(y);
		
	}

}
