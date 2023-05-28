package arrays;

public class MinimumNumber {

	public static void main(String[] args) {
		
		
		int abc [][] = {{3,2,1},{4,0,6}};
		int min = abc[0][0];
		
		for (int i=0; i<2; i++) {
			
			for (int j=0; j<3; j++) {
			
				if (abc[i][j]<min) {
				
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
