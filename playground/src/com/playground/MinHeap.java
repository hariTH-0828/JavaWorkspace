package com.playground;

import java.util.Arrays;

public class MinHeap {

	public static int leftChild(int data) {
		return data * 2 + 1;
	}
	public static int rightChild(int data) {
		return data * 2 + 2;
	}
	
	public static void main(String[] args) {
		int[] Heap = {14, 12, 8, 11, 5, 7, 3, 6, 9};
		System.out.println(Arrays.toString(Heap));
	}

}
