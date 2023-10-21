package com.myprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a triangle array, return the minimum path sum from top to bottom.

	For each step, you may move to an adjacent number of the row below.
 	More formally, if you are on index i on the current row,
 
  	you may move to either index i or index i + 1 on the next row.
  	
  	Example 1:

		Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
		Output: 11
		Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:

Input: triangle = [[-10]]
Output: -10
 */

// This is Dynamic problem
// this can be solved using decision tree.
public class TriangleProblem1 {
	public static int minimumTotal(List<List<Integer>> triangle) {
		int triableSize = triangle.size();
		int[] dynamicArray = new int[triangle.get(triableSize - 1).size()];
		List<Integer> lastList = triangle.get(triableSize - 1);

		for (int i = 0; i < lastList.size(); i++) {
			dynamicArray[i] = lastList.get(i);
		}
		for (int j = triableSize - 2; j >= 0; j--) {
			lastList = triangle.get(j);

			for (int i = 0; i < lastList.size(); i++) {
				int min = Math.min(dynamicArray[i], dynamicArray[i+1]);
				dynamicArray[i] = lastList.get(i) + min;
			}
		}
		return dynamicArray[0] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangle = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		List<List<Integer>> triangleList = new ArrayList<>();

		for (int[] row : triangle) {
			List<Integer> rowList = new ArrayList<>();
			for (int num : row) {
				rowList.add(num);
			}
			triangleList.add(rowList);
		}
		
		System.out.println(minimumTotal(triangleList));
	}

}
