package Prgm;
class Facebook{
	int pwd=1234;
	static int count=0;
	static Facebook F1;
	private Facebook() {
		count++;
	}
	public static Facebook get() {
		if(count < 1) {
			F1=new Facebook();
		}
		return F1;
	}
	public void setpin(int pwd) {
		this.pwd=pwd;
	}
}
public class Facebookapp {
	public static void main(String[] args) {
		Facebook I2=Facebook.get();
		System.out.println(I2.pwd);
		Facebook I3=Facebook.get();
		System.out.println(I3.pwd);
		I3.setpin(4321);
		System.out.println(I3.pwd);
		Facebook I4=Facebook.get();
		I4.setpin(5678);
		System.out.println(I4.pwd);
	}
}
