package com.myprogram;

import java.util.Deque;
import java.util.LinkedList;

public class MovingAverage {

	Deque<Integer> list;
	double sum;
	int sizeLimit;
	
	public MovingAverage(int size) {
		list = new LinkedList<Integer>();
		sizeLimit = size;
		sum = 0.0;
	}
	public double next(int value) {
		
		if(list.size() == sizeLimit) {
			sum -=  list.removeFirst();
		}
		list.offerLast(value);
		sum += (double) value;
		return sum/ (double)list.size();
	}
		
}
