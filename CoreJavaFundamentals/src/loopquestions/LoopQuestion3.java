package loopquestions;

public class LoopQuestion3 {

	/*	1
	 * 	1	2
	 * 	1	2	3
	 * `1	2	3	4
	 *
	 */
	
	
	
	public static void main(String[] args) {
	
		
		for (int i=1; i<=4; i++) {
			
			int k=1;
			for (int j=1; j<=i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
			
		}
	}

}
