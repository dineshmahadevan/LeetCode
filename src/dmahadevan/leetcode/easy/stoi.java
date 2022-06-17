package dmahadevan.leetcode.easy;

public class stoi {
	
	public static int stringtonumber(String s) {
		int x=0;
		String num ="";
		
		char[] c = s.toCharArray();
		if(c[0] == ' ' || c[0] == '+' || c[0] == '-' || ((int)c[0] >=48 && (int)c[0] <= 57)){
			for(int i=0; i<c.length; i++) {
				if(c[i] == '-' || ((int)c[i] >=48 && (int)c[i] <= 57)) {
					num += c[i];
				}
			}
			x = Integer.parseInt(num);
		}		
		return x;
	}

}
