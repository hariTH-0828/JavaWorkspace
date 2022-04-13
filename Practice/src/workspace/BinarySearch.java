package workspace;

import java.util.Scanner;

public class BinarySearch {
	
	private static int binarySearch(int[] arrData,int num,int fPos, int lPos) {
		int mid = fPos + (lPos - fPos) / 2 ;
			
		if(arrData[mid] == num) {
			return mid;
		}
		else if(arrData[mid] > num) {
			return binarySearch(arrData, num, fPos, mid);
		}
		else {
			return binarySearch(arrData, num, mid, lPos);
		}

	}
	
	public static void main(String[] args) {
		// Get data's from the User:
		Scanner scan = new Scanner(System.in);
		int[] getData = EasyArray.getValue();
		System.out.println("Enter the number to find :");
		int findNum = scan.nextInt();

		scan.close();  // Scanner Stream close.
		
		System.out.println("The Element of "+findNum+" is in "+binarySearch(getData, findNum, 0, getData.length)+" Indices");
		
	}

}
