package com.myprogram;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	public int lengthOfLongestSubString(String s) {
		Set<Character> set = new HashSet<>();

		int left = 0, right = 0 , max = 0;

		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right ++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
			max = Math.max(max, set.size());

		}
		return max;
	}
}
