package dmahadevan.leetcode.easy;

public class firstUniqChar {

	public static int firstUniqChar(String s) {
		int index = -1, count = 0, i= 0, j = 0;
		System.out.println(s.length());
		for(i = 0; i < s.length();i++) {
			count = 0;
			char c = s.charAt(i);
			for(j = 0 ; j < s.length();j++) {
				if(count < 2 && s.charAt(j) == c) count++;
				else if(count >=2) break;
			}
			if(count==1) {
				index = i;
				break;
			}
			else if(count==2) continue;
		}
	return index;
	}
}
