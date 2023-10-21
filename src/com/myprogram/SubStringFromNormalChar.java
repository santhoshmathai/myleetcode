package com.myprogram;

import java.util.HashSet;

public class SubStringFromNormalChar {

	public static int subStringFromChar(String s, String q, int k) {
		
		HashSet<String> set  = new HashSet<>();
		int maxSubStrLength = 0;
		
		for (int i = 0; i<q.length(); i++) {
			if('0' == q.charAt(i)) {
				set.add(String.valueOf((char)(i + 97)));
			}
		}
		
		// 0(n*3)
		for (int i = 0; i < s.length();i++) {
			for (int j = i; j < s.length(); j++) {
				String subStr = s.substring(i, j);
				maxSubStrLength = Math.max(maxSubStrLength, getStringLength(subStr,set,k));
			}
		}
		return maxSubStrLength;
	}
	
	
	public static void main(String[] args) {
		// Input : P = “giraffe”, Q = “01111001111111111011111111”, K=2 
		String s = "giraffe";
		String q = "01111001111111111011111111";
		int k = 2;
		System.out.println(subStringFromChar(s, q, k));
	}
	
	public static int getStringLength(String subStr, HashSet<String> set, int k) {
		//System.out.println(subStr);
		int counter = 0;
		if(subStr.length() < k) {
			return 0;
		}
		
		for (int i = 0; i < subStr.length(); i++) {
			if (set.contains(String.valueOf(subStr.charAt(i)))) {
				counter ++;
			}
		}
		if(counter == k  ) {
			return subStr.length();
		} else {
			return 0;
		}
	}
}
//O(n3)