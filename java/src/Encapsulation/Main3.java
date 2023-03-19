package Encapsulation;
class Fb{
	private String oldpwd="Dinga";
	public String getoldpwd() {
		return oldpwd;
	}
	public void setoldpwd(String oldpwd) {
		this.oldpwd=oldpwd;
				
	}
}
public class Main3 {
	public static void main(String[] args) {
		Fb I1=new Fb();
		System.out.println(I1.getoldpwd());
		I1.setoldpwd("pinga");
		System.out.println(I1.getoldpwd());
	}

}
