package Exception;

public class Amazon {
	static void submit()throws PriceException{
		int price=3000;
		if(price>=5000) {
			System.out.println("Buy rapa rapa");
		}
		else
			throw new PriceException("Expensive");
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(PriceException e) {
			System.out.println(e.getmsg());
		}
	}

}
class PriceException extends Exception{
	String msg;
	PriceException(String msg){
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}

