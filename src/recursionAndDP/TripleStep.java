package recursionAndDP;

import java.util.Arrays;

public class TripleStep {
	
	public int countWays1(int n){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else{
			return countWays(n-1) + countWays(n-2) + countWays(n-3);
		}
	}
	
	public int countWays(int n){
		int[] memo = new int[n+1];
		Arrays.fill(memo, -1);
		return countWays(n, memo);
	}
	
	public int countWays(int n, int[] memo){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if(memo[n] > -1){
			return memo[n];
		}else{
			memo[n] = countWays(n-1, memo) + countWays(n-2, memo) + countWays(n-3, memo);
			return memo[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TripleStep ts = new TripleStep();
		System.out.println(ts.countWays1(25));
		System.out.println(ts.countWays(25));

	}

}
