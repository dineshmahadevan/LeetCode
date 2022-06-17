package dmahadevan.leetcode.easy;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class mergetwosortedlists {

	public static void mergelists(LinkedList list1, LinkedList list2) {
		
		int i=0,j=0;
		
		for(i=0;i<list2.size();i++) {
	    	list1.addLast(list2.get(i));
	    }
		
		Collections.sort(list1);
		
		for(i=0;i<list1.size();i++) {
	    	System.out.println(list1.get(i));
	    }
		

	}
}


