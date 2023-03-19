package Test;

public class Count2 {
	public static void main(String[] args) {
		int no=1222522;
		int count=0;
		while(no!=0)
		{
			int rem=no%100;
			if(rem==22)
				count++;
			no=no/100;
		}
		System.out.println(count);

}

}
