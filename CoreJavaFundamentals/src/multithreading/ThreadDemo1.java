package multithreading;

public class ThreadDemo1 extends Thread {
	
	//Thread creation by extending thread class
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}catch(Exception e){
			System.out.println("Exception is caught");
		}
	}

}
