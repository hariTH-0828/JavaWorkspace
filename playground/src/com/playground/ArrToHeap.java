package com.playground;

import java.util.Arrays;

public class ArrToHeap {
	
	public static void swap(int[] arr,int i , int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int Node(int[] arr, int i) {
		if(i != 0 && i % 2 == 0) {
			return (i/2) - 1;
		}else return i/2;
	}
	
	public static void main(String[] args) {
		int[] arr = {14,9,7,6,5,8,3,12,11};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[Node(arr, i)] < arr[i]) { 
				swap(arr, i, Node(arr, i));
				if(arr[Node(arr, Node(arr, i))] < arr[Node(arr, i)]) {
					swap(arr, Node(arr,Node(arr,i)), Node(arr,i));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
