package Exception;

public class Linkedln {
	static void submit()throws JobException{
		String cv="5*";
		if(cv!="5*") {
			System.out.println("Get job");
		}
		else
			throw new JobException("No job");
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(JobException e) {
			System.out.println(e.getmsg());
		}
	}

}
class JobException extends Exception{
	String msg;
	JobException(String msg){
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}

}
