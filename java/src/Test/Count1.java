package Test;

public class Count1 {
	public static void main(String[] args) {
		int no=122522;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==2)
				count++;
			no=no/10;
		}
		System.out.println(count);

}
}
