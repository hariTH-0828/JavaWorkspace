package workspace;

import java.util.LinkedHashSet;
import java.util.Set;

public class SecondMinElement {

	public static void main(String[] args) {
		
	// Method 1 : Optimal Method
		
		int[] input = EasyArray.getValue();
		int min = input[0];
		int smin = input[0];
		
		// Find Minimum number in array:
		for(int i = 1; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		
		// Find Second minimum number in array
		for(int i = 0; i < input.length; i++) {
			if(smin > input[i] && input[i] != min) {
				smin = input[i];
			}
		}
		System.out.println("In Method 1 : The Second Minimum value is: "+smin);
		
		
	//Method 2 : Sorting Method
		
		//Sorting:
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input.length; j++ ) {
				if(input[i] < input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		//Remove duplicate element in Array:
		Set<Integer> setData = new LinkedHashSet<Integer>();
		for(int i =0; i < input.length; i++) {
			setData.add(input[i]);
		}
		
		//Set to Array
		Integer B[] = new Integer[setData.size()];
		setData.toArray(B);
		
		//Result
		System.out.println("In Method 2 : The Second Minimum value is: "+B[1]);
	}
}
