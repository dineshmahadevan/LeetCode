package dmahadevan.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class validparentheses {
	
	private HashMap<Character, Character> mappings;
	
	public validparentheses() {
		    this.mappings = new HashMap<Character, Character>();
		    this.mappings.put(')', '(');
		    this.mappings.put('}', '{');
		    this.mappings.put(']', '[');
		  }
	
	public boolean validParantheses(String s) {
		
		//    (({{[]}}))
		Stack<Character> brackets = new Stack<Character>();

		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (this.mappings.containsKey(c)) {
				char topElement = brackets.empty() ? '#' : brackets.pop();
				if(topElement != this.mappings.get(c)) {
					return false;
				}
			}
			else {
				brackets.push(c);
			}		
		}
	return brackets.isEmpty();
	
	}
}
