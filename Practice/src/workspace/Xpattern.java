package workspace;

import java.util.Scanner;

public class Xpattern {

	public void xpattern(String data) {
		for(int i = 0; i < data.length(); i++) {
			for(int j = 0; j < data.length(); j++) {
				if(i == j || j == (data.length()-1) - i) {
					System.out.print(data.charAt(j));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Xpattern xpat = new Xpattern();
		System.out.println("Enter the Name in Odd format : ");
		String getValue = scan.nextLine();
		xpat.xpattern(getValue);
		scan.close();

	}

}
