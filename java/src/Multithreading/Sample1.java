package Multithreading;

public class Sample1 {
public static void main(String[] args)throws InterruptedException {
	for(int i=1;i<=10;i++) {
		System.out.println(i);
		Thread.sleep(3000);
	}
	
}
}
