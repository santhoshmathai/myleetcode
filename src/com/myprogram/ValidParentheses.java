package com.myprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	 private static Map<Character, Character> basemap;
	 private static Stack<Character> stack;
	 public ValidParentheses() {
		 basemap = new HashMap<>();
		 basemap.put(')', '(');
		 basemap.put('}', '{');
		 basemap.put(']', '[');
		 stack =  new Stack<Character>();
	 }
	 
	 public static boolean isValid(String s) {
		 for (int i = 0; i< s.length(); i++) {
			 char curr = s.charAt(i);
			 if (basemap.containsKey(curr)) {
				 char compareStr = stack.size() != 0 ? stack.pop(): '#';
				 if (compareStr != basemap.get(curr)) {
					 return false;
				 }
			 } else {
				 stack.push(curr);
			 }
			 
		 }
		 return true;
	 }
	 
	 public static void main(String[] args) {
		 ValidParentheses nn = new ValidParentheses();
		 String str = "[{()}]";
		 String str1 = "[{{()}]";
		 System.out.println(nn.isValid(str));
		 System.out.println(nn.isValid(str1));



	 }
}
