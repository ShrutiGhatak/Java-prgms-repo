package Pattern;

public class P6 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==4&&j==2||i==4&&j==3||i==4&&j==4||i==5&&j==4||i==6&&j==4||i==7&&j==1||i==7&&j==2||i==7&&j==3||i==7&&j==4)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
