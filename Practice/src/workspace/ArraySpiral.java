package workspace;

import java.util.Scanner;

public class ArraySpiral {

	public static void arrayRotation(int[][] arrayData,int sizeOfArray) {
		int j = 0, i = 0, z=0;
		int[] arr = new int[sizeOfArray*sizeOfArray];
		for(i = 0; i < arrayData.length;) {
			for(j = 0; j < arrayData.length;) {
				arr[z] = arrayData[i][j];
				j++;
				z++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int sizeOfArray = scan.nextInt();
		int[][] arrayValue = new int[sizeOfArray][sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++) {
				arrayValue[i][j] = scan.nextInt();
			}
		}
		arrayRotation(arrayValue,sizeOfArray);
		//System.out.println(Arrays.deepToString(arrayValue));
		scan.close();
	}
}
