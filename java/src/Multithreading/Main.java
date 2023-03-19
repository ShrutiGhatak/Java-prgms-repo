package Multithreading;
class Sample implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			e.printStackTrace();
			}
	}
}
}
class Sample2 extends Thread{
	public void run()
	{
		for(int i=11;i<=20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			e.printStackTrace();
			}
	}
}
}
public class Main {
	public static void main(String[] args) {
		Sample S1=new Sample();
		Thread th1=new Thread(S1);
		th1.start();
		Sample2 S2=new Sample2();
		Thread th2=new Thread(S2);
		th2.start();
	}

}
