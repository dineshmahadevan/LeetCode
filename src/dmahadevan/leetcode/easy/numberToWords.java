package dmahadevan.leetcode.easy;

import java.util.HashMap;

public class numberToWords {
	
	public HashMap<Integer, String> mapping;
	
	public numberToWords() {
		
		this.mapping = new HashMap<Integer, String>();
		this.mapping.put(0, "");
		this.mapping.put(00, "");
		this.mapping.put(00, "");
		this.mapping.put(1, "One");
		this.mapping.put(2, "Two");
		this.mapping.put(3, "Three");
		this.mapping.put(4, "Four");
		this.mapping.put(5, "Five");
		this.mapping.put(6, "Six");
		this.mapping.put(7, "Seven");
		this.mapping.put(8, "Eight");
		this.mapping.put(9, "Nine");
		this.mapping.put(10, "Ten");
		this.mapping.put(11, "Eleven");
		this.mapping.put(12, "Twelve");
		this.mapping.put(13, "Thirteen");
		this.mapping.put(14, "Fourteen");
		this.mapping.put(15, "Fifteen");
		this.mapping.put(16, "Sixteen");
		this.mapping.put(17, "Seventeeh");
		this.mapping.put(18, "Eighteen");
		this.mapping.put(19, "Nineteen");
		this.mapping.put(20, "Twenty");
		this.mapping.put(30, "Thirty");
		this.mapping.put(40, "Forty");
		this.mapping.put(50, "Fifty");
		this.mapping.put(60, "Sixty");
		this.mapping.put(70, "Seventy");
		this.mapping.put(80, "Eighty");
		this.mapping.put(90, "Ninety");
		
	}
	
	public String numberToWords(int x) {
		
		String s = null;
		String first = null, second = null, third = null,fourth = null;
		String num = String.valueOf(x);
		int len = num.length();
		
		
		if(x%10 == x && x/10 == 0) return this.mapping.get(x);
		else if (len ==2) {
			if(x<20) return this.mapping.get(x);
			else {
				second = this.mapping.get(x%10);
				first = this.mapping.get(x - x%10);
				s = first.concat(" ").concat(second);
			}
		}
		else if (len == 3) {
			
			third = this.mapping.get(x%10);
			second = this.mapping.get(x%100 - x%10);
			first = this.mapping.get(x/100) + " hundred and";
			s = first.concat(second).concat(" ").concat(third);
		}
		else if (len > 3) {
			while(len > 3){
				third = this.mapping.get(x%10);
				second = this.mapping.get(x%100 - x%10);
				first = this.mapping.get(x/100);
				x=x/1000;
				s = s.concat(first).concat(" ").concat(second).concat(" ").concat(third);
			}
/*			
			fourth = this.mapping.get(x%10);
			third = this.mapping.get(x%100 - x%10); 
			second = this.mapping.get(x/100 - (x/1000)*10) + " hundred and ";
			first = this.mapping.get(x/1000) + " Thousand ";
			s = first.concat(second).concat(third).concat(" ").concat(fourth); */
		}
		
		return s;
	}

}
