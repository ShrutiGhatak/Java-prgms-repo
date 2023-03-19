package Encapsulation;
class Linkedln{
	private String oldpwd="Hii";
	public String getoldpwd() {
		return oldpwd;
	}
	public void setoldpwd(String oldpwd) {
		this.oldpwd=oldpwd;
				
	}
}
public class Main5 {
	public static void main(String[] args) {
		Linkedln I1=new Linkedln();
		System.out.println(I1.getoldpwd());
		I1.setoldpwd("bye");
		System.out.println(I1.getoldpwd());
	}

}
