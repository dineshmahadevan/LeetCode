package dmahadevan.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class twosumlarge {
	    public static int[] twoSum(int[] numbers, int target) {
	        
	        int arraylength = numbers.length, i = 0, j=0;
			int[] result = {0,0};
	        
			for(i=0;i<arraylength;i++) {
				for(j=arraylength-1;j>i;j--) {
					//if(i!=0 && numbers[i] != numbers[i-1] && numbers[j] != numbers[j-1]) {
						if(numbers[i]+numbers[j]==target) {
							result[0] = i+1;
							result[1] = j+1;
							//System.out.println(i + ", " + j);
							break;
						}
					//}
				}
			}
	        return result;
	}
}

