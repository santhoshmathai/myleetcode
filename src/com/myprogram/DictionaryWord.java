package com.myprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 
 * 
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
 * 
 * 
 * 
 */
public class DictionaryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "leetcode";
		//String s = "applepenapple";
		String s = "catsandog";

		//List<String> wordDic = Arrays.asList("leet", "code");
		//List<String> wordDic = Arrays.asList("apple","pen");
		List<String> wordDic = Arrays.asList("cats","dog","sand","and","cat");

		System.out.println(isDictionaryWord(s, wordDic));
	}

	public static boolean isDictionaryWord(String s, List<String> wordDic) {

		int[] dynamicArray = new int[s.length() + 1];

		dynamicArray[0] = 1; // 1 means true and 0 mean false.

		Set<String> set = new HashSet<String>(wordDic);
        boolean breakFlag = false;
		for (int i = 1; i <= s.length(); i++) {
			String str = s.substring(0, i);
			if (set.contains(str)) {
				dynamicArray[i] = 1; // true
				continue;
			}
			breakFlag = false;
			StringBuffer strBuff = new StringBuffer(str);
			for (int j = 0; j < str.length(); j++) {
				strBuff.deleteCharAt(0);
				if (set.contains(strBuff.toString())) {
					dynamicArray[i] = 1; // true
					breakFlag = true;
					break;
				}
			}
			if(!breakFlag)
				dynamicArray[i] = 0; // true

		}
		return dynamicArray[s.length()] == 1 ? true : false;
	}

}
