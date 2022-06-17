package dmahadevan.leetcode.easy;

public class findMedianSortedArrays {
	
	public static double medianofsortedarrays(int[] x, int[] y) {
		double median = 0.00;
		int sizex = x.length, sizey = y.length, i=0, j=0;
		int[] mergedarray = new int[sizex+sizey];
		
		for(i = 0; i < sizex; i++) mergedarray[i] = x[i];
		for(i = 0; i < sizey; i++) mergedarray[i+sizex] = y[i];
						
		for(i=0;i<mergedarray.length;i++) {
			for(j=i+1;j<mergedarray.length;j++) {
				if(mergedarray[j] < mergedarray[i]) {
					int temp = 0;
					temp = mergedarray[j];
					mergedarray[j] = mergedarray[i];
					mergedarray[i] = temp;
				}
			}
		}
		
		for(i=0;i<mergedarray.length;i++) System.out.println(mergedarray[i]);

		if(mergedarray.length%2 !=0) {
			median = mergedarray[mergedarray.length/2];
		}
		else {
			median = (double) (mergedarray[mergedarray.length/2] + mergedarray[(mergedarray.length/2)-1])/2;
		}
		
		return median;
	}

}
