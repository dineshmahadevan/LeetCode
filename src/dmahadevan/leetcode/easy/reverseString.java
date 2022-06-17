package dmahadevan.leetcode.easy;

public class reverseString {
	
	public static void reverseString(char[] s) {			
	       char temp;
	       int len = s.length;
	        for(int i = 0; i< (len/2) ; i++) {
	            temp = s[i];
	            s[i] = s[len-1-i];
	            s[len-i-1] = temp;
	            System.out.println(s[i]);
	        }
	        System.out.println(Math.pow(-2,  31));
	        System.out.println(Math.pow(2,  31));
		}

}
