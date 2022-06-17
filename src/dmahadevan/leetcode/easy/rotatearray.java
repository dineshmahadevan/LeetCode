package dmahadevan.leetcode.easy;

public class rotatearray {
	public static void rotate(int[] nums, int k) {
        
		int count = nums.length, i=0, j=0, temp = 0;
		for(i=0;i<k;i++) {
			for(j=0;j<count;j++) {
				temp = nums[j];
				nums[j] = nums[count-1];
				nums[count-1] = temp;
			}
		}
		for(int num : nums) System.out.println(num);
	}
}
