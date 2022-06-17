package dmahadevan.leetcode.easy;

public class findKthLargest {
	
	public static int kthlargest(int[] nums, int k) {
		int kthlargest = 0, sizenums = 0, i=0, j=0, temp=0;
		sizenums = nums.length;
		
		for(i=0;i<sizenums;i++) {
			for(j=i+1;j<sizenums;j++) {
				if(nums[j]>nums[i]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		for(i=0;i<sizenums;i++) System.out.println(nums[i]);
		
		if(k<=sizenums+1) {
			return nums[k-1];
		}
		else {
			return 0;
		}		
	}
	
}