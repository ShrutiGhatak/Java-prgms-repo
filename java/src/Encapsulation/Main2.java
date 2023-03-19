package Encapsulation;
class Instagram{
	private String oldpwd="Dingi";
	public String getoldpwd() {
		return oldpwd;
	}
	public void setoldpwd(String oldpwd) {
		this.oldpwd=oldpwd;
				
	}
}
public class Main2 {
	public static void main(String[] args) {
		Instagram I1=new Instagram();
		System.out.println(I1.getoldpwd());
		I1.setoldpwd("pingi");
		System.out.println(I1.getoldpwd());
	}

}
