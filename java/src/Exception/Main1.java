package Exception;

public class Main1 {
	public static void main(String[] args) {
				int[] i= {1,2,3,4,5};
				try {
			System.out.println(i[10]);
				}//throw
		catch(IndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		        catch(ArithmeticException e)
		        {
		        	System.out.println("Ignore");
		        }
		        catch(Exception e)
		        {
		        	System.out.println("Handled");
		        }
		        finally {
		        	System.out.println("Closed");
		        }
	}
}
