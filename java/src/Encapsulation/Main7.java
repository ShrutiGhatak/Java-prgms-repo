package Encapsulation;
class Ola{
	private String oldpwd="abcd";
	public String getoldpwd() {
		return oldpwd;
	}
	public void setoldpwd(String oldpwd) {
		this.oldpwd=oldpwd;
				
	}
}
public class Main7 {
	public static void main(String[] args) {
		Ola I1=new Ola();
		System.out.println(I1.getoldpwd());
		I1.setoldpwd("efgh");
		System.out.println(I1.getoldpwd());
	}

}
