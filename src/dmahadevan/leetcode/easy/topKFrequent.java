package dmahadevan.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class topKFrequent {
	
	private static HashMap<Integer, Integer> freq;
	
	public static int[] topkfrequent(int[] nums, int k) {
		freq = new HashMap<Integer, Integer>();
		int[] x = new int[k];
		int sizenums = 0, i=0, j=0, temp=0, count=0;
		sizenums = nums.length;
		
		for(i=0;i<sizenums;i++) {
			for(j=i+1;j<sizenums;j++) {
				if(nums[j]<nums[i]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
//		for(i=0;i<sizenums;i++) System.out.println(nums[i]);
		
		for(i=0;i<sizenums;i++) {
			count=0;
			if(!freq.containsKey(nums[i])) {
				count++;
				freq.put(nums[i], count);
			}
			else {
				count = freq.get(nums[i]);
				count++;
				freq.put(nums[i], count);
				
			}
		}
		
//		System.out.println(Arrays.asList(freq));
		
		HashMap<Integer, Integer> sortedfreq = new HashMap<Integer, Integer>();
		sortedfreq = sortByValues(freq);
		
//		System.out.println(Arrays.asList(sortedfreq));
		
		Set resultset = sortedfreq.entrySet();
		
		Iterator ite = resultset.iterator();
		
		for(i=0;i<k;i++) {
			if(ite.hasNext()) {
				Map.Entry e = (Map.Entry) ite.next();
				x[i] = (int) e.getKey();
			}
		}
		return x;
	}
	
	private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
}
