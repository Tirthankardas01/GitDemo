package multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		int n=8;
		
		//Thread creation by extending thread class
		for (int i=0; i<n; i++) {
			ThreadDemo1 td1 = new ThreadDemo1();
			td1.start();
		}

	}

}
