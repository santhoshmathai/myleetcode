package com.myprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString1 {

	public int lengthOfLongestSubstring(String s) {
		
		int left = 0, right = 0;
		int maxLength = 0;
		Set<Character> set = new HashSet<Character>();
		
		while (right < s.length()) {
			char c = s.charAt(right);
			if (set.contains(c)) {
				set.remove(c);
				left++;
			} else {
				set.add(c);
				right++;
			}
			maxLength = Math.max(maxLength, set.size());
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
