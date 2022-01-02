package model;

public class Context {
	private Strategy Strategy;
	public Context() {
		
	}
	public Context(Strategy Strategy) {
		this.Strategy = Strategy;
	}
	
	public void setStrategy(Strategy Strategy) {
		this.Strategy = Strategy;
	}
	
	
	//delete later
	public void CheckStrategy() {
		System.out.println("Current Strategy: " + Strategy.getClass().getSimpleName());
	}
	
	public int[][] executeStrategy(int[][]a,int[][]b){
		return Strategy.doOperation(a, b);
	}

}
