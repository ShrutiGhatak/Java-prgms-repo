package Encapsulation;
class wp{
	private String oldpwd="Hello";
	public String getoldpwd() {
		return oldpwd;
	}
	public void setoldpwd(String oldpwd) {
		this.oldpwd=oldpwd;
				
	}
}
public class Main4 {
	public static void main(String[] args) {
		wp I1=new wp();
		System.out.println(I1.getoldpwd());
		I1.setoldpwd("challo");
		System.out.println(I1.getoldpwd());
	}

}
