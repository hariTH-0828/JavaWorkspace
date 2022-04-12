package workspace;

import java.util.Scanner;

public class EasyArray {

	static int[] getValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Data :");
		String getData = scan.nextLine();
		return StrToInt(getData);
	}
	
	static int[] StrToInt(String Data) {
		String strArray[] = Data.split(" ");
		int[] numArray = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
			numArray[i] = Integer.parseInt(strArray[i]);
		}
		return numArray;
	}
	
	static int[] arraySlice(int[] array, int start, int end) {
		int[] arr = new int[array.length];
		//int j = 0;
		for(int i = start; i < end; i++) {
			arr[i] = array[i];
		//	j++;
		}
		return arr;
	}
}
