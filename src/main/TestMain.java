package main;

import model.Context;
import model.Strategy;
import model.addition;

public class TestMain {
	
	public static void main(String[] args) {
		
		Strategy add = new addition();
		Context currentcon = new Context(add);
		int mat1[][] = new int[10][10];
		int mat2[][] = new int[10][10];
		mat1[0][0] = 1;
		mat1[0][1] = 2;
		mat1[1][0] = 3;
		mat1[1][1] = 4;
		mat2[0][0] = 1;
		mat2[0][1] = 2;
		mat2[1][0] = 3;
		mat2[1][1] = 4;
		int mat3[][] = currentcon.executeStrategy(mat1, mat2);
		System.out.println(mat3[1][1]);
		
	}

}
