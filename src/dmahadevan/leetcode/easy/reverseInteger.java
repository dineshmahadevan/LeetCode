package dmahadevan.leetcode.easy;

public class reverseInteger {
	
	public static void reverseInteger(int x) {
		
		String num = "";
		
		if(x > 0 && x <=Math.pow(2, 31)) {
			
			while(x/10>0 || x%10>0){
				if(x%10 > 0) num+= String.valueOf(x%10);
				else num+= String.valueOf(0);
				x=x/10;
			}
			num+=String.valueOf(x);
		}
		else if (x< 0 && x > Math.pow(-2,  31)) {
			while(x/10<0 || x%10<0){
				if(x%10 < 0) num+= String.valueOf(x%10).substring(1,  2);
				else num+= String.valueOf(0);
				x=x/10;
			}
			num = "-".concat(num);
		}
		else System.out.println(0);
		System.out.println(Integer.parseInt(num));
	}
}
