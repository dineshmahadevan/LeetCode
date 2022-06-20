package dmahadevan.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        boolean anagram = false;
        int i, j, count;
        char temp;
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        
        
        if(s.length() == t.length()){
            for(i = 0 ; i < s.length() ; i++){
            	l1.add(s.charAt(i));
            	l2.add(t.charAt(i));
            }
            Collections.sort(l1);
            Collections.sort(l2);
            if(l1.equals(l2)) anagram = true;
        }
    return anagram;
    }
}
