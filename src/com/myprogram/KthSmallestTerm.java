package com.myprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KthSmallestTerm {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3,0,6);
		getKthSmallestTerm(arr, 7);

	}

	

		public static List<Integer> getKthSmallestTerm(List<Integer> arr, long k) {

			List<Integer> result = new ArrayList<Integer>();
			Comparator<List<Integer>> comparator = (list1, list2) -> {
				return list1.get(0).compareTo(list2.get(0));
				/*
				 * int value = Integer.compare(list1.get(0), list2.get(0)); return value;
				 */
			};
			Comparator<List<Integer>> comparator1 = (list1, list2) -> {
			       for (int i = 0; i < list1.size(); i++) {
			            int value = Integer.compare(list1.get(i), list2.get(i));
			            if (value != 0)
			                return value;
			       }
			       return 0;
			};
			List<List<Integer>> pairs = getAllCombination(arr);
			//Collections.sort(pairs, comparator);
			Collections.sort(pairs, (list1, list2) -> 
		    IntStream.range(0, Math.min(list1.size(), list2.size()))
		        .map(i -> Integer.compare(list1.get(i), list2.get(i)))
		        .filter(value -> value != 0)
		        .findFirst()
		        .orElse(0)
		);
			//pairs.stream().flatMap(
			// sorted(Comparator.comparing(null)).collect(Collectors.toList());
			//Collections.sort(pairs, comparator);
			return result;
		}

		public static List<List<Integer>> getAllCombination(List<Integer> arr) {

			List<List<Integer>> result = new ArrayList<>();

			for (int i = 0; i < arr.size(); i++) {
				
				for (int j = 0; j < arr.size(); j++) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(arr.get(i));
					list.add(arr.get(j));
					result.add(list);
				}
			}

			return result;
		}
	}
 