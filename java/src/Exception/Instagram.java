package Exception;

public class Instagram {
	static void submit()throws FollowerException{
		int f=1000;
		if(f>=2000) {
			System.out.println("Popular");
		}
		else
			throw new FollowerException("Not popular");
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(FollowerException e) {
			System.out.println(e.getmsg());
		}
	}

}
class FollowerException extends Exception{
	String msg;
	FollowerException(String msg){
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
