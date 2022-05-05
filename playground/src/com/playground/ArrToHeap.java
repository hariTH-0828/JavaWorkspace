package com.playground;

import java.util.Arrays;

public class ArrToHeap {
	
	public static void swap(int[] arr,int i , int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int pos(int[] arr, int i) {
		if(i != 0 && i % 2 == 0) {
			return (i/2) - 1;
		}else return i/2;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,12,3,17,11,1,9,0,15,19};
		int child, node;
		for(int i = 0; i < arr.length; i++) {
			if(arr[pos(arr, i)] < arr[i]) { 
				swap(arr, i, pos(arr, i));
				child = pos(arr, i);
				node = pos(arr, pos(arr, i));
				while(arr[node] < arr[child]) {
					swap(arr, node, child);
					child = pos(arr, pos(arr, i));
					node = pos(arr, child);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
