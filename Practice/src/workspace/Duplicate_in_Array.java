package workspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_in_Array {
	
	private static ArrayList<Integer> popDuplicate(int[] arr, int n) {
		Arrays.sort(arr);
		Set<Integer> setArr = new LinkedHashSet<Integer>();
		for(int i = 0; i < n-1; i++) {
			/*
			 * if(setArr.contains(array[i]) && !arrLst.contains(array[i])) {
			 * arrLst.add(array[i]); } else setArr.add(array[i]);
			 */
			if(arr[i] == arr[i+1]) {
				setArr.add(arr[i]);
			}
		}
		if(setArr.isEmpty()) {
			setArr.add(-1);
		}
		ArrayList<Integer> arrLst = new ArrayList<Integer>(setArr);
			return arrLst;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		String input = scan.nextLine();
		int [] numArray = EasyArray.StrToInt(input);
		System.out.println(popDuplicate(numArray,numArray.length));
		scan.close();

	}

}
