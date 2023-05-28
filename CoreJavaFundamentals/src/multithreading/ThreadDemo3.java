package multithreading;

public class ThreadDemo3 implements Runnable {
	
	//Thread creation by implementing Runnable interface
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}

}
