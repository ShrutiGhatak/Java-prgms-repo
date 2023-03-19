package Exception;

public class Shaadidotcom {
	static void submit()throws ShaadiException{
		int age=15;
		if(age>=21) {
			System.out.println("Happy married life");
		}
		else
			throw new ShaadiException("Be patient & control");
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(ShaadiException e) {
			System.out.println(e.getmsg());
		}
	}

}
class ShaadiException extends Exception{
	String msg;
	ShaadiException(String msg){
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
