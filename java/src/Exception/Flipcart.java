package Exception;

public class Flipcart {
	static void submit()throws QualityException{
		int price=3000;
		if(price>=5000) {
			System.out.println("Good quality");
		}
		else
			throw new QualityException("Bad quality");
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(QualityException e) {
			System.out.println(e.getmsg());
		}
	}

}
class QualityException extends Exception{
	String msg;
	QualityException(String msg){
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}


