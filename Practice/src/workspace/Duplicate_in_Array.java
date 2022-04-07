package workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_in_Array {
	
	private static ArrayList<Integer> popDuplicate(int[] array) {
		Set<Integer> setArray = new LinkedHashSet<Integer>();
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			if(setArray.contains(array[i]) && !arrLst.contains(array[i])) {
				arrLst.add(array[i]);
			}
			else setArray.add(array[i]);
		}
		Collections.sort(arrLst);
		if(arrLst.isEmpty()) {
			arrLst.add(-1);
			return arrLst;
		}
		else return arrLst;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		String input = scan.nextLine();
		String[] numbers = EasyArray.Splitter(input);
		int [] numArray = EasyArray.StrToInt(numbers);
		System.out.println(popDuplicate(numArray));
		scan.close();

	}

}
