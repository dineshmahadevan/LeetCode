package dmahadevan.leetcode.easy;

import java.util.HashMap;

public class romantointeger {
	
	public static int romantoint(String s) {
		int x=0, noofchars = 0;
		noofchars=s.length();
		
		HashMap<Character, Integer> rtoi = new HashMap<Character, Integer>();
		rtoi.put('I', 1);
		rtoi.put('V', 5);
		rtoi.put('X', 10);
		rtoi.put('L', 50);
		rtoi.put('C', 100);
		rtoi.put('D', 500);
		rtoi.put('M', 1000);
		
		for(int i = noofchars-1;i>=0;i--) {
			//System.out.println(i + ", " + s.charAt(i-1) + ", " + rtoi.get(s.charAt(i-1))+ ", " + s.charAt(i) + ", " + rtoi.get(s.charAt(i)));
			if(i!=0 && rtoi.get(s.charAt(i-1)) < rtoi.get(s.charAt(i))){
					x+= rtoi.get(s.charAt(i)) - rtoi.get(s.charAt(i-1));
					i--;
			}
			else {
				x+=rtoi.get(s.charAt(i));
			}
			//System.out.println(x);
		}		
		return x;
	}

}
