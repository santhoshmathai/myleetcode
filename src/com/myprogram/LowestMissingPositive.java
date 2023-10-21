package com.myprogram;

import java.util.HashSet;

/*
 * Given an array of integers, write a function that finds the lowest integer that is not in the array.

For example, given the array, [5, 2, 1, 4, 0, 2] , the function should return 3.
 */
public class LowestMissingPositive {

    public static int findLowestMissingPositive(int[] arr) {
        // Create a HashSet to store positive elements of the array
        HashSet<Integer> positiveElements = new HashSet<>();
        
        // Add positive elements of the array to the HashSet
        for (int num : arr) {
            if (num > 0) {
                positiveElements.add(num);
            }
        }
        
        // Start from 1 and keep checking if it exists in the HashSet
        int lowestMissing = 1;
        while (positiveElements.contains(lowestMissing)) {
            lowestMissing++;
        }
        
        return lowestMissing;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -1};
        int result = findLowestMissingPositive(arr);
        System.out.println("Lowest missing positive integer: " + result);
    }
}
