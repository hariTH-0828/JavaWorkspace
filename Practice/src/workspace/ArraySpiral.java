package workspace;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArraySpiral {
	
	public static void main(String[] args) {
		int[] getData = EasyArray.getValue();

		//Sorting:
		for(int i = 0; i < getData.length; i++) {
			for(int j = 0; j < getData.length; j++ ) {
				if(getData[i] < getData[j]) {
					int temp = getData[i];
					getData[i] = getData[j];
					getData[j] = temp;
				}
			}
		}
		
		//Remove duplicate element in Array:
		Set<Integer> setData = new LinkedHashSet<Integer>();
		for(int i =0; i < getData.length; i++) {
			setData.add(getData[i]);
		}
		
		//Set to Array
		Integer B[] = new Integer[setData.size()];
		setData.toArray(B);
		
		//Result
		System.out.println(B[1]);
		
	
	}
}
