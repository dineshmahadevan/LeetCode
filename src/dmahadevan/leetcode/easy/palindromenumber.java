package dmahadevan.leetcode.easy;

public class palindromenumber {
	
	public static boolean isPalindromeNumber(int number) {
		boolean result = false;
		
		String sNum = String.valueOf(number);
		String sReverse = "";
		int sNumLen = sNum.length();
		
		char[] cNum = sNum.toCharArray(); 
		
		
		for(int i = 0; i < sNumLen; i++) {
				sReverse = sReverse + cNum[sNumLen-i-1];
		}
		
		System.out.println(sNum + ", " + sReverse );
		
		if(sReverse.equals(sNum)) {
			result = true;
		}
		return result;
	}

}
