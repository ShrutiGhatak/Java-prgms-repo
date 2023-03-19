package Pattern;

public class P7 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==1)
					System.out.print(j);
				else if(i==2&&j==2)
					System.out.print(3);
				else if(i==3&&j==2)
					System.out.print(4);
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		
	}
}


