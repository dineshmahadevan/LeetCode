package dmahadevan.leetcode.easy;

public class PowerOfThree {
	
	public static boolean isPowerOfThree(int n) {
		boolean result = false;
		if(n>0 && n%3==0) {
			while(n%3 == 0) {
				n=n/3;
			}
		}
		result = n==1;
		return result;
	}

}
