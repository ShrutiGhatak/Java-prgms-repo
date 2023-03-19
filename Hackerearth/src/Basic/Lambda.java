package Basic;
interface Sample1{
	void disp();
}
public class Lambda {
public static void main(String[] args) {
	/*Sample1 s1=new Sample1() {
			public void disp() {
		System.out.println("fofo");
	}
};*/
Sample1 s1=()->System.out.println("fofo");
s1.disp();
}
}
