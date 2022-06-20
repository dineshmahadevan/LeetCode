package dmahadevan.leetcode.easy;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		boolean ispalindrome = false;
		String lower_s = s.toLowerCase();
		int i=0, j=0, len=0;
		String stripped_s = "", reverse_s = "";
		for(i=0;i<lower_s.length();i++) {
			if(((int)lower_s.charAt(i) >=48 && (int)lower_s.charAt(i) <=57) || ((int)lower_s.charAt(i) >=97 && (int)lower_s.charAt(i) <=122)) {
				stripped_s += s.charAt(i);
			}
		}
		System.out.println(stripped_s);
		len = stripped_s.length();
		for(i=0;i<len;i++) {
			reverse_s += stripped_s.charAt(len-1-i);
		}
		System.out.println(reverse_s);
		if(stripped_s.equalsIgnoreCase(reverse_s)) ispalindrome = true;
		return ispalindrome;
	}

}
