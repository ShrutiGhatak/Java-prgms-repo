package Pattern;

public class P8 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==1&&j==1)
					System.out.print("A");
				else if(i==1&&j==2)
					System.out.print("B");
				else if(i==1&&j==3)
					System.out.print("C");
				else if(i==2&&j==2)
					System.out.print("D");
				else if(i==3&&j==2)
					System.out.print("E");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		
	}

}
