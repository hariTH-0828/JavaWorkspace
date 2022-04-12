package workspace;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	private static int binarySearch(int[] arrData,int num) {
		int mid = arrData.length / 2;
		int fPos,lPos;
		if(arrData[mid] == num) {
			return mid; 
		}
		else if(arrData[mid] > num) {
			fPos = 0;
			lPos = mid;
			arrData = EasyArray.arraySlice(arrData, fPos, lPos);
			binarySearch(arrData, num);
		}
		else {
			fPos = mid;
			lPos = arrData.length;
			arrData = EasyArray.arraySlice(arrData, fPos, lPos);
			binarySearch(arrData, num);
		}
		return 0;
	}
	public static void main(String[] args) {
		// Get data's from the User:
		Scanner scan = new Scanner(System.in);
		int[] getData = EasyArray.getValue();
		
		
		//getData = Sorting.sortSelection(getData); // --> Sorting method().
		System.out.println("Enter the number to find :");
		int findNum = scan.nextInt();
		scan.close();
		
		System.out.println(binarySearch(getData, findNum));
	}

}
