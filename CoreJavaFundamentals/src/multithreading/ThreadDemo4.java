package multithreading;

public class ThreadDemo4 {

	public static void main(String[] args) {

		//Thread creation by implementing Runnable interface
		ThreadDemo3 td = new ThreadDemo3();
		
		int n=8;
		
		for (int i=0; i<n; i++) {
		Thread obj = new Thread(new ThreadDemo3());
		obj.start();
		}
	}

}
