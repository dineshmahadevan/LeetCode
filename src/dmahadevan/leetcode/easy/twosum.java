package dmahadevan.leetcode.easy;

public class twosum {
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int arraylength = numbers.length;
		int[] result = {0,0};
		
		for(int i=0;i<arraylength;i++) {
			for(int j=i+1;j<arraylength;j++) {
				if(numbers[i]+numbers[j]==target) {
					result[0] = i;
					result[1] = j;
					System.out.println(i + ", " + j);
				}
			}
		}
	return result;
	}

}
