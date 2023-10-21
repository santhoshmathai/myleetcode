package com.myprogram;

public class ClimbingStaircase {

	// 0 , 1, 2, 3, 5, 8
	// a[i] = a[i-1] + a[i-2];

	public static int getNumberOfWays(int step) {

		if (step > 1 && step < 45) {
			int[] tmp = new int[step + 1];
			// [1,1,2,3]

			tmp[0] = 1;
			tmp[1] = 1;

			for (int i = 2; i < tmp.length; i++) {
				tmp[i] = tmp[i - 1] + tmp[i - 2];
			}
			return tmp[step];
		} else {
			return 0;
		}
	}

	// O(n)
	// O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumberOfWays(6));
	}

}
