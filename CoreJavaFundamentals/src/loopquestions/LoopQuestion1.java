package loopquestions;

public class LoopQuestion1 {


	//1 2 3 4
	//5 6 7
	//8 9
	//10
	
	
	public static void main(String[] args) {
		
		int p=1;
		
		for(int i=0; i<4; i++) {
			
			for (int j=1; j<=4-i; j++) {
				
				System.out.print(p);
				System.out.print("\t");
				p++;	
			}
			System.out.println();
			
			
			
		}

	}

}
