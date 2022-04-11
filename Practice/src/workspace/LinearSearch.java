package workspace;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		String getData = scan.nextLine();
		int[] arrData = EasyArray.StrToInt(getData);
		System.out.println("Enter the number to find in Array :");
		int findNum = scan.nextInt();
	
		for(int i = 0; i < arrData.length; i++) {
			if(findNum == arrData[i]) System.out.println(i+1);
		}
		scan.close();

	}

}
