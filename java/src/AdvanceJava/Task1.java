package AdvanceJava;
class outp{
	void printt(Object o) {
		System.out.println(o);
	}
}
class Sysstem{
	 outp out1=new outp();
}
public class Task1 {
	public static void main(String[] args) {
		Sysstem s1=new Sysstem();
		s1.out1.printt(14);
		s1.out1.printt("Java");
		//Sysstem.out1.printt("Hello");
	}

}
