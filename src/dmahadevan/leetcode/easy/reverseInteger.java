package dmahadevan.leetcode.easy;

public class reverseInteger {
	
	public static void reverseInteger(int x) {
		long num = 0;
		
		if(x > 0 && x <=Math.pow(2, 31)) {
			
			while(x/10>0 || x%10>0){
				if(x%10 > 0) num = num*10 + x%10;
				else num = num*10;
				x=x/10;
				
			}
		}
		else if (x< 0 && x > Math.pow(-2,  31)) {
			while(x/10<0 || x%10<0){
				if(x%10 < 0) num = num*10 - x%10;
				else num = num*10;
				x=x/10;
			}
			num = -num;
		}
		else num = 0;
		System.out.println(num);
	}
}
