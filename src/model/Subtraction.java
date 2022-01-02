package model;

public class Subtraction implements Strategy{

	@Override
	public int[][] doOperation(int[][] a, int[][] b) {
		int[][] result = new int[10][10];
		for(int row=0;row<a.length;row++) {
			for(int col=0; col < a[row].length;col++) {
				result[row][col] = a[row][col] - b[row][col];
			}
		}
		
		return result;
	}

}
