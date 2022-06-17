package dmahadevan.leetcode.easy;

import java.util.HashMap;

public class longestcommonprefix {
	
	public static String findlongestcommonprefix(String[] strs) {
		
		int i=0, noofwords = 0;
		String prefix = null;
		
		noofwords = strs.length;
		
		if(strs.length==0) return"";
		else if (strs[0].length() ==0){
			for(i=0;i<noofwords;i++) {
				if(strs[i].length()==0) return "";
			}	
		}
		else if(strs[0].length() !=0){
			prefix = strs[0];
		}

		for(i=1; i< strs.length ;i++) {
			while(strs[i].indexOf(prefix) !=0){
				prefix = prefix.substring(0, prefix.length()-1);
				System.out.println("\n" + prefix);
				if (prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
}


