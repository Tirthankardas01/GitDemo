package arrays;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [][] = {{3,2,1},{4,0,6}};
		int max = abc[0][0];
		
		for (int i=0; i<2; i++) {
			
			for (int j=0; j<3; j++) {
			
				if (abc[i][j]>max) {
				
					max=abc[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
