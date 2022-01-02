package model;

public class Multiplication implements Strategy {

	@Override
	public int[][] doOperation(int[][] a, int[][] b) {
		int[][] result = new int[10][10];
		int col1 = 0;
		int col2 = 0;
		int product=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0; col < b[row].length;col++) {
				
				product = product + a[row][col1] *b[row][col2];
			
			}
			//product[][] = product
			col1++;
			col2++;
			product = 0;
		}
		return result;
	}

	
}
