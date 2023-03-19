package Exception;

public class Bank {
	static void submit()throws AccountException{
		int balance=1000;
		if(balance>=2000) {
			System.out.println("Account opened");
		}
		else
			throw new AccountException("Account closed");
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(AccountException e) {
			System.out.println(e.getmsg());
		}
	}

}
class AccountException extends Exception{
	String msg;
	AccountException(String msg){
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
