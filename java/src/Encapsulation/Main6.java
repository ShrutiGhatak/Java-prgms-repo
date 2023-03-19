package Encapsulation;
class Gmail{
	private String oldpwd="Test";
	public String getoldpwd() {
		return oldpwd;
	}
	public void setoldpwd(String oldpwd) {
		this.oldpwd=oldpwd;
				
	}
}
public class Main6 {
	public static void main(String[] args) {
		Gmail I1=new Gmail();
		System.out.println(I1.getoldpwd());
		I1.setoldpwd("Test1");
		System.out.println(I1.getoldpwd());
	}

}
